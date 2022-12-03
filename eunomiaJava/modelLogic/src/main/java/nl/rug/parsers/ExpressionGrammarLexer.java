// Generated from java-escape by ANTLR 4.11.1
package nl.rug.parsers;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExpressionGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ATOM=2, CONST=3, VAR=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "ATOM", "CONST", "VAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "ATOM", "CONST", "VAR"
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


	public ExpressionGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExpressionGrammar.g4"; }

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
		"\u0004\u0000\u0004*\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u000f\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0002\u0004\u0002"+
		"\u0016\b\u0002\u000b\u0002\f\u0002\u0017\u0001\u0002\u0005\u0002\u001b"+
		"\b\u0002\n\u0002\f\u0002\u001e\t\u0002\u0001\u0003\u0004\u0003!\b\u0003"+
		"\u000b\u0003\f\u0003\"\u0001\u0003\u0005\u0003&\b\u0003\n\u0003\f\u0003"+
		")\t\u0003\u0000\u0000\u0004\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\u0001\u0000\u0003\u0002\u0000__az\u0004\u000009AZ__az\u0002\u0000"+
		"AZ__/\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0001\u000e\u0001\u0000\u0000\u0000\u0003\u0012\u0001\u0000\u0000"+
		"\u0000\u0005\u0015\u0001\u0000\u0000\u0000\u0007 \u0001\u0000\u0000\u0000"+
		"\t\n\u0005a\u0000\u0000\n\u000b\u0005n\u0000\u0000\u000b\u000f\u0005d"+
		"\u0000\u0000\f\r\u0005&\u0000\u0000\r\u000f\u0005&\u0000\u0000\u000e\t"+
		"\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000\u0000\u000f\u0002\u0001"+
		"\u0000\u0000\u0000\u0010\u0013\u0003\u0005\u0002\u0000\u0011\u0013\u0003"+
		"\u0007\u0003\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0004\u0001\u0000\u0000\u0000\u0014\u0016\u0007"+
		"\u0000\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u001c\u0001\u0000\u0000\u0000\u0019\u001b\u0007"+
		"\u0001\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001e\u0001"+
		"\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u0006\u0001\u0000\u0000\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001f!\u0007\u0002\u0000\u0000 \u001f\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#\'\u0001\u0000\u0000\u0000$&\u0007\u0001\u0000\u0000"+
		"%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(\b\u0001\u0000\u0000\u0000)\'\u0001"+
		"\u0000\u0000\u0000\u0007\u0000\u000e\u0012\u0017\u001c\"\'\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}