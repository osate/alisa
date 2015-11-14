/*
 * generated by Xtext
 */
package org.osate.reqspec.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.osate.reqspec.services.ReqSpecGrammarAccess;

public class ReqSpecParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ReqSpecGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.osate.reqspec.parser.antlr.internal.InternalReqSpecParser createParser(XtextTokenStream stream) {
		return new org.osate.reqspec.parser.antlr.internal.InternalReqSpecParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ReqSpec";
	}
	
	public ReqSpecGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ReqSpecGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
