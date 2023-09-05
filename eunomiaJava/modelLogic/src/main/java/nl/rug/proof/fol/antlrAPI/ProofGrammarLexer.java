// Generated from D:/CompSci/JavaCode/Eunomia/eunomiaJava/modelLogic/src/main/java/nl/rug/proof/fol/grammar\ProofGrammar.g4 by ANTLR 4.12.0
package nl.rug.proof.fol.antlrAPI;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProofGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, VARIABLE=11, CONSTANT=12, PROPOSITION=13, NEGATION=14, CONTRADICTION=15, 
		CONJUNCTION=16, DISJUNCTION=17, IDENTITY=18, IMPLICATION=19, BICONDITIONAL=20, 
		FORALL=21, EXISTS=22, PREMISE=23, ASSUME=24, QED=25, INT=26, NEWLINE=27, 
		WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "VARIABLE", "CONSTANT", "PROPOSITION", "NEGATION", "CONTRADICTION", 
			"CONJUNCTION", "DISJUNCTION", "IDENTITY", "IMPLICATION", "BICONDITIONAL", 
			"FORALL", "EXISTS", "PREMISE", "ASSUME", "QED", "INT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "'Reit: '", "'Intro: '", "','", "'Intro'", 
			"'Elim: '", "'-'", "'|'", null, null, null, "'\\u00C2\\u00AC'", "'\\u00E2\\u0178\\u201A'", 
			"'\\u00E2\\u02C6\\u00A7'", "'\\u00E2\\u02C6\\u00A8'", "'='", "'\\u00E2\\u2020\\u2019'", 
			"'\\u00E2\\u2020\\u201D'", "'\\u00E2\\u02C6\\u20AC'", "'\\u00E2\\u02C6\\u0192'", 
			"'premise'", "'assume'", "'qed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "VARIABLE", 
			"CONSTANT", "PROPOSITION", "NEGATION", "CONTRADICTION", "CONJUNCTION", 
			"DISJUNCTION", "IDENTITY", "IMPLICATION", "BICONDITIONAL", "FORALL", 
			"EXISTS", "PREMISE", "ASSUME", "QED", "INT", "NEWLINE", "WS"
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


	public ProofGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ProofGrammar.g4"; }

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
		"\u0004\u0000\u001c\u00b3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fh\b\f\n\f\f\fk\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u00a3"+
		"\b\u0019\n\u0019\f\u0019\u00a6\t\u0019\u0001\u001a\u0003\u001a\u00a9\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b\u00ae\b\u001b\u000b"+
		"\u001b\f\u001b\u00af\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u00193\u001a5\u001b7\u001c\u0001\u0000\u0007\u0001\u0000uz\u0001\u0000"+
		"at\u0001\u0000AZ\u0003\u000009AZaz\u0001\u000019\u0001\u000009\u0002\u0000"+
		"\t\t  \u00b6\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00019\u0001\u0000\u0000\u0000\u0003;\u0001\u0000\u0000"+
		"\u0000\u0005=\u0001\u0000\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\t"+
		"F\u0001\u0000\u0000\u0000\u000bN\u0001\u0000\u0000\u0000\rP\u0001\u0000"+
		"\u0000\u0000\u000fV\u0001\u0000\u0000\u0000\u0011]\u0001\u0000\u0000\u0000"+
		"\u0013_\u0001\u0000\u0000\u0000\u0015a\u0001\u0000\u0000\u0000\u0017c"+
		"\u0001\u0000\u0000\u0000\u0019e\u0001\u0000\u0000\u0000\u001bl\u0001\u0000"+
		"\u0000\u0000\u001do\u0001\u0000\u0000\u0000\u001fs\u0001\u0000\u0000\u0000"+
		"!w\u0001\u0000\u0000\u0000#{\u0001\u0000\u0000\u0000%}\u0001\u0000\u0000"+
		"\u0000\'\u0081\u0001\u0000\u0000\u0000)\u0085\u0001\u0000\u0000\u0000"+
		"+\u0089\u0001\u0000\u0000\u0000-\u008d\u0001\u0000\u0000\u0000/\u0095"+
		"\u0001\u0000\u0000\u00001\u009c\u0001\u0000\u0000\u00003\u00a0\u0001\u0000"+
		"\u0000\u00005\u00a8\u0001\u0000\u0000\u00007\u00ad\u0001\u0000\u0000\u0000"+
		"9:\u0005.\u0000\u0000:\u0002\u0001\u0000\u0000\u0000;<\u0005(\u0000\u0000"+
		"<\u0004\u0001\u0000\u0000\u0000=>\u0005)\u0000\u0000>\u0006\u0001\u0000"+
		"\u0000\u0000?@\u0005R\u0000\u0000@A\u0005e\u0000\u0000AB\u0005i\u0000"+
		"\u0000BC\u0005t\u0000\u0000CD\u0005:\u0000\u0000DE\u0005 \u0000\u0000"+
		"E\b\u0001\u0000\u0000\u0000FG\u0005I\u0000\u0000GH\u0005n\u0000\u0000"+
		"HI\u0005t\u0000\u0000IJ\u0005r\u0000\u0000JK\u0005o\u0000\u0000KL\u0005"+
		":\u0000\u0000LM\u0005 \u0000\u0000M\n\u0001\u0000\u0000\u0000NO\u0005"+
		",\u0000\u0000O\f\u0001\u0000\u0000\u0000PQ\u0005I\u0000\u0000QR\u0005"+
		"n\u0000\u0000RS\u0005t\u0000\u0000ST\u0005r\u0000\u0000TU\u0005o\u0000"+
		"\u0000U\u000e\u0001\u0000\u0000\u0000VW\u0005E\u0000\u0000WX\u0005l\u0000"+
		"\u0000XY\u0005i\u0000\u0000YZ\u0005m\u0000\u0000Z[\u0005:\u0000\u0000"+
		"[\\\u0005 \u0000\u0000\\\u0010\u0001\u0000\u0000\u0000]^\u0005-\u0000"+
		"\u0000^\u0012\u0001\u0000\u0000\u0000_`\u0005|\u0000\u0000`\u0014\u0001"+
		"\u0000\u0000\u0000ab\u0007\u0000\u0000\u0000b\u0016\u0001\u0000\u0000"+
		"\u0000cd\u0007\u0001\u0000\u0000d\u0018\u0001\u0000\u0000\u0000ei\u0007"+
		"\u0002\u0000\u0000fh\u0007\u0003\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000j\u001a\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005"+
		"\u00c2\u0000\u0000mn\u0005\u00ac\u0000\u0000n\u001c\u0001\u0000\u0000"+
		"\u0000op\u0005\u00e2\u0000\u0000pq\u0005\u0178\u0000\u0000qr\u0005\u201a"+
		"\u0000\u0000r\u001e\u0001\u0000\u0000\u0000st\u0005\u00e2\u0000\u0000"+
		"tu\u0005\u02c6\u0000\u0000uv\u0005\u00a7\u0000\u0000v \u0001\u0000\u0000"+
		"\u0000wx\u0005\u00e2\u0000\u0000xy\u0005\u02c6\u0000\u0000yz\u0005\u00a8"+
		"\u0000\u0000z\"\u0001\u0000\u0000\u0000{|\u0005=\u0000\u0000|$\u0001\u0000"+
		"\u0000\u0000}~\u0005\u00e2\u0000\u0000~\u007f\u0005\u2020\u0000\u0000"+
		"\u007f\u0080\u0005\u2019\u0000\u0000\u0080&\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0005\u00e2\u0000\u0000\u0082\u0083\u0005\u2020\u0000\u0000\u0083"+
		"\u0084\u0005\u201d\u0000\u0000\u0084(\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u00e2\u0000\u0000\u0086\u0087\u0005\u02c6\u0000\u0000\u0087\u0088"+
		"\u0005\u20ac\u0000\u0000\u0088*\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"\u00e2\u0000\u0000\u008a\u008b\u0005\u02c6\u0000\u0000\u008b\u008c\u0005"+
		"\u0192\u0000\u0000\u008c,\u0001\u0000\u0000\u0000\u008d\u008e\u0005p\u0000"+
		"\u0000\u008e\u008f\u0005r\u0000\u0000\u008f\u0090\u0005e\u0000\u0000\u0090"+
		"\u0091\u0005m\u0000\u0000\u0091\u0092\u0005i\u0000\u0000\u0092\u0093\u0005"+
		"s\u0000\u0000\u0093\u0094\u0005e\u0000\u0000\u0094.\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005a\u0000\u0000\u0096\u0097\u0005s\u0000\u0000\u0097"+
		"\u0098\u0005s\u0000\u0000\u0098\u0099\u0005u\u0000\u0000\u0099\u009a\u0005"+
		"m\u0000\u0000\u009a\u009b\u0005e\u0000\u0000\u009b0\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005q\u0000\u0000\u009d\u009e\u0005e\u0000\u0000\u009e"+
		"\u009f\u0005d\u0000\u0000\u009f2\u0001\u0000\u0000\u0000\u00a0\u00a4\u0007"+
		"\u0004\u0000\u0000\u00a1\u00a3\u0007\u0005\u0000\u0000\u00a2\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a54\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a9\u0005\r\u0000"+
		"\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\n\u0000\u0000"+
		"\u00ab6\u0001\u0000\u0000\u0000\u00ac\u00ae\u0007\u0006\u0000\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0006\u001b\u0000\u0000\u00b2"+
		"8\u0001\u0000\u0000\u0000\u0005\u0000i\u00a4\u00a8\u00af\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}