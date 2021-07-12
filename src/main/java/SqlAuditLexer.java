// Generated from SqlAudit.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlAuditLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, CONDITIONIS=4, EXISTLIMIT=5, AND=6, OR=7, BETWEEN=8, 
		IN=9, EQ=10, NSEQ=11, NEQ=12, NEQJ=13, LT=14, LTE=15, GT=16, GTE=17, ID=18, 
		LINE_COMMENT=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "CONDITIONIS", "EXISTLIMIT", "AND", "OR", "BETWEEN", 
			"IN", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "ID", "LETTER", 
			"LINE_COMMENT", "WS"
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


	public SqlAuditLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SqlAudit.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\5\13`\n\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20r\n\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\5\22z\n\22\3\23\3\23\3\23\7\23\177\n\23\f\23"+
		"\16\23\u0082\13\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u008a\n\25\f\25"+
		"\16\25\u008d\13\25\3\25\3\25\3\25\3\25\3\26\6\26\u0094\n\26\r\26\16\26"+
		"\u0095\3\26\3\26\3\u008b\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\25+\26\3\2\5\3\2\62"+
		";\4\2C\\c|\5\2\13\f\17\17\"\"\2\u009e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13?\3\2\2\2\rJ\3"+
		"\2\2\2\17N\3\2\2\2\21Q\3\2\2\2\23Y\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31"+
		"e\3\2\2\2\33h\3\2\2\2\35k\3\2\2\2\37q\3\2\2\2!s\3\2\2\2#y\3\2\2\2%{\3"+
		"\2\2\2\'\u0083\3\2\2\2)\u0085\3\2\2\2+\u0093\3\2\2\2-.\7*\2\2.\4\3\2\2"+
		"\2/\60\7+\2\2\60\6\3\2\2\2\61\62\7.\2\2\62\b\3\2\2\2\63\64\7E\2\2\64\65"+
		"\7Q\2\2\65\66\7P\2\2\66\67\7F\2\2\678\7K\2\289\7V\2\29:\7K\2\2:;\7Q\2"+
		"\2;<\7P\2\2<=\7K\2\2=>\7U\2\2>\n\3\2\2\2?@\7G\2\2@A\7Z\2\2AB\7K\2\2BC"+
		"\7U\2\2CD\7V\2\2DE\7N\2\2EF\7K\2\2FG\7O\2\2GH\7K\2\2HI\7V\2\2I\f\3\2\2"+
		"\2JK\7C\2\2KL\7P\2\2LM\7F\2\2M\16\3\2\2\2NO\7Q\2\2OP\7T\2\2P\20\3\2\2"+
		"\2QR\7D\2\2RS\7G\2\2ST\7V\2\2TU\7Y\2\2UV\7G\2\2VW\7G\2\2WX\7P\2\2X\22"+
		"\3\2\2\2YZ\7K\2\2Z[\7P\2\2[\24\3\2\2\2\\`\7?\2\2]^\7?\2\2^`\7?\2\2_\\"+
		"\3\2\2\2_]\3\2\2\2`\26\3\2\2\2ab\7>\2\2bc\7?\2\2cd\7@\2\2d\30\3\2\2\2"+
		"ef\7>\2\2fg\7@\2\2g\32\3\2\2\2hi\7#\2\2ij\7?\2\2j\34\3\2\2\2kl\7>\2\2"+
		"l\36\3\2\2\2mn\7>\2\2nr\7?\2\2op\7#\2\2pr\7@\2\2qm\3\2\2\2qo\3\2\2\2r"+
		" \3\2\2\2st\7@\2\2t\"\3\2\2\2uv\7@\2\2vz\7?\2\2wx\7#\2\2xz\7>\2\2yu\3"+
		"\2\2\2yw\3\2\2\2z$\3\2\2\2{\u0080\5\'\24\2|\177\5\'\24\2}\177\t\2\2\2"+
		"~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081&\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\t\3\2\2\u0084(\3\2"+
		"\2\2\u0085\u0086\7\61\2\2\u0086\u0087\7\61\2\2\u0087\u008b\3\2\2\2\u0088"+
		"\u008a\13\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7\f\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\25\2\2\u0091*\3\2\2\2"+
		"\u0092\u0094\t\4\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\26\2\2"+
		"\u0098,\3\2\2\2\n\2_qy~\u0080\u008b\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}