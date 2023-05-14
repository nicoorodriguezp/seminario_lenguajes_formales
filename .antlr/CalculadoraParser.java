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
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, NAME=23, MSG=24, CHAR=25, 
		INT=26, COMPOP=27, OPERATOR=28, WS=29;
	public static final int
		RULE_start = 0, RULE_calculadora = 1, RULE_defstmt = 2, RULE_matchstmt = 3, 
		RULE_case_suma = 4, RULE_case_resta = 5, RULE_case_mult = 6, RULE_case_div = 7, 
		RULE_divisionstmt = 8, RULE_whilestmt = 9, RULE_case_error = 10, RULE_int_parser = 11, 
		RULE_input_stmt = 12, RULE_exception_stmt = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calculadora", "defstmt", "matchstmt", "case_suma", "case_resta", 
			"case_mult", "case_div", "divisionstmt", "whilestmt", "case_error", "int_parser", 
			"input_stmt", "exception_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'('", "','", "')'", "':'", "'match'", "'case'", "'\"'", 
			"'+'", "'return'", "'-'", "'*'", "'/'", "'if'", "'else'", "'while'", 
			"'_'", "'raise'", "'int'", "'input'", "'Exception'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "NAME", 
			"MSG", "CHAR", "INT", "COMPOP", "OPERATOR", "WS"
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
			setState(28);
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
			setState(30);
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
			setState(32);
			match(T__0);
			setState(33);
			match(NAME);
			setState(34);
			match(T__1);
			setState(35);
			match(ID);
			setState(36);
			match(T__2);
			setState(37);
			match(ID);
			setState(38);
			match(T__2);
			setState(39);
			match(NAME);
			setState(40);
			match(T__3);
			setState(41);
			match(T__4);
			setState(42);
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
		public Case_sumaContext case_suma() {
			return getRuleContext(Case_sumaContext.class,0);
		}
		public Case_restaContext case_resta() {
			return getRuleContext(Case_restaContext.class,0);
		}
		public Case_multContext case_mult() {
			return getRuleContext(Case_multContext.class,0);
		}
		public Case_divContext case_div() {
			return getRuleContext(Case_divContext.class,0);
		}
		public Case_errorContext case_error() {
			return getRuleContext(Case_errorContext.class,0);
		}
		public MatchstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchstmt; }
	}

	public final MatchstmtContext matchstmt() throws RecognitionException {
		MatchstmtContext _localctx = new MatchstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_matchstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__5);
			setState(45);
			match(T__1);
			setState(46);
			match(NAME);
			setState(47);
			match(T__3);
			setState(48);
			match(T__4);
			setState(49);
			case_suma();
			setState(50);
			case_resta();
			setState(51);
			case_mult();
			setState(52);
			case_div();
			setState(53);
			case_error();
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
		public List<TerminalNode> ID() { return getTokens(CalculadoraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculadoraParser.ID, i);
		}
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
			setState(55);
			match(T__6);
			setState(56);
			match(T__7);
			setState(57);
			match(T__8);
			setState(58);
			match(T__7);
			setState(59);
			match(T__4);
			setState(60);
			match(T__9);
			setState(61);
			match(ID);
			setState(62);
			match(T__8);
			setState(63);
			match(ID);
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
		public List<TerminalNode> ID() { return getTokens(CalculadoraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculadoraParser.ID, i);
		}
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
			setState(65);
			match(T__6);
			setState(66);
			match(T__7);
			setState(67);
			match(T__10);
			setState(68);
			match(T__7);
			setState(69);
			match(T__4);
			setState(70);
			match(T__9);
			setState(71);
			match(ID);
			setState(72);
			match(T__10);
			setState(73);
			match(ID);
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
		public List<TerminalNode> ID() { return getTokens(CalculadoraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculadoraParser.ID, i);
		}
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
			setState(75);
			match(T__6);
			setState(76);
			match(T__7);
			setState(77);
			match(T__11);
			setState(78);
			match(T__7);
			setState(79);
			match(T__4);
			setState(80);
			match(T__9);
			setState(81);
			match(ID);
			setState(82);
			match(T__11);
			setState(83);
			match(ID);
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
		public Case_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_div; }
	}

	public final Case_divContext case_div() throws RecognitionException {
		Case_divContext _localctx = new Case_divContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_case_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__6);
			setState(86);
			match(T__7);
			setState(87);
			match(T__12);
			setState(88);
			match(T__7);
			setState(89);
			match(T__4);
			setState(90);
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

	public static class DivisionstmtContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CalculadoraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculadoraParser.ID, i);
		}
		public TerminalNode COMPOP() { return getToken(CalculadoraParser.COMPOP, 0); }
		public TerminalNode INT() { return getToken(CalculadoraParser.INT, 0); }
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
		enterRule(_localctx, 16, RULE_divisionstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__13);
			setState(93);
			match(T__1);
			setState(94);
			match(ID);
			setState(95);
			match(COMPOP);
			setState(96);
			match(INT);
			setState(97);
			match(T__3);
			setState(98);
			match(T__4);
			setState(99);
			match(T__9);
			setState(100);
			match(ID);
			setState(101);
			match(T__12);
			setState(102);
			match(ID);
			setState(103);
			match(T__14);
			setState(104);
			match(T__4);
			setState(105);
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
		public TerminalNode OPERATOR() { return getToken(CalculadoraParser.OPERATOR, 0); }
		public Int_parserContext int_parser() {
			return getRuleContext(Int_parserContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__15);
			setState(108);
			match(T__1);
			setState(109);
			match(ID);
			setState(110);
			match(COMPOP);
			setState(111);
			match(INT);
			setState(112);
			match(T__3);
			setState(113);
			match(T__4);
			setState(114);
			match(ID);
			setState(115);
			match(OPERATOR);
			setState(116);
			int_parser();
			setState(117);
			match(T__9);
			setState(118);
			match(ID);
			setState(119);
			match(T__12);
			setState(120);
			match(ID);
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
		enterRule(_localctx, 20, RULE_case_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__6);
			setState(123);
			match(T__16);
			setState(124);
			match(T__4);
			setState(125);
			match(T__17);
			setState(126);
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
		enterRule(_localctx, 22, RULE_int_parser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__18);
			setState(129);
			match(T__1);
			setState(130);
			input_stmt();
			setState(131);
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
		enterRule(_localctx, 24, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__19);
			setState(134);
			match(T__1);
			setState(135);
			match(MSG);
			setState(136);
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
		enterRule(_localctx, 26, RULE_exception_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__20);
			setState(139);
			match(T__1);
			setState(140);
			match(MSG);
			setState(141);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\2\2\2\u0083\2\36\3\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b.\3\2"+
		"\2\2\n9\3\2\2\2\fC\3\2\2\2\16M\3\2\2\2\20W\3\2\2\2\22^\3\2\2\2\24m\3\2"+
		"\2\2\26|\3\2\2\2\30\u0082\3\2\2\2\32\u0087\3\2\2\2\34\u008c\3\2\2\2\36"+
		"\37\5\4\3\2\37\3\3\2\2\2 !\5\6\4\2!\5\3\2\2\2\"#\7\3\2\2#$\7\31\2\2$%"+
		"\7\4\2\2%&\7\30\2\2&\'\7\5\2\2\'(\7\30\2\2()\7\5\2\2)*\7\31\2\2*+\7\6"+
		"\2\2+,\7\7\2\2,-\5\b\5\2-\7\3\2\2\2./\7\b\2\2/\60\7\4\2\2\60\61\7\31\2"+
		"\2\61\62\7\6\2\2\62\63\7\7\2\2\63\64\5\n\6\2\64\65\5\f\7\2\65\66\5\16"+
		"\b\2\66\67\5\20\t\2\678\5\26\f\28\t\3\2\2\29:\7\t\2\2:;\7\n\2\2;<\7\13"+
		"\2\2<=\7\n\2\2=>\7\7\2\2>?\7\f\2\2?@\7\30\2\2@A\7\13\2\2AB\7\30\2\2B\13"+
		"\3\2\2\2CD\7\t\2\2DE\7\n\2\2EF\7\r\2\2FG\7\n\2\2GH\7\7\2\2HI\7\f\2\2I"+
		"J\7\30\2\2JK\7\r\2\2KL\7\30\2\2L\r\3\2\2\2MN\7\t\2\2NO\7\n\2\2OP\7\16"+
		"\2\2PQ\7\n\2\2QR\7\7\2\2RS\7\f\2\2ST\7\30\2\2TU\7\16\2\2UV\7\30\2\2V\17"+
		"\3\2\2\2WX\7\t\2\2XY\7\n\2\2YZ\7\17\2\2Z[\7\n\2\2[\\\7\7\2\2\\]\5\22\n"+
		"\2]\21\3\2\2\2^_\7\20\2\2_`\7\4\2\2`a\7\30\2\2ab\7\35\2\2bc\7\34\2\2c"+
		"d\7\6\2\2de\7\7\2\2ef\7\f\2\2fg\7\30\2\2gh\7\17\2\2hi\7\30\2\2ij\7\21"+
		"\2\2jk\7\7\2\2kl\5\24\13\2l\23\3\2\2\2mn\7\22\2\2no\7\4\2\2op\7\30\2\2"+
		"pq\7\35\2\2qr\7\34\2\2rs\7\6\2\2st\7\7\2\2tu\7\30\2\2uv\7\36\2\2vw\5\30"+
		"\r\2wx\7\f\2\2xy\7\30\2\2yz\7\17\2\2z{\7\30\2\2{\25\3\2\2\2|}\7\t\2\2"+
		"}~\7\23\2\2~\177\7\7\2\2\177\u0080\7\24\2\2\u0080\u0081\5\34\17\2\u0081"+
		"\27\3\2\2\2\u0082\u0083\7\25\2\2\u0083\u0084\7\4\2\2\u0084\u0085\5\32"+
		"\16\2\u0085\u0086\7\6\2\2\u0086\31\3\2\2\2\u0087\u0088\7\26\2\2\u0088"+
		"\u0089\7\4\2\2\u0089\u008a\7\32\2\2\u008a\u008b\7\6\2\2\u008b\33\3\2\2"+
		"\2\u008c\u008d\7\27\2\2\u008d\u008e\7\4\2\2\u008e\u008f\7\32\2\2\u008f"+
		"\u0090\7\6\2\2\u0090\35\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}