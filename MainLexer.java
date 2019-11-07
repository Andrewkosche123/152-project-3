// Generated from Main.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MainLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOL=3, ID=4, IF=5, WHILE=6, ELSE=7, BREAK=8, FOR=9, DO=10, 
		AND=11, REAL=12, NUM=13, TRUE=14, FALSE=15, LT=16, LTE=17, GTE=18, GT=19, 
		PLUS=20, MINUS=21, MUL=22, DIV=23, SEMI=24, EQUAL=25, NOT=26, OR=27, OB=28, 
		CB=29, WS=30, OFB=31, CFB=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "FLOAT", "BOOL", "ID", "IF", "WHILE", "ELSE", "BREAK", "FOR", "DO", 
		"AND", "REAL", "NUM", "TRUE", "FALSE", "LT", "LTE", "GTE", "GT", "PLUS", 
		"MINUS", "MUL", "DIV", "SEMI", "EQUAL", "NOT", "OR", "OB", "CB", "WS", 
		"OFB", "CFB"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'bool'", null, "'if'", "'while'", "'else'", 
		"'break'", "'for'", "'do'", "'&&'", null, null, null, null, "'<'", "'<='", 
		"'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "';'", "'='", "'!'", "'||'", 
		"'('", "')'", null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "FLOAT", "BOOL", "ID", "IF", "WHILE", "ELSE", "BREAK", "FOR", 
		"DO", "AND", "REAL", "NUM", "TRUE", "FALSE", "LT", "LTE", "GTE", "GT", 
		"PLUS", "MINUS", "MUL", "DIV", "SEMI", "EQUAL", "NOT", "OR", "OB", "CB", 
		"WS", "OFB", "CFB"
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


	public MainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Main.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00c3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\6"+
		"\5T\n\5\r\5\16\5U\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\6\rw\n\r\r\r\16\rx\3\r\3\r\7\r}\n\r\f\r\16\r\u0080\13\r\3\r\3\r"+
		"\3\16\3\16\7\16\u0086\n\16\f\16\16\16\u0089\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0090\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0098\n\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\6\37\u00ba\n\37\r\37\16\37\u00bb\3\37\3\37\3 \3 \3"+
		"!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"\3\2\6\4\2C\\c|\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"\2"+
		"\u00c9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5G\3\2\2\2\7"+
		"M\3\2\2\2\tS\3\2\2\2\13W\3\2\2\2\rZ\3\2\2\2\17`\3\2\2\2\21e\3\2\2\2\23"+
		"k\3\2\2\2\25o\3\2\2\2\27r\3\2\2\2\31v\3\2\2\2\33\u0083\3\2\2\2\35\u008f"+
		"\3\2\2\2\37\u0097\3\2\2\2!\u0099\3\2\2\2#\u009b\3\2\2\2%\u009e\3\2\2\2"+
		"\'\u00a1\3\2\2\2)\u00a3\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3"+
		"\2\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00af\3\2\2\2\67\u00b1\3\2"+
		"\2\29\u00b4\3\2\2\2;\u00b6\3\2\2\2=\u00b9\3\2\2\2?\u00bf\3\2\2\2A\u00c1"+
		"\3\2\2\2CD\7k\2\2DE\7p\2\2EF\7v\2\2F\4\3\2\2\2GH\7h\2\2HI\7n\2\2IJ\7q"+
		"\2\2JK\7c\2\2KL\7v\2\2L\6\3\2\2\2MN\7d\2\2NO\7q\2\2OP\7q\2\2PQ\7n\2\2"+
		"Q\b\3\2\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\n\3\2\2"+
		"\2WX\7k\2\2XY\7h\2\2Y\f\3\2\2\2Z[\7y\2\2[\\\7j\2\2\\]\7k\2\2]^\7n\2\2"+
		"^_\7g\2\2_\16\3\2\2\2`a\7g\2\2ab\7n\2\2bc\7u\2\2cd\7g\2\2d\20\3\2\2\2"+
		"ef\7d\2\2fg\7t\2\2gh\7g\2\2hi\7c\2\2ij\7m\2\2j\22\3\2\2\2kl\7h\2\2lm\7"+
		"q\2\2mn\7t\2\2n\24\3\2\2\2op\7f\2\2pq\7q\2\2q\26\3\2\2\2rs\7(\2\2st\7"+
		"(\2\2t\30\3\2\2\2uw\t\3\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz"+
		"\3\2\2\2z~\13\2\2\2{}\t\3\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\t\4\2\2\u0082\32"+
		"\3\2\2\2\u0083\u0087\t\4\2\2\u0084\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\34\3\2\2"+
		"\2\u0089\u0087\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d"+
		"\7w\2\2\u008d\u0090\7g\2\2\u008e\u0090\7\63\2\2\u008f\u008a\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\36\3\2\2\2\u0091\u0092\7h\2\2\u0092\u0093\7c\2\2"+
		"\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0098\7g\2\2\u0096\u0098"+
		"\7\62\2\2\u0097\u0091\3\2\2\2\u0097\u0096\3\2\2\2\u0098 \3\2\2\2\u0099"+
		"\u009a\7>\2\2\u009a\"\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7?\2\2\u009d"+
		"$\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0&\3\2\2\2\u00a1\u00a2"+
		"\7@\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7-\2\2\u00a4*\3\2\2\2\u00a5\u00a6\7"+
		"/\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8.\3\2\2\2\u00a9\u00aa\7\61"+
		"\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7=\2\2\u00ac\62\3\2\2\2\u00ad\u00ae"+
		"\7?\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7#\2\2\u00b0\66\3\2\2\2\u00b1\u00b2"+
		"\7~\2\2\u00b2\u00b3\7~\2\2\u00b38\3\2\2\2\u00b4\u00b5\7*\2\2\u00b5:\3"+
		"\2\2\2\u00b6\u00b7\7+\2\2\u00b7<\3\2\2\2\u00b8\u00ba\t\5\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\b\37\2\2\u00be>\3\2\2\2\u00bf\u00c0\7}\2\2"+
		"\u00c0@\3\2\2\2\u00c1\u00c2\7\177\2\2\u00c2B\3\2\2\2\13\2SUx~\u0087\u008f"+
		"\u0097\u00bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}