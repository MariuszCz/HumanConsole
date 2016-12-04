// Generated from C:/Users/Mariusz/Documents/HumanConsole/src/sample/antlr4\Program.g4 by ANTLR 4.5.3
package sample.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CONNECTOR_OR=1, CONNECTOR_AND=2, RUN=3, CLOSE=4, TYPE=5, TEXT=6, WHITESPACE=7;
	public static final int
		RULE_someText = 0, RULE_action = 1, RULE_type = 2, RULE_name = 3, RULE_connector = 4;
	public static final String[] ruleNames = {
		"someText", "action", "type", "name", "connector"
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

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SomeTextContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(ProgramParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(ProgramParser.TEXT, i);
		}
		public SomeTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterSomeText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitSomeText(this);
		}
	}

	public final SomeTextContext someText() throws RecognitionException {
		SomeTextContext _localctx = new SomeTextContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_someText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(10);
				match(TEXT);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public SomeTextContext someText() {
			return getRuleContext(SomeTextContext.class,0);
		}
		public TerminalNode RUN() { return getToken(ProgramParser.RUN, 0); }
		public TerminalNode CLOSE() { return getToken(ProgramParser.CLOSE, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_action);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				someText();
				setState(17);
				match(RUN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				someText();
				setState(20);
				match(CLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public List<TerminalNode> TYPE() { return getTokens(ProgramParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(ProgramParser.TYPE, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			action();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(25);
				match(TYPE);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(ProgramParser.TEXT, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			type();
			setState(32);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectorContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> CONNECTOR_AND() { return getTokens(ProgramParser.CONNECTOR_AND); }
		public TerminalNode CONNECTOR_AND(int i) {
			return getToken(ProgramParser.CONNECTOR_AND, i);
		}
		public List<TerminalNode> CONNECTOR_OR() { return getTokens(ProgramParser.CONNECTOR_OR); }
		public TerminalNode CONNECTOR_OR(int i) {
			return getToken(ProgramParser.CONNECTOR_OR, i);
		}
		public TerminalNode EOF() { return getToken(ProgramParser.EOF, 0); }
		public ConnectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterConnector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitConnector(this);
		}
	}

	public final ConnectorContext connector() throws RecognitionException {
		ConnectorContext _localctx = new ConnectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_connector);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				name();
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONNECTOR_AND) {
					{
					{
					setState(35);
					match(CONNECTOR_AND);
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RUN) | (1L << CLOSE) | (1L << TEXT))) != 0)) {
					{
					{
					setState(41);
					name();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				name();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONNECTOR_OR) {
					{
					{
					setState(48);
					match(CONNECTOR_OR);
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RUN) | (1L << CLOSE) | (1L << TEXT))) != 0)) {
					{
					{
					setState(54);
					name();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\tB\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\31\n\3\3\4\3\4\7\4\35\n\4\f\4\16\4 \13\4\3\5\3\5\3\5"+
		"\3\6\3\6\7\6\'\n\6\f\6\16\6*\13\6\3\6\7\6-\n\6\f\6\16\6\60\13\6\3\6\3"+
		"\6\7\6\64\n\6\f\6\16\6\67\13\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\6\5\6@\n"+
		"\6\3\6\2\2\7\2\4\6\b\n\2\2E\2\17\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b!"+
		"\3\2\2\2\n?\3\2\2\2\f\16\7\b\2\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2"+
		"\2\17\20\3\2\2\2\20\3\3\2\2\2\21\17\3\2\2\2\22\23\5\2\2\2\23\24\7\5\2"+
		"\2\24\31\3\2\2\2\25\26\5\2\2\2\26\27\7\6\2\2\27\31\3\2\2\2\30\22\3\2\2"+
		"\2\30\25\3\2\2\2\31\5\3\2\2\2\32\36\5\4\3\2\33\35\7\7\2\2\34\33\3\2\2"+
		"\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\7\3\2\2\2 \36\3\2\2\2!\""+
		"\5\6\4\2\"#\7\b\2\2#\t\3\2\2\2$(\5\b\5\2%\'\7\4\2\2&%\3\2\2\2\'*\3\2\2"+
		"\2(&\3\2\2\2()\3\2\2\2).\3\2\2\2*(\3\2\2\2+-\5\b\5\2,+\3\2\2\2-\60\3\2"+
		"\2\2.,\3\2\2\2./\3\2\2\2/@\3\2\2\2\60.\3\2\2\2\61\65\5\b\5\2\62\64\7\3"+
		"\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66;\3\2\2"+
		"\2\67\65\3\2\2\28:\5\b\5\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<@\3"+
		"\2\2\2=;\3\2\2\2>@\7\2\2\3?$\3\2\2\2?\61\3\2\2\2?>\3\2\2\2@\13\3\2\2\2"+
		"\n\17\30\36(.\65;?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}