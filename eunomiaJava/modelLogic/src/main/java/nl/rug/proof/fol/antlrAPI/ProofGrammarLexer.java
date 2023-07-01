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
		WS=28, ATOM=29;
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
			"FORALL", "EXISTS", "PREMISE", "ASSUME", "QED", "INT", "NEWLINE", "WS", 
			"ATOM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "'Reit: '", "'Intro: '", "','", "'Intro'", 
			"'Elim: '", "'-'", "'|'", null, null, null, "'\\u00AC'", "'\\u27C2'", 
			"'\\u2227'", "'\\u2228'", "'='", "'\\u2192'", "'\\u2194'", "'\\u2200'", 
			"'\\u2203'", "'premise'", "'assume'", "'qed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "VARIABLE", 
			"CONSTANT", "PROPOSITION", "NEGATION", "CONTRADICTION", "CONJUNCTION", 
			"DISJUNCTION", "IDENTITY", "IMPLICATION", "BICONDITIONAL", "FORALL", 
			"EXISTS", "PREMISE", "ASSUME", "QED", "INT", "NEWLINE", "WS", "ATOM"
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
		"\u0004\u0000\u001d\u00aa\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005"+
		"\fj\b\f\n\f\f\fm\t\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u0096\b\u0019"+
		"\n\u0019\f\u0019\u0099\t\u0019\u0001\u001a\u0003\u001a\u009c\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0004\u001b\u00a1\b\u001b\u000b\u001b\f"+
		"\u001b\u00a2\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u00a9\b\u001c\u0000\u0000\u001d\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		"\u0001\u0000\u0007\u0001\u0000uz\u0001\u0000at\u0001\u0000AZ\u0003\u0000"+
		"09AZaz\u0001\u000019\u0001\u000009\u0002\u0000\t\t  \u00ae\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0001;\u0001\u0000\u0000\u0000\u0003=\u0001\u0000\u0000"+
		"\u0000\u0005?\u0001\u0000\u0000\u0000\u0007A\u0001\u0000\u0000\u0000\t"+
		"H\u0001\u0000\u0000\u0000\u000bP\u0001\u0000\u0000\u0000\rR\u0001\u0000"+
		"\u0000\u0000\u000fX\u0001\u0000\u0000\u0000\u0011_\u0001\u0000\u0000\u0000"+
		"\u0013a\u0001\u0000\u0000\u0000\u0015c\u0001\u0000\u0000\u0000\u0017e"+
		"\u0001\u0000\u0000\u0000\u0019g\u0001\u0000\u0000\u0000\u001bn\u0001\u0000"+
		"\u0000\u0000\u001dp\u0001\u0000\u0000\u0000\u001fr\u0001\u0000\u0000\u0000"+
		"!t\u0001\u0000\u0000\u0000#v\u0001\u0000\u0000\u0000%x\u0001\u0000\u0000"+
		"\u0000\'z\u0001\u0000\u0000\u0000)|\u0001\u0000\u0000\u0000+~\u0001\u0000"+
		"\u0000\u0000-\u0080\u0001\u0000\u0000\u0000/\u0088\u0001\u0000\u0000\u0000"+
		"1\u008f\u0001\u0000\u0000\u00003\u0093\u0001\u0000\u0000\u00005\u009b"+
		"\u0001\u0000\u0000\u00007\u00a0\u0001\u0000\u0000\u00009\u00a8\u0001\u0000"+
		"\u0000\u0000;<\u0005.\u0000\u0000<\u0002\u0001\u0000\u0000\u0000=>\u0005"+
		"(\u0000\u0000>\u0004\u0001\u0000\u0000\u0000?@\u0005)\u0000\u0000@\u0006"+
		"\u0001\u0000\u0000\u0000AB\u0005R\u0000\u0000BC\u0005e\u0000\u0000CD\u0005"+
		"i\u0000\u0000DE\u0005t\u0000\u0000EF\u0005:\u0000\u0000FG\u0005 \u0000"+
		"\u0000G\b\u0001\u0000\u0000\u0000HI\u0005I\u0000\u0000IJ\u0005n\u0000"+
		"\u0000JK\u0005t\u0000\u0000KL\u0005r\u0000\u0000LM\u0005o\u0000\u0000"+
		"MN\u0005:\u0000\u0000NO\u0005 \u0000\u0000O\n\u0001\u0000\u0000\u0000"+
		"PQ\u0005,\u0000\u0000Q\f\u0001\u0000\u0000\u0000RS\u0005I\u0000\u0000"+
		"ST\u0005n\u0000\u0000TU\u0005t\u0000\u0000UV\u0005r\u0000\u0000VW\u0005"+
		"o\u0000\u0000W\u000e\u0001\u0000\u0000\u0000XY\u0005E\u0000\u0000YZ\u0005"+
		"l\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005m\u0000\u0000\\]\u0005:\u0000"+
		"\u0000]^\u0005 \u0000\u0000^\u0010\u0001\u0000\u0000\u0000_`\u0005-\u0000"+
		"\u0000`\u0012\u0001\u0000\u0000\u0000ab\u0005|\u0000\u0000b\u0014\u0001"+
		"\u0000\u0000\u0000cd\u0007\u0000\u0000\u0000d\u0016\u0001\u0000\u0000"+
		"\u0000ef\u0007\u0001\u0000\u0000f\u0018\u0001\u0000\u0000\u0000gk\u0007"+
		"\u0002\u0000\u0000hj\u0007\u0003\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000l\u001a\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005"+
		"\u00ac\u0000\u0000o\u001c\u0001\u0000\u0000\u0000pq\u0005\u27c2\u0000"+
		"\u0000q\u001e\u0001\u0000\u0000\u0000rs\u0005\u2227\u0000\u0000s \u0001"+
		"\u0000\u0000\u0000tu\u0005\u2228\u0000\u0000u\"\u0001\u0000\u0000\u0000"+
		"vw\u0005=\u0000\u0000w$\u0001\u0000\u0000\u0000xy\u0005\u2192\u0000\u0000"+
		"y&\u0001\u0000\u0000\u0000z{\u0005\u2194\u0000\u0000{(\u0001\u0000\u0000"+
		"\u0000|}\u0005\u2200\u0000\u0000}*\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"\u2203\u0000\u0000\u007f,\u0001\u0000\u0000\u0000\u0080\u0081\u0005p\u0000"+
		"\u0000\u0081\u0082\u0005r\u0000\u0000\u0082\u0083\u0005e\u0000\u0000\u0083"+
		"\u0084\u0005m\u0000\u0000\u0084\u0085\u0005i\u0000\u0000\u0085\u0086\u0005"+
		"s\u0000\u0000\u0086\u0087\u0005e\u0000\u0000\u0087.\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005a\u0000\u0000\u0089\u008a\u0005s\u0000\u0000\u008a"+
		"\u008b\u0005s\u0000\u0000\u008b\u008c\u0005u\u0000\u0000\u008c\u008d\u0005"+
		"m\u0000\u0000\u008d\u008e\u0005e\u0000\u0000\u008e0\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005q\u0000\u0000\u0090\u0091\u0005e\u0000\u0000\u0091"+
		"\u0092\u0005d\u0000\u0000\u00922\u0001\u0000\u0000\u0000\u0093\u0097\u0007"+
		"\u0004\u0000\u0000\u0094\u0096\u0007\u0005\u0000\u0000\u0095\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u00984\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009c\u0005\r\u0000"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005\n\u0000\u0000"+
		"\u009e6\u0001\u0000\u0000\u0000\u009f\u00a1\u0007\u0006\u0000\u0000\u00a0"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0006\u001b\u0000\u0000\u00a5"+
		"8\u0001\u0000\u0000\u0000\u00a6\u00a9\u0003\u0015\n\u0000\u00a7\u00a9"+
		"\u0003\u0017\u000b\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9:\u0001\u0000\u0000\u0000\u0006\u0000k\u0097"+
		"\u009b\u00a2\u00a8\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}