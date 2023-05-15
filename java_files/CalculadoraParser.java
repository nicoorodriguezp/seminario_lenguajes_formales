// Generated from Calculadora.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculadoraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ID=19, NAME=20, MSG=21, CHAR=22, INT=23, COMPOP=24, IQOP=25, 
		PLUSOP=26, MINUSOP=27, MULTOP=28, DIVIDEOP=29, PERCENOP=30, WS=31;
	public static final int
		RULE_start = 0, RULE_calculadora = 1, RULE_defstmt = 2, RULE_matchstmt = 3, 
		RULE_case_suma = 4, RULE_case_resta = 5, RULE_case_mult = 6, RULE_case_avrg = 7, 
		RULE_case_div = 8, RULE_case_error = 9, RULE_divisionstmt = 10, RULE_whilestmt = 11, 
		RULE_int_parser = 12, RULE_input_stmt = 13, RULE_exception_stmt = 14, 
		RULE_plus_op = 15, RULE_minus_op = 16, RULE_multiply_op = 17, RULE_divide_op = 18, 
		RULE_avrg_op = 19, RULE_term = 20, RULE_exp = 21, RULE_factor = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calculadora", "defstmt", "matchstmt", "case_suma", "case_resta", 
			"case_mult", "case_avrg", "case_div", "case_error", "divisionstmt", "whilestmt", 
			"int_parser", "input_stmt", "exception_stmt", "plus_op", "minus_op", 
			"multiply_op", "divide_op", "avrg_op", "term", "exp", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "','", "')'", "':'", "'match'", "'case'", "'\"'", 
			"'''", "'return'", "'_'", "'raise'", "'if'", "'else'", "'while'", "'int'", 
			"'input'", "'Exception'", null, null, null, null, null, null, "'='", 
			"'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "NAME", "MSG", "CHAR", 
			"INT", "COMPOP", "IQOP", "PLUSOP", "MINUSOP", "MULTOP", "DIVIDEOP", "PERCENOP", 
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
	public String getGrammarFileName() { return "Calculadora.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculadoraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public CalculadoraContext calculadora() {
			return getRuleContext(CalculadoraContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			calculadora();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CalculadoraContext extends ParserRuleContext {
		public DefstmtContext defstmt() {
			return getRuleContext(DefstmtContext.class,0);
		}
		public CalculadoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculadora; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterCalculadora(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitCalculadora(this);
		}
	}

	public final CalculadoraContext calculadora() throws RecognitionException {
		CalculadoraContext _localctx = new CalculadoraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calculadora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			defstmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefstmtContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(CalculadoraParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CalculadoraParser.NAME, i);
		}
		public List<TerminalNode> ID() { return getTokens(CalculadoraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculadoraParser.ID, i);
		}
		public MatchstmtContext matchstmt() {
			return getRuleContext(MatchstmtContext.class,0);
		}
		public DefstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterDefstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitDefstmt(this);
		}
	}

	public final DefstmtContext defstmt() throws RecognitionException {
		DefstmtContext _localctx = new DefstmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			match(NAME);
			setState(52);
			match(T__1);
			setState(53);
			match(ID);
			setState(54);
			match(T__2);
			setState(55);
			match(ID);
			setState(56);
			match(T__2);
			setState(57);
			match(NAME);
			setState(58);
			match(T__3);
			setState(59);
			match(T__4);
			setState(60);
			matchstmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatchstmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CalculadoraParser.NAME, 0); }
		public List<Case_sumaContext> case_suma() {
			return getRuleContexts(Case_sumaContext.class);
		}
		public Case_sumaContext case_suma(int i) {
			return getRuleContext(Case_sumaContext.class,i);
		}
		public List<Case_restaContext> case_resta() {
			return getRuleContexts(Case_restaContext.class);
		}
		public Case_restaContext case_resta(int i) {
			return getRuleContext(Case_restaContext.class,i);
		}
		public List<Case_multContext> case_mult() {
			return getRuleContexts(Case_multContext.class);
		}
		public Case_multContext case_mult(int i) {
			return getRuleContext(Case_multContext.class,i);
		}
		public List<Case_divContext> case_div() {
			return getRuleContexts(Case_divContext.class);
		}
		public Case_divContext case_div(int i) {
			return getRuleContext(Case_divContext.class,i);
		}
		public List<Case_avrgContext> case_avrg() {
			return getRuleContexts(Case_avrgContext.class);
		}
		public Case_avrgContext case_avrg(int i) {
			return getRuleContext(Case_avrgContext.class,i);
		}
		public List<Case_errorContext> case_error() {
			return getRuleContexts(Case_errorContext.class);
		}
		public Case_errorContext case_error(int i) {
			return getRuleContext(Case_errorContext.class,i);
		}
		public MatchstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterMatchstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitMatchstmt(this);
		}
	}

	public final MatchstmtContext matchstmt() throws RecognitionException {
		MatchstmtContext _localctx = new MatchstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_matchstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__5);
			setState(63);
			match(T__1);
			setState(64);
			match(NAME);
			setState(65);
			match(T__3);
			setState(66);
			match(T__4);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(67);
					case_suma();
					}
					break;
				case 2:
					{
					setState(68);
					case_resta();
					}
					break;
				case 3:
					{
					setState(69);
					case_mult();
					}
					break;
				case 4:
					{
					setState(70);
					case_div();
					}
					break;
				case 5:
					{
					setState(71);
					case_avrg();
					}
					break;
				case 6:
					{
					setState(72);
					case_error();
					}
					break;
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_sumaContext extends ParserRuleContext {
		public Plus_opContext plus_op() {
			return getRuleContext(Plus_opContext.class,0);
		}
		public TerminalNode PLUSOP() { return getToken(CalculadoraParser.PLUSOP, 0); }
		public Case_sumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterCase_suma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitCase_suma(this);
		}
	}

	public final Case_sumaContext case_suma() throws RecognitionException {
		Case_sumaContext _localctx = new Case_sumaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_case_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__6);
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(78);
				match(T__7);
				setState(79);
				match(PLUSOP);
				setState(80);
				match(T__7);
				}
				break;
			case T__8:
				{
				setState(81);
				match(T__8);
				setState(82);
				match(PLUSOP);
				setState(83);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(86);
			match(T__4);
			setState(87);
			match(T__9);
			setState(88);
			plus_op();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_restaContext extends ParserRuleContext {
		public Minus_opContext minus_op() {
			return getRuleContext(Minus_opContext.class,0);
		}
		public TerminalNode MINUSOP() { return getToken(CalculadoraParser.MINUSOP, 0); }
		public Case_restaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_resta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterCase_resta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitCase_resta(this);
		}
	}

	public final Case_restaContext case_resta() throws RecognitionException {
		Case_restaContext _localctx = new Case_restaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_case_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__6);
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(91);
				match(T__7);
				setState(92);
				match(MINUSOP);
				setState(93);
				match(T__7);
				}
				break;
			case T__8:
				{
				setState(94);
				match(T__8);
				setState(95);
				match(MINUSOP);
				setState(96);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(99);
			match(T__4);
			setState(100);
			match(T__9);
			setState(101);
			minus_op();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_multContext extends ParserRuleContext {
		public Multiply_opContext multiply_op() {
			return getRuleContext(Multiply_opContext.class,0);
		}
		public TerminalNode MULTOP() { return getToken(CalculadoraParser.MULTOP, 0); }
		public Case_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterCase_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitCase_mult(this);
		}
	}

	public final Case_multContext case_mult() throws RecognitionException {
		Case_multContext _localctx = new Case_multContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_case_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__6);
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(104);
				match(T__7);
				setState(105);
				match(MULTOP);
				setState(106);
				match(T__7);
				}
				break;
			case T__8:
				{
				setState(107);
				match(T__8);
				setState(108);
				match(MULTOP);
				setState(109);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112);
			match(T__4);
			setState(113);
			match(T__9);
			setState(114);
			multiply_op();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_avrgContext extends ParserRuleContext {
		public Avrg_opContext avrg_op() {
			return getRuleContext(Avrg_opContext.class,0);
		}
		public TerminalNode PERCENOP() { return getToken(CalculadoraParser.PERCENOP, 0); }
		public Case_avrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_avrg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterCase_avrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitCase_avrg(this);
		}
	}

	public final Case_avrgContext case_avrg() throws RecognitionException {
		Case_avrgContext _localctx = new Case_avrgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_case_avrg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__6);
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(117);
				match(T__7);
				setState(118);
				match(PERCENOP);
				setState(119);
				match(T__7);
				}
				break;
			case T__8:
				{
				setState(120);
				match(T__8);
				setState(121);
				match(PERCENOP);
				setState(122);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125);
			match(T__4);
			setState(126);
			match(T__9);
			setState(127);
			avrg_op();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_divContext extends ParserRuleContext {
		public DivisionstmtContext divisionstmt() {
			return getRuleContext(DivisionstmtContext.class,0);
		}
		public TerminalNode DIVIDEOP() { return getToken(CalculadoraParser.DIVIDEOP, 0); }
		public Case_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterCase_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitCase_div(this);
		}
	}

	public final Case_divContext case_div() throws RecognitionException {
		Case_divContext _localctx = new Case_divContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_case_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__6);
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(130);
				match(T__7);
				setState(131);
				match(DIVIDEOP);
				setState(132);
				match(T__7);
				}
				break;
			case T__8:
				{
				setState(133);
				match(T__8);
				setState(134);
				match(DIVIDEOP);
				setState(135);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138);
			match(T__4);
			setState(139);
			divisionstmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Case_errorContext extends ParserRuleContext {
		public Exception_stmtContext exception_stmt() {
			return getRuleContext(Exception_stmtContext.class,0);
		}
		public Case_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterCase_error(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitCase_error(this);
		}
	}

	public final Case_errorContext case_error() throws RecognitionException {
		Case_errorContext _localctx = new Case_errorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_case_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__6);
			setState(142);
			match(T__10);
			setState(143);
			match(T__4);
			setState(144);
			match(T__11);
			setState(145);
			exception_stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DivisionstmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculadoraParser.ID, 0); }
		public TerminalNode COMPOP() { return getToken(CalculadoraParser.COMPOP, 0); }
		public TerminalNode INT() { return getToken(CalculadoraParser.INT, 0); }
		public Divide_opContext divide_op() {
			return getRuleContext(Divide_opContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public DivisionstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divisionstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterDivisionstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitDivisionstmt(this);
		}
	}

	public final DivisionstmtContext divisionstmt() throws RecognitionException {
		DivisionstmtContext _localctx = new DivisionstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_divisionstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__12);
			setState(148);
			match(T__1);
			setState(149);
			match(ID);
			setState(150);
			match(COMPOP);
			setState(151);
			match(INT);
			setState(152);
			match(T__3);
			setState(153);
			match(T__4);
			setState(154);
			match(T__9);
			setState(155);
			divide_op();
			setState(156);
			match(T__13);
			setState(157);
			match(T__4);
			setState(158);
			whilestmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhilestmtContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CalculadoraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculadoraParser.ID, i);
		}
		public TerminalNode COMPOP() { return getToken(CalculadoraParser.COMPOP, 0); }
		public TerminalNode INT() { return getToken(CalculadoraParser.INT, 0); }
		public TerminalNode IQOP() { return getToken(CalculadoraParser.IQOP, 0); }
		public Int_parserContext int_parser() {
			return getRuleContext(Int_parserContext.class,0);
		}
		public Divide_opContext divide_op() {
			return getRuleContext(Divide_opContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitWhilestmt(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__14);
			setState(161);
			match(T__1);
			setState(162);
			match(ID);
			setState(163);
			match(COMPOP);
			setState(164);
			match(INT);
			setState(165);
			match(T__3);
			setState(166);
			match(T__4);
			setState(167);
			match(ID);
			setState(168);
			match(IQOP);
			setState(169);
			int_parser();
			setState(170);
			match(T__9);
			setState(171);
			divide_op();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Int_parserContext extends ParserRuleContext {
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public Int_parserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_parser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterInt_parser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitInt_parser(this);
		}
	}

	public final Int_parserContext int_parser() throws RecognitionException {
		Int_parserContext _localctx = new Int_parserContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_int_parser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__15);
			setState(174);
			match(T__1);
			setState(175);
			input_stmt();
			setState(176);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Input_stmtContext extends ParserRuleContext {
		public TerminalNode MSG() { return getToken(CalculadoraParser.MSG, 0); }
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterInput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitInput_stmt(this);
		}
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__16);
			setState(179);
			match(T__1);
			setState(180);
			match(MSG);
			setState(181);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exception_stmtContext extends ParserRuleContext {
		public TerminalNode MSG() { return getToken(CalculadoraParser.MSG, 0); }
		public Exception_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterException_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitException_stmt(this);
		}
	}

	public final Exception_stmtContext exception_stmt() throws RecognitionException {
		Exception_stmtContext _localctx = new Exception_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exception_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__17);
			setState(184);
			match(T__1);
			setState(185);
			match(MSG);
			setState(186);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Plus_opContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculadoraParser.ID, 0); }
		public TerminalNode PLUSOP() { return getToken(CalculadoraParser.PLUSOP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Plus_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterPlus_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitPlus_op(this);
		}
	}

	public final Plus_opContext plus_op() throws RecognitionException {
		Plus_opContext _localctx = new Plus_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_plus_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ID);
			setState(189);
			match(PLUSOP);
			setState(190);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Minus_opContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculadoraParser.ID, 0); }
		public TerminalNode MINUSOP() { return getToken(CalculadoraParser.MINUSOP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Minus_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterMinus_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitMinus_op(this);
		}
	}

	public final Minus_opContext minus_op() throws RecognitionException {
		Minus_opContext _localctx = new Minus_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_minus_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ID);
			setState(193);
			match(MINUSOP);
			setState(194);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Multiply_opContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculadoraParser.ID, 0); }
		public TerminalNode MULTOP() { return getToken(CalculadoraParser.MULTOP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Multiply_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterMultiply_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitMultiply_op(this);
		}
	}

	public final Multiply_opContext multiply_op() throws RecognitionException {
		Multiply_opContext _localctx = new Multiply_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multiply_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(197);
			match(MULTOP);
			setState(198);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Divide_opContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculadoraParser.ID, 0); }
		public TerminalNode DIVIDEOP() { return getToken(CalculadoraParser.DIVIDEOP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Divide_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterDivide_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitDivide_op(this);
		}
	}

	public final Divide_opContext divide_op() throws RecognitionException {
		Divide_opContext _localctx = new Divide_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_divide_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
			setState(201);
			match(DIVIDEOP);
			setState(202);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Avrg_opContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculadoraParser.ID, 0); }
		public TerminalNode MULTOP() { return getToken(CalculadoraParser.MULTOP, 0); }
		public Divide_opContext divide_op() {
			return getRuleContext(Divide_opContext.class,0);
		}
		public Avrg_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avrg_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterAvrg_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitAvrg_op(this);
		}
	}

	public final Avrg_opContext avrg_op() throws RecognitionException {
		Avrg_opContext _localctx = new Avrg_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_avrg_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ID);
			setState(205);
			match(MULTOP);
			setState(206);
			match(T__1);
			setState(207);
			divide_op();
			setState(208);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public Plus_opContext plus_op() {
			return getRuleContext(Plus_opContext.class,0);
		}
		public Minus_opContext minus_op() {
			return getRuleContext(Minus_opContext.class,0);
		}
		public Multiply_opContext multiply_op() {
			return getRuleContext(Multiply_opContext.class,0);
		}
		public Divide_opContext divide_op() {
			return getRuleContext(Divide_opContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				plus_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				minus_op();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				multiply_op();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				divide_op();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exp);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				term();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculadoraParser.ID, 0); }
		public TerminalNode INT() { return getToken(CalculadoraParser.INT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004"+
		"\u0003J\b\u0003\u000b\u0003\f\u0003K\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"b\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006o\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007|\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0089\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00d7\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u00db"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,\u0000\u0001\u0002\u0000\u0013\u0013\u0017\u0017\u00d6\u0000."+
		"\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u00042\u0001\u0000"+
		"\u0000\u0000\u0006>\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000"+
		"\nZ\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000et\u0001\u0000"+
		"\u0000\u0000\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u008d\u0001\u0000"+
		"\u0000\u0000\u0014\u0093\u0001\u0000\u0000\u0000\u0016\u00a0\u0001\u0000"+
		"\u0000\u0000\u0018\u00ad\u0001\u0000\u0000\u0000\u001a\u00b2\u0001\u0000"+
		"\u0000\u0000\u001c\u00b7\u0001\u0000\u0000\u0000\u001e\u00bc\u0001\u0000"+
		"\u0000\u0000 \u00c0\u0001\u0000\u0000\u0000\"\u00c4\u0001\u0000\u0000"+
		"\u0000$\u00c8\u0001\u0000\u0000\u0000&\u00cc\u0001\u0000\u0000\u0000("+
		"\u00d6\u0001\u0000\u0000\u0000*\u00da\u0001\u0000\u0000\u0000,\u00dc\u0001"+
		"\u0000\u0000\u0000./\u0003\u0002\u0001\u0000/\u0001\u0001\u0000\u0000"+
		"\u000001\u0003\u0004\u0002\u00001\u0003\u0001\u0000\u0000\u000023\u0005"+
		"\u0001\u0000\u000034\u0005\u0014\u0000\u000045\u0005\u0002\u0000\u0000"+
		"56\u0005\u0013\u0000\u000067\u0005\u0003\u0000\u000078\u0005\u0013\u0000"+
		"\u000089\u0005\u0003\u0000\u00009:\u0005\u0014\u0000\u0000:;\u0005\u0004"+
		"\u0000\u0000;<\u0005\u0005\u0000\u0000<=\u0003\u0006\u0003\u0000=\u0005"+
		"\u0001\u0000\u0000\u0000>?\u0005\u0006\u0000\u0000?@\u0005\u0002\u0000"+
		"\u0000@A\u0005\u0014\u0000\u0000AB\u0005\u0004\u0000\u0000BI\u0005\u0005"+
		"\u0000\u0000CJ\u0003\b\u0004\u0000DJ\u0003\n\u0005\u0000EJ\u0003\f\u0006"+
		"\u0000FJ\u0003\u0010\b\u0000GJ\u0003\u000e\u0007\u0000HJ\u0003\u0012\t"+
		"\u0000IC\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000IE\u0001\u0000"+
		"\u0000\u0000IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000L\u0007\u0001\u0000\u0000\u0000MT\u0005\u0007"+
		"\u0000\u0000NO\u0005\b\u0000\u0000OP\u0005\u001a\u0000\u0000PU\u0005\b"+
		"\u0000\u0000QR\u0005\t\u0000\u0000RS\u0005\u001a\u0000\u0000SU\u0005\t"+
		"\u0000\u0000TN\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VW\u0005\u0005\u0000\u0000WX\u0005\n\u0000\u0000XY\u0003"+
		"\u001e\u000f\u0000Y\t\u0001\u0000\u0000\u0000Za\u0005\u0007\u0000\u0000"+
		"[\\\u0005\b\u0000\u0000\\]\u0005\u001b\u0000\u0000]b\u0005\b\u0000\u0000"+
		"^_\u0005\t\u0000\u0000_`\u0005\u001b\u0000\u0000`b\u0005\t\u0000\u0000"+
		"a[\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cd\u0005\u0005\u0000\u0000de\u0005\n\u0000\u0000ef\u0003 \u0010"+
		"\u0000f\u000b\u0001\u0000\u0000\u0000gn\u0005\u0007\u0000\u0000hi\u0005"+
		"\b\u0000\u0000ij\u0005\u001c\u0000\u0000jo\u0005\b\u0000\u0000kl\u0005"+
		"\t\u0000\u0000lm\u0005\u001c\u0000\u0000mo\u0005\t\u0000\u0000nh\u0001"+
		"\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pq\u0005\u0005\u0000\u0000qr\u0005\n\u0000\u0000rs\u0003\"\u0011\u0000"+
		"s\r\u0001\u0000\u0000\u0000t{\u0005\u0007\u0000\u0000uv\u0005\b\u0000"+
		"\u0000vw\u0005\u001e\u0000\u0000w|\u0005\b\u0000\u0000xy\u0005\t\u0000"+
		"\u0000yz\u0005\u001e\u0000\u0000z|\u0005\t\u0000\u0000{u\u0001\u0000\u0000"+
		"\u0000{x\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u0005"+
		"\u0000\u0000~\u007f\u0005\n\u0000\u0000\u007f\u0080\u0003&\u0013\u0000"+
		"\u0080\u000f\u0001\u0000\u0000\u0000\u0081\u0088\u0005\u0007\u0000\u0000"+
		"\u0082\u0083\u0005\b\u0000\u0000\u0083\u0084\u0005\u001d\u0000\u0000\u0084"+
		"\u0089\u0005\b\u0000\u0000\u0085\u0086\u0005\t\u0000\u0000\u0086\u0087"+
		"\u0005\u001d\u0000\u0000\u0087\u0089\u0005\t\u0000\u0000\u0088\u0082\u0001"+
		"\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\u0005\u0000\u0000\u008b\u008c\u0003"+
		"\u0014\n\u0000\u008c\u0011\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0007"+
		"\u0000\u0000\u008e\u008f\u0005\u000b\u0000\u0000\u008f\u0090\u0005\u0005"+
		"\u0000\u0000\u0090\u0091\u0005\f\u0000\u0000\u0091\u0092\u0003\u001c\u000e"+
		"\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093\u0094\u0005\r\u0000\u0000"+
		"\u0094\u0095\u0005\u0002\u0000\u0000\u0095\u0096\u0005\u0013\u0000\u0000"+
		"\u0096\u0097\u0005\u0018\u0000\u0000\u0097\u0098\u0005\u0017\u0000\u0000"+
		"\u0098\u0099\u0005\u0004\u0000\u0000\u0099\u009a\u0005\u0005\u0000\u0000"+
		"\u009a\u009b\u0005\n\u0000\u0000\u009b\u009c\u0003$\u0012\u0000\u009c"+
		"\u009d\u0005\u000e\u0000\u0000\u009d\u009e\u0005\u0005\u0000\u0000\u009e"+
		"\u009f\u0003\u0016\u000b\u0000\u009f\u0015\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005\u000f\u0000\u0000\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0013\u0000\u0000\u00a3\u00a4\u0005\u0018\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0017\u0000\u0000\u00a5\u00a6\u0005\u0004\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0005\u0000\u0000\u00a7\u00a8\u0005\u0013\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0019\u0000\u0000\u00a9\u00aa\u0003\u0018\f\u0000\u00aa\u00ab"+
		"\u0005\n\u0000\u0000\u00ab\u00ac\u0003$\u0012\u0000\u00ac\u0017\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0005\u0010\u0000\u0000\u00ae\u00af\u0005"+
		"\u0002\u0000\u0000\u00af\u00b0\u0003\u001a\r\u0000\u00b0\u00b1\u0005\u0004"+
		"\u0000\u0000\u00b1\u0019\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0011"+
		"\u0000\u0000\u00b3\u00b4\u0005\u0002\u0000\u0000\u00b4\u00b5\u0005\u0015"+
		"\u0000\u0000\u00b5\u00b6\u0005\u0004\u0000\u0000\u00b6\u001b\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0012\u0000\u0000\u00b8\u00b9\u0005\u0002"+
		"\u0000\u0000\u00b9\u00ba\u0005\u0015\u0000\u0000\u00ba\u00bb\u0005\u0004"+
		"\u0000\u0000\u00bb\u001d\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0013"+
		"\u0000\u0000\u00bd\u00be\u0005\u001a\u0000\u0000\u00be\u00bf\u0003*\u0015"+
		"\u0000\u00bf\u001f\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0013\u0000"+
		"\u0000\u00c1\u00c2\u0005\u001b\u0000\u0000\u00c2\u00c3\u0003*\u0015\u0000"+
		"\u00c3!\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0013\u0000\u0000\u00c5"+
		"\u00c6\u0005\u001c\u0000\u0000\u00c6\u00c7\u0003*\u0015\u0000\u00c7#\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005\u0013\u0000\u0000\u00c9\u00ca\u0005"+
		"\u001d\u0000\u0000\u00ca\u00cb\u0003*\u0015\u0000\u00cb%\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0005\u0013\u0000\u0000\u00cd\u00ce\u0005\u001c\u0000"+
		"\u0000\u00ce\u00cf\u0005\u0002\u0000\u0000\u00cf\u00d0\u0003$\u0012\u0000"+
		"\u00d0\u00d1\u0005\u0004\u0000\u0000\u00d1\'\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d7\u0003\u001e\u000f\u0000\u00d3\u00d7\u0003 \u0010\u0000\u00d4\u00d7"+
		"\u0003\"\u0011\u0000\u00d5\u00d7\u0003$\u0012\u0000\u00d6\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7)\u0001\u0000"+
		"\u0000\u0000\u00d8\u00db\u0003,\u0016\u0000\u00d9\u00db\u0003(\u0014\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db+\u0001\u0000\u0000\u0000\u00dc\u00dd\u0007\u0000\u0000\u0000\u00dd"+
		"-\u0001\u0000\u0000\u0000\tIKTan{\u0088\u00d6\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}