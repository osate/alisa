/*
 * generated by Xtext
 */
package org.osate.reqspec.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.osate.reqspec.reqSpec.ContractualElement
import org.osate.xtext.aadl2.properties.scoping.PropertiesScopeProvider

import static org.osate.reqspec.util.ReqSpecUtilExtension.*

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class ReqSpecScopeProvider extends PropertiesScopeProvider {
	
	//Reference is from Goal, ReqSpec, or Hazard
	def scope_NamedElement(ContractualElement context, EReference reference) {
		val targetClassifier = contextClassifier(context)
		if (targetClassifier != null){
			targetClassifier.getAllFeatures.scopeFor
		} else {
			IScope.NULLSCOPE
		}
	}


}
