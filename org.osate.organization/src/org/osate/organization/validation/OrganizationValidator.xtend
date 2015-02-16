/*
 * generated by Xtext
 */
package org.osate.organization.validation

import com.google.inject.Inject
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.validation.Check
import org.osate.organization.organization.OrganizationPackage
import org.osate.organization.organization.Stakeholder
import org.osate.organization.util.OrganizationUtil

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class OrganizationValidator extends AbstractOrganizationValidator {
	extension OrganizationUtil ou = new OrganizationUtil
	@Inject
	private IGlobalScopeProvider scopeProvider;

	public static val DUPLICATE_STAKEHOLDER = "org.osate.organization.DuplicateStakeholder"
	public static val DUPLICATE_ORGANIZATION = "org.osate.organization.DuplicateOrganization"

	/**
 * Check that stakeholder names are unique within an organization
 */
	@Check
	def void checkDuplicateStakeholder(Stakeholder sh) {
		if (sh.containingOrganization.stakeholder.exists [
			it != sh && it.name == sh.name
		])
			error(
				"Duplicate stakeholder '" + sh.name + "'",
				OrganizationPackage::eINSTANCE.stakeholder_Name,
				DUPLICATE_STAKEHOLDER,
				sh.name
			)
	}


}
