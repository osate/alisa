/*
 * generated by Xtext
 */
package org.osate.alisa.workbench.generator

import com.google.inject.Inject
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.UniqueEList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.osate.aadl2.ComponentClassifier
import org.osate.aadl2.ComponentImplementation
import org.osate.aadl2.ComponentType
import org.osate.alisa.workbench.alisa.AlisaWorkArea
import org.osate.alisa.workbench.alisa.AssurancePlan
import org.osate.alisa.workbench.alisa.AssuranceTask
import org.osate.categories.categories.RequirementCategory
import org.osate.categories.categories.SelectionCategory
import org.osate.categories.categories.VerificationCategory
import org.osate.verify.util.IVerifyGlobalReferenceFinder
import org.osate.verify.verify.AllExpr
import org.osate.verify.verify.ArgumentExpr
import org.osate.verify.verify.Claim
import org.osate.verify.verify.ElseExpr
import org.osate.verify.verify.RefExpr
import org.osate.verify.verify.ThenExpr
import org.osate.verify.verify.VerificationActivity
import org.osate.verify.verify.VerificationCondition
import org.osate.verify.verify.VerificationPlan
import org.osate.verify.verify.VerificationPrecondition
import org.osate.verify.verify.VerificationValidation

import static extension org.osate.alisa.common.util.CommonUtilExtension.*
import static extension org.osate.alisa.workbench.util.AlisaWorkbenchUtilExtension.*
import static extension org.osate.verify.util.VerifyUtilExtension.*
import org.osate.aadl2.Subcomponent
import org.osate.aadl2.util.Aadl2Util

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
	
	var List<SelectionCategory> selectionFilter = Collections.EMPTY_LIST
	var List<RequirementCategory> requirementFilter = Collections.EMPTY_LIST
	var List<VerificationCategory> verificationFilter = Collections.EMPTY_LIST
	var boolean strictSelectionCategories = false
	var boolean strictRequirementCategories = false
	var boolean strictVerificationCategories = false
	
	var AssurancePlan rootAssuranceCase;
	
	def generateAssuranceTask(AssuranceTask at){
		selectionFilter = at.selectionFilter
		requirementFilter = at.requirementFilter
		verificationFilter = at.verificationFilter
		strictSelectionCategories = at.strictSelectionCategories
		strictRequirementCategories = at.strictRequirementCategories
		strictVerificationCategories = at.strictVerificationCategories
		at.assurancePlan?.generateRootCase
	}
	
	var Iterable<VerificationPlan> allPlans = null

	def generateFullRootCase(AssurancePlan acp) {
		selectionFilter = Collections.EMPTY_LIST
		requirementFilter = Collections.EMPTY_LIST
		verificationFilter = Collections.EMPTY_LIST
		strictSelectionCategories = false
		strictRequirementCategories = false
		strictVerificationCategories = false
		generateRootCase(acp)
	}

	def generateRootCase(AssurancePlan acp) {
		if (acp.assureGlobal.isEmpty){
			allPlans = referenceFinder.getGlobalReqVerificationPlans(acp)
		} else {
			allPlans = acp.assureGlobal
		}
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
			myplans = acp.assureOwn
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
		if( myplans.empty) return ''''''
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
«««					«FOR myplan : myplans»
«««						«FOR claim : myplan.claim»
«««						«IF claim.evaluateRequirementFilter(requirementFilter,strictRequirementCategories)»
«««							«claim.generate()»
«««						«ENDIF»
«««						«ENDFOR»
«««					«ENDFOR»
«««					«FOR myplan : allPlans»
«««						«FOR claim : (myplan as VerificationPlan).claim»
«««						«IF claim.evaluateRequirementFilter(requirementFilter,strictRequirementCategories)»
«««							«claim.generate()»
«««						«ENDIF»
«««						«ENDFOR»
«««					«ENDFOR»
«««			    «IF cc instanceof ComponentImplementation»
«««					«FOR subc : cc.allSubcomponents»
«««						«subc.filterplans(acp)»
«««					«ENDFOR»
«««			    «ENDIF»
				]
		'''
	}
	
	def doAssurancePlanParts(AssurancePlan acp, Iterable<VerificationPlan> myplans,ComponentClassifier cc){
		'''
		«FOR myplan : myplans»
		«FOR claim : myplan.claim»
		«IF claim.evaluateRequirementFilter(requirementFilter,strictRequirementCategories)»
		«claim.generate()»
		«ENDIF»
		«ENDFOR»
		«ENDFOR»
		«FOR myplan : allPlans»
		«FOR claim : (myplan as VerificationPlan).claim»
		«IF claim.evaluateRequirementFilter(requirementFilter,strictRequirementCategories)»
			«claim.generate()»
		«ENDIF»
		«ENDFOR»
		«ENDFOR»
	    «IF cc instanceof ComponentImplementation»
		«FOR subc : cc.allSubcomponents»
			«subc.filterplans(acp)»
		«ENDFOR»
	    «ENDIF»
		'''
	}
	
	def CharSequence filterplans(Subcomponent subc, AssurancePlan parentacp){
		val cc = subc.allClassifier
		if (cc.skipAssuranceplans(parentacp)) return ''''''
		if (cc instanceof ComponentType){
			generateCase(null,subc)
		} else {
		val subacp = cc.getSubsystemAssuranceplan(parentacp)
		generateCase(subacp,subc)
		}
	}
	
	def boolean skipAssuranceplans(ComponentClassifier cc, AssurancePlan parentacp){
		if (parentacp == null) return false
		if (parentacp.assumeAll) return true
		val assumes = parentacp.assumeSubsystems
		for (cl: assumes){
			if (cc.isSameorExtends(cl)) return true;
		}
		return false
	}
	
	def AssurancePlan getSubsystemAssuranceplan(ComponentClassifier cc, AssurancePlan parentacp){
		if (parentacp == null) return null
		val assure = parentacp.assureSubsystemPlans
		for (ap: assure){
			if (cc.isSameorExtends(ap.target)) return ap;
		}
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
«««			    «FOR subclaim : claim?.subclaim»
«««				«subclaim.generate()»
«««				«ENDFOR»
			    «IF claim.assert != null»
			    «claimassert»
«««			    «claim.assert.generate»
			    «ELSE»
			    «claimvas»
«««			    «FOR va : claim.activities»
«««				«va.doGenerate»
«««			    «ENDFOR»
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
			«IF va.evaluateSelectionFilter(selectionFilter,strictSelectionCategories) && va.evaluateVerificationFilter(verificationFilter,strictVerificationCategories) »
			verification «va.fullyQualifiedName»
			[
				executionstate todo
				resultstate tbd
				tbdcount 0
				«IF va.method?.condition != null»
					«va.method?.condition.generate»
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
		val otherresult = expr.other.generate
		val failresult = expr.fail?.generate?:''''''
		val timeoutresult = expr.timeout?.generate?:''''''
		if (leftresult.length == 0) return ''''''
		if (otherresult == 0&&failresult.length == 0 && timeoutresult.length ==0) return leftresult
		'''
			else
				«expr.left.generate»
			«IF otherresult.length > 0»
			other 
				«otherresult»
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

	def generate(VerificationCondition vc) {
		'''
			«vc.keyword» «vc.fullyQualifiedName»
			[
				executionstate todo
				resultstate tbd
				tbdcount 0
			]
		'''
	}


	def keyword(VerificationCondition vc) {
		switch vc {
			VerificationValidation: '''validation'''
			VerificationPrecondition: '''precondition'''
		}
	}
	
	

}
