/*
* generated by Xtext
*/
package org.osate.categories.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.osate.categories.services.CategoriesGrammarAccess;

public class CategoriesParser extends AbstractContentAssistParser {
	
	@Inject
	private CategoriesGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.osate.categories.ui.contentassist.antlr.internal.InternalCategoriesParser createParser() {
		org.osate.categories.ui.contentassist.antlr.internal.InternalCategoriesParser result = new org.osate.categories.ui.contentassist.antlr.internal.InternalCategoriesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCategoriesAccess().getAlternatives(), "rule__Categories__Alternatives");
					put(grammarAccess.getCategoryAccess().getAlternatives(), "rule__Category__Alternatives");
					put(grammarAccess.getDescriptionElementAccess().getAlternatives(), "rule__DescriptionElement__Alternatives");
					put(grammarAccess.getRequirementCategoriesAccess().getGroup(), "rule__RequirementCategories__Group__0");
					put(grammarAccess.getHazardCategoriesAccess().getGroup(), "rule__HazardCategories__Group__0");
					put(grammarAccess.getVerificationCategoriesAccess().getGroup(), "rule__VerificationCategories__Group__0");
					put(grammarAccess.getRequirementCategoryAccess().getGroup(), "rule__RequirementCategory__Group__0");
					put(grammarAccess.getRequirementCategoryAccess().getGroup_2(), "rule__RequirementCategory__Group_2__0");
					put(grammarAccess.getHazardCategoryAccess().getGroup(), "rule__HazardCategory__Group__0");
					put(grammarAccess.getHazardCategoryAccess().getGroup_2(), "rule__HazardCategory__Group_2__0");
					put(grammarAccess.getVerificationCategoryAccess().getGroup(), "rule__VerificationCategory__Group__0");
					put(grammarAccess.getVerificationCategoryAccess().getGroup_2(), "rule__VerificationCategory__Group_2__0");
					put(grammarAccess.getReferencePathAccess().getGroup(), "rule__ReferencePath__Group__0");
					put(grammarAccess.getReferencePathAccess().getGroup_1(), "rule__ReferencePath__Group_1__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup(), "rule__AadlClassifierReference__Group__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup_0(), "rule__AadlClassifierReference__Group_0__0");
					put(grammarAccess.getAadlClassifierReferenceAccess().getGroup_2(), "rule__AadlClassifierReference__Group_2__0");
					put(grammarAccess.getRequirementCategoriesAccess().getCategoryAssignment_3(), "rule__RequirementCategories__CategoryAssignment_3");
					put(grammarAccess.getHazardCategoriesAccess().getCategoryAssignment_3(), "rule__HazardCategories__CategoryAssignment_3");
					put(grammarAccess.getVerificationCategoriesAccess().getCategoryAssignment_3(), "rule__VerificationCategories__CategoryAssignment_3");
					put(grammarAccess.getRequirementCategoryAccess().getNameAssignment_1(), "rule__RequirementCategory__NameAssignment_1");
					put(grammarAccess.getRequirementCategoryAccess().getExtendsAssignment_2_1(), "rule__RequirementCategory__ExtendsAssignment_2_1");
					put(grammarAccess.getHazardCategoryAccess().getNameAssignment_1(), "rule__HazardCategory__NameAssignment_1");
					put(grammarAccess.getHazardCategoryAccess().getExtendsAssignment_2_1(), "rule__HazardCategory__ExtendsAssignment_2_1");
					put(grammarAccess.getVerificationCategoryAccess().getNameAssignment_1(), "rule__VerificationCategory__NameAssignment_1");
					put(grammarAccess.getVerificationCategoryAccess().getExtendsAssignment_2_1(), "rule__VerificationCategory__ExtendsAssignment_2_1");
					put(grammarAccess.getModelAccess().getContentAssignment(), "rule__Model__ContentAssignment");
					put(grammarAccess.getDescriptionAccess().getDescriptionAssignment(), "rule__Description__DescriptionAssignment");
					put(grammarAccess.getDescriptionElementAccess().getTextAssignment_0(), "rule__DescriptionElement__TextAssignment_0");
					put(grammarAccess.getDescriptionElementAccess().getRefAssignment_1(), "rule__DescriptionElement__RefAssignment_1");
					put(grammarAccess.getReferencePathAccess().getRefAssignment_0(), "rule__ReferencePath__RefAssignment_0");
					put(grammarAccess.getReferencePathAccess().getSubpathAssignment_1_1(), "rule__ReferencePath__SubpathAssignment_1_1");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.osate.categories.ui.contentassist.antlr.internal.InternalCategoriesParser typedParser = (org.osate.categories.ui.contentassist.antlr.internal.InternalCategoriesParser) parser;
			typedParser.entryRuleCategories();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CategoriesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CategoriesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
