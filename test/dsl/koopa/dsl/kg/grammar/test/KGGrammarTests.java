package koopa.dsl.kg.grammar.test;

import java.io.Reader;
import java.io.StringReader;

import koopa.core.grammars.Grammar;
import koopa.core.sources.Source;
import koopa.dsl.kg.grammar.KGGrammar;
import koopa.dsl.kg.source.KGTokens;
import koopa.dsl.stage.runtime.GrammarTestSuite;

public class KGGrammarTests extends GrammarTestSuite {

	@Override
	public Grammar getGrammar() {
		return new KGGrammar();
	}

	@Override
	public Source getSourceForSample(String sample, Grammar grammar) {
		final Reader reader = new StringReader(sample);

		return KGTokens.getNewSource("", reader);
	}
}
