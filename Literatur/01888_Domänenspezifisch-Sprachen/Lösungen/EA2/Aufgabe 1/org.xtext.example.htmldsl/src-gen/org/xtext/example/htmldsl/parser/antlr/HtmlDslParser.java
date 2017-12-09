/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.htmldsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.htmldsl.parser.antlr.internal.InternalHtmlDslParser;
import org.xtext.example.htmldsl.services.HtmlDslGrammarAccess;

public class HtmlDslParser extends AbstractAntlrParser {

	@Inject
	private HtmlDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalHtmlDslParser createParser(XtextTokenStream stream) {
		return new InternalHtmlDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "WebSite";
	}

	public HtmlDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HtmlDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
