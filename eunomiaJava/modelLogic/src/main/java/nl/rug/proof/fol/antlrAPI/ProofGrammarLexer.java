// Generated from java-escape by ANTLR 4.11.1
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
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NEGATION=8, CONTRADICTION=9, 
		CONJUNCTION=10, DISJUNCTION=11, ASSUME=12, QED=13, VARIABLE=14, CONSTANT=15, 
		INT=16, NEWLINE=17, WS=18, ATOM=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NEGATION", "CONTRADICTION", 
			"CONJUNCTION", "DISJUNCTION", "ASSUME", "QED", "VARIABLE", "CONSTANT", 
			"INT", "NEWLINE", "WS", "ATOM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "' premise'", "'Reit: '", "'Intro: '", "','", "'Elim: '", 
			"'-'", "'!'", "'\\perp'", "'&&'", "'||'", "'assume'", "'qed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NEGATION", "CONTRADICTION", 
			"CONJUNCTION", "DISJUNCTION", "ASSUME", "QED", "VARIABLE", "CONSTANT", 
			"INT", "NEWLINE", "WS", "ATOM"
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
		"\u0004\u0000\u0013\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0005\rh\b\r\n\r\f\rk\t\r\u0001\u000e\u0001\u000e\u0005\u000eo\b\u000e"+
		"\n\u000e\f\u000er\t\u000e\u0001\u000f\u0001\u000f\u0005\u000fv\b\u000f"+
		"\n\u000f\f\u000fy\t\u000f\u0001\u0010\u0003\u0010|\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0004\u0011\u0081\b\u0011\u000b\u0011\f\u0011"+
		"\u0082\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u0089"+
		"\b\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001"+
		"\u0000\u0006\u0001\u0000az\u0004\u000009AZ__az\u0001\u0000AZ\u0001\u0000"+
		"19\u0001\u000009\u0002\u0000\t\t  \u008f\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000"+
		"\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000"+
		"\u00079\u0001\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000bC\u0001"+
		"\u0000\u0000\u0000\rJ\u0001\u0000\u0000\u0000\u000fL\u0001\u0000\u0000"+
		"\u0000\u0011N\u0001\u0000\u0000\u0000\u0013T\u0001\u0000\u0000\u0000\u0015"+
		"W\u0001\u0000\u0000\u0000\u0017Z\u0001\u0000\u0000\u0000\u0019a\u0001"+
		"\u0000\u0000\u0000\u001be\u0001\u0000\u0000\u0000\u001dl\u0001\u0000\u0000"+
		"\u0000\u001fs\u0001\u0000\u0000\u0000!{\u0001\u0000\u0000\u0000#\u0080"+
		"\u0001\u0000\u0000\u0000%\u0088\u0001\u0000\u0000\u0000\'(\u0005.\u0000"+
		"\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005 \u0000\u0000*+\u0005p\u0000"+
		"\u0000+,\u0005r\u0000\u0000,-\u0005e\u0000\u0000-.\u0005m\u0000\u0000"+
		"./\u0005i\u0000\u0000/0\u0005s\u0000\u000001\u0005e\u0000\u00001\u0004"+
		"\u0001\u0000\u0000\u000023\u0005R\u0000\u000034\u0005e\u0000\u000045\u0005"+
		"i\u0000\u000056\u0005t\u0000\u000067\u0005:\u0000\u000078\u0005 \u0000"+
		"\u00008\u0006\u0001\u0000\u0000\u00009:\u0005I\u0000\u0000:;\u0005n\u0000"+
		"\u0000;<\u0005t\u0000\u0000<=\u0005r\u0000\u0000=>\u0005o\u0000\u0000"+
		">?\u0005:\u0000\u0000?@\u0005 \u0000\u0000@\b\u0001\u0000\u0000\u0000"+
		"AB\u0005,\u0000\u0000B\n\u0001\u0000\u0000\u0000CD\u0005E\u0000\u0000"+
		"DE\u0005l\u0000\u0000EF\u0005i\u0000\u0000FG\u0005m\u0000\u0000GH\u0005"+
		":\u0000\u0000HI\u0005 \u0000\u0000I\f\u0001\u0000\u0000\u0000JK\u0005"+
		"-\u0000\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0005!\u0000\u0000M\u0010"+
		"\u0001\u0000\u0000\u0000NO\u0005\\\u0000\u0000OP\u0005p\u0000\u0000PQ"+
		"\u0005e\u0000\u0000QR\u0005r\u0000\u0000RS\u0005p\u0000\u0000S\u0012\u0001"+
		"\u0000\u0000\u0000TU\u0005&\u0000\u0000UV\u0005&\u0000\u0000V\u0014\u0001"+
		"\u0000\u0000\u0000WX\u0005|\u0000\u0000XY\u0005|\u0000\u0000Y\u0016\u0001"+
		"\u0000\u0000\u0000Z[\u0005a\u0000\u0000[\\\u0005s\u0000\u0000\\]\u0005"+
		"s\u0000\u0000]^\u0005u\u0000\u0000^_\u0005m\u0000\u0000_`\u0005e\u0000"+
		"\u0000`\u0018\u0001\u0000\u0000\u0000ab\u0005q\u0000\u0000bc\u0005e\u0000"+
		"\u0000cd\u0005d\u0000\u0000d\u001a\u0001\u0000\u0000\u0000ei\u0007\u0000"+
		"\u0000\u0000fh\u0007\u0001\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"j\u001c\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lp\u0007\u0002"+
		"\u0000\u0000mo\u0007\u0001\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"q\u001e\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000sw\u0007\u0003"+
		"\u0000\u0000tv\u0007\u0004\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"x \u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0005\r\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0005\n\u0000\u0000~\"\u0001\u0000\u0000\u0000\u007f\u0081\u0007"+
		"\u0005\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0006"+
		"\u0011\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086\u0089\u0003\u001b"+
		"\r\u0000\u0087\u0089\u0003\u001d\u000e\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089&\u0001\u0000\u0000\u0000"+
		"\u0007\u0000ipw{\u0082\u0088\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}