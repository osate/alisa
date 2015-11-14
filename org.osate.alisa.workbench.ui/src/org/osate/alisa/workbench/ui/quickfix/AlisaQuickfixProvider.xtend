/*
* generated by Xtext
*/
package org.osate.alisa.workbench.ui.quickfix

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.osate.alisa.workbench.alisa.AssurancePlan
import org.osate.alisa.workbench.validation.AlisaValidator
import org.osate.verify.verify.VerificationPlan

//import org.eclipse.xtext.ui.editor.quickfix.Fix
//import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
//import org.eclipse.xtext.validation.Issue

/**
 * Custom quickfixes.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class AlisaQuickfixProvider extends DefaultQuickfixProvider {

//	@Fix(MyDslValidator::INVALID_NAME)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
//			context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//		]
//	}

	/**
	 * QuickFix for missing assureOwn
	 * The issue data array is expected to have multiple data elements:
	 * issue.getData()[Even]: The name of a missing verification plan
	 * issue.getData()[Odd]: The URI of the missing verification plan named prior
	 */
	@Fix(AlisaValidator.ASSURANCE_PLAN_OWN_MISSING_VERIFICATION_PLANS)
	def public void fixMissingOwnVerificationPlans(Issue issue, IssueResolutionAcceptor acceptor) {
		val names = "'" + issue.getData.indexed().filter([key % 2 == 0]).join("', '", [value]) + "'"
		acceptor.accept(issue, "Add verification plans " + names + " to 'assure own'", null, null,
				new ISemanticModification() {
					override apply(EObject element, IModificationContext context) throws Exception {
						val assurancePlan = element as AssurancePlan
						val ResourceSet resourceSet = element.eResource().getResourceSet()
						val uris = issue.getData.indexed().filter([key % 2 == 1])
						uris.forEach([uri |
							assurancePlan.assureOwn.add(resourceSet.getEObject(URI.createURI(uri.value), true) as VerificationPlan)
						])
					}
				});
	}

	/**
	 * QuickFix for invalid verification plans in assureOwn
	 * The issue data array is expected to have multiple data elements:
	 * issue.getData()[Even]: The name of a invalid verification plan
	 * issue.getData()[Odd]: The URI of the invlaid verification plan named prior
	 */
	@Fix(AlisaValidator.ASSURANCE_PLAN_OWN_INVALID_VERIFICATION_PLANS)
	def public void fixInvalidOwnVerificationPlans(Issue issue, IssueResolutionAcceptor acceptor) {
		val name = issue.getData.head
		val vpUri = issue.getData.get(1)
		acceptor.accept(issue, "Remove verification plan '" + name + "' from 'assure own'", null, null,
				new ISemanticModification() {
					override apply(EObject element, IModificationContext context) throws Exception {
						val assurancePlan = element as AssurancePlan
						val ResourceSet resourceSet = element.eResource().getResourceSet()
						assurancePlan.assureOwn.remove(resourceSet.getEObject(URI.createURI(vpUri), true) as VerificationPlan)
					}
				});
	}
}
