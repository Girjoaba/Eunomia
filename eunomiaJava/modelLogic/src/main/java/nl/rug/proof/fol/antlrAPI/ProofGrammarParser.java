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
		T__9=10, VARIABLE=11, CONSTANT=12, ATOM=13, NEGATION=14, CONTRADICTION=15, 
		CONJUNCTION=16, DISJUNCTION=17, IDENTITY=18, IMPLICATION=19, BICONDITIONAL=20, 
		ASSUME=21, QED=22, INT=23, NEWLINE=24, WS=25;
	public static final int
		RULE_proof = 0, RULE_subproof = 1, RULE_assume = 2, RULE_qed = 3, RULE_premiseLine = 4, 
		RULE_proofLine = 5, RULE_conclusionLine = 6, RULE_proofLineNum = 7, RULE_premiseInference = 8, 
		RULE_inference = 9, RULE_contradiction = 10, RULE_sentence = 11, RULE_justification = 12, 
		RULE_reiteration = 13, RULE_introduction = 14, RULE_elimination = 15, 
		RULE_singleReference = 16, RULE_rangeReference = 17, RULE_function = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"proof", "subproof", "assume", "qed", "premiseLine", "proofLine", "conclusionLine", 
			"proofLineNum", "premiseInference", "inference", "contradiction", "sentence", 
			"justification", "reiteration", "introduction", "elimination", "singleReference", 
			"rangeReference", "function"
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
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					premiseLine();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(46);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(44);
						proofLine();
						}
						break;
					case ASSUME:
						{
						setState(45);
						subproof();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(51);
			conclusionLine();
			setState(52);
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
			setState(54);
			assume();
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(57);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSUME:
						{
						setState(55);
						subproof();
						}
						break;
					case INT:
						{
						setState(56);
						proofLine();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(62);
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
			setState(64);
			match(ASSUME);
			setState(65);
			match(NEWLINE);
			setState(66);
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
			setState(68);
			conclusionLine();
			setState(69);
			match(QED);
			setState(70);
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
			setState(72);
			proofLineNum();
			setState(73);
			premiseInference();
			setState(74);
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
			setState(76);
			proofLineNum();
			setState(77);
			inference();
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
			setState(80);
			proofLineNum();
			setState(81);
			inference();
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
			setState(84);
			match(INT);
			setState(85);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRADICTION:
				_localctx = new PremiseContradictionInferContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(87);
					contradiction();
					}
					}
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONTRADICTION );
				setState(92);
				match(T__1);
				}
				break;
			case T__2:
			case ATOM:
			case NEGATION:
				_localctx = new PremiseSentenceInferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(94);
					sentence(0);
					}
					}
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 24584L) != 0 );
				setState(99);
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
		try {
			int _alt;
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTRADICTION:
				_localctx = new ContradictionInferContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(103);
						contradiction();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(106); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(108);
				justification();
				}
				break;
			case T__2:
			case ATOM:
			case NEGATION:
				_localctx = new SentenceInferContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(110);
						sentence(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(113); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(115);
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
		enterRule(_localctx, 20, RULE_contradiction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_sentence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(122);
				match(ATOM);
				}
				break;
			case 2:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				function();
				}
				break;
			case 3:
				{
				_localctx = new NormalSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(NEGATION);
				setState(125);
				sentence(7);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesesSentenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(T__2);
				setState(127);
				sentence(0);
				setState(128);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						match(CONJUNCTION);
						setState(134);
						sentence(6);
						}
						break;
					case 2:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(135);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(136);
						match(DISJUNCTION);
						setState(137);
						sentence(5);
						}
						break;
					case 3:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(138);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(139);
						match(IDENTITY);
						setState(140);
						sentence(4);
						}
						break;
					case 4:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(141);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(142);
						match(IMPLICATION);
						setState(143);
						sentence(3);
						}
						break;
					case 5:
						{
						_localctx = new NormalSentenceContext(new SentenceContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_sentence);
						setState(144);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(145);
						match(BICONDITIONAL);
						setState(146);
						sentence(2);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 24, RULE_justification);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ReitJustContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				reiteration();
				}
				break;
			case 2:
				_localctx = new ElimJustContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				elimination();
				}
				break;
			case 3:
				_localctx = new IntroJustContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
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
		enterRule(_localctx, 26, RULE_reiteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__4);
			setState(158);
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
		enterRule(_localctx, 28, RULE_introduction);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				_localctx = new NegationIntroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(NEGATION);
				setState(161);
				match(T__5);
				setState(162);
				rangeReference();
				}
				break;
			case CONTRADICTION:
				_localctx = new ContradictionIntroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(CONTRADICTION);
				setState(164);
				match(T__5);
				setState(165);
				singleReference();
				setState(166);
				match(T__6);
				setState(167);
				singleReference();
				}
				break;
			case CONJUNCTION:
				_localctx = new ConjunctionIntroContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(CONJUNCTION);
				setState(170);
				match(T__5);
				setState(171);
				singleReference();
				setState(172);
				match(T__6);
				setState(173);
				singleReference();
				}
				break;
			case DISJUNCTION:
				_localctx = new DisjunctionIntroContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				match(DISJUNCTION);
				setState(176);
				match(T__5);
				setState(177);
				singleReference();
				}
				break;
			case IDENTITY:
				_localctx = new IdentityIntroContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(IDENTITY);
				setState(179);
				match(T__7);
				}
				break;
			case IMPLICATION:
				_localctx = new ImplicationIntroContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				match(IMPLICATION);
				setState(181);
				match(T__5);
				setState(182);
				rangeReference();
				}
				break;
			case BICONDITIONAL:
				_localctx = new BiconditionalIntroContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				match(BICONDITIONAL);
				setState(184);
				match(T__5);
				setState(185);
				rangeReference();
				setState(186);
				match(T__6);
				setState(187);
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
		enterRule(_localctx, 30, RULE_elimination);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATION:
				_localctx = new NegationElimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(NEGATION);
				setState(192);
				match(T__8);
				setState(193);
				singleReference();
				}
				break;
			case CONTRADICTION:
				_localctx = new ContradictionElimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(CONTRADICTION);
				setState(195);
				match(T__8);
				setState(196);
				singleReference();
				}
				break;
			case CONJUNCTION:
				_localctx = new ConjunctionElimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(CONJUNCTION);
				setState(198);
				match(T__8);
				setState(199);
				singleReference();
				}
				break;
			case DISJUNCTION:
				_localctx = new DisjunctionElimContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(DISJUNCTION);
				setState(201);
				match(T__8);
				setState(202);
				singleReference();
				setState(203);
				match(T__6);
				setState(204);
				rangeReference();
				setState(205);
				match(T__6);
				setState(206);
				rangeReference();
				}
				break;
			case IDENTITY:
				_localctx = new IdentityElimContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				match(IDENTITY);
				setState(209);
				match(T__8);
				setState(210);
				singleReference();
				setState(211);
				match(T__6);
				setState(212);
				singleReference();
				}
				break;
			case IMPLICATION:
				_localctx = new ImplicationElimContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				match(IMPLICATION);
				setState(215);
				match(T__8);
				setState(216);
				singleReference();
				setState(217);
				match(T__6);
				setState(218);
				singleReference();
				}
				break;
			case BICONDITIONAL:
				_localctx = new BiconditionalElimContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				match(BICONDITIONAL);
				setState(221);
				match(T__8);
				setState(222);
				singleReference();
				setState(223);
				match(T__6);
				setState(224);
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
		enterRule(_localctx, 32, RULE_singleReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		enterRule(_localctx, 34, RULE_rangeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(INT);
			setState(231);
			match(T__9);
			setState(232);
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
		enterRule(_localctx, 36, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(ATOM);
			setState(235);
			match(T__2);
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==CONSTANT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(237);
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
		case 11:
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
		"\u0004\u0001\u0019\u00f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\b"+
		"Y\b\b\u000b\b\f\bZ\u0001\b\u0001\b\u0001\b\u0004\b`\b\b\u000b\b\f\ba\u0001"+
		"\b\u0001\b\u0003\bf\b\b\u0001\t\u0004\ti\b\t\u000b\t\f\tj\u0001\t\u0001"+
		"\t\u0001\t\u0004\tp\b\t\u000b\t\f\tq\u0001\t\u0001\t\u0003\tv\b\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0083\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0094\b\u000b\n\u000b"+
		"\f\u000b\u0097\t\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u009c\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00be\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00e3\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0001\u0016\u0013\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$\u0000\u0001\u0001\u0000\u000b\f\u00fd\u0000)\u0001\u0000\u0000"+
		"\u0000\u00026\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006"+
		"D\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000"+
		"\u0000\fP\u0001\u0000\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010"+
		"e\u0001\u0000\u0000\u0000\u0012u\u0001\u0000\u0000\u0000\u0014w\u0001"+
		"\u0000\u0000\u0000\u0016\u0082\u0001\u0000\u0000\u0000\u0018\u009b\u0001"+
		"\u0000\u0000\u0000\u001a\u009d\u0001\u0000\u0000\u0000\u001c\u00bd\u0001"+
		"\u0000\u0000\u0000\u001e\u00e2\u0001\u0000\u0000\u0000 \u00e4\u0001\u0000"+
		"\u0000\u0000\"\u00e6\u0001\u0000\u0000\u0000$\u00ea\u0001\u0000\u0000"+
		"\u0000&(\u0003\b\u0004\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*0\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,/\u0003\n\u0005\u0000-/\u0003"+
		"\u0002\u0001\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000"+
		"/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u000013\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0003\f\u0006"+
		"\u000045\u0005\u0000\u0000\u00015\u0001\u0001\u0000\u0000\u00006;\u0003"+
		"\u0004\u0002\u00007:\u0003\u0002\u0001\u00008:\u0003\n\u0005\u000097\u0001"+
		"\u0000\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>?\u0003\u0006\u0003\u0000?\u0003\u0001"+
		"\u0000\u0000\u0000@A\u0005\u0015\u0000\u0000AB\u0005\u0018\u0000\u0000"+
		"BC\u0003\b\u0004\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0003\f\u0006"+
		"\u0000EF\u0005\u0016\u0000\u0000FG\u0005\u0018\u0000\u0000G\u0007\u0001"+
		"\u0000\u0000\u0000HI\u0003\u000e\u0007\u0000IJ\u0003\u0010\b\u0000JK\u0005"+
		"\u0018\u0000\u0000K\t\u0001\u0000\u0000\u0000LM\u0003\u000e\u0007\u0000"+
		"MN\u0003\u0012\t\u0000NO\u0005\u0018\u0000\u0000O\u000b\u0001\u0000\u0000"+
		"\u0000PQ\u0003\u000e\u0007\u0000QR\u0003\u0012\t\u0000RS\u0005\u0018\u0000"+
		"\u0000S\r\u0001\u0000\u0000\u0000TU\u0005\u0017\u0000\u0000UV\u0005\u0001"+
		"\u0000\u0000V\u000f\u0001\u0000\u0000\u0000WY\u0003\u0014\n\u0000XW\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0005\u0002\u0000"+
		"\u0000]f\u0001\u0000\u0000\u0000^`\u0003\u0016\u000b\u0000_^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005\u0002\u0000\u0000"+
		"df\u0001\u0000\u0000\u0000eX\u0001\u0000\u0000\u0000e_\u0001\u0000\u0000"+
		"\u0000f\u0011\u0001\u0000\u0000\u0000gi\u0003\u0014\n\u0000hg\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0003\u0018\f\u0000mv\u0001"+
		"\u0000\u0000\u0000np\u0003\u0016\u000b\u0000on\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000st\u0003\u0018\f\u0000tv\u0001\u0000\u0000"+
		"\u0000uh\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000\u0000v\u0013\u0001"+
		"\u0000\u0000\u0000wx\u0005\u000f\u0000\u0000x\u0015\u0001\u0000\u0000"+
		"\u0000yz\u0006\u000b\uffff\uffff\u0000z\u0083\u0005\r\u0000\u0000{\u0083"+
		"\u0003$\u0012\u0000|}\u0005\u000e\u0000\u0000}\u0083\u0003\u0016\u000b"+
		"\u0007~\u007f\u0005\u0003\u0000\u0000\u007f\u0080\u0003\u0016\u000b\u0000"+
		"\u0080\u0081\u0005\u0004\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000"+
		"\u0082y\u0001\u0000\u0000\u0000\u0082{\u0001\u0000\u0000\u0000\u0082|"+
		"\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0083\u0095\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\n\u0005\u0000\u0000\u0085\u0086\u0005\u0010"+
		"\u0000\u0000\u0086\u0094\u0003\u0016\u000b\u0006\u0087\u0088\n\u0004\u0000"+
		"\u0000\u0088\u0089\u0005\u0011\u0000\u0000\u0089\u0094\u0003\u0016\u000b"+
		"\u0005\u008a\u008b\n\u0003\u0000\u0000\u008b\u008c\u0005\u0012\u0000\u0000"+
		"\u008c\u0094\u0003\u0016\u000b\u0004\u008d\u008e\n\u0002\u0000\u0000\u008e"+
		"\u008f\u0005\u0013\u0000\u0000\u008f\u0094\u0003\u0016\u000b\u0003\u0090"+
		"\u0091\n\u0001\u0000\u0000\u0091\u0092\u0005\u0014\u0000\u0000\u0092\u0094"+
		"\u0003\u0016\u000b\u0002\u0093\u0084\u0001\u0000\u0000\u0000\u0093\u0087"+
		"\u0001\u0000\u0000\u0000\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u008d"+
		"\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0094\u0097"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0017\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0098\u009c\u0003\u001a\r\u0000\u0099\u009c\u0003"+
		"\u001e\u000f\u0000\u009a\u009c\u0003\u001c\u000e\u0000\u009b\u0098\u0001"+
		"\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u0019\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\u0005\u0000\u0000\u009e\u009f\u0003 \u0010\u0000\u009f\u001b\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\u000e\u0000\u0000\u00a1\u00a2\u0005\u0006"+
		"\u0000\u0000\u00a2\u00be\u0003\"\u0011\u0000\u00a3\u00a4\u0005\u000f\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0006\u0000\u0000\u00a5\u00a6\u0003 \u0010\u0000"+
		"\u00a6\u00a7\u0005\u0007\u0000\u0000\u00a7\u00a8\u0003 \u0010\u0000\u00a8"+
		"\u00be\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0010\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0006\u0000\u0000\u00ab\u00ac\u0003 \u0010\u0000\u00ac\u00ad"+
		"\u0005\u0007\u0000\u0000\u00ad\u00ae\u0003 \u0010\u0000\u00ae\u00be\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0005\u0011\u0000\u0000\u00b0\u00b1\u0005"+
		"\u0006\u0000\u0000\u00b1\u00be\u0003 \u0010\u0000\u00b2\u00b3\u0005\u0012"+
		"\u0000\u0000\u00b3\u00be\u0005\b\u0000\u0000\u00b4\u00b5\u0005\u0013\u0000"+
		"\u0000\u00b5\u00b6\u0005\u0006\u0000\u0000\u00b6\u00be\u0003\"\u0011\u0000"+
		"\u00b7\u00b8\u0005\u0014\u0000\u0000\u00b8\u00b9\u0005\u0006\u0000\u0000"+
		"\u00b9\u00ba\u0003\"\u0011\u0000\u00ba\u00bb\u0005\u0007\u0000\u0000\u00bb"+
		"\u00bc\u0003\"\u0011\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00a0"+
		"\u0001\u0000\u0000\u0000\u00bd\u00a3\u0001\u0000\u0000\u0000\u00bd\u00a9"+
		"\u0001\u0000\u0000\u0000\u00bd\u00af\u0001\u0000\u0000\u0000\u00bd\u00b2"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b4\u0001\u0000\u0000\u0000\u00bd\u00b7"+
		"\u0001\u0000\u0000\u0000\u00be\u001d\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005\u000e\u0000\u0000\u00c0\u00c1\u0005\t\u0000\u0000\u00c1\u00e3\u0003"+
		" \u0010\u0000\u00c2\u00c3\u0005\u000f\u0000\u0000\u00c3\u00c4\u0005\t"+
		"\u0000\u0000\u00c4\u00e3\u0003 \u0010\u0000\u00c5\u00c6\u0005\u0010\u0000"+
		"\u0000\u00c6\u00c7\u0005\t\u0000\u0000\u00c7\u00e3\u0003 \u0010\u0000"+
		"\u00c8\u00c9\u0005\u0011\u0000\u0000\u00c9\u00ca\u0005\t\u0000\u0000\u00ca"+
		"\u00cb\u0003 \u0010\u0000\u00cb\u00cc\u0005\u0007\u0000\u0000\u00cc\u00cd"+
		"\u0003\"\u0011\u0000\u00cd\u00ce\u0005\u0007\u0000\u0000\u00ce\u00cf\u0003"+
		"\"\u0011\u0000\u00cf\u00e3\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0012"+
		"\u0000\u0000\u00d1\u00d2\u0005\t\u0000\u0000\u00d2\u00d3\u0003 \u0010"+
		"\u0000\u00d3\u00d4\u0005\u0007\u0000\u0000\u00d4\u00d5\u0003 \u0010\u0000"+
		"\u00d5\u00e3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0013\u0000\u0000"+
		"\u00d7\u00d8\u0005\t\u0000\u0000\u00d8\u00d9\u0003 \u0010\u0000\u00d9"+
		"\u00da\u0005\u0007\u0000\u0000\u00da\u00db\u0003 \u0010\u0000\u00db\u00e3"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0014\u0000\u0000\u00dd\u00de"+
		"\u0005\t\u0000\u0000\u00de\u00df\u0003 \u0010\u0000\u00df\u00e0\u0005"+
		"\u0007\u0000\u0000\u00e0\u00e1\u0003 \u0010\u0000\u00e1\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e2\u00bf\u0001\u0000\u0000\u0000\u00e2\u00c2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00c5\u0001\u0000\u0000\u0000\u00e2\u00c8\u0001\u0000"+
		"\u0000\u0000\u00e2\u00d0\u0001\u0000\u0000\u0000\u00e2\u00d6\u0001\u0000"+
		"\u0000\u0000\u00e2\u00dc\u0001\u0000\u0000\u0000\u00e3\u001f\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0005\u0017\u0000\u0000\u00e5!\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005\u0017\u0000\u0000\u00e7\u00e8\u0005\n\u0000\u0000"+
		"\u00e8\u00e9\u0005\u0017\u0000\u0000\u00e9#\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0005\r\u0000\u0000\u00eb\u00ec\u0005\u0003\u0000\u0000\u00ec\u00ed"+
		"\u0007\u0000\u0000\u0000\u00ed\u00ee\u0005\u0004\u0000\u0000\u00ee%\u0001"+
		"\u0000\u0000\u0000\u0011).09;Zaejqu\u0082\u0093\u0095\u009b\u00bd\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}