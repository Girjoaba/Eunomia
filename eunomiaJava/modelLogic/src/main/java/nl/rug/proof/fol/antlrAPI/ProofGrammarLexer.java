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
		T__9=10, VARIABLE=11, CONSTANT=12, ATOM=13, NEGATION=14, CONTRADICTION=15, 
		CONJUNCTION=16, DISJUNCTION=17, IDENTITY=18, IMPLICATION=19, BICONDITIONAL=20, 
		ASSUME=21, QED=22, INT=23, NEWLINE=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "VARIABLE", "CONSTANT", "ATOM", "NEGATION", "CONTRADICTION", 
			"CONJUNCTION", "DISJUNCTION", "IDENTITY", "IMPLICATION", "BICONDITIONAL", 
			"ASSUME", "QED", "INT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "' premise'", "'('", "')'", "'Reit: '", "'Intro: '", "','", 
			"'Intro'", "'Elim: '", "'-'", null, null, null, "'!'", "'\\perp'", "'&&'", 
			"'||'", "'=='", "'->'", "'<->'", "'assume'", "'qed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "VARIABLE", 
			"CONSTANT", "ATOM", "NEGATION", "CONTRADICTION", "CONJUNCTION", "DISJUNCTION", 
			"IDENTITY", "IMPLICATION", "BICONDITIONAL", "ASSUME", "QED", "INT", "NEWLINE", 
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
		"\u0004\u0000\u0019\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fi\b\f\n\f\f\fl\t\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u0093\b\u0016\n\u0016\f\u0016\u0096\t\u0016\u0001\u0017\u0003\u0017\u0099"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u009e\b\u0018"+
		"\u000b\u0018\f\u0018\u009f\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u0019\u0001\u0000\u0007\u0001\u0000uz\u0001\u0000at\u0001\u0000"+
		"AZ\u0003\u000009AZaz\u0001\u000019\u0001\u000009\u0002\u0000\t\t  \u00a6"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000"+
		"\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u0005>\u0001\u0000\u0000\u0000"+
		"\u0007@\u0001\u0000\u0000\u0000\tB\u0001\u0000\u0000\u0000\u000bI\u0001"+
		"\u0000\u0000\u0000\rQ\u0001\u0000\u0000\u0000\u000fS\u0001\u0000\u0000"+
		"\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013`\u0001\u0000\u0000\u0000\u0015"+
		"b\u0001\u0000\u0000\u0000\u0017d\u0001\u0000\u0000\u0000\u0019f\u0001"+
		"\u0000\u0000\u0000\u001bm\u0001\u0000\u0000\u0000\u001do\u0001\u0000\u0000"+
		"\u0000\u001fu\u0001\u0000\u0000\u0000!x\u0001\u0000\u0000\u0000#{\u0001"+
		"\u0000\u0000\u0000%~\u0001\u0000\u0000\u0000\'\u0081\u0001\u0000\u0000"+
		"\u0000)\u0085\u0001\u0000\u0000\u0000+\u008c\u0001\u0000\u0000\u0000-"+
		"\u0090\u0001\u0000\u0000\u0000/\u0098\u0001\u0000\u0000\u00001\u009d\u0001"+
		"\u0000\u0000\u000034\u0005.\u0000\u00004\u0002\u0001\u0000\u0000\u0000"+
		"56\u0005 \u0000\u000067\u0005p\u0000\u000078\u0005r\u0000\u000089\u0005"+
		"e\u0000\u00009:\u0005m\u0000\u0000:;\u0005i\u0000\u0000;<\u0005s\u0000"+
		"\u0000<=\u0005e\u0000\u0000=\u0004\u0001\u0000\u0000\u0000>?\u0005(\u0000"+
		"\u0000?\u0006\u0001\u0000\u0000\u0000@A\u0005)\u0000\u0000A\b\u0001\u0000"+
		"\u0000\u0000BC\u0005R\u0000\u0000CD\u0005e\u0000\u0000DE\u0005i\u0000"+
		"\u0000EF\u0005t\u0000\u0000FG\u0005:\u0000\u0000GH\u0005 \u0000\u0000"+
		"H\n\u0001\u0000\u0000\u0000IJ\u0005I\u0000\u0000JK\u0005n\u0000\u0000"+
		"KL\u0005t\u0000\u0000LM\u0005r\u0000\u0000MN\u0005o\u0000\u0000NO\u0005"+
		":\u0000\u0000OP\u0005 \u0000\u0000P\f\u0001\u0000\u0000\u0000QR\u0005"+
		",\u0000\u0000R\u000e\u0001\u0000\u0000\u0000ST\u0005I\u0000\u0000TU\u0005"+
		"n\u0000\u0000UV\u0005t\u0000\u0000VW\u0005r\u0000\u0000WX\u0005o\u0000"+
		"\u0000X\u0010\u0001\u0000\u0000\u0000YZ\u0005E\u0000\u0000Z[\u0005l\u0000"+
		"\u0000[\\\u0005i\u0000\u0000\\]\u0005m\u0000\u0000]^\u0005:\u0000\u0000"+
		"^_\u0005 \u0000\u0000_\u0012\u0001\u0000\u0000\u0000`a\u0005-\u0000\u0000"+
		"a\u0014\u0001\u0000\u0000\u0000bc\u0007\u0000\u0000\u0000c\u0016\u0001"+
		"\u0000\u0000\u0000de\u0007\u0001\u0000\u0000e\u0018\u0001\u0000\u0000"+
		"\u0000fj\u0007\u0002\u0000\u0000gi\u0007\u0003\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000k\u001a\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000mn\u0005!\u0000\u0000n\u001c\u0001\u0000\u0000\u0000op\u0005\\\u0000"+
		"\u0000pq\u0005p\u0000\u0000qr\u0005e\u0000\u0000rs\u0005r\u0000\u0000"+
		"st\u0005p\u0000\u0000t\u001e\u0001\u0000\u0000\u0000uv\u0005&\u0000\u0000"+
		"vw\u0005&\u0000\u0000w \u0001\u0000\u0000\u0000xy\u0005|\u0000\u0000y"+
		"z\u0005|\u0000\u0000z\"\u0001\u0000\u0000\u0000{|\u0005=\u0000\u0000|"+
		"}\u0005=\u0000\u0000}$\u0001\u0000\u0000\u0000~\u007f\u0005-\u0000\u0000"+
		"\u007f\u0080\u0005>\u0000\u0000\u0080&\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005<\u0000\u0000\u0082\u0083\u0005-\u0000\u0000\u0083\u0084\u0005>"+
		"\u0000\u0000\u0084(\u0001\u0000\u0000\u0000\u0085\u0086\u0005a\u0000\u0000"+
		"\u0086\u0087\u0005s\u0000\u0000\u0087\u0088\u0005s\u0000\u0000\u0088\u0089"+
		"\u0005u\u0000\u0000\u0089\u008a\u0005m\u0000\u0000\u008a\u008b\u0005e"+
		"\u0000\u0000\u008b*\u0001\u0000\u0000\u0000\u008c\u008d\u0005q\u0000\u0000"+
		"\u008d\u008e\u0005e\u0000\u0000\u008e\u008f\u0005d\u0000\u0000\u008f,"+
		"\u0001\u0000\u0000\u0000\u0090\u0094\u0007\u0004\u0000\u0000\u0091\u0093"+
		"\u0007\u0005\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095.\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u0099\u0005\r\u0000\u0000\u0098\u0097\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\n\u0000\u0000\u009b0\u0001\u0000\u0000"+
		"\u0000\u009c\u009e\u0007\u0006\u0000\u0000\u009d\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0006\u0018\u0000\u0000\u00a22\u0001\u0000\u0000\u0000"+
		"\u0005\u0000j\u0094\u0098\u009f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}