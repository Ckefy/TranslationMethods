package generated;// Generated from GramParseGrams.g4 by ANTLR 4.8

import generator.Grammar;
import generator.atoms.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramParseGramsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, WS=20, NAME=21, REGEX=22, CODETEXT=23;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_header = 2, RULE_imports = 3, RULE_importExpr = 4, 
		RULE_importName = 5, RULE_tokens = 6, RULE_tokenExpr = 7, RULE_startState = 8, 
		RULE_skipAttr = 9, RULE_states = 10, RULE_stateExpr = 11, RULE_inheritState = 12, 
		RULE_synthState = 13, RULE_ruleExpr = 14, RULE_inheritRule = 15, RULE_codeBlock = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "header", "imports", "importExpr", "importName", 
			"tokens", "tokenExpr", "startState", "skipAttr", "states", "stateExpr", 
			"inheritState", "synthState", "ruleExpr", "inheritRule", "codeBlock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "'@imp'", "'{'", "'}'", "'import'", "'.'", 
			"'@tokens'", "':'", "'@start'", "'='", "'->'", "'skip'", "'@states'", 
			"'['", "']'", "'returns'", "'|'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "NAME", "REGEX", 
			"CODETEXT"
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
	public String getGrammarFileName() { return "GramParseGrams.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramParseGramsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Grammar gram;
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramParseGramsParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);

		    ((StartContext)_localctx).gram =  new Grammar();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			program(_localctx.gram);
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

	public static class ProgramContext extends ParserRuleContext {
		public Grammar gram;
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public TokensContext tokens() {
			return getRuleContext(TokensContext.class,0);
		}
		public StartStateContext startState() {
			return getRuleContext(StartStateContext.class,0);
		}
		public StatesContext states() {
			return getRuleContext(StatesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ProgramContext(ParserRuleContext parent, int invokingState, Grammar gram) {
			super(parent, invokingState);
			this.gram = gram;
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program(Grammar gram) throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState(), gram);
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			header(_localctx.gram);
			setState(38);
			imports(_localctx.gram);
			setState(39);
			tokens(_localctx.gram);
			setState(40);
			startState(_localctx.gram);
			setState(41);
			states(_localctx.gram);
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

	public static class HeaderContext extends ParserRuleContext {
		public Grammar gram;
		public Token NAME;
		public TerminalNode NAME() { return getToken(GramParseGramsParser.NAME, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public HeaderContext(ParserRuleContext parent, int invokingState, Grammar gram) {
			super(parent, invokingState);
			this.gram = gram;
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header(Grammar gram) throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState(), gram);
		enterRule(_localctx, 4, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			((HeaderContext)_localctx).NAME = match(NAME);
			setState(45);
			match(T__1);

			    _localctx.gram.setName((((HeaderContext)_localctx).NAME!=null?((HeaderContext)_localctx).NAME.getText():null));

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

	public static class ImportsContext extends ParserRuleContext {
		public Grammar gram;
		public List<ImportExprContext> importExpr() {
			return getRuleContexts(ImportExprContext.class);
		}
		public ImportExprContext importExpr(int i) {
			return getRuleContext(ImportExprContext.class,i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ImportsContext(ParserRuleContext parent, int invokingState, Grammar gram) {
			super(parent, invokingState);
			this.gram = gram;
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitImports(this);
		}
	}

	public final ImportsContext imports(Grammar gram) throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState(), gram);
		enterRule(_localctx, 6, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__2);
			setState(49);
			match(T__3);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(50);
				importExpr(_localctx.gram);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__4);
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

	public static class ImportExprContext extends ParserRuleContext {
		public Grammar gram;
		public ImportNameContext importName;
		public ImportNameContext importName() {
			return getRuleContext(ImportNameContext.class,0);
		}
		public ImportExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ImportExprContext(ParserRuleContext parent, int invokingState, Grammar gram) {
			super(parent, invokingState);
			this.gram = gram;
		}
		@Override public int getRuleIndex() { return RULE_importExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterImportExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitImportExpr(this);
		}
	}

	public final ImportExprContext importExpr(Grammar gram) throws RecognitionException {
		ImportExprContext _localctx = new ImportExprContext(_ctx, getState(), gram);
		enterRule(_localctx, 8, RULE_importExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(58);
			match(T__5);
			setState(59);
			((ImportExprContext)_localctx).importName = importName();
			_localctx.gram.addImport(((ImportExprContext)_localctx).importName.name.toString());
			setState(61);
			match(T__1);
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

	public static class ImportNameContext extends ParserRuleContext {
		public StringBuilder name;
		public Token n1;
		public Token n2;
		public List<TerminalNode> NAME() { return getTokens(GramParseGramsParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GramParseGramsParser.NAME, i);
		}
		public ImportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitImportName(this);
		}
	}

	public final ImportNameContext importName() throws RecognitionException {
		ImportNameContext _localctx = new ImportNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importName);

		    ((ImportNameContext)_localctx).name =  new StringBuilder();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			((ImportNameContext)_localctx).n1 = match(NAME);
			_localctx.name.append((((ImportNameContext)_localctx).n1!=null?((ImportNameContext)_localctx).n1.getText():null));
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(65);
				match(T__6);
				setState(66);
				((ImportNameContext)_localctx).n2 = match(NAME);
				_localctx.name.append('.').append((((ImportNameContext)_localctx).n2!=null?((ImportNameContext)_localctx).n2.getText():null));
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TokensContext extends ParserRuleContext {
		public Grammar gram;
		public List<TokenExprContext> tokenExpr() {
			return getRuleContexts(TokenExprContext.class);
		}
		public TokenExprContext tokenExpr(int i) {
			return getRuleContext(TokenExprContext.class,i);
		}
		public TokensContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TokensContext(ParserRuleContext parent, int invokingState, Grammar gram) {
			super(parent, invokingState);
			this.gram = gram;
		}
		@Override public int getRuleIndex() { return RULE_tokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitTokens(this);
		}
	}

	public final TokensContext tokens(Grammar gram) throws RecognitionException {
		TokensContext _localctx = new TokensContext(_ctx, getState(), gram);
		enterRule(_localctx, 12, RULE_tokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__7);
			setState(74);
			match(T__3);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(75);
				tokenExpr(_localctx.gram);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(T__4);
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

	public static class TokenExprContext extends ParserRuleContext {
		public Grammar gram;
		public boolean skipTokens;
		public Token NAME;
		public Token REGEX;
		public TerminalNode NAME() { return getToken(GramParseGramsParser.NAME, 0); }
		public TerminalNode REGEX() { return getToken(GramParseGramsParser.REGEX, 0); }
		public SkipAttrContext skipAttr() {
			return getRuleContext(SkipAttrContext.class,0);
		}
		public TokenExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TokenExprContext(ParserRuleContext parent, int invokingState, Grammar gram) {
			super(parent, invokingState);
			this.gram = gram;
		}
		@Override public int getRuleIndex() { return RULE_tokenExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterTokenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitTokenExpr(this);
		}
	}

	public final TokenExprContext tokenExpr(Grammar gram) throws RecognitionException {
		TokenExprContext _localctx = new TokenExprContext(_ctx, getState(), gram);
		enterRule(_localctx, 14, RULE_tokenExpr);

		    ((TokenExprContext)_localctx).skipTokens =  false;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			((TokenExprContext)_localctx).NAME = match(NAME);
			setState(84);
			match(T__8);
			setState(85);
			((TokenExprContext)_localctx).REGEX = match(REGEX);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(86);
				skipAttr();
				((TokenExprContext)_localctx).skipTokens =  true;
				}
			}

			setState(91);
			match(T__1);

			    if (_localctx.skipTokens) {
			        _localctx.gram.addSkipToken((((TokenExprContext)_localctx).NAME!=null?((TokenExprContext)_localctx).NAME.getText():null), (((TokenExprContext)_localctx).REGEX!=null?((TokenExprContext)_localctx).REGEX.getText():null));
			    } else {
			        _localctx.gram.addToken((((TokenExprContext)_localctx).NAME!=null?((TokenExprContext)_localctx).NAME.getText():null), (((TokenExprContext)_localctx).REGEX!=null?((TokenExprContext)_localctx).REGEX.getText():null));
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

	public static class StartStateContext extends ParserRuleContext {
		public Grammar gram;
		public Token NAME;
		public TerminalNode NAME() { return getToken(GramParseGramsParser.NAME, 0); }
		public StartStateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StartStateContext(ParserRuleContext parent, int invokingState, Grammar gram) {
			super(parent, invokingState);
			this.gram = gram;
		}
		@Override public int getRuleIndex() { return RULE_startState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterStartState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitStartState(this);
		}
	}

	public final StartStateContext startState(Grammar gram) throws RecognitionException {
		StartStateContext _localctx = new StartStateContext(_ctx, getState(), gram);
		enterRule(_localctx, 16, RULE_startState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__9);
			setState(95);
			match(T__10);
			setState(96);
			((StartStateContext)_localctx).NAME = match(NAME);
			setState(97);
			match(T__1);

			    _localctx.gram.setStartState((((StartStateContext)_localctx).NAME!=null?((StartStateContext)_localctx).NAME.getText():null));

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

	public static class SkipAttrContext extends ParserRuleContext {
		public SkipAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterSkipAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitSkipAttr(this);
		}
	}

	public final SkipAttrContext skipAttr() throws RecognitionException {
		SkipAttrContext _localctx = new SkipAttrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_skipAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__11);
			setState(101);
			match(T__12);
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

	public static class StatesContext extends ParserRuleContext {
		public Grammar gram;
		public StateExprContext stateExpr;
		public List<StateExprContext> stateExpr() {
			return getRuleContexts(StateExprContext.class);
		}
		public StateExprContext stateExpr(int i) {
			return getRuleContext(StateExprContext.class,i);
		}
		public StatesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatesContext(ParserRuleContext parent, int invokingState, Grammar gram) {
			super(parent, invokingState);
			this.gram = gram;
		}
		@Override public int getRuleIndex() { return RULE_states; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterStates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitStates(this);
		}
	}

	public final StatesContext states(Grammar gram) throws RecognitionException {
		StatesContext _localctx = new StatesContext(_ctx, getState(), gram);
		enterRule(_localctx, 20, RULE_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__13);
			setState(104);
			match(T__3);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				((StatesContext)_localctx).stateExpr = stateExpr();
				_localctx.gram.addState(((StatesContext)_localctx).stateExpr.state);
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(112);
			match(T__4);
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

	public static class StateExprContext extends ParserRuleContext {
		public State state;
		public Token NAME;
		public RuleExprContext r1;
		public RuleExprContext r2;
		public TerminalNode NAME() { return getToken(GramParseGramsParser.NAME, 0); }
		public List<RuleExprContext> ruleExpr() {
			return getRuleContexts(RuleExprContext.class);
		}
		public RuleExprContext ruleExpr(int i) {
			return getRuleContext(RuleExprContext.class,i);
		}
		public InheritStateContext inheritState() {
			return getRuleContext(InheritStateContext.class,0);
		}
		public SynthStateContext synthState() {
			return getRuleContext(SynthStateContext.class,0);
		}
		public StateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterStateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitStateExpr(this);
		}
	}

	public final StateExprContext stateExpr() throws RecognitionException {
		StateExprContext _localctx = new StateExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stateExpr);

		    ((StateExprContext)_localctx).state =  new State();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((StateExprContext)_localctx).NAME = match(NAME);
			_localctx.state.setName((((StateExprContext)_localctx).NAME!=null?((StateExprContext)_localctx).NAME.getText():null));
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(116);
				match(T__14);
				setState(117);
				inheritState(_localctx.state);
				setState(118);
				match(T__15);
				}
			}

			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(122);
				match(T__16);
				setState(123);
				match(T__14);
				setState(124);
				synthState(_localctx.state);
				setState(125);
				match(T__15);
				}
			}

			setState(129);
			match(T__8);
			setState(130);
			((StateExprContext)_localctx).r1 = ruleExpr();
			_localctx.state.addRule(((StateExprContext)_localctx).r1.r);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(132);
				match(T__17);
				setState(133);
				((StateExprContext)_localctx).r2 = ruleExpr();
				_localctx.state.addRule(((StateExprContext)_localctx).r2.r);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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

	public static class InheritStateContext extends ParserRuleContext {
		public State state;
		public Token type1;
		public Token name1;
		public Token type2;
		public Token name2;
		public List<TerminalNode> NAME() { return getTokens(GramParseGramsParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GramParseGramsParser.NAME, i);
		}
		public InheritStateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InheritStateContext(ParserRuleContext parent, int invokingState, State state) {
			super(parent, invokingState);
			this.state = state;
		}
		@Override public int getRuleIndex() { return RULE_inheritState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterInheritState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitInheritState(this);
		}
	}

	public final InheritStateContext inheritState(State state) throws RecognitionException {
		InheritStateContext _localctx = new InheritStateContext(_ctx, getState(), state);
		enterRule(_localctx, 24, RULE_inheritState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			((InheritStateContext)_localctx).type1 = match(NAME);
			setState(144);
			((InheritStateContext)_localctx).name1 = match(NAME);
			_localctx.state.addParameter((((InheritStateContext)_localctx).type1!=null?((InheritStateContext)_localctx).type1.getText():null), (((InheritStateContext)_localctx).name1!=null?((InheritStateContext)_localctx).name1.getText():null));
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(146);
				match(T__18);
				setState(147);
				((InheritStateContext)_localctx).type2 = match(NAME);
				setState(148);
				((InheritStateContext)_localctx).name2 = match(NAME);
				_localctx.state.addParameter((((InheritStateContext)_localctx).type2!=null?((InheritStateContext)_localctx).type2.getText():null), (((InheritStateContext)_localctx).name2!=null?((InheritStateContext)_localctx).name2.getText():null));
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SynthStateContext extends ParserRuleContext {
		public State state;
		public Token type1;
		public Token name1;
		public Token type2;
		public Token name2;
		public List<TerminalNode> NAME() { return getTokens(GramParseGramsParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GramParseGramsParser.NAME, i);
		}
		public SynthStateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SynthStateContext(ParserRuleContext parent, int invokingState, State state) {
			super(parent, invokingState);
			this.state = state;
		}
		@Override public int getRuleIndex() { return RULE_synthState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterSynthState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitSynthState(this);
		}
	}

	public final SynthStateContext synthState(State state) throws RecognitionException {
		SynthStateContext _localctx = new SynthStateContext(_ctx, getState(), state);
		enterRule(_localctx, 26, RULE_synthState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((SynthStateContext)_localctx).type1 = match(NAME);
			setState(156);
			((SynthStateContext)_localctx).name1 = match(NAME);
			_localctx.state.addReturn((((SynthStateContext)_localctx).type1!=null?((SynthStateContext)_localctx).type1.getText():null), (((SynthStateContext)_localctx).name1!=null?((SynthStateContext)_localctx).name1.getText():null));
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(158);
				match(T__18);
				setState(159);
				((SynthStateContext)_localctx).type2 = match(NAME);
				setState(160);
				((SynthStateContext)_localctx).name2 = match(NAME);
				_localctx.state.addReturn((((SynthStateContext)_localctx).type2!=null?((SynthStateContext)_localctx).type2.getText():null), (((SynthStateContext)_localctx).name2!=null?((SynthStateContext)_localctx).name2.getText():null));
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RuleExprContext extends ParserRuleContext {
		public Rule r;
		public StringBuilder parameters;
		public StringBuilder code;
		public Token NAME;
		public List<TerminalNode> NAME() { return getTokens(GramParseGramsParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GramParseGramsParser.NAME, i);
		}
		public List<InheritRuleContext> inheritRule() {
			return getRuleContexts(InheritRuleContext.class);
		}
		public InheritRuleContext inheritRule(int i) {
			return getRuleContext(InheritRuleContext.class,i);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public RuleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterRuleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitRuleExpr(this);
		}
	}

	public final RuleExprContext ruleExpr() throws RecognitionException {
		RuleExprContext _localctx = new RuleExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ruleExpr);

		    ((RuleExprContext)_localctx).r =  new Rule();
		    ((RuleExprContext)_localctx).parameters =  new StringBuilder();
		    ((RuleExprContext)_localctx).code =  new StringBuilder();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				((RuleExprContext)_localctx).NAME = match(NAME);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(168);
					inheritRule(_localctx.parameters);
					}
				}

				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODETEXT) {
					{
					setState(171);
					codeBlock(_localctx.code);
					}
				}

				_localctx.r.addItem((((RuleExprContext)_localctx).NAME!=null?((RuleExprContext)_localctx).NAME.getText():null), _localctx.parameters.toString(), _localctx.code.toString());
				    ((RuleExprContext)_localctx).parameters =  new StringBuilder();
				    ((RuleExprContext)_localctx).code =  new StringBuilder();
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
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

	public static class InheritRuleContext extends ParserRuleContext {
		public StringBuilder s;
		public Token n1;
		public Token n2;
		public List<TerminalNode> NAME() { return getTokens(GramParseGramsParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GramParseGramsParser.NAME, i);
		}
		public InheritRuleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InheritRuleContext(ParserRuleContext parent, int invokingState, StringBuilder s) {
			super(parent, invokingState);
			this.s = s;
		}
		@Override public int getRuleIndex() { return RULE_inheritRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterInheritRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitInheritRule(this);
		}
	}

	public final InheritRuleContext inheritRule(StringBuilder s) throws RecognitionException {
		InheritRuleContext _localctx = new InheritRuleContext(_ctx, getState(), s);
		enterRule(_localctx, 30, RULE_inheritRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__14);
			setState(180);
			((InheritRuleContext)_localctx).n1 = match(NAME);
			_localctx.s.append((((InheritRuleContext)_localctx).n1!=null?((InheritRuleContext)_localctx).n1.getText():null));
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(182);
				match(T__18);
				setState(183);
				((InheritRuleContext)_localctx).n2 = match(NAME);
				_localctx.s.append(", ").append((((InheritRuleContext)_localctx).n2!=null?((InheritRuleContext)_localctx).n2.getText():null));
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(T__15);
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

	public static class CodeBlockContext extends ParserRuleContext {
		public StringBuilder s;
		public Token CODETEXT;
		public TerminalNode CODETEXT() { return getToken(GramParseGramsParser.CODETEXT, 0); }
		public CodeBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CodeBlockContext(ParserRuleContext parent, int invokingState, StringBuilder s) {
			super(parent, invokingState);
			this.s = s;
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramParseGramsListener ) ((GramParseGramsListener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock(StringBuilder s) throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState(), s);
		enterRule(_localctx, 32, RULE_codeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((CodeBlockContext)_localctx).CODETEXT = match(CODETEXT);

			        _localctx.s.append((((CodeBlockContext)_localctx).CODETEXT!=null?((CodeBlockContext)_localctx).CODETEXT.getText():null));
			        _localctx.s.deleteCharAt(0);
			        _localctx.s.deleteCharAt(_localctx.s.length() - 1);
			    
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00c6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7"+
		"\5\66\n\5\f\5\16\59\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\7\7G\n\7\f\7\16\7J\13\7\3\b\3\b\3\b\7\bO\n\b\f\b\16\bR\13\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\\\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\6\fo\n\f\r\f\16\fp\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r{\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u0082\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u008b\n\r\f\r\16\r\u008e\13\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u0099\n\16\f\16\16\16\u009c\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a5\n\17\f\17\16\17\u00a8\13\17"+
		"\3\20\3\20\5\20\u00ac\n\20\3\20\5\20\u00af\n\20\3\20\6\20\u00b2\n\20\r"+
		"\20\16\20\u00b3\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00bc\n\21\f\21\16"+
		"\21\u00bf\13\21\3\21\3\21\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"\2\2\2\u00c2\2$\3\2\2\2\4\'\3\2\2\2\6-\3\2\2\2"+
		"\b\62\3\2\2\2\n<\3\2\2\2\fA\3\2\2\2\16K\3\2\2\2\20U\3\2\2\2\22`\3\2\2"+
		"\2\24f\3\2\2\2\26i\3\2\2\2\30t\3\2\2\2\32\u0091\3\2\2\2\34\u009d\3\2\2"+
		"\2\36\u00b1\3\2\2\2 \u00b5\3\2\2\2\"\u00c2\3\2\2\2$%\5\4\3\2%&\7\2\2\3"+
		"&\3\3\2\2\2\'(\5\6\4\2()\5\b\5\2)*\5\16\b\2*+\5\22\n\2+,\5\26\f\2,\5\3"+
		"\2\2\2-.\7\3\2\2./\7\27\2\2/\60\7\4\2\2\60\61\b\4\1\2\61\7\3\2\2\2\62"+
		"\63\7\5\2\2\63\67\7\6\2\2\64\66\5\n\6\2\65\64\3\2\2\2\669\3\2\2\2\67\65"+
		"\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\7\2\2;\t\3\2\2\2<=\7\b"+
		"\2\2=>\5\f\7\2>?\b\6\1\2?@\7\4\2\2@\13\3\2\2\2AB\7\27\2\2BH\b\7\1\2CD"+
		"\7\t\2\2DE\7\27\2\2EG\b\7\1\2FC\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2"+
		"I\r\3\2\2\2JH\3\2\2\2KL\7\n\2\2LP\7\6\2\2MO\5\20\t\2NM\3\2\2\2OR\3\2\2"+
		"\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\7\2\2T\17\3\2\2\2UV\7\27"+
		"\2\2VW\7\13\2\2W[\7\30\2\2XY\5\24\13\2YZ\b\t\1\2Z\\\3\2\2\2[X\3\2\2\2"+
		"[\\\3\2\2\2\\]\3\2\2\2]^\7\4\2\2^_\b\t\1\2_\21\3\2\2\2`a\7\f\2\2ab\7\r"+
		"\2\2bc\7\27\2\2cd\7\4\2\2de\b\n\1\2e\23\3\2\2\2fg\7\16\2\2gh\7\17\2\2"+
		"h\25\3\2\2\2ij\7\20\2\2jn\7\6\2\2kl\5\30\r\2lm\b\f\1\2mo\3\2\2\2nk\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\7\2\2s\27\3\2\2\2tu\7"+
		"\27\2\2uz\b\r\1\2vw\7\21\2\2wx\5\32\16\2xy\7\22\2\2y{\3\2\2\2zv\3\2\2"+
		"\2z{\3\2\2\2{\u0081\3\2\2\2|}\7\23\2\2}~\7\21\2\2~\177\5\34\17\2\177\u0080"+
		"\7\22\2\2\u0080\u0082\3\2\2\2\u0081|\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\7\13\2\2\u0084\u0085\5\36\20\2\u0085\u008c"+
		"\b\r\1\2\u0086\u0087\7\24\2\2\u0087\u0088\5\36\20\2\u0088\u0089\b\r\1"+
		"\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\7\4\2\2\u0090\31\3\2\2\2\u0091\u0092\7\27\2\2\u0092\u0093\7\27"+
		"\2\2\u0093\u009a\b\16\1\2\u0094\u0095\7\25\2\2\u0095\u0096\7\27\2\2\u0096"+
		"\u0097\7\27\2\2\u0097\u0099\b\16\1\2\u0098\u0094\3\2\2\2\u0099\u009c\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\33\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7\27\2\2\u009e\u009f\7\27\2\2\u009f\u00a6\b"+
		"\17\1\2\u00a0\u00a1\7\25\2\2\u00a1\u00a2\7\27\2\2\u00a2\u00a3\7\27\2\2"+
		"\u00a3\u00a5\b\17\1\2\u00a4\u00a0\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\35\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ab\7\27\2\2\u00aa\u00ac\5 \21\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3"+
		"\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00af\5\"\22\2\u00ae\u00ad\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\b\20\1\2\u00b1\u00a9\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\37\3\2\2\2\u00b5\u00b6\7\21\2\2\u00b6\u00b7\7\27\2\2\u00b7\u00bd\b\21"+
		"\1\2\u00b8\u00b9\7\25\2\2\u00b9\u00ba\7\27\2\2\u00ba\u00bc\b\21\1\2\u00bb"+
		"\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\22\2\2\u00c1"+
		"!\3\2\2\2\u00c2\u00c3\7\31\2\2\u00c3\u00c4\b\22\1\2\u00c4#\3\2\2\2\20"+
		"\67HP[pz\u0081\u008c\u009a\u00a6\u00ab\u00ae\u00b3\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}