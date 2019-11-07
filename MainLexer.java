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
		INT=1, FLOAT=2, BOOL=3, IF=4, WHILE=5, ELSE=6, BREAK=7, FOR=8, DO=9, AND=10, 
		REAL=11, NUM=12, TRUE=13, FALSE=14, LT=15, LTE=16, GTE=17, GT=18, PLUS=19, 
		MINUS=20, MUL=21, DIV=22, SEMI=23, EQUAL=24, NOT=25, OR=26, OB=27, CB=28, 
		WS=29, OFB=30, CFB=31, ID=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "FLOAT", "BOOL", "IF", "WHILE", "ELSE", "BREAK", "FOR", "DO", "AND", 
		"REAL", "NUM", "TRUE", "FALSE", "LT", "LTE", "GTE", "GT", "PLUS", "MINUS", 
		"MUL", "DIV", "SEMI", "EQUAL", "NOT", "OR", "OB", "CB", "WS", "OFB", "CFB", 
		"ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'bool'", "'if'", "'while'", "'else'", "'break'", 
		"'for'", "'do'", "'&&'", null, null, null, null, "'<'", "'<='", "'>='", 
		"'>'", "'+'", "'-'", "'*'", "'/'", "';'", "'='", "'!'", "'||'", "'('", 
		"')'", null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "FLOAT", "BOOL", "IF", "WHILE", "ELSE", "BREAK", "FOR", "DO", 
		"AND", "REAL", "NUM", "TRUE", "FALSE", "LT", "LTE", "GTE", "GT", "PLUS", 
		"MINUS", "MUL", "DIV", "SEMI", "EQUAL", "NOT", "OR", "OB", "CB", "WS", 
		"OFB", "CFB", "ID"
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
		"\t!\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\6\fr\n\f\r\f\16\f"+
		"s\3\f\3\f\7\fx\n\f\f\f\16\f{\13\f\3\f\3\f\3\r\3\r\7\r\u0081\n\r\f\r\16"+
		"\r\u0084\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u008b\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u0093\n\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\6\36\u00b5\n\36\r\36"+
		"\16\36\u00b6\3\36\3\36\3\37\3\37\3 \3 \3!\6!\u00c0\n!\r!\16!\u00c1\2\2"+
		"\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"\3\2\6\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"\4\2C\\c|\2\u00c9\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5G\3\2\2\2\7M\3\2\2\2\t"+
		"R\3\2\2\2\13U\3\2\2\2\r[\3\2\2\2\17`\3\2\2\2\21f\3\2\2\2\23j\3\2\2\2\25"+
		"m\3\2\2\2\27q\3\2\2\2\31~\3\2\2\2\33\u008a\3\2\2\2\35\u0092\3\2\2\2\37"+
		"\u0094\3\2\2\2!\u0096\3\2\2\2#\u0099\3\2\2\2%\u009c\3\2\2\2\'\u009e\3"+
		"\2\2\2)\u00a0\3\2\2\2+\u00a2\3\2\2\2-\u00a4\3\2\2\2/\u00a6\3\2\2\2\61"+
		"\u00a8\3\2\2\2\63\u00aa\3\2\2\2\65\u00ac\3\2\2\2\67\u00af\3\2\2\29\u00b1"+
		"\3\2\2\2;\u00b4\3\2\2\2=\u00ba\3\2\2\2?\u00bc\3\2\2\2A\u00bf\3\2\2\2C"+
		"D\7k\2\2DE\7p\2\2EF\7v\2\2F\4\3\2\2\2GH\7h\2\2HI\7n\2\2IJ\7q\2\2JK\7c"+
		"\2\2KL\7v\2\2L\6\3\2\2\2MN\7d\2\2NO\7q\2\2OP\7q\2\2PQ\7n\2\2Q\b\3\2\2"+
		"\2RS\7k\2\2ST\7h\2\2T\n\3\2\2\2UV\7y\2\2VW\7j\2\2WX\7k\2\2XY\7n\2\2YZ"+
		"\7g\2\2Z\f\3\2\2\2[\\\7g\2\2\\]\7n\2\2]^\7u\2\2^_\7g\2\2_\16\3\2\2\2`"+
		"a\7d\2\2ab\7t\2\2bc\7g\2\2cd\7c\2\2de\7m\2\2e\20\3\2\2\2fg\7h\2\2gh\7"+
		"q\2\2hi\7t\2\2i\22\3\2\2\2jk\7f\2\2kl\7q\2\2l\24\3\2\2\2mn\7(\2\2no\7"+
		"(\2\2o\26\3\2\2\2pr\t\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu"+
		"\3\2\2\2uy\13\2\2\2vx\t\2\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2"+
		"z|\3\2\2\2{y\3\2\2\2|}\t\3\2\2}\30\3\2\2\2~\u0082\t\3\2\2\177\u0081\t"+
		"\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\32\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7v\2\2"+
		"\u0086\u0087\7t\2\2\u0087\u0088\7w\2\2\u0088\u008b\7g\2\2\u0089\u008b"+
		"\7\63\2\2\u008a\u0085\3\2\2\2\u008a\u0089\3\2\2\2\u008b\34\3\2\2\2\u008c"+
		"\u008d\7h\2\2\u008d\u008e\7c\2\2\u008e\u008f\7n\2\2\u008f\u0090\7u\2\2"+
		"\u0090\u0093\7g\2\2\u0091\u0093\7\62\2\2\u0092\u008c\3\2\2\2\u0092\u0091"+
		"\3\2\2\2\u0093\36\3\2\2\2\u0094\u0095\7>\2\2\u0095 \3\2\2\2\u0096\u0097"+
		"\7>\2\2\u0097\u0098\7?\2\2\u0098\"\3\2\2\2\u0099\u009a\7@\2\2\u009a\u009b"+
		"\7?\2\2\u009b$\3\2\2\2\u009c\u009d\7@\2\2\u009d&\3\2\2\2\u009e\u009f\7"+
		"-\2\2\u009f(\3\2\2\2\u00a0\u00a1\7/\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7,"+
		"\2\2\u00a3,\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5.\3\2\2\2\u00a6\u00a7\7"+
		"=\2\2\u00a7\60\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9\62\3\2\2\2\u00aa\u00ab"+
		"\7#\2\2\u00ab\64\3\2\2\2\u00ac\u00ad\7~\2\2\u00ad\u00ae\7~\2\2\u00ae\66"+
		"\3\2\2\2\u00af\u00b0\7*\2\2\u00b08\3\2\2\2\u00b1\u00b2\7+\2\2\u00b2:\3"+
		"\2\2\2\u00b3\u00b5\t\4\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\36"+
		"\2\2\u00b9<\3\2\2\2\u00ba\u00bb\7}\2\2\u00bb>\3\2\2\2\u00bc\u00bd\7\177"+
		"\2\2\u00bd@\3\2\2\2\u00be\u00c0\t\5\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2B\3\2\2\2\n\2sy"+
		"\u0082\u008a\u0092\u00b6\u00c1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}