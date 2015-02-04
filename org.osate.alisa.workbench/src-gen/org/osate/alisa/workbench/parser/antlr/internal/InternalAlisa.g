/*
* generated by Xtext
*/
grammar InternalAlisa;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.osate.alisa.workbench.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.osate.alisa.workbench.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.alisa.workbench.services.AlisaGrammarAccess;

}

@parser::members {

 	private AlisaGrammarAccess grammarAccess;
 	
    public InternalAlisaParser(TokenStream input, AlisaGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "AlisaWorkArea";	
   	}
   	
   	@Override
   	protected AlisaGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleAlisaWorkArea
entryRuleAlisaWorkArea returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAlisaWorkAreaRule()); }
	 iv_ruleAlisaWorkArea=ruleAlisaWorkArea 
	 { $current=$iv_ruleAlisaWorkArea.current; } 
	 EOF 
;

// Rule AlisaWorkArea
ruleAlisaWorkArea returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='alisa' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAlisaWorkAreaAccess().getAlisaKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAlisaWorkAreaAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAlisaWorkAreaRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAlisaWorkAreaAccess().getCasesAssuranceCaseConfigurationParserRuleCall_2_0()); 
	    }
		lv_cases_2_0=ruleAssuranceCaseConfiguration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAlisaWorkAreaRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_2_0, 
        		"AssuranceCaseConfiguration");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleAssuranceCaseConfiguration
entryRuleAssuranceCaseConfiguration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAssuranceCaseConfigurationRule()); }
	 iv_ruleAssuranceCaseConfiguration=ruleAssuranceCaseConfiguration 
	 { $current=$iv_ruleAssuranceCaseConfiguration.current; } 
	 EOF 
;

// Rule AssuranceCaseConfiguration
ruleAssuranceCaseConfiguration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='case' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAssuranceCaseConfigurationAccess().getCaseKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAssuranceCaseConfigurationAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssuranceCaseConfigurationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAssuranceCaseConfigurationAccess().getColonKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAssuranceCaseConfigurationAccess().getTitleValueStringParserRuleCall_2_1_0()); 
	    }
		lv_title_3_0=ruleValueString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAssuranceCaseConfigurationRule());
	        }
       		set(
       			$current, 
       			"title",
        		lv_title_3_0, 
        		"ValueString");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_4='for' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAssuranceCaseConfigurationAccess().getForKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssuranceCaseConfigurationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAssuranceCaseConfigurationAccess().getSystemComponentImplementationCrossReference_4_0()); 
	    }
		ruleAadlClassifierReference		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='[' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAssuranceCaseConfigurationAccess().getLeftSquareBracketKeyword_5());
    }
((	otherlv_7='description' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getAssuranceCaseConfigurationAccess().getDescriptionKeyword_6_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAssuranceCaseConfigurationAccess().getDescriptionDescriptionParserRuleCall_6_0_1_0()); 
	    }
		lv_description_8_0=ruleDescription		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAssuranceCaseConfigurationRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_8_0, 
        		"Description");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_9='constants' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getAssuranceCaseConfigurationAccess().getConstantsKeyword_6_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAssuranceCaseConfigurationAccess().getConstantConstantDeclParserRuleCall_6_1_1_0()); 
	    }
		lv_constant_10_0=ruleConstantDecl		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAssuranceCaseConfigurationRule());
	        }
       		add(
       			$current, 
       			"constant",
        		lv_constant_10_0, 
        		"ConstantDecl");
	        afterParserOrEnumRuleCall();
	    }

)
)+)?	otherlv_11='plans' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getAssuranceCaseConfigurationAccess().getPlansKeyword_6_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssuranceCaseConfigurationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAssuranceCaseConfigurationAccess().getPlansVerificationPlanCrossReference_6_3_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)+(	otherlv_13='when' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getAssuranceCaseConfigurationAccess().getWhenKeyword_6_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssuranceCaseConfigurationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getAssuranceCaseConfigurationAccess().getSelectionFilterSelectionCategoryCrossReference_6_4_1_0()); 
	    }
		ruleCatRef		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)+)?)	otherlv_15=']' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getAssuranceCaseConfigurationAccess().getRightSquareBracketKeyword_7());
    }
)
;







// Entry rule entryRuleDescription
entryRuleDescription returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDescriptionRule()); }
	 iv_ruleDescription=ruleDescription 
	 { $current=$iv_ruleDescription.current; } 
	 EOF 
;

// Rule Description
ruleDescription returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getDescriptionAccess().getDescriptionDescriptionElementParserRuleCall_0()); 
	    }
		lv_description_0_0=ruleDescriptionElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDescriptionRule());
	        }
       		add(
       			$current, 
       			"description",
        		lv_description_0_0, 
        		"DescriptionElement");
	        afterParserOrEnumRuleCall();
	    }

)
)+
;





