// Generated from /Users/ngrp/Desktop/LenguajesFormales/seminario_lenguajes_formales/Calculadora.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculadoraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, ID=19, NAME=20, MSG=21, CHAR=22, INT=23, COMPOP=24, IQOP=25, 
		PLUSOP=26, MINUSOP=27, MULTOP=28, DIVIDEOP=29, PERCENOP=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "ID", "NAME", "MSG", "CHAR", "INT", "COMPOP", "IQOP", "PLUSOP", 
			"MINUSOP", "MULTOP", "DIVIDEOP", "PERCENOP", "WS"
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


	public CalculadoraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculadora.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\6\25\u0091\n\25\r\25\16\25\u0092\3\26\3\26\3\26\5\26\u0098\n"+
		"\26\3\26\7\26\u009b\n\26\f\26\16\26\u009e\13\26\3\26\3\26\3\26\3\26\5"+
		"\26\u00a4\n\26\3\26\7\26\u00a7\n\26\f\26\16\26\u00aa\13\26\3\26\5\26\u00ad"+
		"\n\26\3\27\6\27\u00b0\n\27\r\27\16\27\u00b1\3\30\6\30\u00b5\n\30\r\30"+
		"\16\30\u00b6\3\31\3\31\3\31\3\31\5\31\u00bd\n\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \6 \u00cc\n \r \16 \u00cd\3 "+
		"\3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!\3\2\6\3\2c|\24\2C\\c|\u00a3\u00a3\u00c1\u00c1\u00c3\u00c3"+
		"\u00cb\u00cb\u00cf\u00cf\u00d3\u00d3\u00d5\u00d5\u00dc\u00dc\u00de\u00de"+
		"\u00e3\u00e3\u00eb\u00eb\u00ef\u00ef\u00f3\u00f3\u00f5\u00f5\u00fc\u00fc"+
		"\u00fe\u00fe\3\2\62;\5\2\13\f\17\17\"\"\2\u00dc\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\3A\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2"+
		"\2\2\17S\3\2\2\2\21X\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2\2\27c\3\2\2\2\31e"+
		"\3\2\2\2\33k\3\2\2\2\35n\3\2\2\2\37s\3\2\2\2!y\3\2\2\2#}\3\2\2\2%\u0083"+
		"\3\2\2\2\'\u008d\3\2\2\2)\u0090\3\2\2\2+\u00ac\3\2\2\2-\u00af\3\2\2\2"+
		"/\u00b4\3\2\2\2\61\u00bc\3\2\2\2\63\u00be\3\2\2\2\65\u00c0\3\2\2\2\67"+
		"\u00c2\3\2\2\29\u00c4\3\2\2\2;\u00c6\3\2\2\2=\u00c8\3\2\2\2?\u00cb\3\2"+
		"\2\2AB\7f\2\2BC\7g\2\2CD\7h\2\2D\4\3\2\2\2EF\7*\2\2F\6\3\2\2\2GH\7.\2"+
		"\2H\b\3\2\2\2IJ\7+\2\2J\n\3\2\2\2KL\7<\2\2L\f\3\2\2\2MN\7o\2\2NO\7c\2"+
		"\2OP\7v\2\2PQ\7e\2\2QR\7j\2\2R\16\3\2\2\2ST\7e\2\2TU\7c\2\2UV\7u\2\2V"+
		"W\7g\2\2W\20\3\2\2\2XY\7$\2\2Y\22\3\2\2\2Z[\7)\2\2[\24\3\2\2\2\\]\7t\2"+
		"\2]^\7g\2\2^_\7v\2\2_`\7w\2\2`a\7t\2\2ab\7p\2\2b\26\3\2\2\2cd\7a\2\2d"+
		"\30\3\2\2\2ef\7t\2\2fg\7c\2\2gh\7k\2\2hi\7u\2\2ij\7g\2\2j\32\3\2\2\2k"+
		"l\7k\2\2lm\7h\2\2m\34\3\2\2\2no\7g\2\2op\7n\2\2pq\7u\2\2qr\7g\2\2r\36"+
		"\3\2\2\2st\7y\2\2tu\7j\2\2uv\7k\2\2vw\7n\2\2wx\7g\2\2x \3\2\2\2yz\7k\2"+
		"\2z{\7p\2\2{|\7v\2\2|\"\3\2\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7r\2\2"+
		"\u0080\u0081\7w\2\2\u0081\u0082\7v\2\2\u0082$\3\2\2\2\u0083\u0084\7G\2"+
		"\2\u0084\u0085\7z\2\2\u0085\u0086\7e\2\2\u0086\u0087\7g\2\2\u0087\u0088"+
		"\7r\2\2\u0088\u0089\7v\2\2\u0089\u008a\7k\2\2\u008a\u008b\7q\2\2\u008b"+
		"\u008c\7p\2\2\u008c&\3\2\2\2\u008d\u008e\t\2\2\2\u008e(\3\2\2\2\u008f"+
		"\u0091\5-\27\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093*\3\2\2\2\u0094\u009c\7$\2\2\u0095\u0098"+
		"\5-\27\2\u0096\u0098\5/\30\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u009b\7\"\2\2\u009a\u0097\3\2\2\2\u009a\u0099\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00ad\7$\2\2\u00a0\u00a8\7)\2"+
		"\2\u00a1\u00a4\5-\27\2\u00a2\u00a4\5/\30\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a7\7\"\2\2\u00a6\u00a3\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\7)\2\2\u00ac"+
		"\u0094\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ad,\3\2\2\2\u00ae\u00b0\t\3\2\2"+
		"\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2.\3\2\2\2\u00b3\u00b5\t\4\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\60\3\2\2"+
		"\2\u00b8\u00b9\7?\2\2\u00b9\u00bd\7?\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bd"+
		"\7?\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\62\3\2\2\2\u00be"+
		"\u00bf\7?\2\2\u00bf\64\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1\66\3\2\2\2\u00c2"+
		"\u00c3\7/\2\2\u00c38\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5:\3\2\2\2\u00c6\u00c7"+
		"\7\61\2\2\u00c7<\3\2\2\2\u00c8\u00c9\7\'\2\2\u00c9>\3\2\2\2\u00ca\u00cc"+
		"\t\5\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b \2\2\u00d0@\3\2\2\2\17"+
		"\2\u0092\u0097\u009a\u009c\u00a3\u00a6\u00a8\u00ac\u00b1\u00b6\u00bc\u00cd"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}