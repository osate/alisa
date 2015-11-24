/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 *
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 *
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 *
 * See COPYRIGHT file for full details.
 */

/*
 * generated by Xtext
 */
package org.osate.alisa.workbench.generator

import com.google.inject.Inject
import java.util.Collections
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.osate.aadl2.ComponentClassifier
import org.osate.aadl2.ComponentImplementation
import org.osate.aadl2.ComponentType
import org.osate.aadl2.Subcomponent
import org.osate.aadl2.util.Aadl2Util
import org.osate.alisa.workbench.alisa.AlisaWorkArea
import org.osate.alisa.workbench.alisa.AssurancePlan
import org.osate.alisa.workbench.alisa.AssuranceTask
import org.osate.categories.categories.CategoryFilter
import org.osate.verify.util.IVerifyGlobalReferenceFinder
import org.osate.verify.verify.AllExpr
import org.osate.verify.verify.ArgumentExpr
import org.osate.verify.verify.Claim
import org.osate.verify.verify.ElseExpr
import org.osate.verify.verify.RefExpr
import org.osate.verify.verify.ThenExpr
import org.osate.verify.verify.VerificationActivity

import static extension org.osate.verify.util.VerifyUtilExtension.*
import static extension org.osate.reqspec.util.ReqSpecUtilExtension.*
import org.eclipse.emf.common.util.EList
import org.osate.verify.verify.VerificationPlan
import org.eclipse.emf.common.util.BasicEList

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class AlisaGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val workarea = resource.contents.get(0) as AlisaWorkArea
		workarea.cases.forEach [ mycase |
			switch (mycase){
			AssurancePlan: fsa.generateFile('''«mycase.name».assure''', generateFullRootCase(mycase))
			AssuranceTask: fsa.generateFile('''«mycase.name».assure''', generateAssuranceTask(mycase))
			}
		]
	}

	@Inject extension IQualifiedNameProvider qualifiedNameProvider
	
	var CategoryFilter filter = null
	
	var AssurancePlan rootAssuranceCase;
	
	def generateAssuranceTask(AssuranceTask at){
		filter = at 
		at.assurancePlan?.generateRootCase
	}
	
	var EList<VerificationPlan> allPlans = new BasicEList()

	def generateFullRootCase(AssurancePlan acp) {
		filter = null
		generateRootCase(acp)
	}

	def generateRootCase(AssurancePlan acp) {
		rootAssuranceCase = acp
		val res = generateCase(acp, null)
		if (res.length == 0 ){
			acp.emptyCase("\"Empty case due to unresolved target reference or empty filter result\"")
		} else {
			res
		}
	}
	
	def emptyCase(AssurancePlan acp,String msg){
	'''
	case  «acp.name»
	for  «acp.name»
	[
		tbdcount 0
		message «msg»
	]
	'''
	}

