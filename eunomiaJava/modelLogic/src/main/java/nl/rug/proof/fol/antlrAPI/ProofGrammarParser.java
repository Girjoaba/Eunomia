// Generated from D:/CompSci/JavaCode/Eunomia/eunomiaJava/modelLogic/src/main/java/nl/rug/proof/fol/grammar\ProofGrammar.g4 by ANTLR 4.12.0
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
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, VARIABLE=11, CONSTANT=12, ATOM=13, NEGATION=14, CONTRADICTION=15, 
		CONJUNCTION=16, DISJUNCTION=17, IDENTITY=18, IMPLICATION=19, BICONDITIONAL=20, 
		FORALL=21, EXISTS=22, PREMISE=23, ASSUME=24, QED=25, INT=26, NEWLINE=27, 
		WS=28;
	public static final int
		RULE_proof = 0, RULE_subproof = 1, RULE_assume = 2, RULE_qed = 3, RULE_premiseLine = 4, 
		RULE_proofLine = 5, RULE_conclusionLine = 6, RULE_constantIntroLine = 7, 
		RULE_proofLineNum = 8, RULE_premiseInference = 9, RULE_inference = 10, 
		RULE_contradiction = 11, RULE_sentence = 12, RULE_premise = 13, RULE_justification = 14, 
		RULE_reiteration = 15, RULE_introduction = 16, RULE_elimination = 17, 
		RULE_singleReference = 18, RULE_rangeReference = 19, RULE_boxedConstant = 20, 
		RULE_function = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"proof", "subproof", "assume", "qed", "premiseLine", "proofLine", "conclusionLine", 
			"constantIntroLine", "proofLineNum", "premiseInference", "inference", 
			"contradiction", "sentence", "premise", "justification", "reiteration", 
			"introduction", "elimination", "singleReference", "rangeReference", "boxedConstant", 
			"function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "'Reit: '", "'Intro: '", "','", "'Intro'", 
			"'Elim: '", "'-'", "'|'", null, null, null, "'\\u00C2\\u00AC'", "'\\u00E2\\u0178\\u201A'", 
			"'\\u00E2\\u02C6\\u00A7'", "'\\u00E2\\u02C6\\u00A8'", "'=='", "'\\u00E2\\u2020\\u2019'", 
			"'\\u00E2\\u2020\\u201D'", "'\\u00E2\\u02C6\\u20AC'", "'\\u00E2\\u02C6\\u0192'", 
			"'premise'", "'assume'", "'qed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "VARIABLE", 
			"CONSTANT", "ATOM", "NEGATION", "CONTRADICTION", "CONJUNCTION", "DISJUNCTION", 
			"IDENTITY", "IMPLICATION", "BICONDITIONAL", "FORALL", "EXISTS", "PREMISE", 
			"ASSUME", "QED", "INT", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "ProofGrammar.g4"; }

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
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					premiseLine();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(52);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(50);
						proofLine();
						}
						break;
					case ASSUME:
						{
						setState(51);
						subproof();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(57);
			conclusionLine();
			setState(58);
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
			setState(60);
			assume();
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(63);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSUME:
						{
						setState(61);
						subproof();
						}
						break;
					case INT:
						{
						setState(62);
						proofLine();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(68);
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
		public ConstantIntroLineContext constantIntroLine() {
			return getRuleContext(ConstantIntroLineContext.class,0);
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
			setState(70);
			match(ASSUME);
			setState(71);
			match(NEWLINE);
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(72);
				premiseLine();
				}
				break;
			case 2:
				{
				setState(73);
				constantIntroLine();
				}
				break;
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
			setState(76);
			conclusionLine();
			setState(77);
			match(QED);
			setState(78);
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
			setState(80);
			proofLineNum();
			setState(81);
			premiseInference();
			setState(82);
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
			setState(84);
			proofLineNum();
			setState(85);
			inference();
			setState(86);
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
			setState(88);
			proofLineNum();
			setState(89);
			inference();
			setState(90);
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
	public static class ConstantIntroLineContext extends ParserRuleContext {
		public ProofLineNumContext proofLineNum() {
			return getRuleContext(ProofLineNumContext.class,0);
		}
		public BoxedConstantContext boxedConstant() {
			return getRuleContext(BoxedConstantContext.class,0);
		}
		public PremiseContext premise() {
			return getRuleContext(PremiseContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ProofGrammarParser.NEWLINE, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ConstantIntroLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantIntroLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterConstantIntroLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitConstantIntroLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitConstantIntroLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantIntroLineContext constantIntroLine() throws RecognitionException {
		ConstantIntroLineContext _localctx = new ConstantIntroLineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantIntroLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			proofLineNum();
			setState(93);
			boxedConstant();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6316036L) != 0)) {
				{
				setState(94);
				sentence(0);
				}
			}

			setState(97);
			premise();
			setState(98);
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
		enterRule(_localctx, 16, RULE_proofLineNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(INT);
			setState(101);
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
		public PremiseContext premise() {
			return getRuleContext(PremiseContext.class,0);
		}
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
		public PremiseContext premise() {
			return getRuleContext(PremiseContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_premiseInference);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRADICTION:
				_localctx = new PremiseContradictionInferContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					contradiction();
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONTRADICTION );
				setState(108);
				premise();
				}
				break;
			case T__1:
			case ATOM:
			case NEGATION:
			case FORALL:
			case EXISTS:
				_localctx = new PremiseSentenceInferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					sentence(0);
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 6316036L) != 0) );
				setState(115);
				premise();
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
		enterRule(_localctx, 20, RULE_inference);
		try {
			int _alt;
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRADICTION:
				_localctx = new ContradictionInferContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(119);
						contradiction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(122); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(124);
				justification();
				}
				break;
			case T__1:
			case ATOM:
			case NEGATION:
			case FORALL:
			case EXISTS:
				_localctx = new SentenceInferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(126);
						sentence(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(129); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(131);
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
		public TerminalNode CONTRADICTION() { return getToken(ProofGrammarParser.CONTRADICTION, 0); }
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
		enterRule(_localctx, 22, RULE_contradiction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(CONTRADICTION);
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
	public static class NormalSentenceContext extends SentenceContext {
		public TerminalNode ATOM() { return getToken(ProofGrammarParser.ATOM, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode FORALL() { return getToken(ProofGrammarParser.FORALL, 0); }
		public TerminalNode VARIABLE() { return getToken(ProofGrammarParser.VARIABLE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode EXISTS() { return getToken(ProofGrammarParser.EXISTS, 0); }
		public TerminalNode NEGATION() { return getToken(ProofGrammarParser.NEGATION, 0); }
		public TerminalNode CONJUNCTION() { return getToken(ProofGrammarParser.CONJUNCTION, 0); }
		public TerminalNode DISJUNCTION() { return getToken(ProofGrammarParser.DISJUNCTION, 0); }
		public TerminalNode IDENTITY() { return getToken(ProofGrammarParser.IDENTITY, 0); }
		public TerminalNode IMPLICATION() { return getToken(ProofGrammarParser.IMPLICATION, 0); }
		public TerminalNode BICONDITIONAL() { return getToken(ProofGrammarParser.BICONDITIONAL, 0); }
		public NormalSentenceContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterNormalSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitNormalSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitNormalSentence(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesSentenceContext extends SentenceContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ParenthesesSentenceContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterParenthesesSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitParenthesesSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitParenthesesSentence(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_sentence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(138);
				match(ATOM);
				}
				break;
			case 2:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				function();
				}
				break;
			case 3:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(FORALL);
				setState(141);
				match(VARIABLE);
				setState(142);
				sentence(9);
				}
				break;
			case 4:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(EXISTS);
				setState(144);
				match(VARIABLE);
				setState(145);
				sentence(8);
				}
				break;
			case 5:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(NEGATION);
				setState(147);
				sentence(7);
				}
				break;
			case 6:
				{
				_localctx = new ParenthesesSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(T__1);
				setState(149);
				sentence(0);
				setState(150);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(154);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(155);
						match(CONJUNCTION);
						setState(156);
						sentence(6);
						}
						break;
					case 2:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(157);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(158);
						match(DISJUNCTION);
						setState(159);
						sentence(5);
						}
						break;
					case 3:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(160);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(161);
						match(IDENTITY);
						setState(162);
						sentence(4);
						}
						break;
					case 4:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(163);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(164);
						match(IMPLICATION);
						setState(165);
						sentence(3);
						}
						break;
					case 5:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(166);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(167);
						match(BICONDITIONAL);
						setState(168);
						sentence(2);
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class PremiseContext extends ParserRuleContext {
		public TerminalNode PREMISE() { return getToken(ProofGrammarParser.PREMISE, 0); }
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
		enterRule(_localctx, 26, RULE_premise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(PREMISE);
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
		enterRule(_localctx, 28, RULE_justification);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ReitJustContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				reiteration();
				}
				break;
			case 2:
				_localctx = new ElimJustContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				elimination();
				}
				break;
			case 3:
				_localctx = new IntroJustContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
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
			setState(181);
			match(T__3);
			setState(182);
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
	public static class ExistsIntroContext extends IntroductionContext {
		public TerminalNode EXISTS() { return getToken(ProofGrammarParser.EXISTS, 0); }
		public SingleReferenceContext singleReference() {
			return getRuleContext(SingleReferenceContext.class,0);
		}
		public ExistsIntroContext(IntroductionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterExistsIntro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitExistsIntro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitExistsIntro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentityIntroContext extends IntroductionContext {
		public TerminalNode IDENTITY() { return getToken(ProofGrammarParser.IDENTITY, 0); }
		public IdentityIntroContext(IntroductionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterIdentityIntro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitIdentityIntro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitIdentityIntro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContradictionIntroContext extends IntroductionContext {
		public TerminalNode CONTRADICTION() { return getToken(ProofGrammarParser.CONTRADICTION, 0); }
		public List<SingleReferenceContext> singleReference() {
			return getRuleContexts(SingleReferenceContext.class);
		}
		public SingleReferenceContext singleReference(int i) {
			return getRuleContext(SingleReferenceContext.class,i);
		}
		public ContradictionIntroContext(IntroductionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterContradictionIntro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitContradictionIntro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitContradictionIntro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImplicationIntroContext extends IntroductionContext {
		public TerminalNode IMPLICATION() { return getToken(ProofGrammarParser.IMPLICATION, 0); }
		public RangeReferenceContext rangeReference() {
			return getRuleContext(RangeReferenceContext.class,0);
		}
		public ImplicationIntroContext(IntroductionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterImplicationIntro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitImplicationIntro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitImplicationIntro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForallIntroContext extends IntroductionContext {
		public TerminalNode FORALL() { return getToken(ProofGrammarParser.FORALL, 0); }
		public RangeReferenceContext rangeReference() {
			return getRuleContext(RangeReferenceContext.class,0);
		}
		public ForallIntroContext(IntroductionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterForallIntro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitForallIntro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitForallIntro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BiconditionalIntroContext extends IntroductionContext {
		public TerminalNode BICONDITIONAL() { return getToken(ProofGrammarParser.BICONDITIONAL, 0); }
		public List<RangeReferenceContext> rangeReference() {
			return getRuleContexts(RangeReferenceContext.class);
		}
		public RangeReferenceContext rangeReference(int i) {
			return getRuleContext(RangeReferenceContext.class,i);
		}
		public BiconditionalIntroContext(IntroductionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterBiconditionalIntro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitBiconditionalIntro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitBiconditionalIntro(this);
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
	@SuppressWarnings("CheckReturnValue")
	public static class NegationIntroContext extends IntroductionContext {
		public TerminalNode NEGATION() { return getToken(ProofGrammarParser.NEGATION, 0); }
		public RangeReferenceContext rangeReference() {
			return getRuleContext(RangeReferenceContext.class,0);
		}
		public NegationIntroContext(IntroductionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterNegationIntro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitNegationIntro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitNegationIntro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntroductionContext introduction() throws RecognitionException {
		IntroductionContext _localctx = new IntroductionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_introduction);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				_localctx = new NegationIntroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(NEGATION);
				setState(185);
				match(T__4);
				setState(186);
				rangeReference();
				}
				break;
			case CONTRADICTION:
				_localctx = new ContradictionIntroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(CONTRADICTION);
				setState(188);
				match(T__4);
				setState(189);
				singleReference();
				setState(190);
				match(T__5);
				setState(191);
				singleReference();
				}
				break;
			case CONJUNCTION:
				_localctx = new ConjunctionIntroContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(CONJUNCTION);
				setState(194);
				match(T__4);
				setState(195);
				singleReference();
				setState(196);
				match(T__5);
				setState(197);
				singleReference();
				}
				break;
			case DISJUNCTION:
				_localctx = new DisjunctionIntroContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(DISJUNCTION);
				setState(200);
				match(T__4);
				setState(201);
				singleReference();
				}
				break;
			case IDENTITY:
				_localctx = new IdentityIntroContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(IDENTITY);
				setState(203);
				match(T__6);
				}
				break;
			case IMPLICATION:
				_localctx = new ImplicationIntroContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				match(IMPLICATION);
				setState(205);
				match(T__4);
				setState(206);
				rangeReference();
				}
				break;
			case BICONDITIONAL:
				_localctx = new BiconditionalIntroContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				match(BICONDITIONAL);
				setState(208);
				match(T__4);
				setState(209);
				rangeReference();
				setState(210);
				match(T__5);
				setState(211);
				rangeReference();
				}
				break;
			case FORALL:
				_localctx = new ForallIntroContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(213);
				match(FORALL);
				setState(214);
				match(T__4);
				setState(215);
				rangeReference();
				}
				break;
			case EXISTS:
				_localctx = new ExistsIntroContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(216);
				match(EXISTS);
				setState(217);
				match(T__4);
				setState(218);
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
	public static class ImplicationElimContext extends EliminationContext {
		public TerminalNode IMPLICATION() { return getToken(ProofGrammarParser.IMPLICATION, 0); }
		public List<SingleReferenceContext> singleReference() {
			return getRuleContexts(SingleReferenceContext.class);
		}
		public SingleReferenceContext singleReference(int i) {
			return getRuleContext(SingleReferenceContext.class,i);
		}
		public ImplicationElimContext(EliminationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterImplicationElim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitImplicationElim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitImplicationElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForallElimContext extends EliminationContext {
		public TerminalNode FORALL() { return getToken(ProofGrammarParser.FORALL, 0); }
		public SingleReferenceContext singleReference() {
			return getRuleContext(SingleReferenceContext.class,0);
		}
		public ForallElimContext(EliminationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterForallElim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitForallElim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitForallElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContradictionElimContext extends EliminationContext {
		public TerminalNode CONTRADICTION() { return getToken(ProofGrammarParser.CONTRADICTION, 0); }
		public SingleReferenceContext singleReference() {
			return getRuleContext(SingleReferenceContext.class,0);
		}
		public ContradictionElimContext(EliminationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterContradictionElim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitContradictionElim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitContradictionElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegationElimContext extends EliminationContext {
		public TerminalNode NEGATION() { return getToken(ProofGrammarParser.NEGATION, 0); }
		public SingleReferenceContext singleReference() {
			return getRuleContext(SingleReferenceContext.class,0);
		}
		public NegationElimContext(EliminationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterNegationElim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitNegationElim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitNegationElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisjunctionElimContext extends EliminationContext {
		public TerminalNode DISJUNCTION() { return getToken(ProofGrammarParser.DISJUNCTION, 0); }
		public SingleReferenceContext singleReference() {
			return getRuleContext(SingleReferenceContext.class,0);
		}
		public List<RangeReferenceContext> rangeReference() {
			return getRuleContexts(RangeReferenceContext.class);
		}
		public RangeReferenceContext rangeReference(int i) {
			return getRuleContext(RangeReferenceContext.class,i);
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
	public static class ExistsElimContext extends EliminationContext {
		public TerminalNode EXISTS() { return getToken(ProofGrammarParser.EXISTS, 0); }
		public SingleReferenceContext singleReference() {
			return getRuleContext(SingleReferenceContext.class,0);
		}
		public RangeReferenceContext rangeReference() {
			return getRuleContext(RangeReferenceContext.class,0);
		}
		public ExistsElimContext(EliminationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterExistsElim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitExistsElim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitExistsElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentityElimContext extends EliminationContext {
		public TerminalNode IDENTITY() { return getToken(ProofGrammarParser.IDENTITY, 0); }
		public List<SingleReferenceContext> singleReference() {
			return getRuleContexts(SingleReferenceContext.class);
		}
		public SingleReferenceContext singleReference(int i) {
			return getRuleContext(SingleReferenceContext.class,i);
		}
		public IdentityElimContext(EliminationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterIdentityElim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitIdentityElim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitIdentityElim(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConjunctionElimContext extends EliminationContext {
		public TerminalNode CONJUNCTION() { return getToken(ProofGrammarParser.CONJUNCTION, 0); }
		public SingleReferenceContext singleReference() {
			return getRuleContext(SingleReferenceContext.class,0);
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
	@SuppressWarnings("CheckReturnValue")
	public static class BiconditionalElimContext extends EliminationContext {
		public TerminalNode BICONDITIONAL() { return getToken(ProofGrammarParser.BICONDITIONAL, 0); }
		public List<SingleReferenceContext> singleReference() {
			return getRuleContexts(SingleReferenceContext.class);
		}
		public SingleReferenceContext singleReference(int i) {
			return getRuleContext(SingleReferenceContext.class,i);
		}
		public BiconditionalElimContext(EliminationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterBiconditionalElim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitBiconditionalElim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitBiconditionalElim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EliminationContext elimination() throws RecognitionException {
		EliminationContext _localctx = new EliminationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elimination);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				_localctx = new NegationElimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(NEGATION);
				setState(222);
				match(T__7);
				setState(223);
				singleReference();
				}
				break;
			case CONTRADICTION:
				_localctx = new ContradictionElimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(CONTRADICTION);
				setState(225);
				match(T__7);
				setState(226);
				singleReference();
				}
				break;
			case CONJUNCTION:
				_localctx = new ConjunctionElimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(CONJUNCTION);
				setState(228);
				match(T__7);
				setState(229);
				singleReference();
				}
				break;
			case DISJUNCTION:
				_localctx = new DisjunctionElimContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(DISJUNCTION);
				setState(231);
				match(T__7);
				setState(232);
				singleReference();
				setState(233);
				match(T__5);
				setState(234);
				rangeReference();
				setState(235);
				match(T__5);
				setState(236);
				rangeReference();
				}
				break;
			case IDENTITY:
				_localctx = new IdentityElimContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(IDENTITY);
				setState(239);
				match(T__7);
				setState(240);
				singleReference();
				setState(241);
				match(T__5);
				setState(242);
				singleReference();
				}
				break;
			case IMPLICATION:
				_localctx = new ImplicationElimContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				match(IMPLICATION);
				setState(245);
				match(T__7);
				setState(246);
				singleReference();
				setState(247);
				match(T__5);
				setState(248);
				singleReference();
				}
				break;
			case BICONDITIONAL:
				_localctx = new BiconditionalElimContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(250);
				match(BICONDITIONAL);
				setState(251);
				match(T__7);
				setState(252);
				singleReference();
				setState(253);
				match(T__5);
				setState(254);
				singleReference();
				}
				break;
			case FORALL:
				_localctx = new ForallElimContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(256);
				match(FORALL);
				setState(257);
				match(T__7);
				setState(258);
				singleReference();
				}
				break;
			case EXISTS:
				_localctx = new ExistsElimContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(259);
				match(EXISTS);
				setState(260);
				match(T__7);
				setState(261);
				singleReference();
				setState(262);
				match(T__5);
				setState(263);
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
			setState(267);
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
			setState(269);
			match(INT);
			setState(270);
			match(T__8);
			setState(271);
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
	public static class BoxedConstantContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(ProofGrammarParser.CONSTANT, 0); }
		public BoxedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterBoxedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitBoxedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitBoxedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoxedConstantContext boxedConstant() throws RecognitionException {
		BoxedConstantContext _localctx = new BoxedConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boxedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__9);
			setState(274);
			match(CONSTANT);
			setState(275);
			match(T__9);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ATOM() { return getToken(ProofGrammarParser.ATOM, 0); }
		public TerminalNode VARIABLE() { return getToken(ProofGrammarParser.VARIABLE, 0); }
		public TerminalNode CONSTANT() { return getToken(ProofGrammarParser.CONSTANT, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProofGrammarVisitor ) return ((ProofGrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ATOM);
			setState(278);
			match(T__1);
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==CONSTANT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(280);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return sentence_sempred((SentenceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean sentence_sempred(SentenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u011b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u00005\b\u0000\n\u0000\f\u00008\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002K\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007`\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0004\ti\b\t\u000b\t\f\tj\u0001\t\u0001\t\u0001"+
		"\t\u0004\tp\b\t\u000b\t\f\tq\u0001\t\u0001\t\u0003\tv\b\t\u0001\n\u0004"+
		"\ny\b\n\u000b\n\f\nz\u0001\n\u0001\n\u0001\n\u0004\n\u0080\b\n\u000b\n"+
		"\f\n\u0081\u0001\n\u0001\n\u0003\n\u0086\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0099\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00aa\b\f\n\f\f\f\u00ad\t\f"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b4"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00dc\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u010a\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0000\u0001\u0018\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0001\u0001\u0000"+
		"\u000b\f\u012d\u0000/\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000"+
		"\u0000\u0004F\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\b"+
		"P\u0001\u0000\u0000\u0000\nT\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000"+
		"\u0000\u000e\\\u0001\u0000\u0000\u0000\u0010d\u0001\u0000\u0000\u0000"+
		"\u0012u\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016"+
		"\u0087\u0001\u0000\u0000\u0000\u0018\u0098\u0001\u0000\u0000\u0000\u001a"+
		"\u00ae\u0001\u0000\u0000\u0000\u001c\u00b3\u0001\u0000\u0000\u0000\u001e"+
		"\u00b5\u0001\u0000\u0000\u0000 \u00db\u0001\u0000\u0000\u0000\"\u0109"+
		"\u0001\u0000\u0000\u0000$\u010b\u0001\u0000\u0000\u0000&\u010d\u0001\u0000"+
		"\u0000\u0000(\u0111\u0001\u0000\u0000\u0000*\u0115\u0001\u0000\u0000\u0000"+
		",.\u0003\b\u0004\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000006\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000025\u0003\n\u0005\u000035\u0003\u0002\u0001"+
		"\u000042\u0001\u0000\u0000\u000043\u0001\u0000\u0000\u000058\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0003\f\u0006\u0000:;\u0005"+
		"\u0000\u0000\u0001;\u0001\u0001\u0000\u0000\u0000<A\u0003\u0004\u0002"+
		"\u0000=@\u0003\u0002\u0001\u0000>@\u0003\n\u0005\u0000?=\u0001\u0000\u0000"+
		"\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000DE\u0003\u0006\u0003\u0000E\u0003\u0001\u0000\u0000"+
		"\u0000FG\u0005\u0018\u0000\u0000GJ\u0005\u001b\u0000\u0000HK\u0003\b\u0004"+
		"\u0000IK\u0003\u000e\u0007\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000K\u0005\u0001\u0000\u0000\u0000LM\u0003\f\u0006\u0000MN\u0005"+
		"\u0019\u0000\u0000NO\u0005\u001b\u0000\u0000O\u0007\u0001\u0000\u0000"+
		"\u0000PQ\u0003\u0010\b\u0000QR\u0003\u0012\t\u0000RS\u0005\u001b\u0000"+
		"\u0000S\t\u0001\u0000\u0000\u0000TU\u0003\u0010\b\u0000UV\u0003\u0014"+
		"\n\u0000VW\u0005\u001b\u0000\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0003"+
		"\u0010\b\u0000YZ\u0003\u0014\n\u0000Z[\u0005\u001b\u0000\u0000[\r\u0001"+
		"\u0000\u0000\u0000\\]\u0003\u0010\b\u0000]_\u0003(\u0014\u0000^`\u0003"+
		"\u0018\f\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ab\u0003\u001a\r\u0000bc\u0005\u001b\u0000\u0000c\u000f"+
		"\u0001\u0000\u0000\u0000de\u0005\u001a\u0000\u0000ef\u0005\u0001\u0000"+
		"\u0000f\u0011\u0001\u0000\u0000\u0000gi\u0003\u0016\u000b\u0000hg\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0003\u001a\r\u0000"+
		"mv\u0001\u0000\u0000\u0000np\u0003\u0018\f\u0000on\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000st\u0003\u001a\r\u0000tv\u0001\u0000\u0000"+
		"\u0000uh\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000\u0000v\u0013\u0001"+
		"\u0000\u0000\u0000wy\u0003\u0016\u000b\u0000xw\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0003\u001c\u000e\u0000}\u0086\u0001"+
		"\u0000\u0000\u0000~\u0080\u0003\u0018\f\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0003\u001c\u000e\u0000\u0084\u0086\u0001\u0000\u0000"+
		"\u0000\u0085x\u0001\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000"+
		"\u0086\u0015\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u000f\u0000\u0000"+
		"\u0088\u0017\u0001\u0000\u0000\u0000\u0089\u008a\u0006\f\uffff\uffff\u0000"+
		"\u008a\u0099\u0005\r\u0000\u0000\u008b\u0099\u0003*\u0015\u0000\u008c"+
		"\u008d\u0005\u0015\u0000\u0000\u008d\u008e\u0005\u000b\u0000\u0000\u008e"+
		"\u0099\u0003\u0018\f\t\u008f\u0090\u0005\u0016\u0000\u0000\u0090\u0091"+
		"\u0005\u000b\u0000\u0000\u0091\u0099\u0003\u0018\f\b\u0092\u0093\u0005"+
		"\u000e\u0000\u0000\u0093\u0099\u0003\u0018\f\u0007\u0094\u0095\u0005\u0002"+
		"\u0000\u0000\u0095\u0096\u0003\u0018\f\u0000\u0096\u0097\u0005\u0003\u0000"+
		"\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0089\u0001\u0000\u0000"+
		"\u0000\u0098\u008b\u0001\u0000\u0000\u0000\u0098\u008c\u0001\u0000\u0000"+
		"\u0000\u0098\u008f\u0001\u0000\u0000\u0000\u0098\u0092\u0001\u0000\u0000"+
		"\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0099\u00ab\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\n\u0005\u0000\u0000\u009b\u009c\u0005\u0010\u0000\u0000"+
		"\u009c\u00aa\u0003\u0018\f\u0006\u009d\u009e\n\u0004\u0000\u0000\u009e"+
		"\u009f\u0005\u0011\u0000\u0000\u009f\u00aa\u0003\u0018\f\u0005\u00a0\u00a1"+
		"\n\u0003\u0000\u0000\u00a1\u00a2\u0005\u0012\u0000\u0000\u00a2\u00aa\u0003"+
		"\u0018\f\u0004\u00a3\u00a4\n\u0002\u0000\u0000\u00a4\u00a5\u0005\u0013"+
		"\u0000\u0000\u00a5\u00aa\u0003\u0018\f\u0003\u00a6\u00a7\n\u0001\u0000"+
		"\u0000\u00a7\u00a8\u0005\u0014\u0000\u0000\u00a8\u00aa\u0003\u0018\f\u0002"+
		"\u00a9\u009a\u0001\u0000\u0000\u0000\u00a9\u009d\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a0\u0001\u0000\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a6\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\u0017\u0000\u0000\u00af\u001b\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b4\u0003\u001e\u000f\u0000\u00b1\u00b4\u0003\"\u0011\u0000\u00b2"+
		"\u00b4\u0003 \u0010\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u001d"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0004\u0000\u0000\u00b6\u00b7"+
		"\u0003$\u0012\u0000\u00b7\u001f\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005"+
		"\u000e\u0000\u0000\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba\u00dc\u0003"+
		"&\u0013\u0000\u00bb\u00bc\u0005\u000f\u0000\u0000\u00bc\u00bd\u0005\u0005"+
		"\u0000\u0000\u00bd\u00be\u0003$\u0012\u0000\u00be\u00bf\u0005\u0006\u0000"+
		"\u0000\u00bf\u00c0\u0003$\u0012\u0000\u00c0\u00dc\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0005\u0010\u0000\u0000\u00c2\u00c3\u0005\u0005\u0000\u0000"+
		"\u00c3\u00c4\u0003$\u0012\u0000\u00c4\u00c5\u0005\u0006\u0000\u0000\u00c5"+
		"\u00c6\u0003$\u0012\u0000\u00c6\u00dc\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005\u0011\u0000\u0000\u00c8\u00c9\u0005\u0005\u0000\u0000\u00c9\u00dc"+
		"\u0003$\u0012\u0000\u00ca\u00cb\u0005\u0012\u0000\u0000\u00cb\u00dc\u0005"+
		"\u0007\u0000\u0000\u00cc\u00cd\u0005\u0013\u0000\u0000\u00cd\u00ce\u0005"+
		"\u0005\u0000\u0000\u00ce\u00dc\u0003&\u0013\u0000\u00cf\u00d0\u0005\u0014"+
		"\u0000\u0000\u00d0\u00d1\u0005\u0005\u0000\u0000\u00d1\u00d2\u0003&\u0013"+
		"\u0000\u00d2\u00d3\u0005\u0006\u0000\u0000\u00d3\u00d4\u0003&\u0013\u0000"+
		"\u00d4\u00dc\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0015\u0000\u0000"+
		"\u00d6\u00d7\u0005\u0005\u0000\u0000\u00d7\u00dc\u0003&\u0013\u0000\u00d8"+
		"\u00d9\u0005\u0016\u0000\u0000\u00d9\u00da\u0005\u0005\u0000\u0000\u00da"+
		"\u00dc\u0003$\u0012\u0000\u00db\u00b8\u0001\u0000\u0000\u0000\u00db\u00bb"+
		"\u0001\u0000\u0000\u0000\u00db\u00c1\u0001\u0000\u0000\u0000\u00db\u00c7"+
		"\u0001\u0000\u0000\u0000\u00db\u00ca\u0001\u0000\u0000\u0000\u00db\u00cc"+
		"\u0001\u0000\u0000\u0000\u00db\u00cf\u0001\u0000\u0000\u0000\u00db\u00d5"+
		"\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00dc!\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005\u000e\u0000\u0000\u00de\u00df\u0005"+
		"\b\u0000\u0000\u00df\u010a\u0003$\u0012\u0000\u00e0\u00e1\u0005\u000f"+
		"\u0000\u0000\u00e1\u00e2\u0005\b\u0000\u0000\u00e2\u010a\u0003$\u0012"+
		"\u0000\u00e3\u00e4\u0005\u0010\u0000\u0000\u00e4\u00e5\u0005\b\u0000\u0000"+
		"\u00e5\u010a\u0003$\u0012\u0000\u00e6\u00e7\u0005\u0011\u0000\u0000\u00e7"+
		"\u00e8\u0005\b\u0000\u0000\u00e8\u00e9\u0003$\u0012\u0000\u00e9\u00ea"+
		"\u0005\u0006\u0000\u0000\u00ea\u00eb\u0003&\u0013\u0000\u00eb\u00ec\u0005"+
		"\u0006\u0000\u0000\u00ec\u00ed\u0003&\u0013\u0000\u00ed\u010a\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005\u0012\u0000\u0000\u00ef\u00f0\u0005\b\u0000"+
		"\u0000\u00f0\u00f1\u0003$\u0012\u0000\u00f1\u00f2\u0005\u0006\u0000\u0000"+
		"\u00f2\u00f3\u0003$\u0012\u0000\u00f3\u010a\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005\u0013\u0000\u0000\u00f5\u00f6\u0005\b\u0000\u0000\u00f6\u00f7"+
		"\u0003$\u0012\u0000\u00f7\u00f8\u0005\u0006\u0000\u0000\u00f8\u00f9\u0003"+
		"$\u0012\u0000\u00f9\u010a\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0014"+
		"\u0000\u0000\u00fb\u00fc\u0005\b\u0000\u0000\u00fc\u00fd\u0003$\u0012"+
		"\u0000\u00fd\u00fe\u0005\u0006\u0000\u0000\u00fe\u00ff\u0003$\u0012\u0000"+
		"\u00ff\u010a\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0015\u0000\u0000"+
		"\u0101\u0102\u0005\b\u0000\u0000\u0102\u010a\u0003$\u0012\u0000\u0103"+
		"\u0104\u0005\u0016\u0000\u0000\u0104\u0105\u0005\b\u0000\u0000\u0105\u0106"+
		"\u0003$\u0012\u0000\u0106\u0107\u0005\u0006\u0000\u0000\u0107\u0108\u0003"+
		"&\u0013\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u00dd\u0001\u0000"+
		"\u0000\u0000\u0109\u00e0\u0001\u0000\u0000\u0000\u0109\u00e3\u0001\u0000"+
		"\u0000\u0000\u0109\u00e6\u0001\u0000\u0000\u0000\u0109\u00ee\u0001\u0000"+
		"\u0000\u0000\u0109\u00f4\u0001\u0000\u0000\u0000\u0109\u00fa\u0001\u0000"+
		"\u0000\u0000\u0109\u0100\u0001\u0000\u0000\u0000\u0109\u0103\u0001\u0000"+
		"\u0000\u0000\u010a#\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u001a\u0000"+
		"\u0000\u010c%\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u001a\u0000\u0000"+
		"\u010e\u010f\u0005\t\u0000\u0000\u010f\u0110\u0005\u001a\u0000\u0000\u0110"+
		"\'\u0001\u0000\u0000\u0000\u0111\u0112\u0005\n\u0000\u0000\u0112\u0113"+
		"\u0005\f\u0000\u0000\u0113\u0114\u0005\n\u0000\u0000\u0114)\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0005\r\u0000\u0000\u0116\u0117\u0005\u0002\u0000"+
		"\u0000\u0117\u0118\u0007\u0000\u0000\u0000\u0118\u0119\u0005\u0003\u0000"+
		"\u0000\u0119+\u0001\u0000\u0000\u0000\u0013/46?AJ_jquz\u0081\u0085\u0098"+
		"\u00a9\u00ab\u00b3\u00db\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}