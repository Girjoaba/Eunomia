// Generated from java-escape by ANTLR 4.11.1
package nl.rug.parsers.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FitchGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENTITY=7, NEGATION=8, 
		CONJUNCTION=9, DISJUNCTION=10, IMPLICATION=11, BICONDITIONAL=12, EXISTENTIAL=13, 
		UNIVERSAL=14, ATOM=15, VARIABLE=16, CONSTANT=17, NUMBER=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "IDENTITY", "NEGATION", 
			"CONJUNCTION", "DISJUNCTION", "IMPLICATION", "BICONDITIONAL", "EXISTENTIAL", 
			"UNIVERSAL", "ATOM", "VARIABLE", "CONSTANT", "NUMBER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'perp'", "'premise'", "'Intro: '", "','", "'Elim: '", "'-'", "'=='", 
			"'~'", "'&'", "'|'", "'->'", "'<->'", "'E'", "'A'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IDENTITY", "NEGATION", "CONJUNCTION", 
			"DISJUNCTION", "IMPLICATION", "BICONDITIONAL", "EXISTENTIAL", "UNIVERSAL", 
			"ATOM", "VARIABLE", "CONSTANT", "NUMBER"
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


	public FitchGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FitchGrammar.g4"; }

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
		"\u0004\u0000\u0012n\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\\\b\u000e\u0001\u000f\u0004\u000f_\b\u000f"+
		"\u000b\u000f\f\u000f`\u0001\u0010\u0004\u0010d\b\u0010\u000b\u0010\f\u0010"+
		"e\u0001\u0011\u0001\u0011\u0005\u0011j\b\u0011\n\u0011\f\u0011m\t\u0011"+
		"\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0004"+
		"\u0001\u0000az\u0001\u0000AZ\u0001\u000019\u0001\u000009q\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003"+
		"*\u0001\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u0007:\u0001"+
		"\u0000\u0000\u0000\t<\u0001\u0000\u0000\u0000\u000bC\u0001\u0000\u0000"+
		"\u0000\rE\u0001\u0000\u0000\u0000\u000fH\u0001\u0000\u0000\u0000\u0011"+
		"J\u0001\u0000\u0000\u0000\u0013L\u0001\u0000\u0000\u0000\u0015N\u0001"+
		"\u0000\u0000\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019U\u0001\u0000\u0000"+
		"\u0000\u001bW\u0001\u0000\u0000\u0000\u001d[\u0001\u0000\u0000\u0000\u001f"+
		"^\u0001\u0000\u0000\u0000!c\u0001\u0000\u0000\u0000#g\u0001\u0000\u0000"+
		"\u0000%&\u0005p\u0000\u0000&\'\u0005e\u0000\u0000\'(\u0005r\u0000\u0000"+
		"()\u0005p\u0000\u0000)\u0002\u0001\u0000\u0000\u0000*+\u0005p\u0000\u0000"+
		"+,\u0005r\u0000\u0000,-\u0005e\u0000\u0000-.\u0005m\u0000\u0000./\u0005"+
		"i\u0000\u0000/0\u0005s\u0000\u000001\u0005e\u0000\u00001\u0004\u0001\u0000"+
		"\u0000\u000023\u0005I\u0000\u000034\u0005n\u0000\u000045\u0005t\u0000"+
		"\u000056\u0005r\u0000\u000067\u0005o\u0000\u000078\u0005:\u0000\u0000"+
		"89\u0005 \u0000\u00009\u0006\u0001\u0000\u0000\u0000:;\u0005,\u0000\u0000"+
		";\b\u0001\u0000\u0000\u0000<=\u0005E\u0000\u0000=>\u0005l\u0000\u0000"+
		">?\u0005i\u0000\u0000?@\u0005m\u0000\u0000@A\u0005:\u0000\u0000AB\u0005"+
		" \u0000\u0000B\n\u0001\u0000\u0000\u0000CD\u0005-\u0000\u0000D\f\u0001"+
		"\u0000\u0000\u0000EF\u0005=\u0000\u0000FG\u0005=\u0000\u0000G\u000e\u0001"+
		"\u0000\u0000\u0000HI\u0005~\u0000\u0000I\u0010\u0001\u0000\u0000\u0000"+
		"JK\u0005&\u0000\u0000K\u0012\u0001\u0000\u0000\u0000LM\u0005|\u0000\u0000"+
		"M\u0014\u0001\u0000\u0000\u0000NO\u0005-\u0000\u0000OP\u0005>\u0000\u0000"+
		"P\u0016\u0001\u0000\u0000\u0000QR\u0005<\u0000\u0000RS\u0005-\u0000\u0000"+
		"ST\u0005>\u0000\u0000T\u0018\u0001\u0000\u0000\u0000UV\u0005E\u0000\u0000"+
		"V\u001a\u0001\u0000\u0000\u0000WX\u0005A\u0000\u0000X\u001c\u0001\u0000"+
		"\u0000\u0000Y\\\u0003\u001f\u000f\u0000Z\\\u0003!\u0010\u0000[Y\u0001"+
		"\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\u001e\u0001\u0000\u0000"+
		"\u0000]_\u0007\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a \u0001"+
		"\u0000\u0000\u0000bd\u0007\u0001\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000f\"\u0001\u0000\u0000\u0000gk\u0007\u0002\u0000\u0000hj\u0007\u0003"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l$\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000\u0005\u0000[`ek\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}