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
		T__9=10, T__10=11, VARIABLE=12, CONSTANT=13, ATOM=14, NEGATION=15, CONTRADICTION=16, 
		CONJUNCTION=17, DISJUNCTION=18, IDENTITY=19, IMPLICATION=20, BICONDITIONAL=21, 
		FORALL=22, EXISTS=23, ASSUME=24, QED=25, INT=26, NEWLINE=27, WS=28;
	public static final int
		RULE_proof = 0, RULE_subproof = 1, RULE_assume = 2, RULE_qed = 3, RULE_premiseLine = 4, 
		RULE_proofLine = 5, RULE_conclusionLine = 6, RULE_constantIntroLine = 7, 
		RULE_proofLineNum = 8, RULE_premiseInference = 9, RULE_inference = 10, 
		RULE_contradiction = 11, RULE_sentence = 12, RULE_justification = 13, 
		RULE_reiteration = 14, RULE_introduction = 15, RULE_elimination = 16, 
		RULE_singleReference = 17, RULE_rangeReference = 18, RULE_boxedConstant = 19, 
		RULE_function = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"proof", "subproof", "assume", "qed", "premiseLine", "proofLine", "conclusionLine", 
			"constantIntroLine", "proofLineNum", "premiseInference", "inference", 
			"contradiction", "sentence", "justification", "reiteration", "introduction", 
			"elimination", "singleReference", "rangeReference", "boxedConstant", 
			"function"
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
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					premiseLine();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(50);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(48);
						proofLine();
						}
						break;
					case ASSUME:
						{
						setState(49);
						subproof();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(55);
			conclusionLine();
			setState(56);
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
			setState(58);
			assume();
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(61);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSUME:
						{
						setState(59);
						subproof();
						}
						break;
					case INT:
						{
						setState(60);
						proofLine();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(66);
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
			setState(68);
			match(ASSUME);
			setState(69);
			match(NEWLINE);
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(70);
				premiseLine();
				}
				break;
			case 2:
				{
				setState(71);
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
			setState(74);
			conclusionLine();
			setState(75);
			match(QED);
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
			setState(78);
			proofLineNum();
			setState(79);
			premiseInference();
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
			setState(86);
			proofLineNum();
			setState(87);
			inference();
			setState(88);
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
			setState(90);
			proofLineNum();
			setState(91);
			boxedConstant();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 12632072L) != 0) {
				{
				setState(92);
				sentence(0);
				}
			}

			setState(95);
			match(T__0);
			setState(96);
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
			setState(98);
			match(INT);
			setState(99);
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
		enterRule(_localctx, 18, RULE_premiseInference);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRADICTION:
				_localctx = new PremiseContradictionInferContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					contradiction();
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONTRADICTION );
				setState(106);
				match(T__0);
				}
				break;
			case T__2:
			case ATOM:
			case NEGATION:
			case FORALL:
			case EXISTS:
				_localctx = new PremiseSentenceInferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(108);
					sentence(0);
					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 12632072L) != 0 );
				setState(113);
				match(T__0);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRADICTION:
				_localctx = new ContradictionInferContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(117);
						contradiction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(120); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(122);
				justification();
				}
				break;
			case T__2:
			case ATOM:
			case NEGATION:
			case FORALL:
			case EXISTS:
				_localctx = new SentenceInferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(124);
						sentence(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(127); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(129);
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
			setState(133);
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
		public TerminalNode NEGATION() { return getToken(ProofGrammarParser.NEGATION, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode FORALL() { return getToken(ProofGrammarParser.FORALL, 0); }
		public TerminalNode VARIABLE() { return getToken(ProofGrammarParser.VARIABLE, 0); }
		public TerminalNode EXISTS() { return getToken(ProofGrammarParser.EXISTS, 0); }
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(136);
				match(ATOM);
				}
				break;
			case 2:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				function();
				}
				break;
			case 3:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(NEGATION);
				setState(139);
				sentence(9);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesesSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(T__2);
				setState(141);
				sentence(0);
				setState(142);
				match(T__3);
				}
				break;
			case 5:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(FORALL);
				setState(145);
				match(VARIABLE);
				setState(146);
				sentence(2);
				}
				break;
			case 6:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(EXISTS);
				setState(148);
				match(VARIABLE);
				setState(149);
				sentence(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(152);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(153);
						match(CONJUNCTION);
						setState(154);
						sentence(8);
						}
						break;
					case 2:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(155);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(156);
						match(DISJUNCTION);
						setState(157);
						sentence(7);
						}
						break;
					case 3:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(158);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(159);
						match(IDENTITY);
						setState(160);
						sentence(6);
						}
						break;
					case 4:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(161);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(162);
						match(IMPLICATION);
						setState(163);
						sentence(5);
						}
						break;
					case 5:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(164);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(165);
						match(BICONDITIONAL);
						setState(166);
						sentence(4);
						}
						break;
					}
					} 
				}
				setState(171);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ReitJustContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				reiteration();
				}
				break;
			case 2:
				_localctx = new ElimJustContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				elimination();
				}
				break;
			case 3:
				_localctx = new IntroJustContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
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
		enterRule(_localctx, 28, RULE_reiteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__4);
			setState(178);
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
		enterRule(_localctx, 30, RULE_introduction);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				_localctx = new NegationIntroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(NEGATION);
				setState(181);
				match(T__5);
				setState(182);
				rangeReference();
				}
				break;
			case CONTRADICTION:
				_localctx = new ContradictionIntroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(CONTRADICTION);
				setState(184);
				match(T__5);
				setState(185);
				singleReference();
				setState(186);
				match(T__6);
				setState(187);
				singleReference();
				}
				break;
			case CONJUNCTION:
				_localctx = new ConjunctionIntroContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(CONJUNCTION);
				setState(190);
				match(T__5);
				setState(191);
				singleReference();
				setState(192);
				match(T__6);
				setState(193);
				singleReference();
				}
				break;
			case DISJUNCTION:
				_localctx = new DisjunctionIntroContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(DISJUNCTION);
				setState(196);
				match(T__5);
				setState(197);
				singleReference();
				}
				break;
			case IDENTITY:
				_localctx = new IdentityIntroContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(IDENTITY);
				setState(199);
				match(T__7);
				}
				break;
			case IMPLICATION:
				_localctx = new ImplicationIntroContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				match(IMPLICATION);
				setState(201);
				match(T__5);
				setState(202);
				rangeReference();
				}
				break;
			case BICONDITIONAL:
				_localctx = new BiconditionalIntroContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				match(BICONDITIONAL);
				setState(204);
				match(T__5);
				setState(205);
				rangeReference();
				setState(206);
				match(T__6);
				setState(207);
				rangeReference();
				}
				break;
			case FORALL:
				_localctx = new ForallIntroContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				match(FORALL);
				setState(210);
				match(T__5);
				setState(211);
				rangeReference();
				}
				break;
			case EXISTS:
				_localctx = new ExistsIntroContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(212);
				match(EXISTS);
				setState(213);
				match(T__5);
				setState(214);
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
		enterRule(_localctx, 32, RULE_elimination);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				_localctx = new NegationElimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(NEGATION);
				setState(218);
				match(T__8);
				setState(219);
				singleReference();
				}
				break;
			case CONTRADICTION:
				_localctx = new ContradictionElimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(CONTRADICTION);
				setState(221);
				match(T__8);
				setState(222);
				singleReference();
				}
				break;
			case CONJUNCTION:
				_localctx = new ConjunctionElimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(CONJUNCTION);
				setState(224);
				match(T__8);
				setState(225);
				singleReference();
				}
				break;
			case DISJUNCTION:
				_localctx = new DisjunctionElimContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(DISJUNCTION);
				setState(227);
				match(T__8);
				setState(228);
				singleReference();
				setState(229);
				match(T__6);
				setState(230);
				rangeReference();
				setState(231);
				match(T__6);
				setState(232);
				rangeReference();
				}
				break;
			case IDENTITY:
				_localctx = new IdentityElimContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				match(IDENTITY);
				setState(235);
				match(T__8);
				setState(236);
				singleReference();
				setState(237);
				match(T__6);
				setState(238);
				singleReference();
				}
				break;
			case IMPLICATION:
				_localctx = new ImplicationElimContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				match(IMPLICATION);
				setState(241);
				match(T__8);
				setState(242);
				singleReference();
				setState(243);
				match(T__6);
				setState(244);
				singleReference();
				}
				break;
			case BICONDITIONAL:
				_localctx = new BiconditionalElimContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				match(BICONDITIONAL);
				setState(247);
				match(T__8);
				setState(248);
				singleReference();
				setState(249);
				match(T__6);
				setState(250);
				singleReference();
				}
				break;
			case FORALL:
				_localctx = new ForallElimContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(252);
				match(FORALL);
				setState(253);
				match(T__8);
				setState(254);
				singleReference();
				}
				break;
			case EXISTS:
				_localctx = new ExistsElimContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(255);
				match(EXISTS);
				setState(256);
				match(T__8);
				setState(257);
				singleReference();
				setState(258);
				match(T__6);
				setState(259);
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
		enterRule(_localctx, 34, RULE_singleReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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
		enterRule(_localctx, 36, RULE_rangeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(INT);
			setState(266);
			match(T__9);
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
		enterRule(_localctx, 38, RULE_boxedConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__10);
			setState(270);
			match(CONSTANT);
			setState(271);
			match(T__10);
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
		enterRule(_localctx, 40, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(ATOM);
			setState(274);
			match(T__2);
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==CONSTANT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(276);
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u0117\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0005"+
		"\u0000,\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001>\b\u0001\n\u0001"+
		"\f\u0001A\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007^\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0004\tg\b\t\u000b\t\f\th\u0001\t\u0001\t\u0001\t\u0004\tn\b\t\u000b"+
		"\t\f\to\u0001\t\u0001\t\u0003\tt\b\t\u0001\n\u0004\nw\b\n\u000b\n\f\n"+
		"x\u0001\n\u0001\n\u0001\n\u0004\n~\b\n\u000b\n\f\n\u007f\u0001\n\u0001"+
		"\n\u0003\n\u0084\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0097\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00a8\b\f\n\f\f\f\u00ab\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00b0\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d8\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0106\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0000\u0001\u0018\u0015\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0001"+
		"\u0001\u0000\f\r\u012a\u0000-\u0001\u0000\u0000\u0000\u0002:\u0001\u0000"+
		"\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000"+
		"\bN\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\fV\u0001\u0000"+
		"\u0000\u0000\u000eZ\u0001\u0000\u0000\u0000\u0010b\u0001\u0000\u0000\u0000"+
		"\u0012s\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016"+
		"\u0085\u0001\u0000\u0000\u0000\u0018\u0096\u0001\u0000\u0000\u0000\u001a"+
		"\u00af\u0001\u0000\u0000\u0000\u001c\u00b1\u0001\u0000\u0000\u0000\u001e"+
		"\u00d7\u0001\u0000\u0000\u0000 \u0105\u0001\u0000\u0000\u0000\"\u0107"+
		"\u0001\u0000\u0000\u0000$\u0109\u0001\u0000\u0000\u0000&\u010d\u0001\u0000"+
		"\u0000\u0000(\u0111\u0001\u0000\u0000\u0000*,\u0003\b\u0004\u0000+*\u0001"+
		"\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.4\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u000003\u0003\n\u0005\u000013\u0003\u0002\u0001\u000020\u0001\u0000\u0000"+
		"\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000078\u0003\f\u0006\u000089\u0005\u0000\u0000\u00019\u0001"+
		"\u0001\u0000\u0000\u0000:?\u0003\u0004\u0002\u0000;>\u0003\u0002\u0001"+
		"\u0000<>\u0003\n\u0005\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0003"+
		"\u0006\u0003\u0000C\u0003\u0001\u0000\u0000\u0000DE\u0005\u0018\u0000"+
		"\u0000EH\u0005\u001b\u0000\u0000FI\u0003\b\u0004\u0000GI\u0003\u000e\u0007"+
		"\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\u0005\u0001"+
		"\u0000\u0000\u0000JK\u0003\f\u0006\u0000KL\u0005\u0019\u0000\u0000LM\u0005"+
		"\u001b\u0000\u0000M\u0007\u0001\u0000\u0000\u0000NO\u0003\u0010\b\u0000"+
		"OP\u0003\u0012\t\u0000PQ\u0005\u001b\u0000\u0000Q\t\u0001\u0000\u0000"+
		"\u0000RS\u0003\u0010\b\u0000ST\u0003\u0014\n\u0000TU\u0005\u001b\u0000"+
		"\u0000U\u000b\u0001\u0000\u0000\u0000VW\u0003\u0010\b\u0000WX\u0003\u0014"+
		"\n\u0000XY\u0005\u001b\u0000\u0000Y\r\u0001\u0000\u0000\u0000Z[\u0003"+
		"\u0010\b\u0000[]\u0003&\u0013\u0000\\^\u0003\u0018\f\u0000]\\\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005"+
		"\u0001\u0000\u0000`a\u0005\u001b\u0000\u0000a\u000f\u0001\u0000\u0000"+
		"\u0000bc\u0005\u001a\u0000\u0000cd\u0005\u0002\u0000\u0000d\u0011\u0001"+
		"\u0000\u0000\u0000eg\u0003\u0016\u000b\u0000fe\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jk\u0005\u0001\u0000\u0000kt\u0001\u0000"+
		"\u0000\u0000ln\u0003\u0018\f\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qr\u0005\u0001\u0000\u0000rt\u0001\u0000\u0000\u0000"+
		"sf\u0001\u0000\u0000\u0000sm\u0001\u0000\u0000\u0000t\u0013\u0001\u0000"+
		"\u0000\u0000uw\u0003\u0016\u000b\u0000vu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000z{\u0003\u001a\r\u0000{\u0084\u0001\u0000\u0000"+
		"\u0000|~\u0003\u0018\f\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0003\u001a\r\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083v\u0001\u0000\u0000\u0000\u0083"+
		"}\u0001\u0000\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u0010\u0000\u0000\u0086\u0017\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0006\f\uffff\uffff\u0000\u0088\u0097\u0005\u000e\u0000\u0000\u0089\u0097"+
		"\u0003(\u0014\u0000\u008a\u008b\u0005\u000f\u0000\u0000\u008b\u0097\u0003"+
		"\u0018\f\t\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008e\u0003\u0018"+
		"\f\u0000\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u0097\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005\u0016\u0000\u0000\u0091\u0092\u0005\f\u0000\u0000"+
		"\u0092\u0097\u0003\u0018\f\u0002\u0093\u0094\u0005\u0017\u0000\u0000\u0094"+
		"\u0095\u0005\f\u0000\u0000\u0095\u0097\u0003\u0018\f\u0001\u0096\u0087"+
		"\u0001\u0000\u0000\u0000\u0096\u0089\u0001\u0000\u0000\u0000\u0096\u008a"+
		"\u0001\u0000\u0000\u0000\u0096\u008c\u0001\u0000\u0000\u0000\u0096\u0090"+
		"\u0001\u0000\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0097\u00a9"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\n\u0007\u0000\u0000\u0099\u009a\u0005"+
		"\u0011\u0000\u0000\u009a\u00a8\u0003\u0018\f\b\u009b\u009c\n\u0006\u0000"+
		"\u0000\u009c\u009d\u0005\u0012\u0000\u0000\u009d\u00a8\u0003\u0018\f\u0007"+
		"\u009e\u009f\n\u0005\u0000\u0000\u009f\u00a0\u0005\u0013\u0000\u0000\u00a0"+
		"\u00a8\u0003\u0018\f\u0006\u00a1\u00a2\n\u0004\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0014\u0000\u0000\u00a3\u00a8\u0003\u0018\f\u0005\u00a4\u00a5\n"+
		"\u0003\u0000\u0000\u00a5\u00a6\u0005\u0015\u0000\u0000\u00a6\u00a8\u0003"+
		"\u0018\f\u0004\u00a7\u0098\u0001\u0000\u0000\u0000\u00a7\u009b\u0001\u0000"+
		"\u0000\u0000\u00a7\u009e\u0001\u0000\u0000\u0000\u00a7\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u0019\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ac\u00b0\u0003\u001c\u000e\u0000\u00ad\u00b0\u0003 \u0010"+
		"\u0000\u00ae\u00b0\u0003\u001e\u000f\u0000\u00af\u00ac\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u001b\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0005\u0000"+
		"\u0000\u00b2\u00b3\u0003\"\u0011\u0000\u00b3\u001d\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\u000f\u0000\u0000\u00b5\u00b6\u0005\u0006\u0000\u0000"+
		"\u00b6\u00d8\u0003$\u0012\u0000\u00b7\u00b8\u0005\u0010\u0000\u0000\u00b8"+
		"\u00b9\u0005\u0006\u0000\u0000\u00b9\u00ba\u0003\"\u0011\u0000\u00ba\u00bb"+
		"\u0005\u0007\u0000\u0000\u00bb\u00bc\u0003\"\u0011\u0000\u00bc\u00d8\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005\u0011\u0000\u0000\u00be\u00bf\u0005"+
		"\u0006\u0000\u0000\u00bf\u00c0\u0003\"\u0011\u0000\u00c0\u00c1\u0005\u0007"+
		"\u0000\u0000\u00c1\u00c2\u0003\"\u0011\u0000\u00c2\u00d8\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\u0012\u0000\u0000\u00c4\u00c5\u0005\u0006\u0000"+
		"\u0000\u00c5\u00d8\u0003\"\u0011\u0000\u00c6\u00c7\u0005\u0013\u0000\u0000"+
		"\u00c7\u00d8\u0005\b\u0000\u0000\u00c8\u00c9\u0005\u0014\u0000\u0000\u00c9"+
		"\u00ca\u0005\u0006\u0000\u0000\u00ca\u00d8\u0003$\u0012\u0000\u00cb\u00cc"+
		"\u0005\u0015\u0000\u0000\u00cc\u00cd\u0005\u0006\u0000\u0000\u00cd\u00ce"+
		"\u0003$\u0012\u0000\u00ce\u00cf\u0005\u0007\u0000\u0000\u00cf\u00d0\u0003"+
		"$\u0012\u0000\u00d0\u00d8\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0016"+
		"\u0000\u0000\u00d2\u00d3\u0005\u0006\u0000\u0000\u00d3\u00d8\u0003$\u0012"+
		"\u0000\u00d4\u00d5\u0005\u0017\u0000\u0000\u00d5\u00d6\u0005\u0006\u0000"+
		"\u0000\u00d6\u00d8\u0003\"\u0011\u0000\u00d7\u00b4\u0001\u0000\u0000\u0000"+
		"\u00d7\u00b7\u0001\u0000\u0000\u0000\u00d7\u00bd\u0001\u0000\u0000\u0000"+
		"\u00d7\u00c3\u0001\u0000\u0000\u0000\u00d7\u00c6\u0001\u0000\u0000\u0000"+
		"\u00d7\u00c8\u0001\u0000\u0000\u0000\u00d7\u00cb\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d8\u001f\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u000f\u0000\u0000"+
		"\u00da\u00db\u0005\t\u0000\u0000\u00db\u0106\u0003\"\u0011\u0000\u00dc"+
		"\u00dd\u0005\u0010\u0000\u0000\u00dd\u00de\u0005\t\u0000\u0000\u00de\u0106"+
		"\u0003\"\u0011\u0000\u00df\u00e0\u0005\u0011\u0000\u0000\u00e0\u00e1\u0005"+
		"\t\u0000\u0000\u00e1\u0106\u0003\"\u0011\u0000\u00e2\u00e3\u0005\u0012"+
		"\u0000\u0000\u00e3\u00e4\u0005\t\u0000\u0000\u00e4\u00e5\u0003\"\u0011"+
		"\u0000\u00e5\u00e6\u0005\u0007\u0000\u0000\u00e6\u00e7\u0003$\u0012\u0000"+
		"\u00e7\u00e8\u0005\u0007\u0000\u0000\u00e8\u00e9\u0003$\u0012\u0000\u00e9"+
		"\u0106\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0013\u0000\u0000\u00eb"+
		"\u00ec\u0005\t\u0000\u0000\u00ec\u00ed\u0003\"\u0011\u0000\u00ed\u00ee"+
		"\u0005\u0007\u0000\u0000\u00ee\u00ef\u0003\"\u0011\u0000\u00ef\u0106\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005\u0014\u0000\u0000\u00f1\u00f2\u0005"+
		"\t\u0000\u0000\u00f2\u00f3\u0003\"\u0011\u0000\u00f3\u00f4\u0005\u0007"+
		"\u0000\u0000\u00f4\u00f5\u0003\"\u0011\u0000\u00f5\u0106\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005\u0015\u0000\u0000\u00f7\u00f8\u0005\t\u0000\u0000"+
		"\u00f8\u00f9\u0003\"\u0011\u0000\u00f9\u00fa\u0005\u0007\u0000\u0000\u00fa"+
		"\u00fb\u0003\"\u0011\u0000\u00fb\u0106\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0005\u0016\u0000\u0000\u00fd\u00fe\u0005\t\u0000\u0000\u00fe\u0106\u0003"+
		"\"\u0011\u0000\u00ff\u0100\u0005\u0017\u0000\u0000\u0100\u0101\u0005\t"+
		"\u0000\u0000\u0101\u0102\u0003\"\u0011\u0000\u0102\u0103\u0005\u0007\u0000"+
		"\u0000\u0103\u0104\u0003$\u0012\u0000\u0104\u0106\u0001\u0000\u0000\u0000"+
		"\u0105\u00d9\u0001\u0000\u0000\u0000\u0105\u00dc\u0001\u0000\u0000\u0000"+
		"\u0105\u00df\u0001\u0000\u0000\u0000\u0105\u00e2\u0001\u0000\u0000\u0000"+
		"\u0105\u00ea\u0001\u0000\u0000\u0000\u0105\u00f0\u0001\u0000\u0000\u0000"+
		"\u0105\u00f6\u0001\u0000\u0000\u0000\u0105\u00fc\u0001\u0000\u0000\u0000"+
		"\u0105\u00ff\u0001\u0000\u0000\u0000\u0106!\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0005\u001a\u0000\u0000\u0108#\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0005\u001a\u0000\u0000\u010a\u010b\u0005\n\u0000\u0000\u010b\u010c\u0005"+
		"\u001a\u0000\u0000\u010c%\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u000b"+
		"\u0000\u0000\u010e\u010f\u0005\r\u0000\u0000\u010f\u0110\u0005\u000b\u0000"+
		"\u0000\u0110\'\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u000e\u0000\u0000"+
		"\u0112\u0113\u0005\u0003\u0000\u0000\u0113\u0114\u0007\u0000\u0000\u0000"+
		"\u0114\u0115\u0005\u0004\u0000\u0000\u0115)\u0001\u0000\u0000\u0000\u0013"+
		"-24=?H]hosx\u007f\u0083\u0096\u00a7\u00a9\u00af\u00d7\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}