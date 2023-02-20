// Generated from java-escape by ANTLR 4.11.1
package nl.rug.proof.fol.antlrAPI;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProofGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, CONJUNCTION=9, 
		DISJUNCTION=10, ASSUME=11, QED=12, VARIABLE=13, CONSTANT=14, INT=15, NEWLINE=16, 
		WS=17, ATOM=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "CONJUNCTION", 
			"DISJUNCTION", "ASSUME", "QED", "VARIABLE", "CONSTANT", "INT", "NEWLINE", 
			"WS", "ATOM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'perp'", "'premise'", "'Reit: '", "'Intro: '", "','", "'Elim: '", 
			"'-'", null, null, "'assume'", "'qed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "CONJUNCTION", 
			"DISJUNCTION", "ASSUME", "QED", "VARIABLE", "CONSTANT", "INT", "NEWLINE", 
			"WS", "ATOM"
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
		"\u0004\u0000\u0012\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bS\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tY\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fh\b"+
		"\f\n\f\f\fk\t\f\u0001\r\u0001\r\u0005\ro\b\r\n\r\f\rr\t\r\u0001\u000e"+
		"\u0001\u000e\u0005\u000ev\b\u000e\n\u000e\f\u000ey\t\u000e\u0001\u000f"+
		"\u0003\u000f|\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010"+
		"\u0081\b\u0010\u000b\u0010\f\u0010\u0082\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0089\b\u0011\u0000\u0000\u0012\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012\u0001\u0000\u0006\u0001\u0000az\u0004\u0000"+
		"09AZ__az\u0001\u0000AZ\u0001\u000019\u0001\u000009\u0002\u0000\t\t  \u0093"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000"+
		"\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000"+
		"\u00074\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000bC\u0001"+
		"\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fL\u0001\u0000\u0000"+
		"\u0000\u0011R\u0001\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000\u0015"+
		"Z\u0001\u0000\u0000\u0000\u0017a\u0001\u0000\u0000\u0000\u0019e\u0001"+
		"\u0000\u0000\u0000\u001bl\u0001\u0000\u0000\u0000\u001ds\u0001\u0000\u0000"+
		"\u0000\u001f{\u0001\u0000\u0000\u0000!\u0080\u0001\u0000\u0000\u0000#"+
		"\u0088\u0001\u0000\u0000\u0000%&\u0005.\u0000\u0000&\u0002\u0001\u0000"+
		"\u0000\u0000\'(\u0005p\u0000\u0000()\u0005e\u0000\u0000)*\u0005r\u0000"+
		"\u0000*+\u0005p\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005p\u0000"+
		"\u0000-.\u0005r\u0000\u0000./\u0005e\u0000\u0000/0\u0005m\u0000\u0000"+
		"01\u0005i\u0000\u000012\u0005s\u0000\u000023\u0005e\u0000\u00003\u0006"+
		"\u0001\u0000\u0000\u000045\u0005R\u0000\u000056\u0005e\u0000\u000067\u0005"+
		"i\u0000\u000078\u0005t\u0000\u000089\u0005:\u0000\u00009:\u0005 \u0000"+
		"\u0000:\b\u0001\u0000\u0000\u0000;<\u0005I\u0000\u0000<=\u0005n\u0000"+
		"\u0000=>\u0005t\u0000\u0000>?\u0005r\u0000\u0000?@\u0005o\u0000\u0000"+
		"@A\u0005:\u0000\u0000AB\u0005 \u0000\u0000B\n\u0001\u0000\u0000\u0000"+
		"CD\u0005,\u0000\u0000D\f\u0001\u0000\u0000\u0000EF\u0005E\u0000\u0000"+
		"FG\u0005l\u0000\u0000GH\u0005i\u0000\u0000HI\u0005m\u0000\u0000IJ\u0005"+
		":\u0000\u0000JK\u0005 \u0000\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0005"+
		"-\u0000\u0000M\u0010\u0001\u0000\u0000\u0000NS\u0005&\u0000\u0000OP\u0005"+
		"&\u0000\u0000PS\u0005&\u0000\u0000QS\u0005^\u0000\u0000RN\u0001\u0000"+
		"\u0000\u0000RO\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\u0012"+
		"\u0001\u0000\u0000\u0000TY\u0005|\u0000\u0000UV\u0005|\u0000\u0000VY\u0005"+
		"|\u0000\u0000WY\u0005v\u0000\u0000XT\u0001\u0000\u0000\u0000XU\u0001\u0000"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000"+
		"Z[\u0005a\u0000\u0000[\\\u0005s\u0000\u0000\\]\u0005s\u0000\u0000]^\u0005"+
		"u\u0000\u0000^_\u0005m\u0000\u0000_`\u0005e\u0000\u0000`\u0016\u0001\u0000"+
		"\u0000\u0000ab\u0005q\u0000\u0000bc\u0005e\u0000\u0000cd\u0005d\u0000"+
		"\u0000d\u0018\u0001\u0000\u0000\u0000ei\u0007\u0000\u0000\u0000fh\u0007"+
		"\u0001\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u001a\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000lp\u0007\u0002\u0000\u0000mo\u0007"+
		"\u0001\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u001c\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000sw\u0007\u0003\u0000\u0000tv\u0007"+
		"\u0004\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u001e\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0005\r\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005"+
		"\n\u0000\u0000~ \u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0005\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0006\u0010\u0000"+
		"\u0000\u0085\"\u0001\u0000\u0000\u0000\u0086\u0089\u0003\u0019\f\u0000"+
		"\u0087\u0089\u0003\u001b\r\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0087\u0001\u0000\u0000\u0000\u0089$\u0001\u0000\u0000\u0000\t\u0000"+
		"RXipw{\u0082\u0088\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}