// Entry rule entryRuleDescriptionElement
entryRuleDescriptionElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDescriptionElementRule()); }
	 iv_ruleDescriptionElement=ruleDescriptionElement 
	 { $current=$iv_ruleDescriptionElement.current; } 
	 EOF 
;

// Rule DescriptionElement
ruleDescriptionElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_text_0_0=RULE_STRING
		{
			newLeafNode(lv_text_0_0, grammarAccess.getDescriptionElementAccess().getTextSTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDescriptionElementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_0_0, 
        		"STRING");
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getDescriptionElementAccess().getValueShowValueParserRuleCall_1_0()); 
	    }
		lv_value_1_0=ruleShowValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDescriptionElementRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"ShowValue");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		lv_newline_2_0=	'&' 
    {
        newLeafNode(lv_newline_2_0, grammarAccess.getDescriptionElementAccess().getNewlineAmpersandKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDescriptionElementRule());
	        }
       		setWithLastConsumed($current, "newline", true, "&");
	    }

)
)
    |(
(
		lv_thisTarget_3_0=	'this' 
    {
        newLeafNode(lv_thisTarget_3_0, grammarAccess.getDescriptionElementAccess().getThisTargetThisKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDescriptionElementRule());
	        }
       		setWithLastConsumed($current, "thisTarget", true, "this");
	    }

)
))
;





// Entry rule entryRuleShowValue
entryRuleShowValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getShowValueRule()); }
	 iv_ruleShowValue=ruleShowValue 
	 { $current=$iv_ruleShowValue.current; } 
	 EOF 
;

// Rule ShowValue
ruleShowValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getShowValueRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getShowValueAccess().getRefConstantDeclCrossReference_0_0()); 
	}

)
)(	otherlv_1='%' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getShowValueAccess().getPercentSignKeyword_1_0());
    }
(
(
		lv_unit_2_0=RULE_ID
		{
			newLeafNode(lv_unit_2_0, grammarAccess.getShowValueAccess().getUnitIDTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getShowValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"unit",
        		lv_unit_2_0, 
        		"ID");
	    }

)
))?)
;





// Entry rule entryRuleReferencePath
entryRuleReferencePath returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getReferencePathRule()); }
	 iv_ruleReferencePath=ruleReferencePath 
	 { $current=$iv_ruleReferencePath.current; } 
	 EOF 
;

// Rule ReferencePath
ruleReferencePath returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getReferencePathRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getReferencePathAccess().getRefEObjectCrossReference_0_0()); 
	}

)
)(	otherlv_1='.' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getReferencePathAccess().getFullStopKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getReferencePathAccess().getSubpathReferencePathParserRuleCall_1_1_0()); 
	    }
		lv_subpath_2_0=ruleReferencePath		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getReferencePathRule());
	        }
       		set(
       			$current, 
       			"subpath",
        		lv_subpath_2_0, 
        		"ReferencePath");
	        afterParserOrEnumRuleCall();
	    }

)
)))
;







// Entry rule entryRuleConstantDecl
entryRuleConstantDecl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstantDeclRule()); }
	 iv_ruleConstantDecl=ruleConstantDecl 
	 { $current=$iv_ruleConstantDecl.current; } 
	 EOF 
;

// Rule ConstantDecl
ruleConstantDecl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getConstantDeclAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstantDeclRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConstantDeclAccess().getEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConstantDeclAccess().getConstantvalueConstantValueParserRuleCall_2_0()); 
	    }
		lv_constantvalue_2_0=ruleConstantValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstantDeclRule());
	        }
       		set(
       			$current, 
       			"constantvalue",
        		lv_constantvalue_2_0, 
        		"ConstantValue");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleConstantValue
entryRuleConstantValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstantValueRule()); }
	 iv_ruleConstantValue=ruleConstantValue 
	 { $current=$iv_ruleConstantValue.current; } 
	 EOF 
;

// Rule ConstantValue
ruleConstantValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getConstantValueAccess().getStringTermParserRuleCall_0()); 
    }
    this_StringTerm_0=ruleStringTerm
    { 
        $current = $this_StringTerm_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConstantValueAccess().getRealTermParserRuleCall_1()); 
    }
    this_RealTerm_1=ruleRealTerm
    { 
        $current = $this_RealTerm_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getConstantValueAccess().getIntegerTermParserRuleCall_2()); 
    }
    this_IntegerTerm_2=ruleIntegerTerm
    { 
        $current = $this_IntegerTerm_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleStringTerm
entryRuleStringTerm returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringTermRule()); }
	 iv_ruleStringTerm=ruleStringTerm 
	 { $current=$iv_ruleStringTerm.current; } 
	 EOF 
