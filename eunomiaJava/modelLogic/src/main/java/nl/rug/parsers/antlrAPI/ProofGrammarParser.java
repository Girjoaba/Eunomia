// Generated from java-escape by ANTLR 4.11.1
package nl.rug.parsers.antlrAPI;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProofGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, CONJUNCTION=7, ASSUME=8, 
		QED=9, VARIABLE=10, CONSTANT=11, INT=12, NEWLINE=13, WS=14, ATOM=15;
	public static final int
		RULE_proof = 0, RULE_subproof = 1, RULE_assume = 2, RULE_qed = 3, RULE_proofLine = 4, 
		RULE_proofLineNum = 5, RULE_inference = 6, RULE_contradiction = 7, RULE_sentence = 8, 
		RULE_atom = 9, RULE_justification = 10, RULE_premise = 11, RULE_introduction = 12, 
		RULE_elimination = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"proof", "subproof", "assume", "qed", "proofLine", "proofLineNum", "inference", 
			"contradiction", "sentence", "atom", "justification", "premise", "introduction", 
			"elimination"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProofGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProofGrammarParser.EOF, 0); }
		public List<ProofLineContext> proofLine() {
			return getRuleContexts(ProofLineContext.class);
		}
		public ProofLineContext proofLine(int i) {
			return getRuleContext(ProofLineContext.class,i);
		}
		public List<SubproofContext> subproof() {
			return getRuleContexts(SubproofContext.class);
		}
		public SubproofContext subproof(int i) {
			return getRuleContext(SubproofContext.class,i);
		}
		public ProofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterProof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitProof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitProof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProofContext proof() throws RecognitionException {
		ProofContext _localctx = new ProofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_proof);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 12544L) != 0) {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case NEWLINE:
					{
					setState(28);
					proofLine();
					}
					break;
				case ASSUME:
					{
					setState(29);
					subproof();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubproofContext extends ParserRuleContext {
		public AssumeContext assume() {
			return getRuleContext(AssumeContext.class,0);
		}
		public QedContext qed() {
			return getRuleContext(QedContext.class,0);
		}
		public List<SubproofContext> subproof() {
			return getRuleContexts(SubproofContext.class);
		}
		public SubproofContext subproof(int i) {
			return getRuleContext(SubproofContext.class,i);
		}
		public List<ProofLineContext> proofLine() {
			return getRuleContexts(ProofLineContext.class);
		}
		public ProofLineContext proofLine(int i) {
			return getRuleContext(ProofLineContext.class,i);
		}
		public SubproofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subproof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterSubproof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitSubproof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitSubproof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubproofContext subproof() throws RecognitionException {
		SubproofContext _localctx = new SubproofContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subproof);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			assume();
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(40);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSUME:
						{
						setState(38);
						subproof();
						}
						break;
					case INT:
					case NEWLINE:
						{
						setState(39);
						proofLine();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(45);
			qed();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssumeContext extends ParserRuleContext {
		public TerminalNode ASSUME() { return getToken(ProofGrammarParser.ASSUME, 0); }
		public TerminalNode NEWLINE() { return getToken(ProofGrammarParser.NEWLINE, 0); }
		public ProofLineContext proofLine() {
			return getRuleContext(ProofLineContext.class,0);
		}
		public AssumeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assume; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterAssume(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitAssume(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitAssume(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssumeContext assume() throws RecognitionException {
		AssumeContext _localctx = new AssumeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assume);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ASSUME);
			setState(48);
			match(NEWLINE);
			setState(49);
			proofLine();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QedContext extends ParserRuleContext {
		public ProofLineContext proofLine() {
			return getRuleContext(ProofLineContext.class,0);
		}
		public TerminalNode QED() { return getToken(ProofGrammarParser.QED, 0); }
		public QedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterQed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitQed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitQed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QedContext qed() throws RecognitionException {
		QedContext _localctx = new QedContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			proofLine();
			setState(52);
			match(QED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProofLineContext extends ParserRuleContext {
		public ProofLineNumContext proofLineNum() {
			return getRuleContext(ProofLineNumContext.class,0);
		}
		public InferenceContext inference() {
			return getRuleContext(InferenceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ProofGrammarParser.NEWLINE, 0); }
		public ProofLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterProofLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitProofLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitProofLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProofLineContext proofLine() throws RecognitionException {
		ProofLineContext _localctx = new ProofLineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_proofLine);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				proofLineNum();
				setState(55);
				inference();
				setState(56);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProofLineNumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProofGrammarParser.INT, 0); }
		public ProofLineNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofLineNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterProofLineNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitProofLineNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitProofLineNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProofLineNumContext proofLineNum() throws RecognitionException {
		ProofLineNumContext _localctx = new ProofLineNumContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proofLineNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(INT);
			setState(62);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InferenceContext extends ParserRuleContext {
		public JustificationContext justification() {
			return getRuleContext(JustificationContext.class,0);
		}
		public List<ContradictionContext> contradiction() {
			return getRuleContexts(ContradictionContext.class);
		}
		public ContradictionContext contradiction(int i) {
			return getRuleContext(ContradictionContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public InferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterInference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitInference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitInference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferenceContext inference() throws RecognitionException {
		InferenceContext _localctx = new InferenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(64);
					contradiction();
					}
					break;
				case VARIABLE:
				case CONSTANT:
					{
					setState(65);
					sentence(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 3076L) != 0 );
			setState(70);
			justification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContradictionContext extends ParserRuleContext {
		public ContradictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contradiction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterContradiction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitContradiction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitContradiction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContradictionContext contradiction() throws RecognitionException {
		ContradictionContext _localctx = new ContradictionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_contradiction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode CONJUNCTION() { return getToken(ProofGrammarParser.CONJUNCTION, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		return sentence(0);
	}

	private SentenceContext sentence(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SentenceContext _localctx = new SentenceContext(_ctx, _parentState);
		SentenceContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_sentence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(75);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SentenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sentence);
					setState(77);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(78);
					match(CONJUNCTION);
					setState(79);
					sentence(2);
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(ProofGrammarParser.VARIABLE, 0); }
		public TerminalNode CONSTANT() { return getToken(ProofGrammarParser.CONSTANT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==CONSTANT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JustificationContext extends ParserRuleContext {
		public PremiseContext premise() {
			return getRuleContext(PremiseContext.class,0);
		}
		public EliminationContext elimination() {
			return getRuleContext(EliminationContext.class,0);
		}
		public IntroductionContext introduction() {
			return getRuleContext(IntroductionContext.class,0);
		}
		public JustificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterJustification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitJustification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitJustification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JustificationContext justification() throws RecognitionException {
		JustificationContext _localctx = new JustificationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_justification);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				premise();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				elimination();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				introduction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PremiseContext extends ParserRuleContext {
		public PremiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_premise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterPremise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitPremise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitPremise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PremiseContext premise() throws RecognitionException {
		PremiseContext _localctx = new PremiseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_premise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntroductionContext extends ParserRuleContext {
		public TerminalNode CONJUNCTION() { return getToken(ProofGrammarParser.CONJUNCTION, 0); }
		public List<TerminalNode> INT() { return getTokens(ProofGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ProofGrammarParser.INT, i);
		}
		public IntroductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_introduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterIntroduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitIntroduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitIntroduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntroductionContext introduction() throws RecognitionException {
		IntroductionContext _localctx = new IntroductionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_introduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(CONJUNCTION);
			setState(95);
			match(T__3);
			setState(96);
			match(INT);
			setState(97);
			match(T__4);
			setState(98);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EliminationContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProofGrammarParser.INT, 0); }
		public List<TerminalNode> CONJUNCTION() { return getTokens(ProofGrammarParser.CONJUNCTION); }
		public TerminalNode CONJUNCTION(int i) {
			return getToken(ProofGrammarParser.CONJUNCTION, i);
		}
		public EliminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elimination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterElimination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitElimination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitElimination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EliminationContext elimination() throws RecognitionException {
		EliminationContext _localctx = new EliminationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elimination);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				match(CONJUNCTION);
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CONJUNCTION );
			setState(105);
			match(T__5);
			setState(106);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return sentence_sempred((SentenceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sentence_sempred(SentenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000fm\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0005\u0000\u001f\b"+
		"\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004<\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0004\u0006C\b\u0006\u000b\u0006\f\u0006"+
		"D\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\bQ\b\b\n\b\f\bT\t\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0003\n[\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004\rf\b\r\u000b\r\f\rg\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0000\u0001\u0010\u000e\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001\u0001\u0000"+
		"\n\u000bi\u0000 \u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000"+
		"\u0004/\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b;\u0001"+
		"\u0000\u0000\u0000\n=\u0001\u0000\u0000\u0000\fB\u0001\u0000\u0000\u0000"+
		"\u000eH\u0001\u0000\u0000\u0000\u0010J\u0001\u0000\u0000\u0000\u0012U"+
		"\u0001\u0000\u0000\u0000\u0014Z\u0001\u0000\u0000\u0000\u0016\\\u0001"+
		"\u0000\u0000\u0000\u0018^\u0001\u0000\u0000\u0000\u001ae\u0001\u0000\u0000"+
		"\u0000\u001c\u001f\u0003\b\u0004\u0000\u001d\u001f\u0003\u0002\u0001\u0000"+
		"\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000%*\u0003\u0004"+
		"\u0002\u0000&)\u0003\u0002\u0001\u0000\')\u0003\b\u0004\u0000(&\u0001"+
		"\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000-.\u0003\u0006\u0003\u0000.\u0003\u0001"+
		"\u0000\u0000\u0000/0\u0005\b\u0000\u000001\u0005\r\u0000\u000012\u0003"+
		"\b\u0004\u00002\u0005\u0001\u0000\u0000\u000034\u0003\b\u0004\u000045"+
		"\u0005\t\u0000\u00005\u0007\u0001\u0000\u0000\u000067\u0003\n\u0005\u0000"+
		"78\u0003\f\u0006\u000089\u0005\r\u0000\u00009<\u0001\u0000\u0000\u0000"+
		":<\u0005\r\u0000\u0000;6\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000"+
		"<\t\u0001\u0000\u0000\u0000=>\u0005\f\u0000\u0000>?\u0005\u0001\u0000"+
		"\u0000?\u000b\u0001\u0000\u0000\u0000@C\u0003\u000e\u0007\u0000AC\u0003"+
		"\u0010\b\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FG\u0003\u0014\n\u0000G\r\u0001\u0000\u0000"+
		"\u0000HI\u0005\u0002\u0000\u0000I\u000f\u0001\u0000\u0000\u0000JK\u0006"+
		"\b\uffff\uffff\u0000KL\u0003\u0012\t\u0000LR\u0001\u0000\u0000\u0000M"+
		"N\n\u0001\u0000\u0000NO\u0005\u0007\u0000\u0000OQ\u0003\u0010\b\u0002"+
		"PM\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000S\u0011\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000UV\u0007\u0000\u0000\u0000V\u0013\u0001\u0000\u0000"+
		"\u0000W[\u0003\u0016\u000b\u0000X[\u0003\u001a\r\u0000Y[\u0003\u0018\f"+
		"\u0000ZW\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000"+
		"\u0000\u0000[\u0015\u0001\u0000\u0000\u0000\\]\u0005\u0003\u0000\u0000"+
		"]\u0017\u0001\u0000\u0000\u0000^_\u0005\u0007\u0000\u0000_`\u0005\u0004"+
		"\u0000\u0000`a\u0005\f\u0000\u0000ab\u0005\u0005\u0000\u0000bc\u0005\f"+
		"\u0000\u0000c\u0019\u0001\u0000\u0000\u0000df\u0005\u0007\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005\u0006"+
		"\u0000\u0000jk\u0005\f\u0000\u0000k\u001b\u0001\u0000\u0000\u0000\n\u001e"+
		" (*;BDRZg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}