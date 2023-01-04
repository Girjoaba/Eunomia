// Generated from java-escape by ANTLR 4.11.1
package nl.rug.parsers.antlrAPI;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CONJUNCTION=7, ASSUME=8, 
		QED=9, VARIABLE=10, CONSTANT=11, INT=12, NEWLINE=13, WS=14, ATOM=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "CONJUNCTION", "ASSUME", 
			"QED", "VARIABLE", "CONSTANT", "INT", "NEWLINE", "WS", "ATOM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'perp'", "'premise'", "'Intro: '", "','", "'Elim: '", null, 
			"'assume'", "'qed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "CONJUNCTION", "ASSUME", "QED", 
			"VARIABLE", "CONSTANT", "INT", "NEWLINE", "WS", "ATOM"
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
		"\u0004\u0000\u000fu\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006D\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0005\tS\b\t\n\t\f\tV\t\t\u0001\n\u0001\n\u0005\nZ\b\n\n\n\f"+
		"\n]\t\n\u0001\u000b\u0001\u000b\u0005\u000ba\b\u000b\n\u000b\f\u000bd"+
		"\t\u000b\u0001\f\u0003\fg\b\f\u0001\f\u0001\f\u0001\r\u0004\rl\b\r\u000b"+
		"\r\f\rm\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000et\b\u000e\u0000"+
		"\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u0001\u0000\u0006\u0001\u0000az\u0004\u000009AZ__a"+
		"z\u0001\u0000AZ\u0001\u000019\u0001\u000009\u0002\u0000\t\t  |\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000"+
		"\u0000\u0005&\u0001\u0000\u0000\u0000\u0007.\u0001\u0000\u0000\u0000\t"+
		"6\u0001\u0000\u0000\u0000\u000b8\u0001\u0000\u0000\u0000\rC\u0001\u0000"+
		"\u0000\u0000\u000fE\u0001\u0000\u0000\u0000\u0011L\u0001\u0000\u0000\u0000"+
		"\u0013P\u0001\u0000\u0000\u0000\u0015W\u0001\u0000\u0000\u0000\u0017^"+
		"\u0001\u0000\u0000\u0000\u0019f\u0001\u0000\u0000\u0000\u001bk\u0001\u0000"+
		"\u0000\u0000\u001ds\u0001\u0000\u0000\u0000\u001f \u0005.\u0000\u0000"+
		" \u0002\u0001\u0000\u0000\u0000!\"\u0005p\u0000\u0000\"#\u0005e\u0000"+
		"\u0000#$\u0005r\u0000\u0000$%\u0005p\u0000\u0000%\u0004\u0001\u0000\u0000"+
		"\u0000&\'\u0005p\u0000\u0000\'(\u0005r\u0000\u0000()\u0005e\u0000\u0000"+
		")*\u0005m\u0000\u0000*+\u0005i\u0000\u0000+,\u0005s\u0000\u0000,-\u0005"+
		"e\u0000\u0000-\u0006\u0001\u0000\u0000\u0000./\u0005I\u0000\u0000/0\u0005"+
		"n\u0000\u000001\u0005t\u0000\u000012\u0005r\u0000\u000023\u0005o\u0000"+
		"\u000034\u0005:\u0000\u000045\u0005 \u0000\u00005\b\u0001\u0000\u0000"+
		"\u000067\u0005,\u0000\u00007\n\u0001\u0000\u0000\u000089\u0005E\u0000"+
		"\u00009:\u0005l\u0000\u0000:;\u0005i\u0000\u0000;<\u0005m\u0000\u0000"+
		"<=\u0005:\u0000\u0000=>\u0005 \u0000\u0000>\f\u0001\u0000\u0000\u0000"+
		"?D\u0005&\u0000\u0000@A\u0005&\u0000\u0000AD\u0005&\u0000\u0000BD\u0005"+
		"^\u0000\u0000C?\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000CB\u0001"+
		"\u0000\u0000\u0000D\u000e\u0001\u0000\u0000\u0000EF\u0005a\u0000\u0000"+
		"FG\u0005s\u0000\u0000GH\u0005s\u0000\u0000HI\u0005u\u0000\u0000IJ\u0005"+
		"m\u0000\u0000JK\u0005e\u0000\u0000K\u0010\u0001\u0000\u0000\u0000LM\u0005"+
		"q\u0000\u0000MN\u0005e\u0000\u0000NO\u0005d\u0000\u0000O\u0012\u0001\u0000"+
		"\u0000\u0000PT\u0007\u0000\u0000\u0000QS\u0007\u0001\u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000U\u0014\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000W[\u0007\u0002\u0000\u0000XZ\u0007\u0001\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\\u0016\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000^b\u0007\u0003\u0000\u0000_a\u0007\u0004\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000c\u0018\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000eg\u0005\r\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\n\u0000\u0000i\u001a\u0001"+
		"\u0000\u0000\u0000jl\u0007\u0005\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000op\u0006\r\u0000\u0000p\u001c\u0001\u0000"+
		"\u0000\u0000qt\u0003\u0013\t\u0000rt\u0003\u0015\n\u0000sq\u0001\u0000"+
		"\u0000\u0000sr\u0001\u0000\u0000\u0000t\u001e\u0001\u0000\u0000\u0000"+
		"\b\u0000CT[bfms\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}