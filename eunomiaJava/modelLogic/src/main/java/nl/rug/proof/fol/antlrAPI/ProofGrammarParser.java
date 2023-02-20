// Generated from java-escape by ANTLR 4.11.1
package nl.rug.proof.fol.antlrAPI;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		CONJUNCTION=10, DISJUNCTION=11, ASSUME=12, QED=13, VARIABLE=14, CONSTANT=15, 
		INT=16, NEWLINE=17, WS=18, ATOM=19;
	public static final int
		RULE_proof = 0, RULE_subproof = 1, RULE_assume = 2, RULE_qed = 3, RULE_premiseLine = 4, 
		RULE_proofLine = 5, RULE_conclusionLine = 6, RULE_proofLineNum = 7, RULE_premiseInference = 8, 
		RULE_inference = 9, RULE_contradiction = 10, RULE_sentence = 11, RULE_atom = 12, 
		RULE_justification = 13, RULE_premise = 14, RULE_reiteration = 15, RULE_introduction = 16, 
		RULE_elimination = 17, RULE_singleReference = 18, RULE_rangeReference = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"proof", "subproof", "assume", "qed", "premiseLine", "proofLine", "conclusionLine", 
			"proofLineNum", "premiseInference", "inference", "contradiction", "sentence", 
			"atom", "justification", "premise", "reiteration", "introduction", "elimination", 
			"singleReference", "rangeReference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "' premise'", "'perp'", "'premise'", "'Reit: '", "'Intro: '", 
			"','", "'Elim: '", "'-'", null, null, "'assume'", "'qed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "CONJUNCTION", 
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
		public ConclusionLineContext conclusionLine() {
			return getRuleContext(ConclusionLineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ProofGrammarParser.EOF, 0); }
		public List<PremiseLineContext> premiseLine() {
			return getRuleContexts(PremiseLineContext.class);
		}
		public PremiseLineContext premiseLine(int i) {
			return getRuleContext(PremiseLineContext.class,i);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(40);
					premiseLine();
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(48);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(46);
						proofLine();
						}
						break;
					case ASSUME:
						{
						setState(47);
						subproof();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(53);
			conclusionLine();
			setState(54);
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
			setState(56);
			assume();
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(59);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSUME:
						{
						setState(57);
						subproof();
						}
						break;
					case INT:
						{
						setState(58);
						proofLine();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(64);
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
		public PremiseLineContext premiseLine() {
			return getRuleContext(PremiseLineContext.class,0);
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
			setState(66);
			match(ASSUME);
			setState(67);
			match(NEWLINE);
			setState(68);
			premiseLine();
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
		public ConclusionLineContext conclusionLine() {
			return getRuleContext(ConclusionLineContext.class,0);
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
			setState(70);
			conclusionLine();
			setState(71);
			match(QED);
			setState(72);
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
	public static class PremiseLineContext extends ParserRuleContext {
		public ProofLineNumContext proofLineNum() {
			return getRuleContext(ProofLineNumContext.class,0);
		}
		public PremiseInferenceContext premiseInference() {
			return getRuleContext(PremiseInferenceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ProofGrammarParser.NEWLINE, 0); }
		public PremiseLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_premiseLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterPremiseLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitPremiseLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitPremiseLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PremiseLineContext premiseLine() throws RecognitionException {
		PremiseLineContext _localctx = new PremiseLineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_premiseLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			proofLineNum();
			setState(75);
			premiseInference();
			setState(76);
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
		enterRule(_localctx, 10, RULE_proofLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			proofLineNum();
			setState(79);
			inference();
			setState(80);
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
	public static class ConclusionLineContext extends ParserRuleContext {
		public ProofLineNumContext proofLineNum() {
			return getRuleContext(ProofLineNumContext.class,0);
		}
		public InferenceContext inference() {
			return getRuleContext(InferenceContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ProofGrammarParser.NEWLINE, 0); }
		public ConclusionLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conclusionLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterConclusionLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitConclusionLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitConclusionLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConclusionLineContext conclusionLine() throws RecognitionException {
		ConclusionLineContext _localctx = new ConclusionLineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conclusionLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			proofLineNum();
			setState(83);
			inference();
			setState(84);
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
		enterRule(_localctx, 14, RULE_proofLineNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(INT);
			setState(87);
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
	public static class PremiseInferenceContext extends ParserRuleContext {
		public PremiseInferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_premiseInference; }
	 
		public PremiseInferenceContext() { }
		public void copyFrom(PremiseInferenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PremiseSentenceInferContext extends PremiseInferenceContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public PremiseSentenceInferContext(PremiseInferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterPremiseSentenceInfer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitPremiseSentenceInfer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitPremiseSentenceInfer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PremiseContradictionInferContext extends PremiseInferenceContext {
		public List<ContradictionContext> contradiction() {
			return getRuleContexts(ContradictionContext.class);
		}
		public ContradictionContext contradiction(int i) {
			return getRuleContext(ContradictionContext.class,i);
		}
		public PremiseContradictionInferContext(PremiseInferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterPremiseContradictionInfer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitPremiseContradictionInfer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitPremiseContradictionInfer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PremiseInferenceContext premiseInference() throws RecognitionException {
		PremiseInferenceContext _localctx = new PremiseInferenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_premiseInference);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new PremiseContradictionInferContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					contradiction();
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(94);
				match(T__1);
				}
				break;
			case VARIABLE:
			case CONSTANT:
				_localctx = new PremiseSentenceInferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					sentence(0);
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VARIABLE || _la==CONSTANT );
				setState(101);
				match(T__1);
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
		enterRule(_localctx, 18, RULE_inference);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new ContradictionInferContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(105);
					contradiction();
					}
					}
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(110);
				justification();
				}
				break;
			case VARIABLE:
			case CONSTANT:
				_localctx = new SentenceInferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(112);
					sentence(0);
					}
					}
					setState(115); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VARIABLE || _la==CONSTANT );
				setState(117);
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
		enterRule(_localctx, 20, RULE_contradiction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_sentence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomicContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(124);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(132);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ConjunctionContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(126);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(127);
						match(CONJUNCTION);
						setState(128);
						sentence(3);
						}
						break;
					case 2:
						{
						_localctx = new DisjunctionContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(129);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(130);
						match(DISJUNCTION);
						setState(131);
						sentence(2);
						}
						break;
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 24, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
		enterRule(_localctx, 26, RULE_justification);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ReitJustContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				reiteration();
				}
				break;
			case 2:
				_localctx = new ElimJustContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				elimination();
				}
				break;
			case 3:
				_localctx = new IntroJustContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
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
		enterRule(_localctx, 28, RULE_premise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__3);
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
		enterRule(_localctx, 30, RULE_reiteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__4);
			setState(147);
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
		enterRule(_localctx, 32, RULE_introduction);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONJUNCTION:
				_localctx = new ConjunctionIntroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(CONJUNCTION);
				setState(150);
				match(T__5);
				setState(151);
				singleReference();
				setState(152);
				match(T__6);
				setState(153);
				singleReference();
				}
				break;
			case DISJUNCTION:
				_localctx = new DisjunctionIntroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(DISJUNCTION);
				setState(156);
				match(T__5);
				setState(157);
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
		enterRule(_localctx, 34, RULE_elimination);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONJUNCTION:
				_localctx = new ConjunctionElimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(160);
					match(CONJUNCTION);
					}
					}
					setState(163); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONJUNCTION );
				setState(165);
				match(T__7);
				setState(166);
				singleReference();
				}
				break;
			case DISJUNCTION:
				_localctx = new DisjunctionElimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					match(DISJUNCTION);
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DISJUNCTION );
				setState(172);
				match(T__7);
				setState(173);
				singleReference();
				setState(174);
				match(T__6);
				setState(175);
				rangeReference();
				setState(176);
				match(T__6);
				setState(177);
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
		enterRule(_localctx, 36, RULE_singleReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
		enterRule(_localctx, 38, RULE_rangeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(INT);
			setState(184);
			match(T__8);
			setState(185);
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
		case 11:
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
		"\u0004\u0001\u0013\u00bc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000"+
		"\f\u0000-\t\u0000\u0001\u0000\u0001\u0000\u0005\u00001\b\u0000\n\u0000"+
		"\f\u00004\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001<\b\u0001\n\u0001\f\u0001?\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0004\b[\b\b\u000b\b\f\b\\\u0001\b\u0001\b\u0001\b\u0004"+
		"\bb\b\b\u000b\b\f\bc\u0001\b\u0001\b\u0003\bh\b\b\u0001\t\u0004\tk\b\t"+
		"\u000b\t\f\tl\u0001\t\u0001\t\u0001\t\u0004\tr\b\t\u000b\t\f\ts\u0001"+
		"\t\u0001\t\u0003\tx\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0085\b\u000b\n\u000b\f\u000b\u0088\t\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u008f\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u009f\b\u0010\u0001\u0011\u0004\u0011\u00a2\b\u0011\u000b"+
		"\u0011\f\u0011\u00a3\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u00a9"+
		"\b\u0011\u000b\u0011\f\u0011\u00aa\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00b4\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0000\u0001\u0016\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0001\u0001"+
		"\u0000\u000e\u000f\u00ba\u0000+\u0001\u0000\u0000\u0000\u00028\u0001\u0000"+
		"\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000"+
		"\bJ\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fR\u0001\u0000"+
		"\u0000\u0000\u000eV\u0001\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000"+
		"\u0012w\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000\u0000\u0016{"+
		"\u0001\u0000\u0000\u0000\u0018\u0089\u0001\u0000\u0000\u0000\u001a\u008e"+
		"\u0001\u0000\u0000\u0000\u001c\u0090\u0001\u0000\u0000\u0000\u001e\u0092"+
		"\u0001\u0000\u0000\u0000 \u009e\u0001\u0000\u0000\u0000\"\u00b3\u0001"+
		"\u0000\u0000\u0000$\u00b5\u0001\u0000\u0000\u0000&\u00b7\u0001\u0000\u0000"+
		"\u0000(*\u0003\b\u0004\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,2\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000.1\u0003\n\u0005\u0000/1\u0003\u0002"+
		"\u0001\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u000014\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"35\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0003\f\u0006\u0000"+
		"67\u0005\u0000\u0000\u00017\u0001\u0001\u0000\u0000\u00008=\u0003\u0004"+
		"\u0002\u00009<\u0003\u0002\u0001\u0000:<\u0003\n\u0005\u0000;9\u0001\u0000"+
		"\u0000\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000@A\u0003\u0006\u0003\u0000A\u0003\u0001\u0000"+
		"\u0000\u0000BC\u0005\f\u0000\u0000CD\u0005\u0011\u0000\u0000DE\u0003\b"+
		"\u0004\u0000E\u0005\u0001\u0000\u0000\u0000FG\u0003\f\u0006\u0000GH\u0005"+
		"\r\u0000\u0000HI\u0005\u0011\u0000\u0000I\u0007\u0001\u0000\u0000\u0000"+
		"JK\u0003\u000e\u0007\u0000KL\u0003\u0010\b\u0000LM\u0005\u0011\u0000\u0000"+
		"M\t\u0001\u0000\u0000\u0000NO\u0003\u000e\u0007\u0000OP\u0003\u0012\t"+
		"\u0000PQ\u0005\u0011\u0000\u0000Q\u000b\u0001\u0000\u0000\u0000RS\u0003"+
		"\u000e\u0007\u0000ST\u0003\u0012\t\u0000TU\u0005\u0011\u0000\u0000U\r"+
		"\u0001\u0000\u0000\u0000VW\u0005\u0010\u0000\u0000WX\u0005\u0001\u0000"+
		"\u0000X\u000f\u0001\u0000\u0000\u0000Y[\u0003\u0014\n\u0000ZY\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]"+
		"\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0005\u0002\u0000"+
		"\u0000_h\u0001\u0000\u0000\u0000`b\u0003\u0016\u000b\u0000a`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0005\u0002\u0000\u0000"+
		"fh\u0001\u0000\u0000\u0000gZ\u0001\u0000\u0000\u0000ga\u0001\u0000\u0000"+
		"\u0000h\u0011\u0001\u0000\u0000\u0000ik\u0003\u0014\n\u0000ji\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0003\u001a\r\u0000ox\u0001"+
		"\u0000\u0000\u0000pr\u0003\u0016\u000b\u0000qp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0003\u001a\r\u0000vx\u0001\u0000\u0000"+
		"\u0000wj\u0001\u0000\u0000\u0000wq\u0001\u0000\u0000\u0000x\u0013\u0001"+
		"\u0000\u0000\u0000yz\u0005\u0003\u0000\u0000z\u0015\u0001\u0000\u0000"+
		"\u0000{|\u0006\u000b\uffff\uffff\u0000|}\u0003\u0018\f\u0000}\u0086\u0001"+
		"\u0000\u0000\u0000~\u007f\n\u0002\u0000\u0000\u007f\u0080\u0005\n\u0000"+
		"\u0000\u0080\u0085\u0003\u0016\u000b\u0003\u0081\u0082\n\u0001\u0000\u0000"+
		"\u0082\u0083\u0005\u000b\u0000\u0000\u0083\u0085\u0003\u0016\u000b\u0002"+
		"\u0084~\u0001\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0085"+
		"\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0017\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0000\u0000\u0000\u008a"+
		"\u0019\u0001\u0000\u0000\u0000\u008b\u008f\u0003\u001e\u000f\u0000\u008c"+
		"\u008f\u0003\"\u0011\u0000\u008d\u008f\u0003 \u0010\u0000\u008e\u008b"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u001b\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u0004\u0000\u0000\u0091\u001d\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005\u0005\u0000\u0000\u0093\u0094\u0003$\u0012\u0000\u0094\u001f\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\n\u0000\u0000\u0096\u0097\u0005\u0006"+
		"\u0000\u0000\u0097\u0098\u0003$\u0012\u0000\u0098\u0099\u0005\u0007\u0000"+
		"\u0000\u0099\u009a\u0003$\u0012\u0000\u009a\u009f\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\u000b\u0000\u0000\u009c\u009d\u0005\u0006\u0000\u0000"+
		"\u009d\u009f\u0003$\u0012\u0000\u009e\u0095\u0001\u0000\u0000\u0000\u009e"+
		"\u009b\u0001\u0000\u0000\u0000\u009f!\u0001\u0000\u0000\u0000\u00a0\u00a2"+
		"\u0005\n\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"\b\u0000\u0000\u00a6\u00b4\u0003$\u0012\u0000\u00a7\u00a9\u0005\u000b"+
		"\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\b\u0000"+
		"\u0000\u00ad\u00ae\u0003$\u0012\u0000\u00ae\u00af\u0005\u0007\u0000\u0000"+
		"\u00af\u00b0\u0003&\u0013\u0000\u00b0\u00b1\u0005\u0007\u0000\u0000\u00b1"+
		"\u00b2\u0003&\u0013\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00a8\u0001\u0000\u0000\u0000\u00b4#\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005\u0010\u0000\u0000\u00b6%\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0010\u0000\u0000\u00b8\u00b9\u0005\t\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0010\u0000\u0000\u00ba\'\u0001\u0000\u0000\u0000"+
		"\u0012+02;=\\cglsw\u0084\u0086\u008e\u009e\u00a3\u00aa\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}