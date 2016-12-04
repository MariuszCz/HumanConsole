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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\'"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6o\n\6\3\7\6\7r\n\7\r\7\16\7s\3\b\6\bw\n\b\r\b\16\bx\3\b\3"+
		"\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\3\5\2\13\f\16\17\"\"\u008a"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\3\31\3\2\2\2\5&\3\2\2\2\7<\3\2\2\2\tK\3\2\2\2\13n\3"+
		"\2\2\2\rq\3\2\2\2\17v\3\2\2\2\21\22\7q\2\2\22\32\7t\2\2\23\24\7g\2\2\24"+
		"\25\7k\2\2\25\26\7v\2\2\26\27\7j\2\2\27\30\7g\2\2\30\32\7t\2\2\31\21\3"+
		"\2\2\2\31\23\3\2\2\2\32\4\3\2\2\2\33\34\7c\2\2\34\35\7p\2\2\35\'\7f\2"+
		"\2\36\37\7p\2\2\37 \7g\2\2 !\7z\2\2!\'\7v\2\2\"#\7c\2\2#$\7n\2\2$%\7u"+
		"\2\2%\'\7q\2\2&\33\3\2\2\2&\36\3\2\2\2&\"\3\2\2\2\'\6\3\2\2\2()\7t\2\2"+
		")*\7w\2\2*=\7p\2\2+,\7q\2\2,-\7r\2\2-.\7g\2\2.=\7p\2\2/\60\7n\2\2\60\61"+
		"\7c\2\2\61\62\7w\2\2\62\63\7p\2\2\63\64\7e\2\2\64=\7j\2\2\65\66\7u\2\2"+
		"\66\67\7v\2\2\678\7c\2\289\7t\2\29=\7v\2\2:;\7i\2\2;=\7q\2\2<(\3\2\2\2"+
		"<+\3\2\2\2</\3\2\2\2<\65\3\2\2\2<:\3\2\2\2=\b\3\2\2\2>?\7e\2\2?@\7n\2"+
		"\2@A\7q\2\2AB\7u\2\2BL\7g\2\2CD\7g\2\2DE\7z\2\2EF\7k\2\2FL\7v\2\2GH\7"+
		"u\2\2HI\7j\2\2IJ\7w\2\2JL\7v\2\2K>\3\2\2\2KC\3\2\2\2KG\3\2\2\2L\n\3\2"+
		"\2\2MN\7c\2\2NO\7r\2\2OP\7r\2\2PQ\7n\2\2QR\7k\2\2RS\7e\2\2ST\7c\2\2TU"+
		"\7v\2\2UV\7k\2\2VW\7q\2\2Wo\7p\2\2XY\7h\2\2YZ\7k\2\2Z[\7n\2\2[o\7g\2\2"+
		"\\]\7f\2\2]^\7q\2\2^_\7e\2\2_`\7w\2\2`a\7o\2\2ab\7g\2\2bc\7p\2\2co\7v"+
		"\2\2de\7c\2\2ef\7r\2\2fo\7r\2\2gh\7d\2\2hi\7t\2\2ij\7q\2\2jk\7y\2\2kl"+
		"\7u\2\2lm\7g\2\2mo\7t\2\2nM\3\2\2\2nX\3\2\2\2n\\\3\2\2\2nd\3\2\2\2ng\3"+
		"\2\2\2o\f\3\2\2\2pr\4c|\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\16"+
		"\3\2\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z"+
		"{\b\b\2\2{\20\3\2\2\2\n\2\31&<Knsx\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}