@Inject extension IVerifyGlobalReferenceFinder referenceFinder

	/**
	 * acp: AssurancePlan of the system of interest
	 * sub: system of interest as subcomponent of another system
	 * either acp or sub may be null, but not both
	 * they can both be set, in this case acp takes precedence
	 */
	def CharSequence generateCase(AssurancePlan acp, Subcomponent sub){
		var Iterable<VerificationPlan> myplans = Collections.EMPTY_LIST
		var ComponentClassifier cc
		if (acp != null){
			myplans = acp.assure
			cc = acp.target
			if (myplans.empty && !Aadl2Util.isNull(cc)){
				myplans = cc.getVerificationPlans(rootAssuranceCase)
			}
		}
		if (myplans.empty && !Aadl2Util.isNull(sub)){
			cc = sub.allClassifier
		 	if (!Aadl2Util.isNull(cc)) {
		 	myplans = cc.getVerificationPlans(rootAssuranceCase);
		 	} else {
		 	myplans =Collections.EMPTY_LIST
		 	}
		}
		val APparts = doAssurancePlanParts(acp, myplans, cc)
		if(APparts.length == 0) return ''''''
		'''	
			«IF sub == null»
				case «acp.name» 
			«ELSE»
				case «sub.name» 
			«ENDIF»
			«IF acp != null»
				for «acp.name»
			«ENDIF»
			«IF sub != null»
				system «sub.name»
			«ENDIF»
				[
					tbdcount 0
					«APparts»
				]
		'''
	}
	
	def doAssurancePlanParts(AssurancePlan acp, Iterable<VerificationPlan> myplans,ComponentClassifier cc){
		'''
		«FOR myplan : myplans»
		«FOR claim : myplan.claim»
		«IF claim.evaluateRequirementFilter(filter)»
		«claim.generate()»
		«ENDIF»
		«ENDFOR»
		«ENDFOR»
«««		«FOR myplan : allPlans»
«««		«FOR claim : myplan.claim.filter[cl|cl.requirement?.matchingCategory(cc.category)]»
«««		«IF claim.evaluateRequirementFilter(filter)»
«««			«claim.generate()»
«««		«ENDIF»
«««		«ENDFOR»
«««		«ENDFOR»
	    «IF cc instanceof ComponentImplementation»
		«FOR subc : cc.allSubcomponents»
			«subc.filterplans(acp)»
		«ENDFOR»
	    «ENDIF»
		'''
	}
	
	def CharSequence filterplans(Subcomponent subc, AssurancePlan parentacp){
		val cc = subc.allClassifier
		if (subc.skipAssuranceplans(parentacp)) return ''''''
		if (cc instanceof ComponentType){
			generateCase(null,subc)
		} else {
		val subacp = cc.getSubsystemAssuranceplan(parentacp)
		generateCase(subacp,subc)
		}
	}
	
	def boolean skipAssuranceplans(Subcomponent subc, AssurancePlan parentacp){
		if (parentacp == null) return false
		if (parentacp.assumeAll) return true
		val assumes = parentacp.assumeSubsystems
		for (sub: assumes){
			if (sub.name.equalsIgnoreCase(subc.name)) return true;
		}
		return false
	}
	
	def AssurancePlan getSubsystemAssuranceplan(ComponentClassifier cc, AssurancePlan parentacp){
		if (parentacp == null) return null
//		val assure = parentacp.assureSubsystemPlans
//		for (ap: assure){
//			if (cc.isSameorExtends(ap.target)) return ap;
//		}
		return null
	}

	def CharSequence generate(Claim claim) {
		val claimvas = doGenerateVA(claim)
		val subclaims = if (claim.assert == null) doGenerateSubclaims(claim)
		val claimassert = if (claim.assert != null) claim.assert.generate else ''''''
		if (claimvas.length == 0 && subclaims.length == 0 && claimassert.length == 0) return ''''''
		'''
			claim «claim.requirement.fullyQualifiedName»
			[
				tbdcount 0
			    «subclaims»
			    «IF claim.assert != null»
			    «claimassert»
			    «ELSE»
			    «claimvas»
			    «ENDIF»
				]
			'''
	}
	
	def doGenerateVA(Claim claim){
	'''
	«FOR va : claim.activities»
		«va.doGenerate»
	«ENDFOR»
	'''	
	}
	
	def doGenerateSubclaims(Claim claim){
	'''
	«FOR subclaim : claim?.subclaim»
		«subclaim.generate»
	«ENDFOR»
	'''	
	}

	def doGenerate(VerificationActivity va) {
		'''
			«IF va.evaluateVerificationActivityFilter(filter) && va.evaluateVerificationMethodFilter(filter) »
			verification «va.fullyQualifiedName»
			[
				executionstate todo
				resultstate tbd
				tbdcount 0
				«IF va.method?.precondition != null»
				precondition «va.method.fullyQualifiedName»
				[
					executionstate todo
					resultstate tbd
					tbdcount 0
				]
				«ENDIF»
				«IF va.method?.validation != null»
				validation «va.method.fullyQualifiedName»
				[
					executionstate todo
					resultstate tbd
					tbdcount 0
				]
				«ENDIF»
			]
			«ENDIF»
		'''
	}

	def CharSequence generate(ArgumentExpr expr) {
		switch expr {
			AllExpr: expr.doGenerate
			ThenExpr: expr.doGenerate
			ElseExpr: expr.doGenerate
			RefExpr: expr.doGenerate
		}
	}

	def doGenerate(AllExpr expr) {
		'''
			«FOR subexpr : expr.elements»
				«subexpr.generate»
			«ENDFOR»
		'''
	}

	def doGenerate(ThenExpr expr) {
		val leftresult = expr.left.generate
		val successorresult = expr.successor.generate
		if (leftresult.length == 0) return ''''''
		if (successorresult == 0) return leftresult
		'''
			then
				«leftresult»
			do
				«successorresult»
			[
				tbdcount 0
			]
		'''
	}

	def doGenerate(ElseExpr expr) {
		val leftresult = expr.left.generate
		val errorresult = expr.error.generate
		val failresult = expr.fail?.generate?:''''''
		val timeoutresult = expr.timeout?.generate?:''''''
		if (leftresult.length == 0) return ''''''
		if (errorresult == 0&&failresult.length == 0 && timeoutresult.length ==0) return leftresult
		'''
			else
				«expr.left.generate»
			«IF errorresult.length > 0»
			error 
				«errorresult»
			«ENDIF»
			«IF expr.fail != null»
			fail "«expr.fail.generate»"
			«ENDIF»
			«IF expr.timeout != null»
			timeout "«expr.timeout.generate»"
			«ENDIF»
			[
				tbdcount 0
			]
		'''
	}

	def doGenerate(RefExpr expr) {
		if (expr.verification != null) expr.verification.doGenerate
		else 
		''''''
	}

}
