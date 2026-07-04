package koopa.cobol.grammar.directives.test.free;

import koopa.cobol.grammar.directives.test.DirectivesTests;
import koopa.cobol.sources.SourceFormat;

public class FreeDirectivesTests extends DirectivesTests {

	@Override
	protected SourceFormat getSourceFormat() {
		return SourceFormat.FREE;
	}
}
