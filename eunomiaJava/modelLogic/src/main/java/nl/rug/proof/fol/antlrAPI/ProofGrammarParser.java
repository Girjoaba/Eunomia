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
		T__9=10, VARIABLE=11, CONSTANT=12, PROPOSITION=13, NEGATION=14, CONTRADICTION=15, 
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
		RULE_atom = 21, RULE_identifierAtom = 22, RULE_function = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"proof", "subproof", "assume", "qed", "premiseLine", "proofLine", "conclusionLine", 
			"constantIntroLine", "proofLineNum", "premiseInference", "inference", 
			"contradiction", "sentence", "premise", "justification", "reiteration", 
			"introduction", "elimination", "singleReference", "rangeReference", "boxedConstant", 
			"atom", "identifierAtom", "function"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "'Reit: '", "'Intro: '", "','", "'Intro'", 
			"'Elim: '", "'-'", "'|'", null, null, null, "'\\u00AC'", "'\\u27C2'", 
			"'\\u2227'", "'\\u2228'", "'='", "'\\u2192'", "'\\u2194'", "'\\u2200'", 
			"'\\u2203'", "'premise'", "'assume'", "'qed'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "VARIABLE", 
			"CONSTANT", "PROPOSITION", "NEGATION", "CONTRADICTION", "CONJUNCTION", 
			"DISJUNCTION", "IDENTITY", "IMPLICATION", "BICONDITIONAL", "FORALL", 
			"EXISTS", "PREMISE", "ASSUME", "QED", "INT", "NEWLINE", "WS"
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
	}

	public final ProofContext proof() throws RecognitionException {
		ProofContext _localctx = new ProofContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_proof);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					premiseLine();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSUME || _la==INT) {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(54);
					proofLine();
					}
					break;
				case ASSUME:
					{
					setState(55);
					subproof();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
	}

	public final SubproofContext subproof() throws RecognitionException {
		SubproofContext _localctx = new SubproofContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subproof);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			assume();
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(66);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSUME:
						{
						setState(64);
						subproof();
						}
						break;
					case INT:
						{
						setState(65);
						proofLine();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(71);
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
	}

	public final AssumeContext assume() throws RecognitionException {
		AssumeContext _localctx = new AssumeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assume);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ASSUME);
			setState(74);
			match(NEWLINE);
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(75);
				premiseLine();
				}
				break;
			case 2:
				{
				setState(76);
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
	}

	public final QedContext qed() throws RecognitionException {
		QedContext _localctx = new QedContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			conclusionLine();
			setState(80);
			match(QED);
			setState(81);
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
	}

	public final PremiseLineContext premiseLine() throws RecognitionException {
		PremiseLineContext _localctx = new PremiseLineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_premiseLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			proofLineNum();
			setState(84);
			premiseInference();
			setState(85);
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
	}

	public final ProofLineContext proofLine() throws RecognitionException {
		ProofLineContext _localctx = new ProofLineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proofLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			proofLineNum();
			setState(88);
			inference();
			setState(89);
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
	}

	public final ConclusionLineContext conclusionLine() throws RecognitionException {
		ConclusionLineContext _localctx = new ConclusionLineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conclusionLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			proofLineNum();
			setState(92);
			inference();
			setState(93);
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
	}

	public final ConstantIntroLineContext constantIntroLine() throws RecognitionException {
		ConstantIntroLineContext _localctx = new ConstantIntroLineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantIntroLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			proofLineNum();
			setState(96);
			boxedConstant();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6322180L) != 0)) {
				{
				setState(97);
				sentence(0);
				}
			}

			setState(100);
			premise();
			setState(101);
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
	}

	public final ProofLineNumContext proofLineNum() throws RecognitionException {
		ProofLineNumContext _localctx = new ProofLineNumContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_proofLineNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(INT);
			setState(104);
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
	}

	public final PremiseInferenceContext premiseInference() throws RecognitionException {
		PremiseInferenceContext _localctx = new PremiseInferenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_premiseInference);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRADICTION:
				_localctx = new PremiseContradictionInferContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					contradiction();
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONTRADICTION );
				setState(111);
				premise();
				}
				break;
			case T__1:
			case VARIABLE:
			case CONSTANT:
			case PROPOSITION:
			case NEGATION:
			case FORALL:
			case EXISTS:
				_localctx = new PremiseSentenceInferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					sentence(0);
					}
					}
					setState(116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 6322180L) != 0) );
				setState(118);
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
	}

	public final InferenceContext inference() throws RecognitionException {
		InferenceContext _localctx = new InferenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inference);
		try {
			int _alt;
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRADICTION:
				_localctx = new ContradictionInferContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(122);
						contradiction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(125); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(127);
				justification();
				}
				break;
			case T__1:
			case VARIABLE:
			case CONSTANT:
			case PROPOSITION:
			case NEGATION:
			case FORALL:
			case EXISTS:
				_localctx = new SentenceInferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(129);
						sentence(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(132); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(134);
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
	}

	public final ContradictionContext contradiction() throws RecognitionException {
		ContradictionContext _localctx = new ContradictionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contradiction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode CONJUNCTION() { return getToken(ProofGrammarParser.CONJUNCTION, 0); }
		public TerminalNode DISJUNCTION() { return getToken(ProofGrammarParser.DISJUNCTION, 0); }
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
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(141);
				match(FORALL);
				setState(142);
				match(VARIABLE);
				setState(143);
				sentence(10);
				}
				break;
			case 2:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(EXISTS);
				setState(145);
				match(VARIABLE);
				setState(146);
				sentence(9);
				}
				break;
			case 3:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(NEGATION);
				setState(148);
				sentence(8);
				}
				break;
			case 4:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				function();
				}
				break;
			case 5:
				{
				_localctx = new ParenthesesSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(T__1);
				setState(151);
				sentence(0);
				setState(152);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				atom();
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
						setState(157);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(158);
						match(CONJUNCTION);
						setState(159);
						sentence(6);
						}
						break;
					case 2:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(160);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(161);
						match(DISJUNCTION);
						setState(162);
						sentence(5);
						}
						break;
					case 3:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(164);
						match(IMPLICATION);
						setState(165);
						sentence(4);
						}
						break;
					case 4:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						match(BICONDITIONAL);
						setState(168);
						sentence(3);
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
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropositionAtomContext extends AtomContext {
		public TerminalNode PROPOSITION() { return getToken(ProofGrammarParser.PROPOSITION, 0); }
		public PropositionAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterPropositionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitPropositionAtom(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentityAtomContext extends AtomContext {
		public List<IdentifierAtomContext> identifierAtom() {
			return getRuleContexts(IdentifierAtomContext.class);
		}
		public IdentifierAtomContext identifierAtom(int i) {
			return getRuleContext(IdentifierAtomContext.class,i);
		}
		public TerminalNode IDENTITY() { return getToken(ProofGrammarParser.IDENTITY, 0); }
		public IdentityAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterIdentityAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitIdentityAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atom);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROPOSITION:
				_localctx = new PropositionAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(PROPOSITION);
				}
				break;
			case VARIABLE:
			case CONSTANT:
				_localctx = new IdentityAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				identifierAtom();
				setState(279);
				match(IDENTITY);
				setState(280);
				identifierAtom();
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
	public static class IdentifierAtomContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(ProofGrammarParser.CONSTANT, 0); }
		public TerminalNode VARIABLE() { return getToken(ProofGrammarParser.VARIABLE, 0); }
		public IdentifierAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).enterIdentifierAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProofGrammarListener ) ((ProofGrammarListener)listener).exitIdentifierAtom(this);
		}
	}

	public final IdentifierAtomContext identifierAtom() throws RecognitionException {
		IdentifierAtomContext _localctx = new IdentifierAtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifierAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode PROPOSITION() { return getToken(ProofGrammarParser.PROPOSITION, 0); }
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
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(PROPOSITION);
			setState(287);
			match(T__1);
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==CONSTANT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(289);
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u0124\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005"+
		"\u00002\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u00009\b\u0000\n\u0000\f\u0000<\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001C\b\u0001\n\u0001\f\u0001F\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002N\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007c\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0004\t"+
		"l\b\t\u000b\t\f\tm\u0001\t\u0001\t\u0001\t\u0004\ts\b\t\u000b\t\f\tt\u0001"+
		"\t\u0001\t\u0003\ty\b\t\u0001\n\u0004\n|\b\n\u000b\n\f\n}\u0001\n\u0001"+
		"\n\u0001\n\u0004\n\u0083\b\n\u000b\n\f\n\u0084\u0001\n\u0001\n\u0003\n"+
		"\u0089\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u009c\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00aa\b\f\n"+
		"\f\f\f\u00ad\t\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00b4\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00dc\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u010a\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u011b\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0001\u0018"+
		"\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.\u0000\u0001\u0001\u0000\u000b\f\u0134\u0000"+
		"3\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0004I\u0001"+
		"\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\bS\u0001\u0000\u0000"+
		"\u0000\nW\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000\u000e_\u0001"+
		"\u0000\u0000\u0000\u0010g\u0001\u0000\u0000\u0000\u0012x\u0001\u0000\u0000"+
		"\u0000\u0014\u0088\u0001\u0000\u0000\u0000\u0016\u008a\u0001\u0000\u0000"+
		"\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a\u00ae\u0001\u0000\u0000"+
		"\u0000\u001c\u00b3\u0001\u0000\u0000\u0000\u001e\u00b5\u0001\u0000\u0000"+
		"\u0000 \u00db\u0001\u0000\u0000\u0000\"\u0109\u0001\u0000\u0000\u0000"+
		"$\u010b\u0001\u0000\u0000\u0000&\u010d\u0001\u0000\u0000\u0000(\u0111"+
		"\u0001\u0000\u0000\u0000*\u011a\u0001\u0000\u0000\u0000,\u011c\u0001\u0000"+
		"\u0000\u0000.\u011e\u0001\u0000\u0000\u000002\u0003\b\u0004\u000010\u0001"+
		"\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u00004:\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000069\u0003\n\u0005\u000079\u0003\u0002\u0001\u000086\u0001\u0000\u0000"+
		"\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000=>\u0005\u0000\u0000\u0001>\u0001\u0001\u0000\u0000"+
		"\u0000?D\u0003\u0004\u0002\u0000@C\u0003\u0002\u0001\u0000AC\u0003\n\u0005"+
		"\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0003\u0006\u0003\u0000"+
		"H\u0003\u0001\u0000\u0000\u0000IJ\u0005\u0018\u0000\u0000JM\u0005\u001b"+
		"\u0000\u0000KN\u0003\b\u0004\u0000LN\u0003\u000e\u0007\u0000MK\u0001\u0000"+
		"\u0000\u0000ML\u0001\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000"+
		"OP\u0003\f\u0006\u0000PQ\u0005\u0019\u0000\u0000QR\u0005\u001b\u0000\u0000"+
		"R\u0007\u0001\u0000\u0000\u0000ST\u0003\u0010\b\u0000TU\u0003\u0012\t"+
		"\u0000UV\u0005\u001b\u0000\u0000V\t\u0001\u0000\u0000\u0000WX\u0003\u0010"+
		"\b\u0000XY\u0003\u0014\n\u0000YZ\u0005\u001b\u0000\u0000Z\u000b\u0001"+
		"\u0000\u0000\u0000[\\\u0003\u0010\b\u0000\\]\u0003\u0014\n\u0000]^\u0005"+
		"\u001b\u0000\u0000^\r\u0001\u0000\u0000\u0000_`\u0003\u0010\b\u0000`b"+
		"\u0003(\u0014\u0000ac\u0003\u0018\f\u0000ba\u0001\u0000\u0000\u0000bc"+
		"\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0003\u001a\r\u0000"+
		"ef\u0005\u001b\u0000\u0000f\u000f\u0001\u0000\u0000\u0000gh\u0005\u001a"+
		"\u0000\u0000hi\u0005\u0001\u0000\u0000i\u0011\u0001\u0000\u0000\u0000"+
		"jl\u0003\u0016\u000b\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000op\u0003\u001a\r\u0000py\u0001\u0000\u0000\u0000qs\u0003\u0018"+
		"\f\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0003"+
		"\u001a\r\u0000wy\u0001\u0000\u0000\u0000xk\u0001\u0000\u0000\u0000xr\u0001"+
		"\u0000\u0000\u0000y\u0013\u0001\u0000\u0000\u0000z|\u0003\u0016\u000b"+
		"\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0003\u001c\u000e\u0000\u0080\u0089\u0001\u0000\u0000\u0000"+
		"\u0081\u0083\u0003\u0018\f\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0003\u001c\u000e\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088"+
		"{\u0001\u0000\u0000\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0089\u0015"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u000f\u0000\u0000\u008b\u0017"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0006\f\uffff\uffff\u0000\u008d\u008e"+
		"\u0005\u0015\u0000\u0000\u008e\u008f\u0005\u000b\u0000\u0000\u008f\u009c"+
		"\u0003\u0018\f\n\u0090\u0091\u0005\u0016\u0000\u0000\u0091\u0092\u0005"+
		"\u000b\u0000\u0000\u0092\u009c\u0003\u0018\f\t\u0093\u0094\u0005\u000e"+
		"\u0000\u0000\u0094\u009c\u0003\u0018\f\b\u0095\u009c\u0003.\u0017\u0000"+
		"\u0096\u0097\u0005\u0002\u0000\u0000\u0097\u0098\u0003\u0018\f\u0000\u0098"+
		"\u0099\u0005\u0003\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0003*\u0015\u0000\u009b\u008c\u0001\u0000\u0000\u0000\u009b\u0090"+
		"\u0001\u0000\u0000\u0000\u009b\u0093\u0001\u0000\u0000\u0000\u009b\u0095"+
		"\u0001\u0000\u0000\u0000\u009b\u0096\u0001\u0000\u0000\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u00ab\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\n\u0005\u0000\u0000\u009e\u009f\u0005\u0010\u0000\u0000\u009f\u00aa\u0003"+
		"\u0018\f\u0006\u00a0\u00a1\n\u0004\u0000\u0000\u00a1\u00a2\u0005\u0011"+
		"\u0000\u0000\u00a2\u00aa\u0003\u0018\f\u0005\u00a3\u00a4\n\u0003\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0013\u0000\u0000\u00a5\u00aa\u0003\u0018\f\u0004"+
		"\u00a6\u00a7\n\u0002\u0000\u0000\u00a7\u00a8\u0005\u0014\u0000\u0000\u00a8"+
		"\u00aa\u0003\u0018\f\u0003\u00a9\u009d\u0001\u0000\u0000\u0000\u00a9\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000\u0000\u00a9\u00a6"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u0019"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u0017\u0000\u0000\u00af\u001b\u0001\u0000\u0000\u0000\u00b0\u00b4"+
		"\u0003\u001e\u000f\u0000\u00b1\u00b4\u0003\"\u0011\u0000\u00b2\u00b4\u0003"+
		" \u0010\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u001d\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005\u0004\u0000\u0000\u00b6\u00b7\u0003$\u0012"+
		"\u0000\u00b7\u001f\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u000e\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba\u00dc\u0003&\u0013\u0000"+
		"\u00bb\u00bc\u0005\u000f\u0000\u0000\u00bc\u00bd\u0005\u0005\u0000\u0000"+
		"\u00bd\u00be\u0003$\u0012\u0000\u00be\u00bf\u0005\u0006\u0000\u0000\u00bf"+
		"\u00c0\u0003$\u0012\u0000\u00c0\u00dc\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0005\u0010\u0000\u0000\u00c2\u00c3\u0005\u0005\u0000\u0000\u00c3\u00c4"+
		"\u0003$\u0012\u0000\u00c4\u00c5\u0005\u0006\u0000\u0000\u00c5\u00c6\u0003"+
		"$\u0012\u0000\u00c6\u00dc\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0011"+
		"\u0000\u0000\u00c8\u00c9\u0005\u0005\u0000\u0000\u00c9\u00dc\u0003$\u0012"+
		"\u0000\u00ca\u00cb\u0005\u0012\u0000\u0000\u00cb\u00dc\u0005\u0007\u0000"+
		"\u0000\u00cc\u00cd\u0005\u0013\u0000\u0000\u00cd\u00ce\u0005\u0005\u0000"+
		"\u0000\u00ce\u00dc\u0003&\u0013\u0000\u00cf\u00d0\u0005\u0014\u0000\u0000"+
		"\u00d0\u00d1\u0005\u0005\u0000\u0000\u00d1\u00d2\u0003&\u0013\u0000\u00d2"+
		"\u00d3\u0005\u0006\u0000\u0000\u00d3\u00d4\u0003&\u0013\u0000\u00d4\u00dc"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0015\u0000\u0000\u00d6\u00d7"+
		"\u0005\u0005\u0000\u0000\u00d7\u00dc\u0003&\u0013\u0000\u00d8\u00d9\u0005"+
		"\u0016\u0000\u0000\u00d9\u00da\u0005\u0005\u0000\u0000\u00da\u00dc\u0003"+
		"$\u0012\u0000\u00db\u00b8\u0001\u0000\u0000\u0000\u00db\u00bb\u0001\u0000"+
		"\u0000\u0000\u00db\u00c1\u0001\u0000\u0000\u0000\u00db\u00c7\u0001\u0000"+
		"\u0000\u0000\u00db\u00ca\u0001\u0000\u0000\u0000\u00db\u00cc\u0001\u0000"+
		"\u0000\u0000\u00db\u00cf\u0001\u0000\u0000\u0000\u00db\u00d5\u0001\u0000"+
		"\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00dc!\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0005\u000e\u0000\u0000\u00de\u00df\u0005\b\u0000\u0000"+
		"\u00df\u010a\u0003$\u0012\u0000\u00e0\u00e1\u0005\u000f\u0000\u0000\u00e1"+
		"\u00e2\u0005\b\u0000\u0000\u00e2\u010a\u0003$\u0012\u0000\u00e3\u00e4"+
		"\u0005\u0010\u0000\u0000\u00e4\u00e5\u0005\b\u0000\u0000\u00e5\u010a\u0003"+
		"$\u0012\u0000\u00e6\u00e7\u0005\u0011\u0000\u0000\u00e7\u00e8\u0005\b"+
		"\u0000\u0000\u00e8\u00e9\u0003$\u0012\u0000\u00e9\u00ea\u0005\u0006\u0000"+
		"\u0000\u00ea\u00eb\u0003&\u0013\u0000\u00eb\u00ec\u0005\u0006\u0000\u0000"+
		"\u00ec\u00ed\u0003&\u0013\u0000\u00ed\u010a\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0012\u0000\u0000\u00ef\u00f0\u0005\b\u0000\u0000\u00f0\u00f1"+
		"\u0003$\u0012\u0000\u00f1\u00f2\u0005\u0006\u0000\u0000\u00f2\u00f3\u0003"+
		"$\u0012\u0000\u00f3\u010a\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0013"+
		"\u0000\u0000\u00f5\u00f6\u0005\b\u0000\u0000\u00f6\u00f7\u0003$\u0012"+
		"\u0000\u00f7\u00f8\u0005\u0006\u0000\u0000\u00f8\u00f9\u0003$\u0012\u0000"+
		"\u00f9\u010a\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0014\u0000\u0000"+
		"\u00fb\u00fc\u0005\b\u0000\u0000\u00fc\u00fd\u0003$\u0012\u0000\u00fd"+
		"\u00fe\u0005\u0006\u0000\u0000\u00fe\u00ff\u0003$\u0012\u0000\u00ff\u010a"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0015\u0000\u0000\u0101\u0102"+
		"\u0005\b\u0000\u0000\u0102\u010a\u0003$\u0012\u0000\u0103\u0104\u0005"+
		"\u0016\u0000\u0000\u0104\u0105\u0005\b\u0000\u0000\u0105\u0106\u0003$"+
		"\u0012\u0000\u0106\u0107\u0005\u0006\u0000\u0000\u0107\u0108\u0003&\u0013"+
		"\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u00dd\u0001\u0000\u0000"+
		"\u0000\u0109\u00e0\u0001\u0000\u0000\u0000\u0109\u00e3\u0001\u0000\u0000"+
		"\u0000\u0109\u00e6\u0001\u0000\u0000\u0000\u0109\u00ee\u0001\u0000\u0000"+
		"\u0000\u0109\u00f4\u0001\u0000\u0000\u0000\u0109\u00fa\u0001\u0000\u0000"+
		"\u0000\u0109\u0100\u0001\u0000\u0000\u0000\u0109\u0103\u0001\u0000\u0000"+
		"\u0000\u010a#\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u001a\u0000\u0000"+
		"\u010c%\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u001a\u0000\u0000\u010e"+
		"\u010f\u0005\t\u0000\u0000\u010f\u0110\u0005\u001a\u0000\u0000\u0110\'"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0005\n\u0000\u0000\u0112\u0113\u0005"+
		"\f\u0000\u0000\u0113\u0114\u0005\n\u0000\u0000\u0114)\u0001\u0000\u0000"+
		"\u0000\u0115\u011b\u0005\r\u0000\u0000\u0116\u0117\u0003,\u0016\u0000"+
		"\u0117\u0118\u0005\u0012\u0000\u0000\u0118\u0119\u0003,\u0016\u0000\u0119"+
		"\u011b\u0001\u0000\u0000\u0000\u011a\u0115\u0001\u0000\u0000\u0000\u011a"+
		"\u0116\u0001\u0000\u0000\u0000\u011b+\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0007\u0000\u0000\u0000\u011d-\u0001\u0000\u0000\u0000\u011e\u011f\u0005"+
		"\r\u0000\u0000\u011f\u0120\u0005\u0002\u0000\u0000\u0120\u0121\u0007\u0000"+
		"\u0000\u0000\u0121\u0122\u0005\u0003\u0000\u0000\u0122/\u0001\u0000\u0000"+
		"\u0000\u001438:BDMbmtx}\u0084\u0088\u009b\u00a9\u00ab\u00b3\u00db\u0109"+
		"\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}