package koopa.cobol.grammar.directives.test.fixed;

import koopa.cobol.grammar.directives.test.DirectivesTests;
import koopa.cobol.sources.SourceFormat;

public class FixedDirectivesTests extends DirectivesTests {

	@Override
	protected SourceFormat getSourceFormat() {
		return SourceFormat.FIXED;
	}
}
