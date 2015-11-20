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

package org.osate.verify.util

import com.google.inject.ImplementedBy
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.osate.aadl2.ComponentClassifier
import org.osate.alisa.common.scoping.ICommonGlobalReferenceFinder
import org.osate.reqspec.reqSpec.SystemRequirements
import org.osate.verify.verify.VerificationPlan
import org.osate.verify.verify.VerifyPackage

import static extension org.osate.alisa.common.util.CommonUtilExtension.*
import static extension org.osate.reqspec.util.ReqSpecUtilExtension.*
import org.osate.aadl2.ComponentCategory

@ImplementedBy(VerifyGlobalReferenceFinder)
interface IVerifyGlobalReferenceFinder {
	/**
	 * do not use this methods to construction of scopes as they are operating on references
	 * cc is the classifier that must be the same or an ancestor of the classifier referenced by the system requirements or the verification plan
	 * context determines the resourceset into which the verificaiton plans are loaded
	 */
	def Iterable<VerificationPlan> getVerificationPlans(ComponentClassifier cc ,EObject context);

	/**
	 * method to be used for scope creation as it does not use EReferences
	 */
	def Iterable<VerificationPlan> getGlobalReqVerificationPlans(EObject context, ComponentCategory cc);
	
	def Iterable<VerificationPlan> getAllVerificationPlansForSystemRequirement(SystemRequirements sysReqs, EObject context);
}

class VerifyGlobalReferenceFinder implements IVerifyGlobalReferenceFinder{
		
	@Inject
	var ICommonGlobalReferenceFinder refFinder
		
		override Iterable<VerificationPlan> getVerificationPlans(ComponentClassifier cc, EObject context){
			return refFinder.getEObjectDescriptions(context, VerifyPackage.Literals.VERIFICATION_PLAN, "verify").map [ eod |
			EcoreUtil.resolve(eod.EObjectOrProxy, context) as VerificationPlan].filter[vp|cc.isSameorExtends(vp.systemRequirements?.target)]
	}
		

		
		override Iterable<VerificationPlan> getGlobalReqVerificationPlans(EObject context, ComponentCategory cc){
			 refFinder.getEObjectDescriptions(context, VerifyPackage.Literals.VERIFICATION_PLAN, "verify").map [ eod |
			EcoreUtil.resolve(eod.EObjectOrProxy, context) as VerificationPlan
		].filter[vp|vp.systemRequirements?.global || vp.systemRequirements.matchingCategory(cc)]
		
		}

		override Iterable<VerificationPlan> getAllVerificationPlansForSystemRequirement(SystemRequirements sysReqs, EObject context){
			 refFinder.getEObjectDescriptions(context, VerifyPackage.Literals.VERIFICATION_PLAN, "verify").map [ eod |
			EcoreUtil.resolve(eod.EObjectOrProxy, context) as VerificationPlan].filter[vp|vp.systemRequirements === sysReqs]
		}

}