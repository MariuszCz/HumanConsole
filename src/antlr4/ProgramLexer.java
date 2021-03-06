// Generated from C:/Users/Mariusz/Downloads/speech2/src/antlr4\Program.g4 by ANTLR 4.5.3
package antlr4;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\u00a9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5[\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009c\n\6\3\7"+
		"\6\7\u009f\n\7\r\7\16\7\u00a0\3\b\6\b\u00a4\n\b\r\b\16\b\u00a5\3\b\3\b"+
		"\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\4\5\2\60\60C\\c|\5\2\13\f\16"+
		"\17\"\"\u00c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\31\3\2\2\2\5&\3\2\2\2\7B\3\2\2\2\tZ\3"+
		"\2\2\2\13\u009b\3\2\2\2\r\u009e\3\2\2\2\17\u00a3\3\2\2\2\21\22\7q\2\2"+
		"\22\32\7t\2\2\23\24\7g\2\2\24\25\7k\2\2\25\26\7v\2\2\26\27\7j\2\2\27\30"+
		"\7g\2\2\30\32\7t\2\2\31\21\3\2\2\2\31\23\3\2\2\2\32\4\3\2\2\2\33\34\7"+
		"c\2\2\34\35\7p\2\2\35\'\7f\2\2\36\37\7p\2\2\37 \7g\2\2 !\7z\2\2!\'\7v"+
		"\2\2\"#\7c\2\2#$\7n\2\2$%\7u\2\2%\'\7q\2\2&\33\3\2\2\2&\36\3\2\2\2&\""+
		"\3\2\2\2\'\6\3\2\2\2()\7t\2\2)*\7w\2\2*C\7p\2\2+,\7q\2\2,-\7r\2\2-.\7"+
		"g\2\2.C\7p\2\2/\60\7n\2\2\60\61\7c\2\2\61\62\7w\2\2\62\63\7p\2\2\63\64"+
		"\7e\2\2\64C\7j\2\2\65\66\7u\2\2\66\67\7v\2\2\678\7c\2\289\7t\2\29C\7v"+
		"\2\2:;\7i\2\2;C\7q\2\2<=\7u\2\2=>\7g\2\2>?\7c\2\2?@\7t\2\2@A\7e\2\2AC"+
		"\7j\2\2B(\3\2\2\2B+\3\2\2\2B/\3\2\2\2B\65\3\2\2\2B:\3\2\2\2B<\3\2\2\2"+
		"C\b\3\2\2\2DE\7e\2\2EF\7n\2\2FG\7q\2\2GH\7u\2\2H[\7g\2\2IJ\7g\2\2JK\7"+
		"z\2\2KL\7k\2\2L[\7v\2\2MN\7u\2\2NO\7j\2\2OP\7w\2\2P[\7v\2\2QR\7u\2\2R"+
		"S\7v\2\2ST\7q\2\2T[\7r\2\2UV\7d\2\2VW\7t\2\2WX\7g\2\2XY\7c\2\2Y[\7m\2"+
		"\2ZD\3\2\2\2ZI\3\2\2\2ZM\3\2\2\2ZQ\3\2\2\2ZU\3\2\2\2[\n\3\2\2\2\\]\7c"+
		"\2\2]^\7r\2\2^_\7r\2\2_`\7n\2\2`a\7k\2\2ab\7e\2\2bc\7c\2\2cd\7v\2\2de"+
		"\7k\2\2ef\7q\2\2f\u009c\7p\2\2gh\7h\2\2hi\7k\2\2ij\7n\2\2j\u009c\7g\2"+
		"\2kl\7f\2\2lm\7q\2\2mn\7e\2\2no\7w\2\2op\7o\2\2pq\7g\2\2qr\7p\2\2r\u009c"+
		"\7v\2\2st\7c\2\2tu\7r\2\2u\u009c\7r\2\2vw\7d\2\2wx\7t\2\2xy\7q\2\2yz\7"+
		"y\2\2z{\7u\2\2{|\7g\2\2|\u009c\7t\2\2}~\7r\2\2~\177\7c\2\2\177\u0080\7"+
		"i\2\2\u0080\u009c\7g\2\2\u0081\u0082\7y\2\2\u0082\u0083\7y\2\2\u0083\u009c"+
		"\7y\2\2\u0084\u0085\7x\2\2\u0085\u0086\7k\2\2\u0086\u0087\7f\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u009c\7q\2\2\u0089\u008a\7h\2\2\u008a\u008b\7k\2\2"+
		"\u008b\u008c\7n\2\2\u008c\u009c\7o\2\2\u008d\u008e\7c\2\2\u008e\u008f"+
		"\7t\2\2\u008f\u0090\7v\2\2\u0090\u0091\7k\2\2\u0091\u0092\7e\2\2\u0092"+
		"\u0093\7n\2\2\u0093\u009c\7g\2\2\u0094\u0095\7r\2\2\u0095\u0096\7t\2\2"+
		"\u0096\u0097\7q\2\2\u0097\u0098\7i\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7c\2\2\u009a\u009c\7o\2\2\u009b\\\3\2\2\2\u009bg\3\2\2\2\u009bk\3\2\2"+
		"\2\u009bs\3\2\2\2\u009bv\3\2\2\2\u009b}\3\2\2\2\u009b\u0081\3\2\2\2\u009b"+
		"\u0084\3\2\2\2\u009b\u0089\3\2\2\2\u009b\u008d\3\2\2\2\u009b\u0094\3\2"+
		"\2\2\u009c\f\3\2\2\2\u009d\u009f\t\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\16\3\2\2\2\u00a2"+
		"\u00a4\t\3\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\b\2\2\u00a8"+
		"\20\3\2\2\2\13\2\31&BZ\u009b\u009e\u00a0\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}