/*
 * generated by Xtext
 */
package org.osate.assure.generator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class AssureConstructor {

// Needs to be synched with Alisa Generator.

//	val factory = AssureFactory.eINSTANCE
//
//	var List<SelectionCategory> selectionFilter = Collections.EMPTY_LIST
//	var List<RequirementCategory> requirementFilter = Collections.EMPTY_LIST
//	var List<VerificationCategory> verificationFilter = Collections.EMPTY_LIST
//
//	
//	var Iterable<VerificationPlan> allPlans = null
//
//	def constructAssuranceTask(AssuranceTask at) {
//		selectionFilter = at.selectionFilter
//		requirementFilter = at.requirementFilter
//		verificationFilter = at.verificationFilter
//		at.assurancePlan?.constructCase
//	}
//
//	def constructCase(AssurancePlan acp) {
//		if (acp.assureGlobal.isEmpty){
//			allPlans = referenceFinder.getGlobalReqVerificationPlans(acp)
//		} else {
//			allPlans = acp.assureGlobal
//		}
//		acp.target.construct(acp, false)
//	}
//
//	def constructSystemEvidence(ComponentClassifier cc, AssurancePlan parentacp) {
//		cc.construct(parentacp, true)
//	}
//
//	@Inject extension IVerifyGlobalReferenceFinder referenceFinder
//
//	/**
//	 * if systemEvidence is true then acp is the parent acp. Therefore we need to find the verification plans for the system.
//	 */
//	def AssuranceCase construct(ComponentClassifier cc, AssurancePlan acp, boolean systemEvidence) {
//		var Iterable<VerificationPlan> myplans = Collections.EMPTY_LIST
//		if (!systemEvidence){
//			myplans = acp.assureOwn
//		}
//		if (myplans.empty){
//		 myplans = cc.getVerificationPlans(acp);
//		}
//		var AssuranceCase acase = null
//		if (!myplans.empty) {
//			acase = factory.createAssuranceCase
//			acase.name = acp.name
//			acase.target = acp
//			acase.metrics = factory.createMetrics
//			for (myplan : myplans) {
//				for (claim : (myplan as VerificationPlan).claim) {
//					if (claim.evaluateRequirementFilter(requirementFilter))
//						acase.claimResult += claim.construct
//				}
//			}
//			for (myplan : allPlans) {
//				for (claim : (myplan as VerificationPlan).claim) {
//					if (claim.evaluateRequirementFilter(requirementFilter))
//						acase.claimResult += claim.construct
//				}
//			}
//			for (subci : cc.subcomponentClassifiers) {
//				acase.subAssuranceCase += subci.filterplans(acp)
//			}
//		}
//		acase
//	}
//
//	def AssuranceCase filterplans(ComponentClassifier cc, AssurancePlan parentacp) {
//		if(cc instanceof ComponentType || cc.skipAssuranceplans(parentacp)) return null
//		val subacp = cc.getSubsystemAssuranceplan(parentacp)
//		if (subacp != null) {
//			subacp.constructCase
//		} else {
//			cc.constructSystemEvidence(parentacp)
//		}
//	}
//
//	def subcomponentClassifiers(ComponentClassifier cl) {
//		if (cl instanceof ComponentImplementation) {
//			val List<ComponentClassifier> result = new UniqueEList<ComponentClassifier>()
//			result += cl.allSubcomponents.map[sub|sub.classifier]
//			result
//		} else {
//			Collections.emptyList
//		}
//	}
//
//	def boolean skipAssuranceplans(ComponentClassifier cc, AssurancePlan parentacp) {
//		if (parentacp.assumeAll) return true
//		val assumes = parentacp.assumeSubsystems
//		for (cl : assumes) {
//			if(cc.isSameorExtends(cl)) return true;
//		}
//		return false
//	}
//
//	def AssurancePlan getSubsystemAssuranceplan(ComponentClassifier cc, AssurancePlan parentacp) {
//		val assure = parentacp.assureSubsystemPlans
//		for (ap : assure) {
//			if(cc.isSameorExtends(ap.target)) return ap;
//		}
//		return null
//	}
//
//	def ClaimResult construct(Claim claim) {
//		val claimresult = factory.createClaimResult
//		claimresult.target = claim.requirement
//		claimresult.metrics = factory.createMetrics
//		for (subclaim : claim?.subclaim) {
//			claimresult.subClaimResult += subclaim.construct
//		}
//		if (claim.assert != null) {
//			claimresult.verificationActivityResult.construct(claim.assert)
//		} else {
//			for (va : claim.activities) {
//				claimresult.verificationActivityResult.doConstruct(va)
//			}
//		}
//		claimresult
//	}
//
//	def void construct(List<VerificationExpr> arl, ArgumentExpr expr) {
//		switch expr {
//			AllExpr: arl.doConstruct(expr)
//			ThenExpr: arl.doConstruct(expr)
//			ElseExpr: arl.doConstruct(expr)
//			RefExpr: arl.doConstruct(expr)
//		}
//	}
//
//	def void doConstruct(List<VerificationExpr> arl, AllExpr expr) {
//		for (subexpr : expr.elements) {
//			arl.construct(subexpr)
//		}
//	}
//
//	def void doConstruct(List<VerificationExpr> arl, ThenExpr expr) {
//		val thenres = factory.createThenResult
//		thenres.metrics = factory.createMetrics
//		thenres.first.construct(expr.left)
//		thenres.second.construct(expr.successor)
//		if (thenres.first.empty) return;
//		if (thenres.second.empty) {
//			arl += thenres.first
//		} else {
//			arl += thenres
//		}
//	}
//
//	def void doConstruct(List<VerificationExpr> arl, ElseExpr expr) {
//		val elseres = factory.createElseResult
//		elseres.metrics = factory.createMetrics
//		elseres.first.construct(expr.left)
//		elseres.other.construct(expr.other)
//		if(expr.fail != null) elseres.fail.construct(expr.fail)
//		if(expr.timeout != null) elseres.timeout.construct(expr.timeout)
//		if (elseres.first.empty) return;
//		if (elseres.other.empty && elseres.fail.empty && elseres.timeout.empty){
//			arl += elseres.first
//		} else {
//			arl += elseres
//		}
//	}
//
//
//	def void doConstruct(List<VerificationExpr> arl, RefExpr expr) {
//		val va = expr.verification
//		if (va.evaluateSelectionFilter(selectionFilter) && va.evaluateVerificationFilter(verificationFilter)) {
//			val vr = factory.createVerificationActivityResult
//			vr.resultState = VerificationResultState.TBD
//			vr.executionState = VerificationExecutionState.TODO
//			vr.target = expr.verification
//			vr.metrics = factory.createMetrics
//			arl += vr
//			val cond = expr.verification?.method?.condition
//			if (cond != null) {
//				vr.conditionResult = doConstruct(cond)
//			}
//		}
//	}
//
//
//	def void doConstruct(List<VerificationExpr> arl, VerificationActivity expr) {
//		if (expr.evaluateSelectionFilter(selectionFilter)) {
//		val vr = factory.createVerificationActivityResult
//		vr.resultState = VerificationResultState.TBD
//		vr.executionState = VerificationExecutionState.TODO
//		vr.target = expr
//		vr.metrics = factory.createMetrics
//		val cond = expr.method?.condition
//		if (cond != null) {
//			vr.conditionResult = doConstruct(cond)
//		}
//		}
//	}
//
//	def VerificationResult doConstruct( VerificationCondition vc) {
//		var VerificationResult vcr
//		switch (vc) {
//			VerificationValidation: {
//				vcr = factory.createValidationResult
//			}
//			VerificationPrecondition: {
//				vcr = factory.createPreconditionResult
//			}
//		}
//		vcr.resultState = VerificationResultState.TBD
//		vcr.executionState = VerificationExecutionState.TODO
//		vcr.metrics = factory.createMetrics
//		return vcr
//	}

	
}
