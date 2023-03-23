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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, VARIABLE=12, CONSTANT=13, ATOM=14, NEGATION=15, CONTRADICTION=16, 
		CONJUNCTION=17, DISJUNCTION=18, IDENTITY=19, IMPLICATION=20, BICONDITIONAL=21, 
		FORALL=22, EXISTS=23, ASSUME=24, QED=25, INT=26, NEWLINE=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "VARIABLE", "CONSTANT", "ATOM", "NEGATION", "CONTRADICTION", 
			"CONJUNCTION", "DISJUNCTION", "IDENTITY", "IMPLICATION", "BICONDITIONAL", 
			"FORALL", "EXISTS", "ASSUME", "QED", "INT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' premise'", "'.'", "'('", "')'", "'Reit: '", "'Intro: '", "','", 
			"'Intro'", "'Elim: '", "'-'", "'|'", null, null, null, "'!'", "'\\perp'", 
			"'&&'", "'||'", "'=='", "'->'", "'<->'", "'\\forall'", "'\\exists'", 
			"'assume'", "'qed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"VARIABLE", "CONSTANT", "ATOM", "NEGATION", "CONTRADICTION", "CONJUNCTION", 
			"DISJUNCTION", "IDENTITY", "IMPLICATION", "BICONDITIONAL", "FORALL", 
			"EXISTS", "ASSUME", "QED", "INT", "NEWLINE", "WS"
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
		"\u0004\u0000\u001c\u00bb\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rq\b\r\n\r\f"+
		"\rt\t\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u00ab\b\u0019\n\u0019\f\u0019\u00ae\t\u0019\u0001\u001a\u0003\u001a"+
		"\u00b1\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b\u00b6\b"+
		"\u001b\u000b\u001b\f\u001b\u00b7\u0001\u001b\u0001\u001b\u0000\u0000\u001c"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c\u0001\u0000\u0007\u0001\u0000uz\u0001"+
		"\u0000at\u0001\u0000AZ\u0003\u000009AZaz\u0001\u000019\u0001\u000009\u0002"+
		"\u0000\t\t  \u00be\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00019\u0001\u0000\u0000\u0000\u0003B\u0001\u0000\u0000"+
		"\u0000\u0005D\u0001\u0000\u0000\u0000\u0007F\u0001\u0000\u0000\u0000\t"+
		"H\u0001\u0000\u0000\u0000\u000bO\u0001\u0000\u0000\u0000\rW\u0001\u0000"+
		"\u0000\u0000\u000fY\u0001\u0000\u0000\u0000\u0011_\u0001\u0000\u0000\u0000"+
		"\u0013f\u0001\u0000\u0000\u0000\u0015h\u0001\u0000\u0000\u0000\u0017j"+
		"\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000\u0000\u001bn\u0001\u0000"+
		"\u0000\u0000\u001du\u0001\u0000\u0000\u0000\u001fw\u0001\u0000\u0000\u0000"+
		"!}\u0001\u0000\u0000\u0000#\u0080\u0001\u0000\u0000\u0000%\u0083\u0001"+
		"\u0000\u0000\u0000\'\u0086\u0001\u0000\u0000\u0000)\u0089\u0001\u0000"+
		"\u0000\u0000+\u008d\u0001\u0000\u0000\u0000-\u0095\u0001\u0000\u0000\u0000"+
		"/\u009d\u0001\u0000\u0000\u00001\u00a4\u0001\u0000\u0000\u00003\u00a8"+
		"\u0001\u0000\u0000\u00005\u00b0\u0001\u0000\u0000\u00007\u00b5\u0001\u0000"+
		"\u0000\u00009:\u0005 \u0000\u0000:;\u0005p\u0000\u0000;<\u0005r\u0000"+
		"\u0000<=\u0005e\u0000\u0000=>\u0005m\u0000\u0000>?\u0005i\u0000\u0000"+
		"?@\u0005s\u0000\u0000@A\u0005e\u0000\u0000A\u0002\u0001\u0000\u0000\u0000"+
		"BC\u0005.\u0000\u0000C\u0004\u0001\u0000\u0000\u0000DE\u0005(\u0000\u0000"+
		"E\u0006\u0001\u0000\u0000\u0000FG\u0005)\u0000\u0000G\b\u0001\u0000\u0000"+
		"\u0000HI\u0005R\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005i\u0000\u0000"+
		"KL\u0005t\u0000\u0000LM\u0005:\u0000\u0000MN\u0005 \u0000\u0000N\n\u0001"+
		"\u0000\u0000\u0000OP\u0005I\u0000\u0000PQ\u0005n\u0000\u0000QR\u0005t"+
		"\u0000\u0000RS\u0005r\u0000\u0000ST\u0005o\u0000\u0000TU\u0005:\u0000"+
		"\u0000UV\u0005 \u0000\u0000V\f\u0001\u0000\u0000\u0000WX\u0005,\u0000"+
		"\u0000X\u000e\u0001\u0000\u0000\u0000YZ\u0005I\u0000\u0000Z[\u0005n\u0000"+
		"\u0000[\\\u0005t\u0000\u0000\\]\u0005r\u0000\u0000]^\u0005o\u0000\u0000"+
		"^\u0010\u0001\u0000\u0000\u0000_`\u0005E\u0000\u0000`a\u0005l\u0000\u0000"+
		"ab\u0005i\u0000\u0000bc\u0005m\u0000\u0000cd\u0005:\u0000\u0000de\u0005"+
		" \u0000\u0000e\u0012\u0001\u0000\u0000\u0000fg\u0005-\u0000\u0000g\u0014"+
		"\u0001\u0000\u0000\u0000hi\u0005|\u0000\u0000i\u0016\u0001\u0000\u0000"+
		"\u0000jk\u0007\u0000\u0000\u0000k\u0018\u0001\u0000\u0000\u0000lm\u0007"+
		"\u0001\u0000\u0000m\u001a\u0001\u0000\u0000\u0000nr\u0007\u0002\u0000"+
		"\u0000oq\u0007\u0003\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u001c"+
		"\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005!\u0000\u0000"+
		"v\u001e\u0001\u0000\u0000\u0000wx\u0005\\\u0000\u0000xy\u0005p\u0000\u0000"+
		"yz\u0005e\u0000\u0000z{\u0005r\u0000\u0000{|\u0005p\u0000\u0000| \u0001"+
		"\u0000\u0000\u0000}~\u0005&\u0000\u0000~\u007f\u0005&\u0000\u0000\u007f"+
		"\"\u0001\u0000\u0000\u0000\u0080\u0081\u0005|\u0000\u0000\u0081\u0082"+
		"\u0005|\u0000\u0000\u0082$\u0001\u0000\u0000\u0000\u0083\u0084\u0005="+
		"\u0000\u0000\u0084\u0085\u0005=\u0000\u0000\u0085&\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005-\u0000\u0000\u0087\u0088\u0005>\u0000\u0000\u0088("+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005<\u0000\u0000\u008a\u008b\u0005"+
		"-\u0000\u0000\u008b\u008c\u0005>\u0000\u0000\u008c*\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005\\\u0000\u0000\u008e\u008f\u0005f\u0000\u0000"+
		"\u008f\u0090\u0005o\u0000\u0000\u0090\u0091\u0005r\u0000\u0000\u0091\u0092"+
		"\u0005a\u0000\u0000\u0092\u0093\u0005l\u0000\u0000\u0093\u0094\u0005l"+
		"\u0000\u0000\u0094,\u0001\u0000\u0000\u0000\u0095\u0096\u0005\\\u0000"+
		"\u0000\u0096\u0097\u0005e\u0000\u0000\u0097\u0098\u0005x\u0000\u0000\u0098"+
		"\u0099\u0005i\u0000\u0000\u0099\u009a\u0005s\u0000\u0000\u009a\u009b\u0005"+
		"t\u0000\u0000\u009b\u009c\u0005s\u0000\u0000\u009c.\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005a\u0000\u0000\u009e\u009f\u0005s\u0000\u0000\u009f"+
		"\u00a0\u0005s\u0000\u0000\u00a0\u00a1\u0005u\u0000\u0000\u00a1\u00a2\u0005"+
		"m\u0000\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a30\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0005q\u0000\u0000\u00a5\u00a6\u0005e\u0000\u0000\u00a6"+
		"\u00a7\u0005d\u0000\u0000\u00a72\u0001\u0000\u0000\u0000\u00a8\u00ac\u0007"+
		"\u0004\u0000\u0000\u00a9\u00ab\u0007\u0005\u0000\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad4\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b1\u0005\r\u0000"+
		"\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\n\u0000\u0000"+
		"\u00b36\u0001\u0000\u0000\u0000\u00b4\u00b6\u0007\u0006\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0006\u001b\u0000\u0000\u00ba"+
		"8\u0001\u0000\u0000\u0000\u0005\u0000r\u00ac\u00b0\u00b7\u0001\u0006\u0000"+
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