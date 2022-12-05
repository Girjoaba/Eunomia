// Generated from java-escape by ANTLR 4.11.1
package nl.rug.parsers.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FitchGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENTITY=7, NEGATION=8, 
		CONJUNCTION=9, DISJUNCTION=10, IMPLICATION=11, BICONDITIONAL=12, EXISTENTIAL=13, 
		UNIVERSAL=14, ATOM=15, VARIABLE=16, CONSTANT=17, NUMBER=18;
	public static final int
		RULE_sentence = 0, RULE_contradiction = 1, RULE_expression = 2, RULE_justification = 3, 
		RULE_premise = 4, RULE_introduction = 5, RULE_elimination = 6, RULE_single_reference = 7, 
		RULE_multiple_reference = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentence", "contradiction", "expression", "justification", "premise", 
			"introduction", "elimination", "single_reference", "multiple_reference"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FitchGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public JustificationContext justification() {
			return getRuleContext(JustificationContext.class,0);
		}
		public List<ContradictionContext> contradiction() {
			return getRuleContexts(ContradictionContext.class);
		}
		public ContradictionContext contradiction(int i) {
			return getRuleContext(ContradictionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FitchGrammarVisitor ) return ((FitchGrammarVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(20);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(18);
						contradiction();
						}
						break;
					case NEGATION:
					case EXISTENTIAL:
					case UNIVERSAL:
					case ATOM:
						{
						setState(19);
						expression(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(22); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(24);
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
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).enterContradiction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).exitContradiction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FitchGrammarVisitor ) return ((FitchGrammarVisitor<? extends T>)visitor).visitContradiction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContradictionContext contradiction() throws RecognitionException {
		ContradictionContext _localctx = new ContradictionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_contradiction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ATOM() { return getToken(FitchGrammarParser.ATOM, 0); }
		public TerminalNode NEGATION() { return getToken(FitchGrammarParser.NEGATION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXISTENTIAL() { return getToken(FitchGrammarParser.EXISTENTIAL, 0); }
		public TerminalNode VARIABLE() { return getToken(FitchGrammarParser.VARIABLE, 0); }
		public TerminalNode UNIVERSAL() { return getToken(FitchGrammarParser.UNIVERSAL, 0); }
		public TerminalNode IDENTITY() { return getToken(FitchGrammarParser.IDENTITY, 0); }
		public TerminalNode CONJUNCTION() { return getToken(FitchGrammarParser.CONJUNCTION, 0); }
		public TerminalNode DISJUNCTION() { return getToken(FitchGrammarParser.DISJUNCTION, 0); }
		public TerminalNode IMPLICATION() { return getToken(FitchGrammarParser.IMPLICATION, 0); }
		public TerminalNode BICONDITIONAL() { return getToken(FitchGrammarParser.BICONDITIONAL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FitchGrammarVisitor ) return ((FitchGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOM:
				{
				setState(29);
				match(ATOM);
				}
				break;
			case NEGATION:
				{
				setState(30);
				match(NEGATION);
				setState(31);
				expression(7);
				}
				break;
			case EXISTENTIAL:
				{
				setState(32);
				match(EXISTENTIAL);
				setState(33);
				match(VARIABLE);
				setState(34);
				expression(2);
				}
				break;
			case UNIVERSAL:
				{
				setState(35);
				match(UNIVERSAL);
				setState(36);
				match(VARIABLE);
				setState(37);
				expression(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(40);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(41);
						match(IDENTITY);
						setState(42);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(43);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(44);
						match(CONJUNCTION);
						setState(45);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(46);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(47);
						match(DISJUNCTION);
						setState(48);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(49);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(50);
						match(IMPLICATION);
						setState(51);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(52);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(53);
						match(BICONDITIONAL);
						setState(54);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).enterJustification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).exitJustification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FitchGrammarVisitor ) return ((FitchGrammarVisitor<? extends T>)visitor).visitJustification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JustificationContext justification() throws RecognitionException {
		JustificationContext _localctx = new JustificationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_justification);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				premise();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				elimination();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
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
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).enterPremise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).exitPremise(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FitchGrammarVisitor ) return ((FitchGrammarVisitor<? extends T>)visitor).visitPremise(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PremiseContext premise() throws RecognitionException {
		PremiseContext _localctx = new PremiseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_premise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
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
	public static class IntroductionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTITY() { return getTokens(FitchGrammarParser.IDENTITY); }
		public TerminalNode IDENTITY(int i) {
			return getToken(FitchGrammarParser.IDENTITY, i);
		}
		public List<Multiple_referenceContext> multiple_reference() {
			return getRuleContexts(Multiple_referenceContext.class);
		}
		public Multiple_referenceContext multiple_reference(int i) {
			return getRuleContext(Multiple_referenceContext.class,i);
		}
		public List<TerminalNode> NEGATION() { return getTokens(FitchGrammarParser.NEGATION); }
		public TerminalNode NEGATION(int i) {
			return getToken(FitchGrammarParser.NEGATION, i);
		}
		public List<Single_referenceContext> single_reference() {
			return getRuleContexts(Single_referenceContext.class);
		}
		public Single_referenceContext single_reference(int i) {
			return getRuleContext(Single_referenceContext.class,i);
		}
		public List<TerminalNode> CONJUNCTION() { return getTokens(FitchGrammarParser.CONJUNCTION); }
		public TerminalNode CONJUNCTION(int i) {
			return getToken(FitchGrammarParser.CONJUNCTION, i);
		}
		public List<TerminalNode> DISJUNCTION() { return getTokens(FitchGrammarParser.DISJUNCTION); }
		public TerminalNode DISJUNCTION(int i) {
			return getToken(FitchGrammarParser.DISJUNCTION, i);
		}
		public List<TerminalNode> IMPLICATION() { return getTokens(FitchGrammarParser.IMPLICATION); }
		public TerminalNode IMPLICATION(int i) {
			return getToken(FitchGrammarParser.IMPLICATION, i);
		}
		public List<TerminalNode> BICONDITIONAL() { return getTokens(FitchGrammarParser.BICONDITIONAL); }
		public TerminalNode BICONDITIONAL(int i) {
			return getToken(FitchGrammarParser.BICONDITIONAL, i);
		}
		public List<TerminalNode> EXISTENTIAL() { return getTokens(FitchGrammarParser.EXISTENTIAL); }
		public TerminalNode EXISTENTIAL(int i) {
			return getToken(FitchGrammarParser.EXISTENTIAL, i);
		}
		public List<TerminalNode> UNIVERSAL() { return getTokens(FitchGrammarParser.UNIVERSAL); }
		public TerminalNode UNIVERSAL(int i) {
			return getToken(FitchGrammarParser.UNIVERSAL, i);
		}
		public IntroductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_introduction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).enterIntroduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).exitIntroduction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FitchGrammarVisitor ) return ((FitchGrammarVisitor<? extends T>)visitor).visitIntroduction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntroductionContext introduction() throws RecognitionException {
		IntroductionContext _localctx = new IntroductionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_introduction);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67);
					match(IDENTITY);
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTITY );
				setState(72);
				match(T__2);
				}
				break;
			case NEGATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					match(NEGATION);
					}
					}
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEGATION );
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					match(T__2);
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(83);
				multiple_reference();
				}
				break;
			case CONJUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					match(CONJUNCTION);
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONJUNCTION );
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					match(T__2);
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(94);
					single_reference();
					}
					}
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					match(T__3);
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(104);
				single_reference();
				}
				break;
			case DISJUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					match(DISJUNCTION);
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DISJUNCTION );
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					match(T__2);
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(116);
				single_reference();
				}
				break;
			case IMPLICATION:
				enterOuterAlt(_localctx, 5);
				{
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					match(IMPLICATION);
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IMPLICATION );
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(122);
					match(T__2);
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(127);
				multiple_reference();
				}
				break;
			case BICONDITIONAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128);
					match(BICONDITIONAL);
					}
					}
					setState(131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BICONDITIONAL );
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(133);
					match(T__2);
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					multiple_reference();
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143);
					match(T__3);
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(148);
				multiple_reference();
				}
				break;
			case EXISTENTIAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					match(EXISTENTIAL);
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXISTENTIAL );
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					match(T__2);
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(160);
				single_reference();
				}
				break;
			case UNIVERSAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					match(UNIVERSAL);
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==UNIVERSAL );
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					match(T__2);
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(171);
				multiple_reference();
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
		public List<Single_referenceContext> single_reference() {
			return getRuleContexts(Single_referenceContext.class);
		}
		public Single_referenceContext single_reference(int i) {
			return getRuleContext(Single_referenceContext.class,i);
		}
		public List<TerminalNode> IDENTITY() { return getTokens(FitchGrammarParser.IDENTITY); }
		public TerminalNode IDENTITY(int i) {
			return getToken(FitchGrammarParser.IDENTITY, i);
		}
		public List<TerminalNode> NEGATION() { return getTokens(FitchGrammarParser.NEGATION); }
		public TerminalNode NEGATION(int i) {
			return getToken(FitchGrammarParser.NEGATION, i);
		}
		public List<TerminalNode> CONJUNCTION() { return getTokens(FitchGrammarParser.CONJUNCTION); }
		public TerminalNode CONJUNCTION(int i) {
			return getToken(FitchGrammarParser.CONJUNCTION, i);
		}
		public List<Multiple_referenceContext> multiple_reference() {
			return getRuleContexts(Multiple_referenceContext.class);
		}
		public Multiple_referenceContext multiple_reference(int i) {
			return getRuleContext(Multiple_referenceContext.class,i);
		}
		public List<TerminalNode> DISJUNCTION() { return getTokens(FitchGrammarParser.DISJUNCTION); }
		public TerminalNode DISJUNCTION(int i) {
			return getToken(FitchGrammarParser.DISJUNCTION, i);
		}
		public List<TerminalNode> IMPLICATION() { return getTokens(FitchGrammarParser.IMPLICATION); }
		public TerminalNode IMPLICATION(int i) {
			return getToken(FitchGrammarParser.IMPLICATION, i);
		}
		public List<TerminalNode> BICONDITIONAL() { return getTokens(FitchGrammarParser.BICONDITIONAL); }
		public TerminalNode BICONDITIONAL(int i) {
			return getToken(FitchGrammarParser.BICONDITIONAL, i);
		}
		public List<TerminalNode> EXISTENTIAL() { return getTokens(FitchGrammarParser.EXISTENTIAL); }
		public TerminalNode EXISTENTIAL(int i) {
			return getToken(FitchGrammarParser.EXISTENTIAL, i);
		}
		public List<TerminalNode> UNIVERSAL() { return getTokens(FitchGrammarParser.UNIVERSAL); }
		public TerminalNode UNIVERSAL(int i) {
			return getToken(FitchGrammarParser.UNIVERSAL, i);
		}
		public EliminationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elimination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).enterElimination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).exitElimination(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FitchGrammarVisitor ) return ((FitchGrammarVisitor<? extends T>)visitor).visitElimination(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EliminationContext elimination() throws RecognitionException {
		EliminationContext _localctx = new EliminationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elimination);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(174);
					match(IDENTITY);
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTITY );
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(179);
					match(T__4);
					}
					}
					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					single_reference();
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(189);
					match(T__3);
					}
					}
					setState(192); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(194);
				single_reference();
				}
				break;
			case NEGATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(196);
					match(NEGATION);
					}
					}
					setState(199); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEGATION );
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(201);
					match(T__4);
					}
					}
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(206);
				single_reference();
				}
				break;
			case CONJUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(207);
					match(CONJUNCTION);
					}
					}
					setState(210); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CONJUNCTION );
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(212);
					match(T__4);
					}
					}
					setState(215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(217);
				single_reference();
				}
				break;
			case DISJUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(218);
					match(DISJUNCTION);
					}
					}
					setState(221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DISJUNCTION );
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(223);
					match(T__4);
					}
					}
					setState(226); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(228);
					single_reference();
					}
					}
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(233);
					match(T__3);
					}
					}
					setState(236); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(238);
					multiple_reference();
					}
					}
					setState(241); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(243);
					match(T__3);
					}
					}
					setState(246); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(248);
				multiple_reference();
				}
				break;
			case IMPLICATION:
				enterOuterAlt(_localctx, 5);
				{
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(250);
					match(IMPLICATION);
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IMPLICATION );
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(255);
					match(T__4);
					}
					}
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(260);
					single_reference();
					}
					}
					setState(263); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(265);
					match(T__3);
					}
					}
					setState(268); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(270);
				single_reference();
				}
				break;
			case BICONDITIONAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(272);
					match(BICONDITIONAL);
					}
					}
					setState(275); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BICONDITIONAL );
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(277);
					match(T__4);
					}
					}
					setState(280); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(282);
					single_reference();
					}
					}
					setState(285); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(288); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(287);
					match(T__3);
					}
					}
					setState(290); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(292);
				single_reference();
				}
				break;
			case EXISTENTIAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(294);
					match(EXISTENTIAL);
					}
					}
					setState(297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXISTENTIAL );
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(299);
					match(T__4);
					}
					}
					setState(302); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(304);
					single_reference();
					}
					}
					setState(307); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(309);
					match(T__3);
					}
					}
					setState(312); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(314);
				multiple_reference();
				}
				break;
			case UNIVERSAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(316);
					match(UNIVERSAL);
					}
					}
					setState(319); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==UNIVERSAL );
				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(321);
					match(T__4);
					}
					}
					setState(324); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__4 );
				setState(326);
				single_reference();
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
	public static class Single_referenceContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(FitchGrammarParser.NUMBER, 0); }
		public Single_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).enterSingle_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).exitSingle_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FitchGrammarVisitor ) return ((FitchGrammarVisitor<? extends T>)visitor).visitSingle_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_referenceContext single_reference() throws RecognitionException {
		Single_referenceContext _localctx = new Single_referenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_single_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(NUMBER);
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
	public static class Multiple_referenceContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(FitchGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(FitchGrammarParser.NUMBER, i);
		}
		public Multiple_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).enterMultiple_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FitchGrammarListener ) ((FitchGrammarListener)listener).exitMultiple_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FitchGrammarVisitor ) return ((FitchGrammarVisitor<? extends T>)visitor).visitMultiple_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_referenceContext multiple_reference() throws RecognitionException {
		Multiple_referenceContext _localctx = new Multiple_referenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiple_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(331);
				match(NUMBER);
				}
				}
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(337); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(336);
				match(T__5);
				}
				}
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(341);
			match(NUMBER);
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
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
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
		"\u0004\u0001\u0012\u0158\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0004\u0000\u0015\b\u0000\u000b"+
		"\u0000\f\u0000\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u00028\b\u0002\n\u0002\f\u0002;\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003@\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0004\u0005E\b\u0005\u000b\u0005\f\u0005"+
		"F\u0001\u0005\u0001\u0005\u0004\u0005K\b\u0005\u000b\u0005\f\u0005L\u0001"+
		"\u0005\u0004\u0005P\b\u0005\u000b\u0005\f\u0005Q\u0001\u0005\u0001\u0005"+
		"\u0004\u0005V\b\u0005\u000b\u0005\f\u0005W\u0001\u0005\u0004\u0005[\b"+
		"\u0005\u000b\u0005\f\u0005\\\u0001\u0005\u0004\u0005`\b\u0005\u000b\u0005"+
		"\f\u0005a\u0001\u0005\u0004\u0005e\b\u0005\u000b\u0005\f\u0005f\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005l\b\u0005\u000b\u0005\f\u0005"+
		"m\u0001\u0005\u0004\u0005q\b\u0005\u000b\u0005\f\u0005r\u0001\u0005\u0001"+
		"\u0005\u0004\u0005w\b\u0005\u000b\u0005\f\u0005x\u0001\u0005\u0004\u0005"+
		"|\b\u0005\u000b\u0005\f\u0005}\u0001\u0005\u0001\u0005\u0004\u0005\u0082"+
		"\b\u0005\u000b\u0005\f\u0005\u0083\u0001\u0005\u0004\u0005\u0087\b\u0005"+
		"\u000b\u0005\f\u0005\u0088\u0001\u0005\u0004\u0005\u008c\b\u0005\u000b"+
		"\u0005\f\u0005\u008d\u0001\u0005\u0004\u0005\u0091\b\u0005\u000b\u0005"+
		"\f\u0005\u0092\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u0098\b"+
		"\u0005\u000b\u0005\f\u0005\u0099\u0001\u0005\u0004\u0005\u009d\b\u0005"+
		"\u000b\u0005\f\u0005\u009e\u0001\u0005\u0001\u0005\u0004\u0005\u00a3\b"+
		"\u0005\u000b\u0005\f\u0005\u00a4\u0001\u0005\u0004\u0005\u00a8\b\u0005"+
		"\u000b\u0005\f\u0005\u00a9\u0001\u0005\u0003\u0005\u00ad\b\u0005\u0001"+
		"\u0006\u0004\u0006\u00b0\b\u0006\u000b\u0006\f\u0006\u00b1\u0001\u0006"+
		"\u0004\u0006\u00b5\b\u0006\u000b\u0006\f\u0006\u00b6\u0001\u0006\u0004"+
		"\u0006\u00ba\b\u0006\u000b\u0006\f\u0006\u00bb\u0001\u0006\u0004\u0006"+
		"\u00bf\b\u0006\u000b\u0006\f\u0006\u00c0\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0004\u0006\u00c6\b\u0006\u000b\u0006\f\u0006\u00c7\u0001\u0006"+
		"\u0004\u0006\u00cb\b\u0006\u000b\u0006\f\u0006\u00cc\u0001\u0006\u0001"+
		"\u0006\u0004\u0006\u00d1\b\u0006\u000b\u0006\f\u0006\u00d2\u0001\u0006"+
		"\u0004\u0006\u00d6\b\u0006\u000b\u0006\f\u0006\u00d7\u0001\u0006\u0001"+
		"\u0006\u0004\u0006\u00dc\b\u0006\u000b\u0006\f\u0006\u00dd\u0001\u0006"+
		"\u0004\u0006\u00e1\b\u0006\u000b\u0006\f\u0006\u00e2\u0001\u0006\u0004"+
		"\u0006\u00e6\b\u0006\u000b\u0006\f\u0006\u00e7\u0001\u0006\u0004\u0006"+
		"\u00eb\b\u0006\u000b\u0006\f\u0006\u00ec\u0001\u0006\u0004\u0006\u00f0"+
		"\b\u0006\u000b\u0006\f\u0006\u00f1\u0001\u0006\u0004\u0006\u00f5\b\u0006"+
		"\u000b\u0006\f\u0006\u00f6\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"\u00fc\b\u0006\u000b\u0006\f\u0006\u00fd\u0001\u0006\u0004\u0006\u0101"+
		"\b\u0006\u000b\u0006\f\u0006\u0102\u0001\u0006\u0004\u0006\u0106\b\u0006"+
		"\u000b\u0006\f\u0006\u0107\u0001\u0006\u0004\u0006\u010b\b\u0006\u000b"+
		"\u0006\f\u0006\u010c\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u0112"+
		"\b\u0006\u000b\u0006\f\u0006\u0113\u0001\u0006\u0004\u0006\u0117\b\u0006"+
		"\u000b\u0006\f\u0006\u0118\u0001\u0006\u0004\u0006\u011c\b\u0006\u000b"+
		"\u0006\f\u0006\u011d\u0001\u0006\u0004\u0006\u0121\b\u0006\u000b\u0006"+
		"\f\u0006\u0122\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u0128\b"+
		"\u0006\u000b\u0006\f\u0006\u0129\u0001\u0006\u0004\u0006\u012d\b\u0006"+
		"\u000b\u0006\f\u0006\u012e\u0001\u0006\u0004\u0006\u0132\b\u0006\u000b"+
		"\u0006\f\u0006\u0133\u0001\u0006\u0004\u0006\u0137\b\u0006\u000b\u0006"+
		"\f\u0006\u0138\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u013e\b"+
		"\u0006\u000b\u0006\f\u0006\u013f\u0001\u0006\u0004\u0006\u0143\b\u0006"+
		"\u000b\u0006\f\u0006\u0144\u0001\u0006\u0003\u0006\u0148\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0004\b\u014d\b\b\u000b\b\f\b\u014e\u0001\b"+
		"\u0004\b\u0152\b\b\u000b\b\f\b\u0153\u0001\b\u0001\b\u0001\b\u0000\u0001"+
		"\u0004\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000\u0199\u0000"+
		"\u0014\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004"+
		"&\u0001\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\bA\u0001\u0000"+
		"\u0000\u0000\n\u00ac\u0001\u0000\u0000\u0000\f\u0147\u0001\u0000\u0000"+
		"\u0000\u000e\u0149\u0001\u0000\u0000\u0000\u0010\u014c\u0001\u0000\u0000"+
		"\u0000\u0012\u0015\u0003\u0002\u0001\u0000\u0013\u0015\u0003\u0004\u0002"+
		"\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0003\u0006\u0003\u0000\u0019\u0001\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u0003\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0006\u0002\uffff\uffff\u0000\u001d\'\u0005\u000f\u0000"+
		"\u0000\u001e\u001f\u0005\b\u0000\u0000\u001f\'\u0003\u0004\u0002\u0007"+
		" !\u0005\r\u0000\u0000!\"\u0005\u0010\u0000\u0000\"\'\u0003\u0004\u0002"+
		"\u0002#$\u0005\u000e\u0000\u0000$%\u0005\u0010\u0000\u0000%\'\u0003\u0004"+
		"\u0002\u0001&\u001c\u0001\u0000\u0000\u0000&\u001e\u0001\u0000\u0000\u0000"+
		"& \u0001\u0000\u0000\u0000&#\u0001\u0000\u0000\u0000\'9\u0001\u0000\u0000"+
		"\u0000()\n\b\u0000\u0000)*\u0005\u0007\u0000\u0000*8\u0003\u0004\u0002"+
		"\t+,\n\u0006\u0000\u0000,-\u0005\t\u0000\u0000-8\u0003\u0004\u0002\u0007"+
		"./\n\u0005\u0000\u0000/0\u0005\n\u0000\u000008\u0003\u0004\u0002\u0006"+
		"12\n\u0004\u0000\u000023\u0005\u000b\u0000\u000038\u0003\u0004\u0002\u0005"+
		"45\n\u0003\u0000\u000056\u0005\f\u0000\u000068\u0003\u0004\u0002\u0004"+
		"7(\u0001\u0000\u0000\u00007+\u0001\u0000\u0000\u00007.\u0001\u0000\u0000"+
		"\u000071\u0001\u0000\u0000\u000074\u0001\u0000\u0000\u00008;\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u0005"+
		"\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<@\u0003\b\u0004\u0000"+
		"=@\u0003\f\u0006\u0000>@\u0003\n\u0005\u0000?<\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0007\u0001\u0000"+
		"\u0000\u0000AB\u0005\u0002\u0000\u0000B\t\u0001\u0000\u0000\u0000CE\u0005"+
		"\u0007\u0000\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000H\u00ad\u0005\u0003\u0000\u0000IK\u0005\b\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NP\u0005\u0003\u0000\u0000"+
		"ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u00ad\u0003"+
		"\u0010\b\u0000TV\u0005\t\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XZ\u0001\u0000\u0000\u0000Y[\u0005\u0003\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^`\u0003\u000e\u0007\u0000"+
		"_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000ce\u0005\u0004"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hi\u0003\u000e\u0007\u0000i\u00ad\u0001\u0000\u0000\u0000jl\u0005\n\u0000"+
		"\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000oq\u0005"+
		"\u0003\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000t\u00ad\u0003\u000e\u0007\u0000uw\u0005\u000b\u0000\u0000vu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000z|\u0005\u0003\u0000"+
		"\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u00ad\u0003\u0010\b\u0000\u0080\u0082\u0005\f\u0000\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u0087\u0005\u0003\u0000\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u008b\u0001\u0000\u0000\u0000\u008a\u008c\u0003\u0010\b\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0005\u0004\u0000\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0003\u0010\b\u0000\u0095\u00ad\u0001"+
		"\u0000\u0000\u0000\u0096\u0098\u0005\r\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000"+
		"\u0000\u0000\u009b\u009d\u0005\u0003\u0000\u0000\u009c\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00ad\u0003\u000e\u0007\u0000\u00a1\u00a3\u0005\u000e"+
		"\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0003"+
		"\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003\u0010"+
		"\b\u0000\u00acD\u0001\u0000\u0000\u0000\u00acJ\u0001\u0000\u0000\u0000"+
		"\u00acU\u0001\u0000\u0000\u0000\u00ack\u0001\u0000\u0000\u0000\u00acv"+
		"\u0001\u0000\u0000\u0000\u00ac\u0081\u0001\u0000\u0000\u0000\u00ac\u0097"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a2\u0001\u0000\u0000\u0000\u00ad\u000b"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005\u0007\u0000\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005\u0005\u0000\u0000\u00b4\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b8\u00ba\u0003\u000e\u0007\u0000\u00b9\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bf\u0005\u0004\u0000\u0000\u00be\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\u000e\u0007\u0000\u00c3\u0148"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c6\u0005\b\u0000\u0000\u00c5\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c9\u00cb\u0005\u0005\u0000\u0000\u00ca\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u0148\u0003\u000e\u0007\u0000\u00cf\u00d1\u0005"+
		"\t\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d6\u0005\u0005"+
		"\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u0148\u0003\u000e"+
		"\u0007\u0000\u00da\u00dc\u0005\n\u0000\u0000\u00db\u00da\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000"+
		"\u0000\u00df\u00e1\u0005\u0005\u0000\u0000\u00e0\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e6\u0003\u000e\u0007\u0000\u00e5\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000"+
		"\u0000\u00e9\u00eb\u0005\u0004\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f0\u0003\u0010\b\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f5\u0005\u0004\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0003\u0010\b\u0000\u00f9\u0148\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fc\u0005\u000b\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff"+
		"\u0101\u0005\u0005\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104"+
		"\u0106\u0003\u000e\u0007\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109"+
		"\u010b\u0005\u0004\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0003\u000e\u0007\u0000\u010f\u0148\u0001\u0000\u0000\u0000\u0110"+
		"\u0112\u0005\f\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0117"+
		"\u0005\u0005\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u011c"+
		"\u0003\u000e\u0007\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u0121"+
		"\u0005\u0004\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0003\u000e\u0007\u0000\u0125\u0148\u0001\u0000\u0000\u0000\u0126\u0128"+
		"\u0005\r\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001"+
		"\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001"+
		"\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b\u012d\u0005"+
		"\u0005\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001"+
		"\u0000\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u0132\u0003"+
		"\u000e\u0007\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001"+
		"\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u0137\u0005"+
		"\u0004\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0003"+
		"\u0010\b\u0000\u013b\u0148\u0001\u0000\u0000\u0000\u013c\u013e\u0005\u000e"+
		"\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000"+
		"\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000"+
		"\u0000\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u0143\u0005\u0005"+
		"\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0003\u000e"+
		"\u0007\u0000\u0147\u00af\u0001\u0000\u0000\u0000\u0147\u00c5\u0001\u0000"+
		"\u0000\u0000\u0147\u00d0\u0001\u0000\u0000\u0000\u0147\u00db\u0001\u0000"+
		"\u0000\u0000\u0147\u00fb\u0001\u0000\u0000\u0000\u0147\u0111\u0001\u0000"+
		"\u0000\u0000\u0147\u0127\u0001\u0000\u0000\u0000\u0147\u013d\u0001\u0000"+
		"\u0000\u0000\u0148\r\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0012\u0000"+
		"\u0000\u014a\u000f\u0001\u0000\u0000\u0000\u014b\u014d\u0005\u0012\u0000"+
		"\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u0152\u0005\u0006\u0000"+
		"\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u0012\u0000"+
		"\u0000\u0156\u0011\u0001\u0000\u0000\u00009\u0014\u0016&79?FLQW\\afmr"+
		"x}\u0083\u0088\u008d\u0092\u0099\u009e\u00a4\u00a9\u00ac\u00b1\u00b6\u00bb"+
		"\u00c0\u00c7\u00cc\u00d2\u00d7\u00dd\u00e2\u00e7\u00ec\u00f1\u00f6\u00fd"+
		"\u0102\u0107\u010c\u0113\u0118\u011d\u0122\u0129\u012e\u0133\u0138\u013f"+
		"\u0144\u0147\u014e\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}