// Generated from antlr4/TenaliCommand.g4 by ANTLR 4.7
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TenaliCommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Q_SET=1, Q_ADD_JAR=2, Q_USE=3, Q_CREATE_FUNCTION=4, Q_INSERT=5, Q_SELECT=6, 
		Q_DROP_TABLE=7, Q_DROP_VIEW=8, Q_ALTER_TABLE=9, Q_CREATE_TABLE=10, Q_CREATE_EXTERNAL_TABLE=11, 
		Q_CREATE_VIEW=12, Q_WITH=13, TEXT=14, Q_SEMI=15, SIMPLE_COMMENT=16, BRACKETED_EMPTY_COMMENT=17, 
		BRACKETED_COMMENT=18, WS=19, SPACES=20;
	public static final int
		RULE_parse = 0, RULE_sql_stmt_list = 1, RULE_sql_stmt = 2;
	public static final String[] ruleNames = {
		"parse", "sql_stmt_list", "sql_stmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Q_SET", "Q_ADD_JAR", "Q_USE", "Q_CREATE_FUNCTION", "Q_INSERT", 
		"Q_SELECT", "Q_DROP_TABLE", "Q_DROP_VIEW", "Q_ALTER_TABLE", "Q_CREATE_TABLE", 
		"Q_CREATE_EXTERNAL_TABLE", "Q_CREATE_VIEW", "Q_WITH", "TEXT", "Q_SEMI", 
		"SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", 
		"SPACES"
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
	public String getGrammarFileName() { return "TenaliCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TenaliCommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TenaliCommandParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TenaliCommandListener ) ((TenaliCommandListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TenaliCommandListener ) ((TenaliCommandListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TenaliCommandVisitor ) return ((TenaliCommandVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			sql_stmt_list();
			setState(7);
			match(EOF);
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> Q_SEMI() { return getTokens(TenaliCommandParser.Q_SEMI); }
		public TerminalNode Q_SEMI(int i) {
			return getToken(TenaliCommandParser.Q_SEMI, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TenaliCommandListener ) ((TenaliCommandListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TenaliCommandListener ) ((TenaliCommandListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TenaliCommandVisitor ) return ((TenaliCommandVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(9);
				sql_stmt();
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Q_SEMI) {
					{
					{
					setState(10);
					match(Q_SEMI);
					}
					}
					setState(15);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_SET) | (1L << Q_ADD_JAR) | (1L << Q_USE) | (1L << Q_CREATE_FUNCTION) | (1L << Q_INSERT) | (1L << Q_SELECT) | (1L << Q_DROP_TABLE) | (1L << Q_DROP_VIEW) | (1L << Q_ALTER_TABLE) | (1L << Q_CREATE_TABLE) | (1L << Q_CREATE_EXTERNAL_TABLE) | (1L << Q_CREATE_VIEW) | (1L << Q_WITH))) != 0) );
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Q_SET() { return getToken(TenaliCommandParser.Q_SET, 0); }
		public TerminalNode Q_ADD_JAR() { return getToken(TenaliCommandParser.Q_ADD_JAR, 0); }
		public TerminalNode Q_USE() { return getToken(TenaliCommandParser.Q_USE, 0); }
		public TerminalNode Q_WITH() { return getToken(TenaliCommandParser.Q_WITH, 0); }
		public TerminalNode Q_CREATE_FUNCTION() { return getToken(TenaliCommandParser.Q_CREATE_FUNCTION, 0); }
		public TerminalNode Q_INSERT() { return getToken(TenaliCommandParser.Q_INSERT, 0); }
		public TerminalNode Q_SELECT() { return getToken(TenaliCommandParser.Q_SELECT, 0); }
		public TerminalNode Q_DROP_TABLE() { return getToken(TenaliCommandParser.Q_DROP_TABLE, 0); }
		public TerminalNode Q_DROP_VIEW() { return getToken(TenaliCommandParser.Q_DROP_VIEW, 0); }
		public TerminalNode Q_ALTER_TABLE() { return getToken(TenaliCommandParser.Q_ALTER_TABLE, 0); }
		public TerminalNode Q_CREATE_TABLE() { return getToken(TenaliCommandParser.Q_CREATE_TABLE, 0); }
		public TerminalNode Q_CREATE_EXTERNAL_TABLE() { return getToken(TenaliCommandParser.Q_CREATE_EXTERNAL_TABLE, 0); }
		public TerminalNode Q_CREATE_VIEW() { return getToken(TenaliCommandParser.Q_CREATE_VIEW, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TenaliCommandListener ) ((TenaliCommandListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TenaliCommandListener ) ((TenaliCommandListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TenaliCommandVisitor ) return ((TenaliCommandVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((Sql_stmtContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Q_SET) | (1L << Q_ADD_JAR) | (1L << Q_USE) | (1L << Q_CREATE_FUNCTION) | (1L << Q_INSERT) | (1L << Q_SELECT) | (1L << Q_DROP_TABLE) | (1L << Q_DROP_VIEW) | (1L << Q_ALTER_TABLE) | (1L << Q_CREATE_TABLE) | (1L << Q_CREATE_EXTERNAL_TABLE) | (1L << Q_CREATE_VIEW) | (1L << Q_WITH))) != 0)) ) {
				((Sql_stmtContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\31\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\3\3\3\7\3\16\n\3\f\3\16\3\21\13\3\6\3\23\n"+
		"\3\r\3\16\3\24\3\4\3\4\3\4\2\2\5\2\4\6\2\3\3\2\3\17\2\27\2\b\3\2\2\2\4"+
		"\22\3\2\2\2\6\26\3\2\2\2\b\t\5\4\3\2\t\n\7\2\2\3\n\3\3\2\2\2\13\17\5\6"+
		"\4\2\f\16\7\21\2\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2"+
		"\2\20\23\3\2\2\2\21\17\3\2\2\2\22\13\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2"+
		"\2\24\25\3\2\2\2\25\5\3\2\2\2\26\27\t\2\2\2\27\7\3\2\2\2\4\17\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}