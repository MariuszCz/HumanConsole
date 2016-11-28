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
		ARTICLE=1, OF=2, RUN=3, CLOSE=4, TYPE=5, DRINKING_VESSEL=6, TEXT=7, WHITESPACE=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ARTICLE", "OF", "RUN", "CLOSE", "TYPE", "DRINKING_VESSEL", "TEXT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'of'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ARTICLE", "OF", "RUN", "CLOSE", "TYPE", "DRINKING_VESSEL", "TEXT", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u0087\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6e\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7z\n\7\3"+
		"\b\6\b}\n\b\r\b\16\b~\3\t\6\t\u0082\n\t\r\t\16\t\u0083\3\t\3\t\2\2\n\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\3\5\2\13\f\16\17\"\"\u0098\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7\62\3\2\2\2\tA\3\2"+
		"\2\2\13d\3\2\2\2\ry\3\2\2\2\17|\3\2\2\2\21\u0081\3\2\2\2\23\24\7v\2\2"+
		"\24\25\7j\2\2\25\32\7g\2\2\26\27\7c\2\2\27\32\7p\2\2\30\32\7c\2\2\31\23"+
		"\3\2\2\2\31\26\3\2\2\2\31\30\3\2\2\2\32\4\3\2\2\2\33\34\7q\2\2\34\35\7"+
		"h\2\2\35\6\3\2\2\2\36\37\7t\2\2\37 \7w\2\2 \63\7p\2\2!\"\7q\2\2\"#\7r"+
		"\2\2#$\7g\2\2$\63\7p\2\2%&\7n\2\2&\'\7c\2\2\'(\7w\2\2()\7p\2\2)*\7e\2"+
		"\2*\63\7j\2\2+,\7u\2\2,-\7v\2\2-.\7c\2\2./\7t\2\2/\63\7v\2\2\60\61\7i"+
		"\2\2\61\63\7q\2\2\62\36\3\2\2\2\62!\3\2\2\2\62%\3\2\2\2\62+\3\2\2\2\62"+
		"\60\3\2\2\2\63\b\3\2\2\2\64\65\7e\2\2\65\66\7n\2\2\66\67\7q\2\2\678\7"+
		"u\2\28B\7g\2\29:\7g\2\2:;\7z\2\2;<\7k\2\2<B\7v\2\2=>\7u\2\2>?\7j\2\2?"+
		"@\7w\2\2@B\7v\2\2A\64\3\2\2\2A9\3\2\2\2A=\3\2\2\2B\n\3\2\2\2CD\7c\2\2"+
		"DE\7r\2\2EF\7r\2\2FG\7n\2\2GH\7k\2\2HI\7e\2\2IJ\7c\2\2JK\7v\2\2KL\7k\2"+
		"\2LM\7q\2\2Me\7p\2\2NO\7h\2\2OP\7k\2\2PQ\7n\2\2Qe\7g\2\2RS\7f\2\2ST\7"+
		"q\2\2TU\7e\2\2UV\7w\2\2VW\7o\2\2WX\7g\2\2XY\7p\2\2Ye\7v\2\2Z[\7c\2\2["+
		"\\\7r\2\2\\e\7r\2\2]^\7d\2\2^_\7t\2\2_`\7q\2\2`a\7y\2\2ab\7u\2\2bc\7g"+
		"\2\2ce\7t\2\2dC\3\2\2\2dN\3\2\2\2dR\3\2\2\2dZ\3\2\2\2d]\3\2\2\2e\f\3\2"+
		"\2\2fg\7e\2\2gh\7w\2\2hz\7r\2\2ij\7r\2\2jk\7k\2\2kl\7p\2\2lz\7v\2\2mn"+
		"\7u\2\2no\7j\2\2op\7q\2\2pz\7v\2\2qr\7o\2\2rs\7w\2\2sz\7i\2\2tu\7i\2\2"+
		"uv\7n\2\2vw\7c\2\2wx\7u\2\2xz\7u\2\2yf\3\2\2\2yi\3\2\2\2ym\3\2\2\2yq\3"+
		"\2\2\2yt\3\2\2\2z\16\3\2\2\2{}\4c|\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\20\3\2\2\2\u0080\u0082\t\2\2\2\u0081\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0086\b\t\2\2\u0086\22\3\2\2\2\n\2\31\62Ady~\u0083\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}