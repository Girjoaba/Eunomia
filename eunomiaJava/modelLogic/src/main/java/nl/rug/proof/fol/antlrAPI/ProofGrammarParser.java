// Generated from java-escape by ANTLR 4.11.1
package nl.rug.proof.fol.antlrAPI;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProofGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, CONJUNCTION=9, 
		DISJUNCTION=10, ASSUME=11, QED=12, VARIABLE=13, CONSTANT=14, INT=15, NEWLINE=16, 
		WS=17, ATOM=18;
	public static final int
		RULE_proof = 0, RULE_subproof = 1, RULE_assume = 2, RULE_qed = 3, RULE_proofLine = 4, 
		RULE_proofLineNum = 5, RULE_inference = 6, RULE_contradiction = 7, RULE_sentence = 8, 
		RULE_atom = 9, RULE_justification = 10, RULE_premise = 11, RULE_reiteration = 12, 
		RULE_introduction = 13, RULE_elimination = 14, RULE_singleReference = 15, 
		RULE_rangeReference = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"proof", "subproof", "assume", "qed", "proofLine", "proofLineNum", "inference", 
			"contradiction", "sentence", "atom", "justification", "premise", "reiteration", 
			"introduction", "elimination", "singleReference", "rangeReference"
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
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSUME || _la==INT) {
				{
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(34);
					proofLine();
					}
					break;
				case ASSUME:
					{
					setState(35);
					subproof();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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
			setState(43);
			assume();
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(46);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSUME:
						{
						setState(44);
						subproof();
						}
						break;
					case INT:
						{
						setState(45);
						proofLine();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(51);
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
			setState(53);
			match(ASSUME);
			setState(54);
			match(NEWLINE);
			setState(55);
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
		public TerminalNode NEWLINE() { return getToken(ProofGrammarParser.NEWLINE, 0); }
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
			setState(57);
			proofLine();
			setState(58);
			match(QED);
			setState(59);
			match(NEWLINE);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			proofLineNum();
			setState(62);
			inference();
			setState(63);
			match(NEWLINE);
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
			setState(65);
			match(INT);
			setState(66);
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
		public InferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inference; }
	 
		public InferenceContext() { }
		public void copyFrom(InferenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContradictionInferContext extends InferenceContext {
		public JustificationContext justification() {
			return getRuleContext(JustificationContext.class,0);
		}
		public List<ContradictionContext> contradiction() {
			return getRuleContexts(ContradictionContext.class);
		}
		public ContradictionContext contradiction(int i) {
			return getRuleContext(ContradictionContext.class,i);
		}
		public ContradictionInferContext(InferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterContradictionInfer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitContradictionInfer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitContradictionInfer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentenceInferContext extends InferenceContext {
		public JustificationContext justification() {
			return getRuleContext(JustificationContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public SentenceInferContext(InferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterSentenceInfer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitSentenceInfer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitSentenceInfer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InferenceContext inference() throws RecognitionException {
		InferenceContext _localctx = new InferenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inference);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new ContradictionInferContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(68);
					contradiction();
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(73);
				justification();
				}
				break;
			case VARIABLE:
			case CONSTANT:
				_localctx = new SentenceInferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75);
					sentence(0);
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VARIABLE || _la==CONSTANT );
				setState(80);
				justification();
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
			setState(84);
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
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	 
		public SentenceContext() { }
		public void copyFrom(SentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisjunctionContext extends SentenceContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode DISJUNCTION() { return getToken(ProofGrammarParser.DISJUNCTION, 0); }
		public DisjunctionContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConjunctionContext extends SentenceContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode CONJUNCTION() { return getToken(ProofGrammarParser.CONJUNCTION, 0); }
		public ConjunctionContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomicContext extends SentenceContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomicContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitAtomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitAtomic(this);
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
			_localctx = new AtomicContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(87);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ConjunctionContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(89);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(90);
						match(CONJUNCTION);
						setState(91);
						sentence(3);
						}
						break;
					case 2:
						{
						_localctx = new DisjunctionContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(92);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(93);
						match(DISJUNCTION);
						setState(94);
						sentence(2);
						}
						break;
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(100);
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
		public JustificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justification; }
	 
		public JustificationContext() { }
		public void copyFrom(JustificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReitJustContext extends JustificationContext {
		public ReiterationContext reiteration() {
			return getRuleContext(ReiterationContext.class,0);
		}
		public ReitJustContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterReitJust(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitReitJust(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitReitJust(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElimJustContext extends JustificationContext {
		public EliminationContext elimination() {
			return getRuleContext(EliminationContext.class,0);
		}
		public ElimJustContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterElimJust(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitElimJust(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitElimJust(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PremiseJustContext extends JustificationContext {
		public PremiseContext premise() {
			return getRuleContext(PremiseContext.class,0);
		}
		public PremiseJustContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterPremiseJust(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitPremiseJust(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitPremiseJust(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntroJustContext extends JustificationContext {
		public IntroductionContext introduction() {
			return getRuleContext(IntroductionContext.class,0);
		}
		public IntroJustContext(JustificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterIntroJust(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitIntroJust(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitIntroJust(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JustificationContext justification() throws RecognitionException {
		JustificationContext _localctx = new JustificationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_justification);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PremiseJustContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				premise();
				}
				break;
			case 2:
				_localctx = new ReitJustContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				reiteration();
				}
				break;
			case 3:
				_localctx = new ElimJustContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				elimination();
				}
				break;
			case 4:
				_localctx = new IntroJustContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
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
			setState(108);
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
	public static class ReiterationContext extends ParserRuleContext {
		public SingleReferenceContext singleReference() {
			return getRuleContext(SingleReferenceContext.class,0);
		}
		public ReiterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reiteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterReiteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitReiteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitReiteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReiterationContext reiteration() throws RecognitionException {
		ReiterationContext _localctx = new ReiterationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_reiteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__3);
			setState(111);
			singleReference();
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
		public IntroductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_introduction; }
	 
		public IntroductionContext() { }
		public void copyFrom(IntroductionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisjunctionIntroContext extends IntroductionContext {
		public TerminalNode DISJUNCTION() { return getToken(ProofGrammarParser.DISJUNCTION, 0); }
		public SingleReferenceContext singleReference() {
			return getRuleContext(SingleReferenceContext.class,0);
		}
		public DisjunctionIntroContext(IntroductionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterDisjunctionIntro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitDisjunctionIntro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitDisjunctionIntro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConjunctionIntroContext extends IntroductionContext {
		public TerminalNode CONJUNCTION() { return getToken(ProofGrammarParser.CONJUNCTION, 0); }
		public List<SingleReferenceContext> singleReference() {
			return getRuleContexts(SingleReferenceContext.class);
		}
		public SingleReferenceContext singleReference(int i) {
			return getRuleContext(SingleReferenceContext.class,i);
		}
		public ConjunctionIntroContext(IntroductionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterConjunctionIntro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitConjunctionIntro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitConjunctionIntro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntroductionContext introduction() throws RecognitionException {
		IntroductionContext _localctx = new IntroductionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_introduction);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONJUNCTION:
				_localctx = new ConjunctionIntroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(CONJUNCTION);
				setState(114);
				match(T__4);
				setState(115);
				singleReference();
				setState(116);
				match(T__5);
				setState(117);
				singleReference();
				}
				break;
			case DISJUNCTION:
				_localctx = new DisjunctionIntroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(DISJUNCTION);
				setState(120);
				match(T__4);
				setState(121);
				singleReference();
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
	public static class EliminationContext extends ParserRuleContext {
		public EliminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elimination; }
	 
		public EliminationContext() { }
		public void copyFrom(EliminationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisjunctionElimContext extends EliminationContext {
		public SingleReferenceContext singleReference() {
			return getRuleContext(SingleReferenceContext.class,0);
		}
		public List<RangeReferenceContext> rangeReference() {
			return getRuleContexts(RangeReferenceContext.class);
		}
		public RangeReferenceContext rangeReference(int i) {
			return getRuleContext(RangeReferenceContext.class,i);
		}
		public List<TerminalNode> DISJUNCTION() { return getTokens(ProofGrammarParser.DISJUNCTION); }
		public TerminalNode DISJUNCTION(int i) {
			return getToken(ProofGrammarParser.DISJUNCTION, i);
		}
		public DisjunctionElimContext(EliminationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterDisjunctionElim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitDisjunctionElim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitDisjunctionElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConjunctionElimContext extends EliminationContext {
		public SingleReferenceContext singleReference() {
			return getRuleContext(SingleReferenceContext.class,0);
		}
		public List<TerminalNode> CONJUNCTION() { return getTokens(ProofGrammarParser.CONJUNCTION); }
		public TerminalNode CONJUNCTION(int i) {
			return getToken(ProofGrammarParser.CONJUNCTION, i);
		}
		public ConjunctionElimContext(EliminationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterConjunctionElim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitConjunctionElim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitConjunctionElim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EliminationContext elimination() throws RecognitionException {
		EliminationContext _localctx = new EliminationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elimination);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONJUNCTION:
				_localctx = new ConjunctionElimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					match(CONJUNCTION);
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONJUNCTION );
				setState(129);
				match(T__6);
				setState(130);
				singleReference();
				}
				break;
			case DISJUNCTION:
				_localctx = new DisjunctionElimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					match(DISJUNCTION);
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DISJUNCTION );
				setState(136);
				match(T__6);
				setState(137);
				singleReference();
				setState(138);
				match(T__5);
				setState(139);
				rangeReference();
				setState(140);
				match(T__5);
				setState(141);
				rangeReference();
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
	public static class SingleReferenceContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ProofGrammarParser.INT, 0); }
		public SingleReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterSingleReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitSingleReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitSingleReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleReferenceContext singleReference() throws RecognitionException {
		SingleReferenceContext _localctx = new SingleReferenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_singleReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
	public static class RangeReferenceContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ProofGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ProofGrammarParser.INT, i);
		}
		public RangeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterRangeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitRangeReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitRangeReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeReferenceContext rangeReference() throws RecognitionException {
		RangeReferenceContext _localctx = new RangeReferenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rangeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(INT);
			setState(148);
			match(T__7);
			setState(149);
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
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012\u0098\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0005\u0000%\b"+
		"\u0000\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004"+
		"\u0006F\b\u0006\u000b\u0006\f\u0006G\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0004\u0006M\b\u0006\u000b\u0006\f\u0006N\u0001\u0006\u0001\u0006\u0003"+
		"\u0006S\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b`\b\b\n\b\f\bc\t\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nk\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r{\b\r\u0001\u000e\u0004\u000e"+
		"~\b\u000e\u000b\u000e\f\u000e\u007f\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0004\u000e\u0085\b\u000e\u000b\u000e\f\u000e\u0086\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0090\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0000\u0001\u0010\u0011\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000"+
		"\u0001\u0001\u0000\r\u000e\u0096\u0000&\u0001\u0000\u0000\u0000\u0002"+
		"+\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u00069\u0001"+
		"\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000\u0000"+
		"\fR\u0001\u0000\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010V\u0001"+
		"\u0000\u0000\u0000\u0012d\u0001\u0000\u0000\u0000\u0014j\u0001\u0000\u0000"+
		"\u0000\u0016l\u0001\u0000\u0000\u0000\u0018n\u0001\u0000\u0000\u0000\u001a"+
		"z\u0001\u0000\u0000\u0000\u001c\u008f\u0001\u0000\u0000\u0000\u001e\u0091"+
		"\u0001\u0000\u0000\u0000 \u0093\u0001\u0000\u0000\u0000\"%\u0003\b\u0004"+
		"\u0000#%\u0003\u0002\u0001\u0000$\"\u0001\u0000\u0000\u0000$#\u0001\u0000"+
		"\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		")*\u0005\u0000\u0000\u0001*\u0001\u0001\u0000\u0000\u0000+0\u0003\u0004"+
		"\u0002\u0000,/\u0003\u0002\u0001\u0000-/\u0003\b\u0004\u0000.,\u0001\u0000"+
		"\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000034\u0003\u0006\u0003\u00004\u0003\u0001\u0000"+
		"\u0000\u000056\u0005\u000b\u0000\u000067\u0005\u0010\u0000\u000078\u0003"+
		"\b\u0004\u00008\u0005\u0001\u0000\u0000\u00009:\u0003\b\u0004\u0000:;"+
		"\u0005\f\u0000\u0000;<\u0005\u0010\u0000\u0000<\u0007\u0001\u0000\u0000"+
		"\u0000=>\u0003\n\u0005\u0000>?\u0003\f\u0006\u0000?@\u0005\u0010\u0000"+
		"\u0000@\t\u0001\u0000\u0000\u0000AB\u0005\u000f\u0000\u0000BC\u0005\u0001"+
		"\u0000\u0000C\u000b\u0001\u0000\u0000\u0000DF\u0003\u000e\u0007\u0000"+
		"ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0003\u0014"+
		"\n\u0000JS\u0001\u0000\u0000\u0000KM\u0003\u0010\b\u0000LK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0003\u0014\n\u0000QS\u0001"+
		"\u0000\u0000\u0000RE\u0001\u0000\u0000\u0000RL\u0001\u0000\u0000\u0000"+
		"S\r\u0001\u0000\u0000\u0000TU\u0005\u0002\u0000\u0000U\u000f\u0001\u0000"+
		"\u0000\u0000VW\u0006\b\uffff\uffff\u0000WX\u0003\u0012\t\u0000Xa\u0001"+
		"\u0000\u0000\u0000YZ\n\u0002\u0000\u0000Z[\u0005\t\u0000\u0000[`\u0003"+
		"\u0010\b\u0003\\]\n\u0001\u0000\u0000]^\u0005\n\u0000\u0000^`\u0003\u0010"+
		"\b\u0002_Y\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"b\u0011\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0007\u0000"+
		"\u0000\u0000e\u0013\u0001\u0000\u0000\u0000fk\u0003\u0016\u000b\u0000"+
		"gk\u0003\u0018\f\u0000hk\u0003\u001c\u000e\u0000ik\u0003\u001a\r\u0000"+
		"jf\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000k\u0015\u0001\u0000\u0000\u0000lm\u0005"+
		"\u0003\u0000\u0000m\u0017\u0001\u0000\u0000\u0000no\u0005\u0004\u0000"+
		"\u0000op\u0003\u001e\u000f\u0000p\u0019\u0001\u0000\u0000\u0000qr\u0005"+
		"\t\u0000\u0000rs\u0005\u0005\u0000\u0000st\u0003\u001e\u000f\u0000tu\u0005"+
		"\u0006\u0000\u0000uv\u0003\u001e\u000f\u0000v{\u0001\u0000\u0000\u0000"+
		"wx\u0005\n\u0000\u0000xy\u0005\u0005\u0000\u0000y{\u0003\u001e\u000f\u0000"+
		"zq\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000{\u001b\u0001\u0000"+
		"\u0000\u0000|~\u0005\t\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0007"+
		"\u0000\u0000\u0082\u0090\u0003\u001e\u000f\u0000\u0083\u0085\u0005\n\u0000"+
		"\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0007\u0000"+
		"\u0000\u0089\u008a\u0003\u001e\u000f\u0000\u008a\u008b\u0005\u0006\u0000"+
		"\u0000\u008b\u008c\u0003 \u0010\u0000\u008c\u008d\u0005\u0006\u0000\u0000"+
		"\u008d\u008e\u0003 \u0010\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f"+
		"}\u0001\u0000\u0000\u0000\u008f\u0084\u0001\u0000\u0000\u0000\u0090\u001d"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u000f\u0000\u0000\u0092\u001f"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u000f\u0000\u0000\u0094\u0095"+
		"\u0005\b\u0000\u0000\u0095\u0096\u0005\u000f\u0000\u0000\u0096!\u0001"+
		"\u0000\u0000\u0000\u000e$&.0GNR_ajz\u007f\u0086\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}