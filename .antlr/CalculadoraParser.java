// Generated from /Users/ngrp/Desktop/LenguajesFormales/seminario_lenguajes_formales/Calculadora.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculadoraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		RULE_case_suma = 4, RULE_case_resta = 5, RULE_case_mult = 6, RULE_case_percen = 7, 
		RULE_case_div = 8, RULE_case_error = 9, RULE_divisionstmt = 10, RULE_whilestmt = 11, 
		RULE_int_parser = 12, RULE_input_stmt = 13, RULE_exception_stmt = 14, 
		RULE_plus_op = 15, RULE_minus_op = 16, RULE_multiply_op = 17, RULE_divide_op = 18, 
		RULE_percen_op = 19, RULE_term = 20, RULE_exp = 21, RULE_factor = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calculadora", "defstmt", "matchstmt", "case_suma", "case_resta", 
			"case_mult", "case_percen", "case_div", "case_error", "divisionstmt", 
			"whilestmt", "int_parser", "input_stmt", "exception_stmt", "plus_op", 
			"minus_op", "multiply_op", "divide_op", "percen_op", "term", "exp", "factor"
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

	public static class StartContext extends ParserRuleContext {
		public CalculadoraContext calculadora() {
			return getRuleContext(CalculadoraContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
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

	public static class CalculadoraContext extends ParserRuleContext {
		public DefstmtContext defstmt() {
			return getRuleContext(DefstmtContext.class,0);
		}
		public CalculadoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculadora; }
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
		public List<Case_percenContext> case_percen() {
			return getRuleContexts(Case_percenContext.class);
		}
		public Case_percenContext case_percen(int i) {
			return getRuleContext(Case_percenContext.class,i);
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
					case_percen();
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

	public static class Case_sumaContext extends ParserRuleContext {
		public Plus_opContext plus_op() {
			return getRuleContext(Plus_opContext.class,0);
		}
		public TerminalNode PLUSOP() { return getToken(CalculadoraParser.PLUSOP, 0); }
		public Case_sumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_suma; }
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

	public static class Case_restaContext extends ParserRuleContext {
		public Minus_opContext minus_op() {
			return getRuleContext(Minus_opContext.class,0);
		}
		public TerminalNode MINUSOP() { return getToken(CalculadoraParser.MINUSOP, 0); }
		public Case_restaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_resta; }
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

	public static class Case_multContext extends ParserRuleContext {
		public Multiply_opContext multiply_op() {
			return getRuleContext(Multiply_opContext.class,0);
		}
		public TerminalNode MULTOP() { return getToken(CalculadoraParser.MULTOP, 0); }
		public Case_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_mult; }
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

	public static class Case_percenContext extends ParserRuleContext {
		public Percen_opContext percen_op() {
			return getRuleContext(Percen_opContext.class,0);
		}
		public TerminalNode PERCENOP() { return getToken(CalculadoraParser.PERCENOP, 0); }
		public Case_percenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_percen; }
	}

	public final Case_percenContext case_percen() throws RecognitionException {
		Case_percenContext _localctx = new Case_percenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_case_percen);
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
			percen_op();
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

	public static class Case_divContext extends ParserRuleContext {
		public DivisionstmtContext divisionstmt() {
			return getRuleContext(DivisionstmtContext.class,0);
		}
		public TerminalNode DIVIDEOP() { return getToken(CalculadoraParser.DIVIDEOP, 0); }
		public Case_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_div; }
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

	public static class Case_errorContext extends ParserRuleContext {
		public Exception_stmtContext exception_stmt() {
			return getRuleContext(Exception_stmtContext.class,0);
		}
		public Case_errorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_error; }
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

	public static class Int_parserContext extends ParserRuleContext {
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public Int_parserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_parser; }
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

	public static class Input_stmtContext extends ParserRuleContext {
		public TerminalNode MSG() { return getToken(CalculadoraParser.MSG, 0); }
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
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

	public static class Exception_stmtContext extends ParserRuleContext {
		public TerminalNode MSG() { return getToken(CalculadoraParser.MSG, 0); }
		public Exception_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_stmt; }
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

	public static class Percen_opContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculadoraParser.ID, 0); }
		public TerminalNode MULTOP() { return getToken(CalculadoraParser.MULTOP, 0); }
		public Divide_opContext divide_op() {
			return getRuleContext(Divide_opContext.class,0);
		}
		public Percen_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percen_op; }
	}

	public final Percen_opContext percen_op() throws RecognitionException {
		Percen_opContext _localctx = new Percen_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_percen_op);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculadoraParser.ID, 0); }
		public TerminalNode INT() { return getToken(CalculadoraParser.INT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5L\n\5\r\5\16\5M\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6W\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7d\n\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u008b\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\5\26\u00d9\n\26\3\27\3\27\5\27\u00dd\n\27\3"+
		"\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2"+
		"\3\4\2\25\25\31\31\2\u00d8\2\60\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2\2\b@\3"+
		"\2\2\2\nO\3\2\2\2\f\\\3\2\2\2\16i\3\2\2\2\20v\3\2\2\2\22\u0083\3\2\2\2"+
		"\24\u008f\3\2\2\2\26\u0095\3\2\2\2\30\u00a2\3\2\2\2\32\u00af\3\2\2\2\34"+
		"\u00b4\3\2\2\2\36\u00b9\3\2\2\2 \u00be\3\2\2\2\"\u00c2\3\2\2\2$\u00c6"+
		"\3\2\2\2&\u00ca\3\2\2\2(\u00ce\3\2\2\2*\u00d8\3\2\2\2,\u00dc\3\2\2\2."+
		"\u00de\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\63\5\6\4\2\63\5\3\2\2\2\64"+
		"\65\7\3\2\2\65\66\7\26\2\2\66\67\7\4\2\2\678\7\25\2\289\7\5\2\29:\7\25"+
		"\2\2:;\7\5\2\2;<\7\26\2\2<=\7\6\2\2=>\7\7\2\2>?\5\b\5\2?\7\3\2\2\2@A\7"+
		"\b\2\2AB\7\4\2\2BC\7\26\2\2CD\7\6\2\2DK\7\7\2\2EL\5\n\6\2FL\5\f\7\2GL"+
		"\5\16\b\2HL\5\22\n\2IL\5\20\t\2JL\5\24\13\2KE\3\2\2\2KF\3\2\2\2KG\3\2"+
		"\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\t\3"+
		"\2\2\2OV\7\t\2\2PQ\7\n\2\2QR\7\34\2\2RW\7\n\2\2ST\7\13\2\2TU\7\34\2\2"+
		"UW\7\13\2\2VP\3\2\2\2VS\3\2\2\2WX\3\2\2\2XY\7\7\2\2YZ\7\f\2\2Z[\5 \21"+
		"\2[\13\3\2\2\2\\c\7\t\2\2]^\7\n\2\2^_\7\35\2\2_d\7\n\2\2`a\7\13\2\2ab"+
		"\7\35\2\2bd\7\13\2\2c]\3\2\2\2c`\3\2\2\2de\3\2\2\2ef\7\7\2\2fg\7\f\2\2"+
		"gh\5\"\22\2h\r\3\2\2\2ip\7\t\2\2jk\7\n\2\2kl\7\36\2\2lq\7\n\2\2mn\7\13"+
		"\2\2no\7\36\2\2oq\7\13\2\2pj\3\2\2\2pm\3\2\2\2qr\3\2\2\2rs\7\7\2\2st\7"+
		"\f\2\2tu\5$\23\2u\17\3\2\2\2v}\7\t\2\2wx\7\n\2\2xy\7 \2\2y~\7\n\2\2z{"+
		"\7\13\2\2{|\7 \2\2|~\7\13\2\2}w\3\2\2\2}z\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\7\7\2\2\u0080\u0081\7\f\2\2\u0081\u0082\5(\25\2\u0082\21\3\2\2\2\u0083"+
		"\u008a\7\t\2\2\u0084\u0085\7\n\2\2\u0085\u0086\7\37\2\2\u0086\u008b\7"+
		"\n\2\2\u0087\u0088\7\13\2\2\u0088\u0089\7\37\2\2\u0089\u008b\7\13\2\2"+
		"\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d"+
		"\7\7\2\2\u008d\u008e\5\26\f\2\u008e\23\3\2\2\2\u008f\u0090\7\t\2\2\u0090"+
		"\u0091\7\r\2\2\u0091\u0092\7\7\2\2\u0092\u0093\7\16\2\2\u0093\u0094\5"+
		"\36\20\2\u0094\25\3\2\2\2\u0095\u0096\7\17\2\2\u0096\u0097\7\4\2\2\u0097"+
		"\u0098\7\25\2\2\u0098\u0099\7\32\2\2\u0099\u009a\7\31\2\2\u009a\u009b"+
		"\7\6\2\2\u009b\u009c\7\7\2\2\u009c\u009d\7\f\2\2\u009d\u009e\5&\24\2\u009e"+
		"\u009f\7\20\2\2\u009f\u00a0\7\7\2\2\u00a0\u00a1\5\30\r\2\u00a1\27\3\2"+
		"\2\2\u00a2\u00a3\7\21\2\2\u00a3\u00a4\7\4\2\2\u00a4\u00a5\7\25\2\2\u00a5"+
		"\u00a6\7\32\2\2\u00a6\u00a7\7\31\2\2\u00a7\u00a8\7\6\2\2\u00a8\u00a9\7"+
		"\7\2\2\u00a9\u00aa\7\25\2\2\u00aa\u00ab\7\33\2\2\u00ab\u00ac\5\32\16\2"+
		"\u00ac\u00ad\7\f\2\2\u00ad\u00ae\5&\24\2\u00ae\31\3\2\2\2\u00af\u00b0"+
		"\7\22\2\2\u00b0\u00b1\7\4\2\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3\7\6\2"+
		"\2\u00b3\33\3\2\2\2\u00b4\u00b5\7\23\2\2\u00b5\u00b6\7\4\2\2\u00b6\u00b7"+
		"\7\27\2\2\u00b7\u00b8\7\6\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\7\24\2\2\u00ba"+
		"\u00bb\7\4\2\2\u00bb\u00bc\7\27\2\2\u00bc\u00bd\7\6\2\2\u00bd\37\3\2\2"+
		"\2\u00be\u00bf\7\25\2\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1\5,\27\2\u00c1"+
		"!\3\2\2\2\u00c2\u00c3\7\25\2\2\u00c3\u00c4\7\35\2\2\u00c4\u00c5\5,\27"+
		"\2\u00c5#\3\2\2\2\u00c6\u00c7\7\25\2\2\u00c7\u00c8\7\36\2\2\u00c8\u00c9"+
		"\5,\27\2\u00c9%\3\2\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\7\37\2\2\u00cc"+
		"\u00cd\5,\27\2\u00cd\'\3\2\2\2\u00ce\u00cf\7\25\2\2\u00cf\u00d0\7\36\2"+
		"\2\u00d0\u00d1\7\4\2\2\u00d1\u00d2\5&\24\2\u00d2\u00d3\7\6\2\2\u00d3)"+
		"\3\2\2\2\u00d4\u00d9\5 \21\2\u00d5\u00d9\5\"\22\2\u00d6\u00d9\5$\23\2"+
		"\u00d7\u00d9\5&\24\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9+\3\2\2\2\u00da\u00dd\5.\30\2\u00db"+
		"\u00dd\5*\26\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd-\3\2\2\2"+
		"\u00de\u00df\t\2\2\2\u00df/\3\2\2\2\13KMVcp}\u008a\u00d8\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}