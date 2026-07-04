package koopa.cics.grammar.test;

import java.io.Reader;
import java.io.StringReader;

import koopa.cics.grammar.CICSGrammar;
import koopa.core.grammars.Grammar;
import koopa.core.sources.BasicTokens;
import koopa.core.sources.Source;
import koopa.dsl.stage.runtime.GrammarTestSuite;

/**
 * Triggers all CICS grammar unit tests.
 */
public class EmbeddedCICSGrammarTests extends GrammarTestSuite {
	@Override
	public Grammar getGrammar() {
		return CICSGrammar.instance();
	}

	@Override
	public Source getSourceForSample(String sample, Grammar grammar) {
		final Reader reader = new StringReader(sample);

		return BasicTokens.getNewSource("test", reader);
	}
}
