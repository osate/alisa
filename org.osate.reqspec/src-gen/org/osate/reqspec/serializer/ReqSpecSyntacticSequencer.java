/*
 * generated by Xtext
 */
package org.osate.reqspec.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.osate.reqspec.services.ReqSpecGrammarAccess;

@SuppressWarnings("all")
public class ReqSpecSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ReqSpecGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Goal_CategoryKeyword_5_0_0_q;
	protected AbstractElementAlias match_Goal_IssuesKeyword_5_10_0_q;
	protected AbstractElementAlias match_Goal_RefinesKeyword_5_5_0_q;
	protected AbstractElementAlias match_Goal_StakeholderKeyword_5_7_0_q;
	protected AbstractElementAlias match_Goal___ConflictsKeyword_5_6_0_WithKeyword_5_6_1__q;
	protected AbstractElementAlias match_Goal___SeeKeyword_5_8_0_DocumentKeyword_5_8_1_RequirementKeyword_5_8_2__q;
	protected AbstractElementAlias match_Goal___SeeKeyword_5_9_0_DocumentKeyword_5_9_1__q;
	protected AbstractElementAlias match_ReqSpecs_IssuesKeyword_7_3_0_q;
	protected AbstractElementAlias match_ReqSpecs___SeeKeyword_7_2_0_DocumentKeyword_7_2_1__q;
	protected AbstractElementAlias match_Requirement_CategoryKeyword_5_0_0_q;
	protected AbstractElementAlias match_Requirement_ForKeyword_3_0_q;
	protected AbstractElementAlias match_Requirement_IssuesKeyword_5_13_0_q;
	protected AbstractElementAlias match_Requirement_RefinesKeyword_5_8_0_q;
	protected AbstractElementAlias match_Requirement___SeeKeyword_5_10_0_DocumentKeyword_5_10_1_GoalKeyword_5_10_2__q;
	protected AbstractElementAlias match_Requirement___SeeKeyword_5_11_0_DocumentKeyword_5_11_1_RequirementKeyword_5_11_2__q;
	protected AbstractElementAlias match_Requirement___SeeKeyword_5_12_0_DocumentKeyword_5_12_1__q;
	protected AbstractElementAlias match_Requirement___SeeKeyword_5_9_0_GoalKeyword_5_9_1__q;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XImportDeclaration_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ReqSpecGrammarAccess) access;
		match_Goal_CategoryKeyword_5_0_0_q = new TokenAlias(false, true, grammarAccess.getGoalAccess().getCategoryKeyword_5_0_0());
		match_Goal_IssuesKeyword_5_10_0_q = new TokenAlias(false, true, grammarAccess.getGoalAccess().getIssuesKeyword_5_10_0());
		match_Goal_RefinesKeyword_5_5_0_q = new TokenAlias(false, true, grammarAccess.getGoalAccess().getRefinesKeyword_5_5_0());
		match_Goal_StakeholderKeyword_5_7_0_q = new TokenAlias(false, true, grammarAccess.getGoalAccess().getStakeholderKeyword_5_7_0());
		match_Goal___ConflictsKeyword_5_6_0_WithKeyword_5_6_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGoalAccess().getConflictsKeyword_5_6_0()), new TokenAlias(false, false, grammarAccess.getGoalAccess().getWithKeyword_5_6_1()));
		match_Goal___SeeKeyword_5_8_0_DocumentKeyword_5_8_1_RequirementKeyword_5_8_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGoalAccess().getSeeKeyword_5_8_0()), new TokenAlias(false, false, grammarAccess.getGoalAccess().getDocumentKeyword_5_8_1()), new TokenAlias(false, false, grammarAccess.getGoalAccess().getRequirementKeyword_5_8_2()));
		match_Goal___SeeKeyword_5_9_0_DocumentKeyword_5_9_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGoalAccess().getSeeKeyword_5_9_0()), new TokenAlias(false, false, grammarAccess.getGoalAccess().getDocumentKeyword_5_9_1()));
		match_ReqSpecs_IssuesKeyword_7_3_0_q = new TokenAlias(false, true, grammarAccess.getReqSpecsAccess().getIssuesKeyword_7_3_0());
		match_ReqSpecs___SeeKeyword_7_2_0_DocumentKeyword_7_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReqSpecsAccess().getSeeKeyword_7_2_0()), new TokenAlias(false, false, grammarAccess.getReqSpecsAccess().getDocumentKeyword_7_2_1()));
		match_Requirement_CategoryKeyword_5_0_0_q = new TokenAlias(false, true, grammarAccess.getRequirementAccess().getCategoryKeyword_5_0_0());
		match_Requirement_ForKeyword_3_0_q = new TokenAlias(false, true, grammarAccess.getRequirementAccess().getForKeyword_3_0());
		match_Requirement_IssuesKeyword_5_13_0_q = new TokenAlias(false, true, grammarAccess.getRequirementAccess().getIssuesKeyword_5_13_0());
		match_Requirement_RefinesKeyword_5_8_0_q = new TokenAlias(false, true, grammarAccess.getRequirementAccess().getRefinesKeyword_5_8_0());
		match_Requirement___SeeKeyword_5_10_0_DocumentKeyword_5_10_1_GoalKeyword_5_10_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequirementAccess().getSeeKeyword_5_10_0()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getDocumentKeyword_5_10_1()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getGoalKeyword_5_10_2()));
		match_Requirement___SeeKeyword_5_11_0_DocumentKeyword_5_11_1_RequirementKeyword_5_11_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequirementAccess().getSeeKeyword_5_11_0()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getDocumentKeyword_5_11_1()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getRequirementKeyword_5_11_2()));
		match_Requirement___SeeKeyword_5_12_0_DocumentKeyword_5_12_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequirementAccess().getSeeKeyword_5_12_0()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getDocumentKeyword_5_12_1()));
		match_Requirement___SeeKeyword_5_9_0_GoalKeyword_5_9_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequirementAccess().getSeeKeyword_5_9_0()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getGoalKeyword_5_9_1()));
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XImportDeclaration_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getXImportDeclarationAccess().getSemicolonKeyword_2());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getArrayBracketsRule())
			return getArrayBracketsToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ArrayBrackets :
	 * 	'[' ']'
	 * ;
	 */
	protected String getArrayBracketsToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[]";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Goal_CategoryKeyword_5_0_0_q.equals(syntax))
				emit_Goal_CategoryKeyword_5_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Goal_IssuesKeyword_5_10_0_q.equals(syntax))
				emit_Goal_IssuesKeyword_5_10_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Goal_RefinesKeyword_5_5_0_q.equals(syntax))
				emit_Goal_RefinesKeyword_5_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Goal_StakeholderKeyword_5_7_0_q.equals(syntax))
				emit_Goal_StakeholderKeyword_5_7_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Goal___ConflictsKeyword_5_6_0_WithKeyword_5_6_1__q.equals(syntax))
				emit_Goal___ConflictsKeyword_5_6_0_WithKeyword_5_6_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Goal___SeeKeyword_5_8_0_DocumentKeyword_5_8_1_RequirementKeyword_5_8_2__q.equals(syntax))
				emit_Goal___SeeKeyword_5_8_0_DocumentKeyword_5_8_1_RequirementKeyword_5_8_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Goal___SeeKeyword_5_9_0_DocumentKeyword_5_9_1__q.equals(syntax))
				emit_Goal___SeeKeyword_5_9_0_DocumentKeyword_5_9_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReqSpecs_IssuesKeyword_7_3_0_q.equals(syntax))
				emit_ReqSpecs_IssuesKeyword_7_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReqSpecs___SeeKeyword_7_2_0_DocumentKeyword_7_2_1__q.equals(syntax))
				emit_ReqSpecs___SeeKeyword_7_2_0_DocumentKeyword_7_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement_CategoryKeyword_5_0_0_q.equals(syntax))
				emit_Requirement_CategoryKeyword_5_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement_ForKeyword_3_0_q.equals(syntax))
				emit_Requirement_ForKeyword_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement_IssuesKeyword_5_13_0_q.equals(syntax))
				emit_Requirement_IssuesKeyword_5_13_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement_RefinesKeyword_5_8_0_q.equals(syntax))
				emit_Requirement_RefinesKeyword_5_8_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement___SeeKeyword_5_10_0_DocumentKeyword_5_10_1_GoalKeyword_5_10_2__q.equals(syntax))
				emit_Requirement___SeeKeyword_5_10_0_DocumentKeyword_5_10_1_GoalKeyword_5_10_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement___SeeKeyword_5_11_0_DocumentKeyword_5_11_1_RequirementKeyword_5_11_2__q.equals(syntax))
				emit_Requirement___SeeKeyword_5_11_0_DocumentKeyword_5_11_1_RequirementKeyword_5_11_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement___SeeKeyword_5_12_0_DocumentKeyword_5_12_1__q.equals(syntax))
				emit_Requirement___SeeKeyword_5_12_0_DocumentKeyword_5_12_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement___SeeKeyword_5_9_0_GoalKeyword_5_9_1__q.equals(syntax))
				emit_Requirement___SeeKeyword_5_9_0_GoalKeyword_5_9_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XImportDeclaration_SemicolonKeyword_2_q.equals(syntax))
				emit_XImportDeclaration_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'category'?
	 *
	 * This ambiguous syntax occurs at:
	 *     category+=[RequirementCategory|ID] (ambiguity) category+=[RequirementCategory|ID]
	 */
	protected void emit_Goal_CategoryKeyword_5_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'issues'?
	 *
	 * This ambiguous syntax occurs at:
	 *     issues+=STRING (ambiguity) issues+=STRING
	 */
	protected void emit_Goal_IssuesKeyword_5_10_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'refines'?
	 *
	 * This ambiguous syntax occurs at:
	 *     refinesReference+=[Goal|QualifiedName] (ambiguity) refinesReference+=[Goal|QualifiedName]
	 */
	protected void emit_Goal_RefinesKeyword_5_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'stakeholder'?
	 *
	 * This ambiguous syntax occurs at:
	 *     stakeholderReference+=[Stakeholder|QualifiedName] (ambiguity) stakeholderReference+=[Stakeholder|QualifiedName]
	 */
	protected void emit_Goal_StakeholderKeyword_5_7_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('conflicts' 'with')?
	 *
	 * This ambiguous syntax occurs at:
	 *     conflictsReference+=[Goal|QualifiedName] (ambiguity) conflictsReference+=[Goal|QualifiedName]
	 */
	protected void emit_Goal___ConflictsKeyword_5_6_0_WithKeyword_5_6_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('see' 'document' 'requirement')?
	 *
	 * This ambiguous syntax occurs at:
	 *     documentRequirement+=[ContractualElement|QualifiedName] (ambiguity) documentRequirement+=[ContractualElement|QualifiedName]
	 */
	protected void emit_Goal___SeeKeyword_5_8_0_DocumentKeyword_5_8_1_RequirementKeyword_5_8_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('see' 'document')?
	 *
	 * This ambiguous syntax occurs at:
	 *     docReference+=ExternalDocument (ambiguity) docReference+=ExternalDocument
	 */
	protected void emit_Goal___SeeKeyword_5_9_0_DocumentKeyword_5_9_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'issues'?
	 *
	 * This ambiguous syntax occurs at:
	 *     issues+=STRING (ambiguity) issues+=STRING
	 */
	protected void emit_ReqSpecs_IssuesKeyword_7_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('see' 'document')?
	 *
	 * This ambiguous syntax occurs at:
	 *     docReference+=ExternalDocument (ambiguity) docReference+=ExternalDocument
	 */
	protected void emit_ReqSpecs___SeeKeyword_7_2_0_DocumentKeyword_7_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'category'?
	 *
	 * This ambiguous syntax occurs at:
	 *     category+=[RequirementCategory|ID] (ambiguity) category+=[RequirementCategory|ID]
	 */
	protected void emit_Requirement_CategoryKeyword_5_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'for'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) '[' ']' (rule end)
	 *     name=ID (ambiguity) '[' 'category' category+=[RequirementCategory|ID]
	 *     name=ID (ambiguity) '[' 'issues' issues+=STRING
	 *     name=ID (ambiguity) '[' 'mitigates' exception=[EObject|ID]
	 *     name=ID (ambiguity) '[' 'mitigates' exceptionText=STRING
	 *     name=ID (ambiguity) '[' 'refines' refinesReference+=[Requirement|QualifiedName]
	 *     name=ID (ambiguity) '[' 'see' 'document' 'goal' stakeholderRequirementReference+=[Goal|QualifiedName]
	 *     name=ID (ambiguity) '[' 'see' 'document' 'requirement' documentRequirement+=[ContractualElement|QualifiedName]
	 *     name=ID (ambiguity) '[' 'see' 'document' docReference+=ExternalDocument
	 *     name=ID (ambiguity) '[' 'see' 'goal' goalReference+=[Goal|QualifiedName]
	 *     name=ID (ambiguity) '[' changeUncertainty=Uncertainty
	 *     name=ID (ambiguity) '[' computes+=ComputeDeclaration
	 *     name=ID (ambiguity) '[' constants+=XValDeclaration
	 *     name=ID (ambiguity) '[' description=Description
	 *     name=ID (ambiguity) '[' predicate=ReqPredicate
	 *     name=ID (ambiguity) '[' rationale=Rationale
	 *     title=STRING (ambiguity) '[' ']' (rule end)
	 *     title=STRING (ambiguity) '[' 'category' category+=[RequirementCategory|ID]
	 *     title=STRING (ambiguity) '[' 'issues' issues+=STRING
	 *     title=STRING (ambiguity) '[' 'mitigates' exception=[EObject|ID]
	 *     title=STRING (ambiguity) '[' 'mitigates' exceptionText=STRING
	 *     title=STRING (ambiguity) '[' 'refines' refinesReference+=[Requirement|QualifiedName]
	 *     title=STRING (ambiguity) '[' 'see' 'document' 'goal' stakeholderRequirementReference+=[Goal|QualifiedName]
	 *     title=STRING (ambiguity) '[' 'see' 'document' 'requirement' documentRequirement+=[ContractualElement|QualifiedName]
	 *     title=STRING (ambiguity) '[' 'see' 'document' docReference+=ExternalDocument
	 *     title=STRING (ambiguity) '[' 'see' 'goal' goalReference+=[Goal|QualifiedName]
	 *     title=STRING (ambiguity) '[' changeUncertainty=Uncertainty
	 *     title=STRING (ambiguity) '[' computes+=ComputeDeclaration
	 *     title=STRING (ambiguity) '[' constants+=XValDeclaration
	 *     title=STRING (ambiguity) '[' description=Description
	 *     title=STRING (ambiguity) '[' predicate=ReqPredicate
	 *     title=STRING (ambiguity) '[' rationale=Rationale
	 */
	protected void emit_Requirement_ForKeyword_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'issues'?
	 *
	 * This ambiguous syntax occurs at:
	 *     issues+=STRING (ambiguity) issues+=STRING
	 */
	protected void emit_Requirement_IssuesKeyword_5_13_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'refines'?
	 *
	 * This ambiguous syntax occurs at:
	 *     refinesReference+=[Requirement|QualifiedName] (ambiguity) refinesReference+=[Requirement|QualifiedName]
	 */
	protected void emit_Requirement_RefinesKeyword_5_8_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('see' 'document' 'goal')?
	 *
	 * This ambiguous syntax occurs at:
	 *     stakeholderRequirementReference+=[Goal|QualifiedName] (ambiguity) stakeholderRequirementReference+=[Goal|QualifiedName]
	 */
	protected void emit_Requirement___SeeKeyword_5_10_0_DocumentKeyword_5_10_1_GoalKeyword_5_10_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('see' 'document' 'requirement')?
	 *
	 * This ambiguous syntax occurs at:
	 *     documentRequirement+=[ContractualElement|QualifiedName] (ambiguity) documentRequirement+=[ContractualElement|QualifiedName]
	 */
	protected void emit_Requirement___SeeKeyword_5_11_0_DocumentKeyword_5_11_1_RequirementKeyword_5_11_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('see' 'document')?
	 *
	 * This ambiguous syntax occurs at:
	 *     docReference+=ExternalDocument (ambiguity) docReference+=ExternalDocument
	 */
	protected void emit_Requirement___SeeKeyword_5_12_0_DocumentKeyword_5_12_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('see' 'goal')?
	 *
	 * This ambiguous syntax occurs at:
	 *     goalReference+=[Goal|QualifiedName] (ambiguity) goalReference+=[Goal|QualifiedName]
	 */
	protected void emit_Requirement___SeeKeyword_5_9_0_GoalKeyword_5_9_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) '}' ')' (rule end)
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) '}' (rule end)
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) expressions+=XExpressionOrVarDeclaration
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) (rule end)
	 *     expressions+=XExpressionOrVarDeclaration (ambiguity) expressions+=XExpressionOrVarDeclaration
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '=>' returnType=JvmTypeReference
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     importedNamespace=QualifiedNameWithWildcard (ambiguity) (rule end)
	 *     importedType=[JvmDeclaredType|QualifiedName] (ambiguity) (rule end)
	 *     memberName=ValidID (ambiguity) (rule end)
	 *     wildcard?='*' (ambiguity) (rule end)
	 */
	protected void emit_XImportDeclaration_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#' '[' ']' (rule start)
	 *     (rule start) (ambiguity) '#' '[' elements+=XExpression
	 *     (rule start) (ambiguity) '#' '{' '}' (rule start)
	 *     (rule start) (ambiguity) '#' '{' elements+=XExpression
	 *     (rule start) (ambiguity) '<' typeArguments+=JvmArgumentTypeReference
	 *     (rule start) (ambiguity) '[' declaredFormalParameters+=JvmFormalParameter
	 *     (rule start) (ambiguity) '[' explicitSyntax?='|'
	 *     (rule start) (ambiguity) '[' expression=XExpressionInClosure
	 *     (rule start) (ambiguity) 'do' body=XExpression
	 *     (rule start) (ambiguity) 'false' (rule start)
	 *     (rule start) (ambiguity) 'for' '(' ';' ';' ')' eachExpression=XExpression
	 *     (rule start) (ambiguity) 'for' '(' ';' ';' updateExpressions+=XExpression
	 *     (rule start) (ambiguity) 'for' '(' ';' expression=XExpression
	 *     (rule start) (ambiguity) 'for' '(' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'for' '(' initExpressions+=XExpressionOrVarDeclaration
	 *     (rule start) (ambiguity) 'if' '(' if=XExpression
	 *     (rule start) (ambiguity) 'new' constructor=[JvmConstructor|QualifiedName]
	 *     (rule start) (ambiguity) 'null' (rule start)
	 *     (rule start) (ambiguity) 'return' (rule start)
	 *     (rule start) (ambiguity) 'return' expression=XExpression
	 *     (rule start) (ambiguity) 'switch' '(' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'switch' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'switch' switch=XExpression
	 *     (rule start) (ambiguity) 'synchronized' '(' param=XExpression
	 *     (rule start) (ambiguity) 'throw' expression=XExpression
	 *     (rule start) (ambiguity) 'try' expression=XExpression
	 *     (rule start) (ambiguity) 'typeof' '(' type=[JvmType|QualifiedName]
	 *     (rule start) (ambiguity) 'while' '(' predicate=XExpression
	 *     (rule start) (ambiguity) '{' '}' (rule start)
	 *     (rule start) (ambiguity) '{' expressions+=XExpressionOrVarDeclaration
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|FeatureCallID]
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|IdOrSuper]
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|OpUnary]
	 *     (rule start) (ambiguity) isTrue?='true'
	 *     (rule start) (ambiguity) value=Number
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) {XAssignment.assignable=}
	 *     (rule start) (ambiguity) {XBinaryOperation.leftOperand=}
	 *     (rule start) (ambiguity) {XCastedExpression.target=}
	 *     (rule start) (ambiguity) {XInstanceOfExpression.expression=}
	 *     (rule start) (ambiguity) {XMemberFeatureCall.memberCallTarget=}
	 *     (rule start) (ambiguity) {XPostfixOperation.operand=}
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '#' '[' ']' ')' (rule start)
	 *     (rule start) (ambiguity) '#' '[' elements+=XExpression
	 *     (rule start) (ambiguity) '#' '{' '}' ')' (rule start)
	 *     (rule start) (ambiguity) '#' '{' elements+=XExpression
	 *     (rule start) (ambiguity) '<' typeArguments+=JvmArgumentTypeReference
	 *     (rule start) (ambiguity) '[' declaredFormalParameters+=JvmFormalParameter
	 *     (rule start) (ambiguity) '[' explicitSyntax?='|'
	 *     (rule start) (ambiguity) '[' expression=XExpressionInClosure
	 *     (rule start) (ambiguity) 'do' body=XExpression
	 *     (rule start) (ambiguity) 'false' ')' (rule start)
	 *     (rule start) (ambiguity) 'for' '(' ';' ';' ')' eachExpression=XExpression
	 *     (rule start) (ambiguity) 'for' '(' ';' ';' updateExpressions+=XExpression
	 *     (rule start) (ambiguity) 'for' '(' ';' expression=XExpression
	 *     (rule start) (ambiguity) 'for' '(' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'for' '(' initExpressions+=XExpressionOrVarDeclaration
	 *     (rule start) (ambiguity) 'if' '(' if=XExpression
	 *     (rule start) (ambiguity) 'new' constructor=[JvmConstructor|QualifiedName]
	 *     (rule start) (ambiguity) 'null' ')' (rule start)
	 *     (rule start) (ambiguity) 'return' ')' (rule start)
	 *     (rule start) (ambiguity) 'return' expression=XExpression
	 *     (rule start) (ambiguity) 'switch' '(' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'switch' declaredParam=JvmFormalParameter
	 *     (rule start) (ambiguity) 'switch' switch=XExpression
	 *     (rule start) (ambiguity) 'synchronized' '(' param=XExpression
	 *     (rule start) (ambiguity) 'throw' expression=XExpression
	 *     (rule start) (ambiguity) 'try' expression=XExpression
	 *     (rule start) (ambiguity) 'typeof' '(' type=[JvmType|QualifiedName]
	 *     (rule start) (ambiguity) 'while' '(' predicate=XExpression
	 *     (rule start) (ambiguity) '{' '}' ')' (rule start)
	 *     (rule start) (ambiguity) '{' expressions+=XExpressionOrVarDeclaration
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|FeatureCallID]
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|IdOrSuper]
	 *     (rule start) (ambiguity) feature=[JvmIdentifiableElement|OpUnary]
	 *     (rule start) (ambiguity) isTrue?='true'
	 *     (rule start) (ambiguity) value=Number
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) {XAssignment.assignable=}
	 *     (rule start) (ambiguity) {XBinaryOperation.leftOperand=}
	 *     (rule start) (ambiguity) {XCastedExpression.target=}
	 *     (rule start) (ambiguity) {XInstanceOfExpression.expression=}
	 *     (rule start) (ambiguity) {XMemberFeatureCall.memberCallTarget=}
	 *     (rule start) (ambiguity) {XPostfixOperation.operand=}
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
