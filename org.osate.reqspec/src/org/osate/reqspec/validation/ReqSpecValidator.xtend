/*
 * generated by Xtext
 */
package org.osate.reqspec.validation
import org.eclipse.xtext.validation.Check
import org.osate.reqspec.reqSpec.Goal
import org.osate.reqspec.reqSpec.ReqSpecPackage
import org.osate.reqspec.reqSpec.Requirement

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class ReqSpecValidator extends AbstractReqSpecValidator {

  public static val MISSING_STAKEHOLDER = 'missingStakeholder'
  public static val MISSING_STAKEHOLDER_GOAL = 'missingStakeholderGoal'

	@Check
	def void checkMissingStakeholder(Goal goal) {
		if (goal.stakeholderReference.empty) {
			if (goal.refinesReference.empty){
			warning('Goal should have stakeholders', 
					ReqSpecPackage.Literals.GOAL__STAKEHOLDER_REFERENCE,
					MISSING_STAKEHOLDER)
			} else {
				goal.refinesReference.forEach[checkMissingStakeholder]
			}		
		}
	}
	@Check
	def void checkMissingGoal(Requirement req) {
		if (req.goalReference.empty  && req.stakeholderRequirementReference.empty) {
			if (req.refinesReference.empty){ 
			warning('System requirement should have stakeholder goal', 
					ReqSpecPackage.Literals.REQUIREMENT__GOAL_REFERENCE,
					MISSING_STAKEHOLDER_GOAL)
			} else {
				req.refinesReference.forEach[checkMissingGoal]
			}		
		}
	}
}
