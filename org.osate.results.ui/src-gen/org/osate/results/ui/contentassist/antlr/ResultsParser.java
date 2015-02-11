/*
* generated by Xtext
*/
package org.osate.results.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.osate.results.services.ResultsGrammarAccess;

public class ResultsParser extends AbstractContentAssistParser {
	
	@Inject
	private ResultsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.osate.results.ui.contentassist.antlr.internal.InternalResultsParser createParser() {
		org.osate.results.ui.contentassist.antlr.internal.InternalResultsParser result = new org.osate.results.ui.contentassist.antlr.internal.InternalResultsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getReportIssueTypeAccess().getAlternatives(), "rule__ReportIssueType__Alternatives");
					put(grammarAccess.getResultReportAccess().getGroup(), "rule__ResultReport__Group__0");
					put(grammarAccess.getResultReportAccess().getGroup_2(), "rule__ResultReport__Group_2__0");
					put(grammarAccess.getResultReportAccess().getGroup_6(), "rule__ResultReport__Group_6__0");
					put(grammarAccess.getResultReportAccess().getGroup_7(), "rule__ResultReport__Group_7__0");
					put(grammarAccess.getResultReportAccess().getGroup_8(), "rule__ResultReport__Group_8__0");
					put(grammarAccess.getResultReportEntryAccess().getGroup(), "rule__ResultReportEntry__Group__0");
					put(grammarAccess.getResultReportEntryAccess().getGroup_2(), "rule__ResultReportEntry__Group_2__0");
					put(grammarAccess.getResultReportEntryAccess().getGroup_6(), "rule__ResultReportEntry__Group_6__0");
					put(grammarAccess.getResultReportEntryAccess().getGroup_7(), "rule__ResultReportEntry__Group_7__0");
					put(grammarAccess.getResultReportEntryAccess().getGroup_8(), "rule__ResultReportEntry__Group_8__0");
					put(grammarAccess.getResultReportEntryAccess().getGroup_9(), "rule__ResultReportEntry__Group_9__0");
					put(grammarAccess.getResultReportEntryAccess().getGroup_10(), "rule__ResultReportEntry__Group_10__0");
					put(grammarAccess.getResultContributorAccess().getGroup(), "rule__ResultContributor__Group__0");
					put(grammarAccess.getResultContributorAccess().getGroup_4(), "rule__ResultContributor__Group_4__0");
					put(grammarAccess.getResultContributorAccess().getGroup_5(), "rule__ResultContributor__Group_5__0");
					put(grammarAccess.getReportIssueAccess().getGroup(), "rule__ReportIssue__Group__0");
					put(grammarAccess.getNameValuePairAccess().getGroup(), "rule__NameValuePair__Group__0");
					put(grammarAccess.getResultReportAccess().getNameAssignment_1(), "rule__ResultReport__NameAssignment_1");
					put(grammarAccess.getResultReportAccess().getTitleAssignment_2_1(), "rule__ResultReport__TitleAssignment_2_1");
					put(grammarAccess.getResultReportAccess().getRootAssignment_5(), "rule__ResultReport__RootAssignment_5");
					put(grammarAccess.getResultReportAccess().getDecriptionAssignment_6_1(), "rule__ResultReport__DecriptionAssignment_6_1");
					put(grammarAccess.getResultReportAccess().getHeadingAssignment_7_1(), "rule__ResultReport__HeadingAssignment_7_1");
					put(grammarAccess.getResultReportAccess().getContentAssignment_7_2(), "rule__ResultReport__ContentAssignment_7_2");
					put(grammarAccess.getResultReportAccess().getResultDataAssignment_8_1(), "rule__ResultReport__ResultDataAssignment_8_1");
					put(grammarAccess.getResultReportEntryAccess().getNameAssignment_1(), "rule__ResultReportEntry__NameAssignment_1");
					put(grammarAccess.getResultReportEntryAccess().getTitleAssignment_2_1(), "rule__ResultReportEntry__TitleAssignment_2_1");
					put(grammarAccess.getResultReportEntryAccess().getTargetAssignment_5(), "rule__ResultReportEntry__TargetAssignment_5");
					put(grammarAccess.getResultReportEntryAccess().getDecriptionAssignment_6_1(), "rule__ResultReportEntry__DecriptionAssignment_6_1");
					put(grammarAccess.getResultReportEntryAccess().getHeadingAssignment_7_1(), "rule__ResultReportEntry__HeadingAssignment_7_1");
					put(grammarAccess.getResultReportEntryAccess().getResultDataAssignment_8_1(), "rule__ResultReportEntry__ResultDataAssignment_8_1");
					put(grammarAccess.getResultReportEntryAccess().getIssueAssignment_9_1(), "rule__ResultReportEntry__IssueAssignment_9_1");
					put(grammarAccess.getResultReportEntryAccess().getRowAssignment_10_1(), "rule__ResultReportEntry__RowAssignment_10_1");
					put(grammarAccess.getResultContributorAccess().getContributorAssignment_1(), "rule__ResultContributor__ContributorAssignment_1");
					put(grammarAccess.getResultContributorAccess().getCellAssignment_3(), "rule__ResultContributor__CellAssignment_3");
					put(grammarAccess.getResultContributorAccess().getIssueAssignment_4_1(), "rule__ResultContributor__IssueAssignment_4_1");
					put(grammarAccess.getResultContributorAccess().getSubcontributorAssignment_5_1(), "rule__ResultContributor__SubcontributorAssignment_5_1");
					put(grammarAccess.getReportIssueAccess().getIssueTypeAssignment_0(), "rule__ReportIssue__IssueTypeAssignment_0");
					put(grammarAccess.getReportIssueAccess().getTitleAssignment_1(), "rule__ReportIssue__TitleAssignment_1");
					put(grammarAccess.getReportIssueAccess().getTargetAssignment_2(), "rule__ReportIssue__TargetAssignment_2");
					put(grammarAccess.getResultDataAccess().getDataAssignment(), "rule__ResultData__DataAssignment");
					put(grammarAccess.getNameValuePairAccess().getNameAssignment_0(), "rule__NameValuePair__NameAssignment_0");
					put(grammarAccess.getNameValuePairAccess().getValueAssignment_2(), "rule__NameValuePair__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.osate.results.ui.contentassist.antlr.internal.InternalResultsParser typedParser = (org.osate.results.ui.contentassist.antlr.internal.InternalResultsParser) parser;
			typedParser.entryRuleResultReport();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ResultsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ResultsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