;

// Rule StringTerm
ruleStringTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_STRING
		{
			newLeafNode(lv_value_0_0, grammarAccess.getStringTermAccess().getValueSTRINGTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringTermRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"STRING");
	    }

)
)
;





// Entry rule entryRuleRealTerm
entryRuleRealTerm returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRealTermRule()); }
	 iv_ruleRealTerm=ruleRealTerm 
	 { $current=$iv_ruleRealTerm.current; } 
	 EOF 
;

// Rule RealTerm
ruleRealTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getRealTermAccess().getValueREALParserRuleCall_0_0()); 
	    }
		lv_value_0_0=ruleREAL		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRealTermRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"REAL");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_unit_1_0=RULE_ID
		{
			newLeafNode(lv_unit_1_0, grammarAccess.getRealTermAccess().getUnitIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRealTermRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"unit",
        		lv_unit_1_0, 
        		"ID");
	    }

)
)?)
;





// Entry rule entryRuleREAL
entryRuleREAL returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getREALRule()); } 
	 iv_ruleREAL=ruleREAL 
	 { $current=$iv_ruleREAL.current.getText(); }  
	 EOF 
;

// Rule REAL
ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
    }

	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1()); 
    }
    this_INT_2=RULE_INT    {
		$current.merge(this_INT_2);
    }

    { 
    newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
    }
)
    ;





// Entry rule entryRuleIntegerTerm
entryRuleIntegerTerm returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntegerTermRule()); }
	 iv_ruleIntegerTerm=ruleIntegerTerm 
	 { $current=$iv_ruleIntegerTerm.current; } 
	 EOF 
;

// Rule IntegerTerm
ruleIntegerTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_value_0_0=RULE_INT
		{
			newLeafNode(lv_value_0_0, grammarAccess.getIntegerTermAccess().getValueINTTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntegerTermRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"INT");
	    }

)
)(
(
		lv_unit_1_0=RULE_ID
		{
			newLeafNode(lv_unit_1_0, grammarAccess.getIntegerTermAccess().getUnitIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIntegerTermRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"unit",
        		lv_unit_1_0, 
        		"ID");
	    }

)
)?)
;







// Entry rule entryRuleTextElement
entryRuleTextElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTextElementRule()); }
	 iv_ruleTextElement=ruleTextElement 
	 { $current=$iv_ruleTextElement.current; } 
	 EOF 
;

// Rule TextElement
ruleTextElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_text_0_0=RULE_STRING
		{
			newLeafNode(lv_text_0_0, grammarAccess.getTextElementAccess().getTextSTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextElementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_0_0, 
        		"STRING");
	    }

)
)
    |(
(
		lv_newline_1_0=	'&' 
    {
        newLeafNode(lv_newline_1_0, grammarAccess.getTextElementAccess().getNewlineAmpersandKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextElementRule());
	        }
       		setWithLastConsumed($current, "newline", true, "&");
	    }

)
))
;





// Entry rule entryRuleValueString
entryRuleValueString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueStringRule()); } 
	 iv_ruleValueString=ruleValueString 
	 { $current=$iv_ruleValueString.current.getText(); }  
	 EOF 
;

// Rule ValueString
ruleValueString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getValueStringAccess().getSTRINGTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleAadlClassifierReference
entryRuleAadlClassifierReference returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getAadlClassifierReferenceRule()); } 
	 iv_ruleAadlClassifierReference=ruleAadlClassifierReference 
	 { $current=$iv_ruleAadlClassifierReference.current.getText(); }  
	 EOF 
;

// Rule AadlClassifierReference
ruleAadlClassifierReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_0_0()); 
    }

	kw='::' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAadlClassifierReferenceAccess().getColonColonKeyword_0_1()); 
    }
)*    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_1()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAadlClassifierReferenceAccess().getFullStopKeyword_2_0()); 
    }
    this_ID_4=RULE_ID    {
		$current.merge(this_ID_4);
    }

    { 
    newLeafNode(this_ID_4, grammarAccess.getAadlClassifierReferenceAccess().getIDTerminalRuleCall_2_1()); 
    }
)?)
    ;





// Entry rule entryRuleCatRef
entryRuleCatRef returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getCatRefRule()); } 
	 iv_ruleCatRef=ruleCatRef 
	 { $current=$iv_ruleCatRef.current.getText(); }  
	 EOF 
;

// Rule CatRef
ruleCatRef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getCatRefAccess().getIDTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;







RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


