// Generated from SqlAudit.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlAuditParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, CONDITIONIS=4, EXISTLIMIT=5, AND=6, OR=7, BETWEEN=8, 
		IN=9, EQ=10, NSEQ=11, NEQ=12, NEQJ=13, LT=14, LTE=15, GT=16, GTE=17, ID=18, 
		LINE_COMMENT=19, WS=20;
	public static final int
		RULE_auditRule = 0, RULE_expr = 1, RULE_function = 2, RULE_funcParamList = 3, 
		RULE_funcParam = 4, RULE_predicate = 5, RULE_compOperator = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"auditRule", "expr", "function", "funcParamList", "funcParam", "predicate", 
			"compOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'CONDITIONIS'", "'EXISTLIMIT'", "'AND'", 
			"'OR'", "'BETWEEN'", "'IN'", null, "'<=>'", "'<>'", "'!='", "'<'", null, 
			"'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "CONDITIONIS", "EXISTLIMIT", "AND", "OR", "BETWEEN", 
			"IN", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "ID", "LINE_COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SqlAudit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlAuditParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AuditRuleContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlAuditParser.EOF, 0); }
		public AuditRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auditRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).enterAuditRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).exitAuditRule(this);
		}
	}

	public final AuditRuleContext auditRule() throws RecognitionException {
		AuditRuleContext _localctx = new AuditRuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_auditRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			expr(0);
			setState(15);
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

	public static class ExprContext extends ParserRuleContext {
		public boolean result;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.result = ctx.result;
		}
	}
	public static class BracketExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracketExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).enterBracketExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).exitBracketExpr(this);
		}
	}
	public static class FunctionCallContext extends ExprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FuncParamListContext funcParamList() {
			return getRuleContext(FuncParamListContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).exitFunctionCall(this);
		}
	}
	public static class LogicalBinaryContext extends ExprContext {
		public ExprContext left;
		public Token operator;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlAuditParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlAuditParser.OR, 0); }
		public LogicalBinaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).exitLogicalBinary(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONDITIONIS:
			case EXISTLIMIT:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(18);
				function();
				setState(19);
				match(T__0);
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BETWEEN) | (1L << IN) | (1L << EQ) | (1L << NSEQ) | (1L << NEQ) | (1L << NEQJ) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE) | (1L << ID))) != 0)) {
					{
					setState(20);
					funcParamList();
					}
				}

				setState(23);
				match(T__1);
				}
				break;
			case T__0:
				{
				_localctx = new BracketExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				match(T__0);
				setState(26);
				expr(0);
				setState(27);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new ExprContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(31);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(32);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(33);
						((LogicalBinaryContext)_localctx).right = expr(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new ExprContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(35);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(36);
						((LogicalBinaryContext)_localctx).right = expr(2);
						}
						break;
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode CONDITIONIS() { return getToken(SqlAuditParser.CONDITIONIS, 0); }
		public TerminalNode EXISTLIMIT() { return getToken(SqlAuditParser.EXISTLIMIT, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !(_la==CONDITIONIS || _la==EXISTLIMIT) ) {
			_errHandler.recoverInline(this);
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

	public static class FuncParamListContext extends ParserRuleContext {
		public FuncParamContext funcParam;
		public List<FuncParamContext> params = new ArrayList<FuncParamContext>();
		public List<FuncParamContext> funcParam() {
			return getRuleContexts(FuncParamContext.class);
		}
		public FuncParamContext funcParam(int i) {
			return getRuleContext(FuncParamContext.class,i);
		}
		public FuncParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).enterFuncParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).exitFuncParamList(this);
		}
	}

	public final FuncParamListContext funcParamList() throws RecognitionException {
		FuncParamListContext _localctx = new FuncParamListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcParamList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((FuncParamListContext)_localctx).funcParam = funcParam();
			((FuncParamListContext)_localctx).params.add(((FuncParamListContext)_localctx).funcParam);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(45);
				match(T__2);
				setState(46);
				((FuncParamListContext)_localctx).funcParam = funcParam();
				((FuncParamListContext)_localctx).params.add(((FuncParamListContext)_localctx).funcParam);
				}
				}
				setState(51);
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

	public static class FuncParamContext extends ParserRuleContext {
		public CompOperatorContext compOperator() {
			return getRuleContext(CompOperatorContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode ID() { return getToken(SqlAuditParser.ID, 0); }
		public FuncParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).enterFuncParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).exitFuncParam(this);
		}
	}

	public final FuncParamContext funcParam() throws RecognitionException {
		FuncParamContext _localctx = new FuncParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcParam);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
			case NSEQ:
			case NEQ:
			case NEQJ:
			case LT:
			case LTE:
			case GT:
			case GTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				compOperator();
				}
				break;
			case BETWEEN:
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				predicate();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(SqlAuditParser.BETWEEN, 0); }
		public TerminalNode IN() { return getToken(SqlAuditParser.IN, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !(_la==BETWEEN || _la==IN) ) {
			_errHandler.recoverInline(this);
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

	public static class CompOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlAuditParser.EQ, 0); }
		public TerminalNode NSEQ() { return getToken(SqlAuditParser.NSEQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlAuditParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlAuditParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlAuditParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlAuditParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlAuditParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlAuditParser.GTE, 0); }
		public CompOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).enterCompOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlAuditListener ) ((SqlAuditListener)listener).exitCompOperator(this);
		}
	}

	public final CompOperatorContext compOperator() throws RecognitionException {
		CompOperatorContext _localctx = new CompOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NSEQ) | (1L << NEQ) | (1L << NEQJ) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
			_errHandler.recoverInline(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\5\3\30\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3(\n\3\f\3\16\3+\13\3\3\4\3\4\3\5\3\5\3\5\7\5\62\n\5\f\5\16\5\65\13\5"+
		"\3\6\3\6\3\6\5\6:\n\6\3\7\3\7\3\b\3\b\3\b\2\3\4\t\2\4\6\b\n\f\16\2\5\3"+
		"\2\6\7\3\2\n\13\3\2\f\23\2?\2\20\3\2\2\2\4\37\3\2\2\2\6,\3\2\2\2\b.\3"+
		"\2\2\2\n9\3\2\2\2\f;\3\2\2\2\16=\3\2\2\2\20\21\5\4\3\2\21\22\7\2\2\3\22"+
		"\3\3\2\2\2\23\24\b\3\1\2\24\25\5\6\4\2\25\27\7\3\2\2\26\30\5\b\5\2\27"+
		"\26\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\32\7\4\2\2\32 \3\2\2\2\33\34"+
		"\7\3\2\2\34\35\5\4\3\2\35\36\7\4\2\2\36 \3\2\2\2\37\23\3\2\2\2\37\33\3"+
		"\2\2\2 )\3\2\2\2!\"\f\4\2\2\"#\7\b\2\2#(\5\4\3\5$%\f\3\2\2%&\7\t\2\2&"+
		"(\5\4\3\4\'!\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\5\3\2"+
		"\2\2+)\3\2\2\2,-\t\2\2\2-\7\3\2\2\2.\63\5\n\6\2/\60\7\5\2\2\60\62\5\n"+
		"\6\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\t\3\2\2"+
		"\2\65\63\3\2\2\2\66:\5\16\b\2\67:\5\f\7\28:\7\24\2\29\66\3\2\2\29\67\3"+
		"\2\2\298\3\2\2\2:\13\3\2\2\2;<\t\3\2\2<\r\3\2\2\2=>\t\4\2\2>\17\3\2\2"+
		"\2\b\27\37\')\639";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}