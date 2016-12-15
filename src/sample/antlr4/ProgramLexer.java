// Generated from C:/Users/Mariusz/Documents/HumanConsole/src/sample/antlr4\Program.g4 by ANTLR 4.5.3
package sample.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONNECTOR_OR=1, CONNECTOR_AND=2, RUN=3, CLOSE=4, TYPE=5, TEXT=6, WHITESPACE=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CONNECTOR_OR", "CONNECTOR_AND", "RUN", "CLOSE", "TYPE", "TEXT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CONNECTOR_OR", "CONNECTOR_AND", "RUN", "CLOSE", "TYPE", "TEXT", 
		"WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\u009d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5V\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0090\n\6\3\7\6\7\u0093\n\7\r\7\16\7\u0094\3\b\6\b\u0098\n\b"+
		"\r\b\16\b\u0099\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\4\4\2"+
		"\60\60c|\5\2\13\f\16\17\"\"\u00b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\31\3\2\2\2\5&\3\2"+
		"\2\2\7B\3\2\2\2\tU\3\2\2\2\13\u008f\3\2\2\2\r\u0092\3\2\2\2\17\u0097\3"+
		"\2\2\2\21\22\7q\2\2\22\32\7t\2\2\23\24\7g\2\2\24\25\7k\2\2\25\26\7v\2"+
		"\2\26\27\7j\2\2\27\30\7g\2\2\30\32\7t\2\2\31\21\3\2\2\2\31\23\3\2\2\2"+
		"\32\4\3\2\2\2\33\34\7c\2\2\34\35\7p\2\2\35\'\7f\2\2\36\37\7p\2\2\37 \7"+
		"g\2\2 !\7z\2\2!\'\7v\2\2\"#\7c\2\2#$\7n\2\2$%\7u\2\2%\'\7q\2\2&\33\3\2"+
		"\2\2&\36\3\2\2\2&\"\3\2\2\2\'\6\3\2\2\2()\7t\2\2)*\7w\2\2*C\7p\2\2+,\7"+
		"q\2\2,-\7r\2\2-.\7g\2\2.C\7p\2\2/\60\7n\2\2\60\61\7c\2\2\61\62\7w\2\2"+
		"\62\63\7p\2\2\63\64\7e\2\2\64C\7j\2\2\65\66\7u\2\2\66\67\7v\2\2\678\7"+
		"c\2\289\7t\2\29C\7v\2\2:;\7i\2\2;C\7q\2\2<=\7u\2\2=>\7g\2\2>?\7c\2\2?"+
		"@\7t\2\2@A\7e\2\2AC\7j\2\2B(\3\2\2\2B+\3\2\2\2B/\3\2\2\2B\65\3\2\2\2B"+
		":\3\2\2\2B<\3\2\2\2C\b\3\2\2\2DE\7e\2\2EF\7n\2\2FG\7q\2\2GH\7u\2\2HV\7"+
		"g\2\2IJ\7g\2\2JK\7z\2\2KL\7k\2\2LV\7v\2\2MN\7u\2\2NO\7j\2\2OP\7w\2\2P"+
		"V\7v\2\2QR\7u\2\2RS\7v\2\2ST\7q\2\2TV\7r\2\2UD\3\2\2\2UI\3\2\2\2UM\3\2"+
		"\2\2UQ\3\2\2\2V\n\3\2\2\2WX\7c\2\2XY\7r\2\2YZ\7r\2\2Z[\7n\2\2[\\\7k\2"+
		"\2\\]\7e\2\2]^\7c\2\2^_\7v\2\2_`\7k\2\2`a\7q\2\2a\u0090\7p\2\2bc\7h\2"+
		"\2cd\7k\2\2de\7n\2\2e\u0090\7g\2\2fg\7f\2\2gh\7q\2\2hi\7e\2\2ij\7w\2\2"+
		"jk\7o\2\2kl\7g\2\2lm\7p\2\2m\u0090\7v\2\2no\7c\2\2op\7r\2\2p\u0090\7r"+
		"\2\2qr\7d\2\2rs\7t\2\2st\7q\2\2tu\7y\2\2uv\7u\2\2vw\7g\2\2w\u0090\7t\2"+
		"\2xy\7r\2\2yz\7c\2\2z{\7i\2\2{\u0090\7g\2\2|}\7y\2\2}~\7y\2\2~\u0090\7"+
		"y\2\2\177\u0080\7x\2\2\u0080\u0081\7k\2\2\u0081\u0082\7f\2\2\u0082\u0083"+
		"\7g\2\2\u0083\u0090\7q\2\2\u0084\u0085\7h\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7n\2\2\u0087\u0090\7o\2\2\u0088\u0089\7c\2\2\u0089\u008a\7t\2\2"+
		"\u008a\u008b\7v\2\2\u008b\u008c\7k\2\2\u008c\u008d\7e\2\2\u008d\u008e"+
		"\7n\2\2\u008e\u0090\7g\2\2\u008fW\3\2\2\2\u008fb\3\2\2\2\u008ff\3\2\2"+
		"\2\u008fn\3\2\2\2\u008fq\3\2\2\2\u008fx\3\2\2\2\u008f|\3\2\2\2\u008f\177"+
		"\3\2\2\2\u008f\u0084\3\2\2\2\u008f\u0088\3\2\2\2\u0090\f\3\2\2\2\u0091"+
		"\u0093\t\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\16\3\2\2\2\u0096\u0098\t\3\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\b\b\2\2\u009c\20\3\2\2\2\13\2\31&BU\u008f\u0092"+
		"\u0094\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}