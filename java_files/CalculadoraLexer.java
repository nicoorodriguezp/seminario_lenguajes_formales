// Generated from Calculadora.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculadoraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\u001f\u00cf\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u008f\b\u0013\u000b\u0013\f"+
		"\u0013\u0090\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0096\b\u0014"+
		"\u0001\u0014\u0005\u0014\u0099\b\u0014\n\u0014\f\u0014\u009c\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00a2\b\u0014\u0001"+
		"\u0014\u0005\u0014\u00a5\b\u0014\n\u0014\f\u0014\u00a8\t\u0014\u0001\u0014"+
		"\u0003\u0014\u00ab\b\u0014\u0001\u0015\u0004\u0015\u00ae\b\u0015\u000b"+
		"\u0015\f\u0015\u00af\u0001\u0016\u0004\u0016\u00b3\b\u0016\u000b\u0016"+
		"\f\u0016\u00b4\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00bb\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0004\u001e\u00ca\b\u001e\u000b\u001e\f\u001e"+
		"\u00cb\u0001\u001e\u0001\u001e\u0000\u0000\u001f\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f\u0001\u0000\u0004\u0001\u0000az\u0012\u0000"+
		"AZaz\u00a1\u00a1\u00bf\u00bf\u00c1\u00c1\u00c9\u00c9\u00cd\u00cd\u00d1"+
		"\u00d1\u00d3\u00d3\u00da\u00da\u00dc\u00dc\u00e1\u00e1\u00e9\u00e9\u00ed"+
		"\u00ed\u00f1\u00f1\u00f3\u00f3\u00fa\u00fa\u00fc\u00fc\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  \u00da\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0001?\u0001\u0000\u0000"+
		"\u0000\u0003C\u0001\u0000\u0000\u0000\u0005E\u0001\u0000\u0000\u0000\u0007"+
		"G\u0001\u0000\u0000\u0000\tI\u0001\u0000\u0000\u0000\u000bK\u0001\u0000"+
		"\u0000\u0000\rQ\u0001\u0000\u0000\u0000\u000fV\u0001\u0000\u0000\u0000"+
		"\u0011X\u0001\u0000\u0000\u0000\u0013Z\u0001\u0000\u0000\u0000\u0015a"+
		"\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019i\u0001\u0000"+
		"\u0000\u0000\u001bl\u0001\u0000\u0000\u0000\u001dq\u0001\u0000\u0000\u0000"+
		"\u001fw\u0001\u0000\u0000\u0000!{\u0001\u0000\u0000\u0000#\u0081\u0001"+
		"\u0000\u0000\u0000%\u008b\u0001\u0000\u0000\u0000\'\u008e\u0001\u0000"+
		"\u0000\u0000)\u00aa\u0001\u0000\u0000\u0000+\u00ad\u0001\u0000\u0000\u0000"+
		"-\u00b2\u0001\u0000\u0000\u0000/\u00ba\u0001\u0000\u0000\u00001\u00bc"+
		"\u0001\u0000\u0000\u00003\u00be\u0001\u0000\u0000\u00005\u00c0\u0001\u0000"+
		"\u0000\u00007\u00c2\u0001\u0000\u0000\u00009\u00c4\u0001\u0000\u0000\u0000"+
		";\u00c6\u0001\u0000\u0000\u0000=\u00c9\u0001\u0000\u0000\u0000?@\u0005"+
		"d\u0000\u0000@A\u0005e\u0000\u0000AB\u0005f\u0000\u0000B\u0002\u0001\u0000"+
		"\u0000\u0000CD\u0005(\u0000\u0000D\u0004\u0001\u0000\u0000\u0000EF\u0005"+
		",\u0000\u0000F\u0006\u0001\u0000\u0000\u0000GH\u0005)\u0000\u0000H\b\u0001"+
		"\u0000\u0000\u0000IJ\u0005:\u0000\u0000J\n\u0001\u0000\u0000\u0000KL\u0005"+
		"m\u0000\u0000LM\u0005a\u0000\u0000MN\u0005t\u0000\u0000NO\u0005c\u0000"+
		"\u0000OP\u0005h\u0000\u0000P\f\u0001\u0000\u0000\u0000QR\u0005c\u0000"+
		"\u0000RS\u0005a\u0000\u0000ST\u0005s\u0000\u0000TU\u0005e\u0000\u0000"+
		"U\u000e\u0001\u0000\u0000\u0000VW\u0005\"\u0000\u0000W\u0010\u0001\u0000"+
		"\u0000\u0000XY\u0005\'\u0000\u0000Y\u0012\u0001\u0000\u0000\u0000Z[\u0005"+
		"r\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005t\u0000\u0000]^\u0005u\u0000"+
		"\u0000^_\u0005r\u0000\u0000_`\u0005n\u0000\u0000`\u0014\u0001\u0000\u0000"+
		"\u0000ab\u0005_\u0000\u0000b\u0016\u0001\u0000\u0000\u0000cd\u0005r\u0000"+
		"\u0000de\u0005a\u0000\u0000ef\u0005i\u0000\u0000fg\u0005s\u0000\u0000"+
		"gh\u0005e\u0000\u0000h\u0018\u0001\u0000\u0000\u0000ij\u0005i\u0000\u0000"+
		"jk\u0005f\u0000\u0000k\u001a\u0001\u0000\u0000\u0000lm\u0005e\u0000\u0000"+
		"mn\u0005l\u0000\u0000no\u0005s\u0000\u0000op\u0005e\u0000\u0000p\u001c"+
		"\u0001\u0000\u0000\u0000qr\u0005w\u0000\u0000rs\u0005h\u0000\u0000st\u0005"+
		"i\u0000\u0000tu\u0005l\u0000\u0000uv\u0005e\u0000\u0000v\u001e\u0001\u0000"+
		"\u0000\u0000wx\u0005i\u0000\u0000xy\u0005n\u0000\u0000yz\u0005t\u0000"+
		"\u0000z \u0001\u0000\u0000\u0000{|\u0005i\u0000\u0000|}\u0005n\u0000\u0000"+
		"}~\u0005p\u0000\u0000~\u007f\u0005u\u0000\u0000\u007f\u0080\u0005t\u0000"+
		"\u0000\u0080\"\u0001\u0000\u0000\u0000\u0081\u0082\u0005E\u0000\u0000"+
		"\u0082\u0083\u0005x\u0000\u0000\u0083\u0084\u0005c\u0000\u0000\u0084\u0085"+
		"\u0005e\u0000\u0000\u0085\u0086\u0005p\u0000\u0000\u0086\u0087\u0005t"+
		"\u0000\u0000\u0087\u0088\u0005i\u0000\u0000\u0088\u0089\u0005o\u0000\u0000"+
		"\u0089\u008a\u0005n\u0000\u0000\u008a$\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0007\u0000\u0000\u0000\u008c&\u0001\u0000\u0000\u0000\u008d\u008f\u0003"+
		"+\u0015\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091(\u0001\u0000\u0000\u0000\u0092\u009a\u0005\"\u0000"+
		"\u0000\u0093\u0096\u0003+\u0015\u0000\u0094\u0096\u0003-\u0016\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0099\u0001\u0000\u0000\u0000\u0097\u0099\u0005 \u0000\u0000\u0098\u0095"+
		"\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c"+
		"\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u00ab\u0005\"\u0000\u0000\u009e\u00a6\u0005"+
		"\'\u0000\u0000\u009f\u00a2\u0003+\u0015\u0000\u00a0\u00a2\u0003-\u0016"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005 \u0000\u0000"+
		"\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005\'\u0000\u0000\u00aa"+
		"\u0092\u0001\u0000\u0000\u0000\u00aa\u009e\u0001\u0000\u0000\u0000\u00ab"+
		"*\u0001\u0000\u0000\u0000\u00ac\u00ae\u0007\u0001\u0000\u0000\u00ad\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0,\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b3\u0007\u0002\u0000\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5.\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005=\u0000\u0000\u00b7\u00bb\u0005=\u0000\u0000"+
		"\u00b8\u00b9\u0005!\u0000\u0000\u00b9\u00bb\u0005=\u0000\u0000\u00ba\u00b6"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb0\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0005=\u0000\u0000\u00bd2\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005+\u0000\u0000\u00bf4\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005-\u0000\u0000\u00c16\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"*\u0000\u0000\u00c38\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005/\u0000"+
		"\u0000\u00c5:\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005%\u0000\u0000\u00c7"+
		"<\u0001\u0000\u0000\u0000\u00c8\u00ca\u0007\u0003\u0000\u0000\u00c9\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0006\u001e\u0000\u0000\u00ce>\u0001"+
		"\u0000\u0000\u0000\r\u0000\u0090\u0095\u0098\u009a\u00a1\u00a4\u00a6\u00aa"+
		"\u00af\u00b4\u00ba\u00cb\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}