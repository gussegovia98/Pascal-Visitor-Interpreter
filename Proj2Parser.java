// Generated from /Users/gussegovia/IdeaProjects/antlrtest/src/Proj2.g4 by ANTLR 4.8


import java.util.*;
import java.util.HashMap;
import java.util.Map;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Proj2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		PROGRAM=25, BEGIN=26, END=27, STATEMENT=28, FUNCTION=29, PROCEDURE=30, 
		INT=31, DOUBLE=32, COMMENT_1=33, COMMENT_2=34, IDENT=35, VAR=36, INTEGER=37, 
		REAL=38, INTEGER_CONST=39, REAL_CONST=40, INTEGER_DIV=41, FLOAT_DIV=42, 
		TRUE=43, FALSE=44, PLUS=45, MINUS=46, MUL=47, DIV=48, ASSIGN=49, COMMA=50, 
		SEMI=51, COLON=52, EQUAL=53, NOT_EQUAL=54, LT=55, LE=56, GE=57, GT=58, 
		LPAREN=59, RPAREN=60, LBRACK=61, LBRACK2=62, RBRACK=63, RBRACK2=64, POINTER=65, 
		AT=66, DOT=67, DOTDOT=68, LCURLY=69, RCURLY=70, UNIT=71, BOOL=72, ID=73, 
		BLOCK=74, IF=75, THEN=76, ELSE=77, WS=78;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_identifier = 2, RULE_block = 3, 
		RULE_compoundStatement = 4, RULE_statements = 5, RULE_statement = 6, RULE_procedureAndFunctionDeclarationPart = 7, 
		RULE_procedureOrFunctionDeclaration = 8, RULE_procedureDeclaration = 9, 
		RULE_formalParameterList = 10, RULE_breakStatement = 11, RULE_continueStatement = 12, 
		RULE_formalParameterSection = 13, RULE_parameterGroup = 14, RULE_functionDeclaration = 15, 
		RULE_resultType = 16, RULE_typeIdentifier = 17, RULE_variableDeclarationPart = 18, 
		RULE_variableDeclaration = 19, RULE_identifierList = 20, RULE_methodCall = 21, 
		RULE_methodArguments = 22, RULE_varDef = 23, RULE_sExpr = 24, RULE_expr = 25, 
		RULE_logicExpr = 26, RULE_variable = 27, RULE_empty = 28, RULE_specialExpr = 29, 
		RULE_term = 30, RULE_factor = 31, RULE_bool = 32, RULE_ifStatement = 33, 
		RULE_whileStatement = 34, RULE_forStatement = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeading", "identifier", "block", "compoundStatement", 
			"statements", "statement", "procedureAndFunctionDeclarationPart", "procedureOrFunctionDeclaration", 
			"procedureDeclaration", "formalParameterList", "breakStatement", "continueStatement", 
			"formalParameterSection", "parameterGroup", "functionDeclaration", "resultType", 
			"typeIdentifier", "variableDeclarationPart", "variableDeclaration", "identifierList", 
			"methodCall", "methodArguments", "varDef", "sExpr", "expr", "logicExpr", 
			"variable", "empty", "specialExpr", "term", "factor", "bool", "ifStatement", 
			"whileStatement", "forStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'break;'", "'continue'", "'real'", "'boolean'", 
			"'var'", "'true'", "'false'", "'readln'", "'writeln'", "'''", "'sqrt'", 
			"'sin'", "'cos'", "'ln'", "'exp'", "'if'", "'then'", "'else'", "'while'", 
			"'do'", "'for'", "'to'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "':='", "','", "';'", "':'", "'='", "'<>'", 
			"'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", "'(.'", "']'", "'.)'", 
			"'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "PROGRAM", "BEGIN", "END", "STATEMENT", "FUNCTION", "PROCEDURE", 
			"INT", "DOUBLE", "COMMENT_1", "COMMENT_2", "IDENT", "VAR", "INTEGER", 
			"REAL", "INTEGER_CONST", "REAL_CONST", "INTEGER_DIV", "FLOAT_DIV", "TRUE", 
			"FALSE", "PLUS", "MINUS", "MUL", "DIV", "ASSIGN", "COMMA", "SEMI", "COLON", 
			"EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", 
			"LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", "DOT", "DOTDOT", "LCURLY", 
			"RCURLY", "UNIT", "BOOL", "ID", "BLOCK", "IF", "THEN", "ELSE", "WS"
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
	public String getGrammarFileName() { return "Proj2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	Map<String, Boolean> bool_table = new HashMap<>();
	Map<String, String> real_table = new HashMap<>();


	Boolean glo = true;

	public Proj2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgExprContext extends ProgramContext {
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Proj2Parser.DOT, 0); }
		public ProgExprContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitProgExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			_localctx = new ProgExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			programHeading();
			setState(73);
			block();
			setState(74);
			match(DOT);
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

	public static class ProgramHeadingContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(Proj2Parser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Proj2Parser.SEMI, 0); }
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitProgramHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(PROGRAM);
			setState(77);
			identifier();
			setState(78);
			match(SEMI);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Proj2Parser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(IDENT);
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

	public static class BlockContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<VariableDeclarationPartContext> variableDeclarationPart() {
			return getRuleContexts(VariableDeclarationPartContext.class);
		}
		public VariableDeclarationPartContext variableDeclarationPart(int i) {
			return getRuleContext(VariableDeclarationPartContext.class,i);
		}
		public List<ProcedureAndFunctionDeclarationPartContext> procedureAndFunctionDeclarationPart() {
			return getRuleContexts(ProcedureAndFunctionDeclarationPartContext.class);
		}
		public ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart(int i) {
			return getRuleContext(ProcedureAndFunctionDeclarationPartContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << FUNCTION) | (1L << PROCEDURE))) != 0)) {
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(82);
					variableDeclarationPart();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					setState(83);
					procedureAndFunctionDeclarationPart();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			compoundStatement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__0);
			setState(92);
			statements();
			setState(93);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(Proj2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Proj2Parser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			statement();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(96);
				match(SEMI);
				setState(97);
				statement();
				}
				}
				setState(102);
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

	public static class StatementContext extends ParserRuleContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public SExprContext sExpr() {
			return getRuleContext(SExprContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SpecialExprContext specialExpr() {
			return getRuleContext(SpecialExprContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				varDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				sExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				compoundStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(109);
				breakStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(110);
				continueStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(111);
				ifStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(112);
				empty();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(113);
				expr(0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(114);
				specialExpr();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(115);
				logicExpr();
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

	public static class ProcedureAndFunctionDeclarationPartContext extends ParserRuleContext {
		public ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() {
			return getRuleContext(ProcedureOrFunctionDeclarationContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Proj2Parser.DOT, 0); }
		public ProcedureAndFunctionDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionDeclarationPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitProcedureAndFunctionDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			procedureOrFunctionDeclaration();
			setState(119);
			match(DOT);
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

	public static class ProcedureOrFunctionDeclarationContext extends ParserRuleContext {
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ProcedureOrFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureOrFunctionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitProcedureOrFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() throws RecognitionException {
		ProcedureOrFunctionDeclarationContext _localctx = new ProcedureOrFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_procedureOrFunctionDeclaration);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				functionDeclaration();
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

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(Proj2Parser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Proj2Parser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(PROCEDURE);
			setState(126);
			identifier();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(127);
				formalParameterList();
				}
			}

			setState(130);
			match(SEMI);
			setState(131);
			block();
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Proj2Parser.LPAREN, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(Proj2Parser.RPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(Proj2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Proj2Parser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(LPAREN);
			setState(134);
			formalParameterSection();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(135);
				match(SEMI);
				setState(136);
				formalParameterSection();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(RPAREN);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	 
		public BreakStatementContext() { }
		public void copyFrom(BreakStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementVisitContext extends BreakStatementContext {
		public BreakStatementVisitContext(BreakStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitBreakStatementVisit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_breakStatement);
		try {
			_localctx = new BreakStatementVisitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	 
		public ContinueStatementContext() { }
		public void copyFrom(ContinueStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContinueStatementVisitContext extends ContinueStatementContext {
		public ContinueStatementVisitContext(ContinueStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitContinueStatementVisit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_continueStatement);
		try {
			_localctx = new ContinueStatementVisitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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

	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode VAR() { return getToken(Proj2Parser.VAR, 0); }
		public TerminalNode FUNCTION() { return getToken(Proj2Parser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(Proj2Parser.PROCEDURE, 0); }
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitFormalParameterSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formalParameterSection);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				parameterGroup();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(VAR);
				setState(150);
				parameterGroup();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(FUNCTION);
				setState(152);
				parameterGroup();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(PROCEDURE);
				setState(154);
				parameterGroup();
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

	public static class ParameterGroupContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Proj2Parser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitParameterGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			identifierList();
			setState(158);
			match(COLON);
			setState(159);
			typeIdentifier();
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Proj2Parser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Proj2Parser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Proj2Parser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(FUNCTION);
			setState(162);
			identifier();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(163);
				formalParameterList();
				}
			}

			setState(166);
			match(COLON);
			setState(167);
			resultType();
			setState(168);
			match(SEMI);
			setState(169);
			block();
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

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitResultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			typeIdentifier();
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

	public static class TypeIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitTypeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeIdentifier);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				identifier();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(Proj2Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Proj2Parser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitVariableDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__6);
			setState(178);
			variableDeclaration();
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					match(SEMI);
					setState(180);
					variableDeclaration();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(186);
			match(SEMI);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList;
		public Token a;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Proj2Parser.COLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			((VariableDeclarationContext)_localctx).identifierList = identifierList();
			setState(189);
			match(COLON);
			setState(190);
			((VariableDeclarationContext)_localctx).a = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
				((VariableDeclarationContext)_localctx).a = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}


			    //System.out.println("Here be more specific variable: " + (((VariableDeclarationContext)_localctx).identifierList!=null?_input.getText(((VariableDeclarationContext)_localctx).identifierList.start,((VariableDeclarationContext)_localctx).identifierList.stop):null));
			    //System.out.println("And here be its type: " + (((VariableDeclarationContext)_localctx).a!=null?((VariableDeclarationContext)_localctx).a.getText():null));

			    if((((VariableDeclarationContext)_localctx).a!=null?((VariableDeclarationContext)_localctx).a.getText():null) == "boolean"){
			        bool_table.put((((VariableDeclarationContext)_localctx).identifierList!=null?_input.getText(((VariableDeclarationContext)_localctx).identifierList.start,((VariableDeclarationContext)_localctx).identifierList.stop):null), false);
			        //System.out.println("It's a boolean.");
			    }
			    else if((((VariableDeclarationContext)_localctx).a!=null?((VariableDeclarationContext)_localctx).a.getText():null) == "real"){
			        real_table.put((((VariableDeclarationContext)_localctx).identifierList!=null?_input.getText(((VariableDeclarationContext)_localctx).identifierList.start,((VariableDeclarationContext)_localctx).identifierList.stop):null), "0");
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Proj2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Proj2Parser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			identifier();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(194);
				match(COMMA);
				setState(195);
				identifier();
				}
				}
				setState(200);
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

	public static class MethodCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Proj2Parser.LPAREN, 0); }
		public MethodArgumentsContext methodArguments() {
			return getRuleContext(MethodArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Proj2Parser.RPAREN, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			identifier();
			setState(202);
			match(LPAREN);
			setState(203);
			methodArguments();
			setState(204);
			match(RPAREN);
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

	public static class MethodArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Proj2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Proj2Parser.COMMA, i);
		}
		public MethodArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitMethodArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentsContext methodArguments() throws RecognitionException {
		MethodArgumentsContext _localctx = new MethodArgumentsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodArguments);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case INT:
			case IDENT:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				expr(0);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(208);
					match(COMMA);
					setState(209);
					expr(0);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class VarDefContext extends ParserRuleContext {
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	 
		public VarDefContext() { }
		public void copyFrom(VarDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarSpecialContext extends VarDefContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Proj2Parser.ASSIGN, 0); }
		public SpecialExprContext specialExpr() {
			return getRuleContext(SpecialExprContext.class,0);
		}
		public VarSpecialContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitVarSpecial(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDefVisitContext extends VarDefContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Proj2Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefVisitContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitVarDefVisit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallingContext extends VarDefContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Proj2Parser.ASSIGN, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MethodCallingContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitMethodCalling(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarTrueVisitContext extends VarDefContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Proj2Parser.ASSIGN, 0); }
		public VarTrueVisitContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitVarTrueVisit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarFalseVisitContext extends VarDefContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Proj2Parser.ASSIGN, 0); }
		public VarFalseVisitContext(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitVarFalseVisit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_varDef);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new VarDefVisitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				identifier();
				setState(218);
				match(ASSIGN);
				setState(219);
				expr(0);
				}
				break;
			case 2:
				_localctx = new VarTrueVisitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				identifier();
				setState(222);
				match(ASSIGN);
				setState(223);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new VarFalseVisitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				identifier();
				setState(226);
				match(ASSIGN);
				setState(227);
				match(T__8);
				}
				break;
			case 4:
				_localctx = new MethodCallingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				identifier();
				setState(230);
				match(ASSIGN);
				setState(231);
				methodCall();
				}
				break;
			case 5:
				_localctx = new VarSpecialContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				identifier();
				setState(234);
				match(ASSIGN);
				setState(235);
				specialExpr();
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

	public static class SExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitSExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SExprContext sExpr() throws RecognitionException {
		SExprContext _localctx = new SExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			expr(0);
			 
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

	public static class ExprContext extends ParserRuleContext {
		public double i;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.i = ctx.i;
		}
	}
	public static class ExprMultiplicationContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(Proj2Parser.MUL, 0); }
		public ExprMultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitExprMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAdditionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(Proj2Parser.PLUS, 0); }
		public ExprAdditionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitExprAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSubtractionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(Proj2Parser.MINUS, 0); }
		public ExprSubtractionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitExprSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NothigContext extends ExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NothigContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitNothig(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadDoubleContext extends ExprContext {
		public TerminalNode INT() { return getToken(Proj2Parser.INT, 0); }
		public ReadDoubleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitReadDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprParenthesisContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(Proj2Parser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Proj2Parser.RPAREN, 0); }
		public ExprParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitExprParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDivisionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(Proj2Parser.DIV, 0); }
		public ExprDivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitExprDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ExprParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(243);
				match(LPAREN);
				setState(244);
				expr(0);
				setState(245);
				match(RPAREN);
				}
				break;
			case IDENT:
				{
				_localctx = new NothigContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				identifier();

				}
				break;
			case INT:
				{
				_localctx = new ReadDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultiplicationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(254);
						match(MUL);
						setState(255);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprAdditionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(257);
						match(PLUS);
						setState(258);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new ExprSubtractionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(260);
						match(MINUS);
						setState(261);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new ExprDivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(263);
						match(DIV);
						setState(264);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class LogicExprContext extends ParserRuleContext {
		public String s;
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
	 
		public LogicExprContext() { }
		public void copyFrom(LogicExprContext ctx) {
			super.copyFrom(ctx);
			this.s = ctx.s;
		}
	}
	public static class LogicNotEqualExprVisitContext extends LogicExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT_EQUAL() { return getToken(Proj2Parser.NOT_EQUAL, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(Proj2Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Proj2Parser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Proj2Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Proj2Parser.RPAREN, i);
		}
		public LogicNotEqualExprVisitContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitLogicNotEqualExprVisit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicGTExprVisitContext extends LogicExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(Proj2Parser.GT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(Proj2Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Proj2Parser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Proj2Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Proj2Parser.RPAREN, i);
		}
		public LogicGTExprVisitContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitLogicGTExprVisit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicLTExprVisitContext extends LogicExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(Proj2Parser.LT, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(Proj2Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Proj2Parser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Proj2Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Proj2Parser.RPAREN, i);
		}
		public LogicLTExprVisitContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitLogicLTExprVisit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicLEExprVisitContext extends LogicExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(Proj2Parser.LE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(Proj2Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Proj2Parser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Proj2Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Proj2Parser.RPAREN, i);
		}
		public LogicLEExprVisitContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitLogicLEExprVisit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicEqualExprVisitContext extends LogicExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(Proj2Parser.EQUAL, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(Proj2Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Proj2Parser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Proj2Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Proj2Parser.RPAREN, i);
		}
		public LogicEqualExprVisitContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitLogicEqualExprVisit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicGEExprVisitContext extends LogicExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GE() { return getToken(Proj2Parser.GE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(Proj2Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Proj2Parser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Proj2Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Proj2Parser.RPAREN, i);
		}
		public LogicGEExprVisitContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitLogicGEExprVisit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logicExpr);
		int _la;
		try {
			int _alt;
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new LogicEqualExprVisitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(270);
						match(LPAREN);
						}
						} 
					}
					setState(275);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(276);
				expr(0);
				setState(277);
				match(EQUAL);
				setState(278);
				expr(0);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RPAREN) {
					{
					{
					setState(279);
					match(RPAREN);
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new LogicGTExprVisitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(285);
						match(LPAREN);
						}
						} 
					}
					setState(290);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(291);
				expr(0);
				setState(292);
				match(GT);
				setState(293);
				expr(0);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RPAREN) {
					{
					{
					setState(294);
					match(RPAREN);
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new LogicGEExprVisitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(300);
						match(LPAREN);
						}
						} 
					}
					setState(305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(306);
				expr(0);
				setState(307);
				match(GE);
				setState(308);
				expr(0);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RPAREN) {
					{
					{
					setState(309);
					match(RPAREN);
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new LogicLTExprVisitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(315);
						match(LPAREN);
						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(321);
				expr(0);
				setState(322);
				match(LT);
				setState(323);
				expr(0);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RPAREN) {
					{
					{
					setState(324);
					match(RPAREN);
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new LogicLEExprVisitContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(330);
						match(LPAREN);
						}
						} 
					}
					setState(335);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(336);
				expr(0);
				setState(337);
				match(LE);
				setState(338);
				expr(0);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RPAREN) {
					{
					{
					setState(339);
					match(RPAREN);
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				_localctx = new LogicNotEqualExprVisitContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(345);
						match(LPAREN);
						}
						} 
					}
					setState(350);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(351);
				expr(0);
				setState(352);
				match(NOT_EQUAL);
				setState(353);
				expr(0);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RPAREN) {
					{
					{
					setState(354);
					match(RPAREN);
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Proj2Parser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(Proj2Parser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(Proj2Parser.LBRACK, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(Proj2Parser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(Proj2Parser.RBRACK, i);
		}
		public List<TerminalNode> LBRACK2() { return getTokens(Proj2Parser.LBRACK2); }
		public TerminalNode LBRACK2(int i) {
			return getToken(Proj2Parser.LBRACK2, i);
		}
		public List<TerminalNode> RBRACK2() { return getTokens(Proj2Parser.RBRACK2); }
		public TerminalNode RBRACK2(int i) {
			return getToken(Proj2Parser.RBRACK2, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Proj2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Proj2Parser.DOT, i);
		}
		public List<TerminalNode> POINTER() { return getTokens(Proj2Parser.POINTER); }
		public TerminalNode POINTER(int i) {
			return getToken(Proj2Parser.POINTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Proj2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Proj2Parser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				{
				setState(362);
				match(AT);
				setState(363);
				identifier();
				}
				break;
			case IDENT:
				{
				setState(364);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (LBRACK - 61)) | (1L << (LBRACK2 - 61)) | (1L << (POINTER - 61)) | (1L << (DOT - 61)))) != 0)) {
				{
				setState(392);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(367);
					match(LBRACK);
					setState(368);
					expr(0);
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(369);
						match(COMMA);
						setState(370);
						expr(0);
						}
						}
						setState(375);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(376);
					match(RBRACK);
					}
					break;
				case LBRACK2:
					{
					setState(378);
					match(LBRACK2);
					setState(379);
					expr(0);
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(380);
						match(COMMA);
						setState(381);
						expr(0);
						}
						}
						setState(386);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(387);
					match(RBRACK2);
					}
					break;
				case DOT:
					{
					setState(389);
					match(DOT);
					setState(390);
					identifier();
					}
					break;
				case POINTER:
					{
					setState(391);
					match(POINTER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(396);
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

	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class SpecialExprContext extends ParserRuleContext {
		public SpecialExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialExpr; }
	 
		public SpecialExprContext() { }
		public void copyFrom(SpecialExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SpecialExprSinContext extends SpecialExprContext {
		public TerminalNode LPAREN() { return getToken(Proj2Parser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Proj2Parser.RPAREN, 0); }
		public SpecialExprSinContext(SpecialExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitSpecialExprSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialExprCosContext extends SpecialExprContext {
		public TerminalNode LPAREN() { return getToken(Proj2Parser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Proj2Parser.RPAREN, 0); }
		public SpecialExprCosContext(SpecialExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitSpecialExprCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialExprReadlnContext extends SpecialExprContext {
		public TerminalNode LPAREN() { return getToken(Proj2Parser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Proj2Parser.RPAREN, 0); }
		public SpecialExprReadlnContext(SpecialExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitSpecialExprReadln(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialExprExpContext extends SpecialExprContext {
		public TerminalNode LPAREN() { return getToken(Proj2Parser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Proj2Parser.RPAREN, 0); }
		public SpecialExprExpContext(SpecialExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitSpecialExprExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialExprWritelnContext extends SpecialExprContext {
		public TerminalNode LPAREN() { return getToken(Proj2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Proj2Parser.RPAREN, 0); }
		public List<TerminalNode> INT() { return getTokens(Proj2Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(Proj2Parser.INT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public SpecialExprWritelnContext(SpecialExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitSpecialExprWriteln(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialExprLnContext extends SpecialExprContext {
		public TerminalNode LPAREN() { return getToken(Proj2Parser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Proj2Parser.RPAREN, 0); }
		public SpecialExprLnContext(SpecialExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitSpecialExprLn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialExprSqrtContext extends SpecialExprContext {
		public TerminalNode LPAREN() { return getToken(Proj2Parser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Proj2Parser.RPAREN, 0); }
		public SpecialExprSqrtContext(SpecialExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitSpecialExprSqrt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialExprContext specialExpr() throws RecognitionException {
		SpecialExprContext _localctx = new SpecialExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_specialExpr);
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new SpecialExprReadlnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(T__9);
				setState(400);
				match(LPAREN);
				setState(401);
				identifier();
				setState(402);
				match(RPAREN);
				}
				break;
			case T__10:
				_localctx = new SpecialExprWritelnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(T__10);
				setState(405);
				match(LPAREN);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(406);
					match(T__11);
					}
				}

				setState(411); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(411);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(409);
						match(INT);
						}
						break;
					case IDENT:
						{
						setState(410);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(413); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT || _la==IDENT );
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(415);
					match(T__11);
					}
				}

				setState(418);
				match(RPAREN);
				}
				break;
			case T__12:
				_localctx = new SpecialExprSqrtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(T__12);
				setState(420);
				match(LPAREN);
				setState(421);
				expr(0);
				setState(422);
				match(RPAREN);
				}
				break;
			case T__13:
				_localctx = new SpecialExprSinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				match(T__13);
				setState(425);
				match(LPAREN);
				setState(426);
				expr(0);
				setState(427);
				match(RPAREN);
				}
				break;
			case T__14:
				_localctx = new SpecialExprCosContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				match(T__14);
				setState(430);
				match(LPAREN);
				setState(431);
				expr(0);
				setState(432);
				match(RPAREN);
				}
				break;
			case T__15:
				_localctx = new SpecialExprLnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(434);
				match(T__15);
				setState(435);
				match(LPAREN);
				setState(436);
				expr(0);
				setState(437);
				match(RPAREN);
				}
				break;
			case T__16:
				_localctx = new SpecialExprExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(439);
				match(T__16);
				setState(440);
				match(LPAREN);
				setState(441);
				expr(0);
				setState(442);
				match(RPAREN);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(Proj2Parser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(Proj2Parser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Proj2Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Proj2Parser.DIV, i);
		}
		public List<TerminalNode> FLOAT_DIV() { return getTokens(Proj2Parser.FLOAT_DIV); }
		public TerminalNode FLOAT_DIV(int i) {
			return getToken(Proj2Parser.FLOAT_DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			factor();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT_DIV) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				{
				setState(447);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT_DIV) | (1L << MUL) | (1L << DIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(448);
				factor();
				}
				}
				setState(453);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(Proj2Parser.PLUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(Proj2Parser.MINUS, 0); }
		public TerminalNode INTEGER_CONST() { return getToken(Proj2Parser.INTEGER_CONST, 0); }
		public TerminalNode REAL_CONST() { return getToken(Proj2Parser.REAL_CONST, 0); }
		public TerminalNode LPAREN() { return getToken(Proj2Parser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Proj2Parser.RPAREN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode INT() { return getToken(Proj2Parser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(Proj2Parser.DOUBLE, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(Proj2Parser.BOOL, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_factor);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				match(PLUS);
				setState(455);
				factor();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				match(MINUS);
				setState(457);
				factor();
				}
				break;
			case INTEGER_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				match(INTEGER_CONST);
				}
				break;
			case REAL_CONST:
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				match(REAL_CONST);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(460);
				match(LPAREN);
				setState(461);
				expr(0);
				setState(462);
				match(RPAREN);
				}
				break;
			case IDENT:
			case AT:
				enterOuterAlt(_localctx, 6);
				{
				setState(464);
				variable();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 7);
				{
				setState(465);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(466);
				match(DOUBLE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(467);
				bool();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 10);
				{
				setState(468);
				match(BOOL);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(Proj2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Proj2Parser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfElseBlockContext extends IfStatementContext {
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Proj2Parser.SEMI, 0); }
		public IfElseBlockContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitIfElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifStatement);
		try {
			_localctx = new IfElseBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__17);
			setState(474);
			logicExpr();
			setState(475);
			match(T__18);
			setState(476);
			statement();
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(477);
				match(SEMI);
				setState(478);
				match(T__19);
				setState(479);
				statement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStateBlockContext extends WhileStatementContext {
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public WhileStateBlockContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitWhileStateBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_whileStatement);
		try {
			_localctx = new WhileStateBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(T__20);
			setState(483);
			logicExpr();
			setState(484);
			match(T__21);
			setState(485);
			compoundStatement();
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

	public static class ForStatementContext extends ParserRuleContext {
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	 
		public ForStatementContext() { }
		public void copyFrom(ForStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForStateBlockContext extends ForStatementContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public TerminalNode INT() { return getToken(Proj2Parser.INT, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ForStateBlockContext(ForStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Proj2Visitor ) return ((Proj2Visitor<? extends T>)visitor).visitForStateBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forStatement);
		try {
			_localctx = new ForStateBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__22);
			setState(488);
			varDef();
			setState(489);
			match(T__23);
			setState(490);
			match(INT);
			setState(491);
			match(T__21);
			setState(492);
			compoundStatement();
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
		case 25:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u01f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7"+
		"\7e\n\7\f\7\16\7h\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bw\n\b\3\t\3\t\3\t\3\n\3\n\5\n~\n\n\3\13\3\13\3\13\5\13\u0083\n"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f\13\f\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009e"+
		"\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00a7\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u00b2\n\23\3\24\3\24\3\24\3\24\7\24"+
		"\u00b8\n\24\f\24\16\24\u00bb\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\7\26\u00c7\n\26\f\26\16\26\u00ca\13\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00d5\n\30\f\30\16\30\u00d8\13\30"+
		"\5\30\u00da\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00f0\n\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00fe\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u010c\n\33"+
		"\f\33\16\33\u010f\13\33\3\34\7\34\u0112\n\34\f\34\16\34\u0115\13\34\3"+
		"\34\3\34\3\34\3\34\7\34\u011b\n\34\f\34\16\34\u011e\13\34\3\34\7\34\u0121"+
		"\n\34\f\34\16\34\u0124\13\34\3\34\3\34\3\34\3\34\7\34\u012a\n\34\f\34"+
		"\16\34\u012d\13\34\3\34\7\34\u0130\n\34\f\34\16\34\u0133\13\34\3\34\3"+
		"\34\3\34\3\34\7\34\u0139\n\34\f\34\16\34\u013c\13\34\3\34\7\34\u013f\n"+
		"\34\f\34\16\34\u0142\13\34\3\34\3\34\3\34\3\34\7\34\u0148\n\34\f\34\16"+
		"\34\u014b\13\34\3\34\7\34\u014e\n\34\f\34\16\34\u0151\13\34\3\34\3\34"+
		"\3\34\3\34\7\34\u0157\n\34\f\34\16\34\u015a\13\34\3\34\7\34\u015d\n\34"+
		"\f\34\16\34\u0160\13\34\3\34\3\34\3\34\3\34\7\34\u0166\n\34\f\34\16\34"+
		"\u0169\13\34\5\34\u016b\n\34\3\35\3\35\3\35\5\35\u0170\n\35\3\35\3\35"+
		"\3\35\3\35\7\35\u0176\n\35\f\35\16\35\u0179\13\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u0181\n\35\f\35\16\35\u0184\13\35\3\35\3\35\3\35\3\35"+
		"\3\35\7\35\u018b\n\35\f\35\16\35\u018e\13\35\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u019a\n\37\3\37\3\37\6\37\u019e\n\37\r"+
		"\37\16\37\u019f\3\37\5\37\u01a3\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u01bf\n\37\3 \3 \3 \7 \u01c4\n \f \16 "+
		"\u01c7\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01d8\n!\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\5#\u01e3\n#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\2\3\64&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFH\2\5\3\2\7\b\4\2,,\61\62\3\2-.\2\u021e\2J\3\2\2\2\4N\3"+
		"\2\2\2\6R\3\2\2\2\bX\3\2\2\2\n]\3\2\2\2\fa\3\2\2\2\16v\3\2\2\2\20x\3\2"+
		"\2\2\22}\3\2\2\2\24\177\3\2\2\2\26\u0087\3\2\2\2\30\u0092\3\2\2\2\32\u0094"+
		"\3\2\2\2\34\u009d\3\2\2\2\36\u009f\3\2\2\2 \u00a3\3\2\2\2\"\u00ad\3\2"+
		"\2\2$\u00b1\3\2\2\2&\u00b3\3\2\2\2(\u00be\3\2\2\2*\u00c3\3\2\2\2,\u00cb"+
		"\3\2\2\2.\u00d9\3\2\2\2\60\u00ef\3\2\2\2\62\u00f1\3\2\2\2\64\u00fd\3\2"+
		"\2\2\66\u016a\3\2\2\28\u016f\3\2\2\2:\u018f\3\2\2\2<\u01be\3\2\2\2>\u01c0"+
		"\3\2\2\2@\u01d7\3\2\2\2B\u01d9\3\2\2\2D\u01db\3\2\2\2F\u01e4\3\2\2\2H"+
		"\u01e9\3\2\2\2JK\5\4\3\2KL\5\b\5\2LM\7E\2\2M\3\3\2\2\2NO\7\33\2\2OP\5"+
		"\6\4\2PQ\7\65\2\2Q\5\3\2\2\2RS\7%\2\2S\7\3\2\2\2TW\5&\24\2UW\5\20\t\2"+
		"VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2"+
		"[\\\5\n\6\2\\\t\3\2\2\2]^\7\3\2\2^_\5\f\7\2_`\7\4\2\2`\13\3\2\2\2af\5"+
		"\16\b\2bc\7\65\2\2ce\5\16\b\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"g\r\3\2\2\2hf\3\2\2\2iw\5\60\31\2jw\5,\27\2kw\5\62\32\2lw\5F$\2mw\5H%"+
		"\2nw\5\n\6\2ow\5\30\r\2pw\5\32\16\2qw\5D#\2rw\5:\36\2sw\5\64\33\2tw\5"+
		"<\37\2uw\5\66\34\2vi\3\2\2\2vj\3\2\2\2vk\3\2\2\2vl\3\2\2\2vm\3\2\2\2v"+
		"n\3\2\2\2vo\3\2\2\2vp\3\2\2\2vq\3\2\2\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2"+
		"vu\3\2\2\2w\17\3\2\2\2xy\5\22\n\2yz\7E\2\2z\21\3\2\2\2{~\5\24\13\2|~\5"+
		" \21\2}{\3\2\2\2}|\3\2\2\2~\23\3\2\2\2\177\u0080\7 \2\2\u0080\u0082\5"+
		"\6\4\2\u0081\u0083\5\26\f\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\7\65\2\2\u0085\u0086\5\b\5\2\u0086\25\3\2\2"+
		"\2\u0087\u0088\7=\2\2\u0088\u008d\5\34\17\2\u0089\u008a\7\65\2\2\u008a"+
		"\u008c\5\34\17\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7>\2\2\u0091\27\3\2\2\2\u0092\u0093\7\5\2\2\u0093\31\3\2\2\2\u0094"+
		"\u0095\7\6\2\2\u0095\33\3\2\2\2\u0096\u009e\5\36\20\2\u0097\u0098\7&\2"+
		"\2\u0098\u009e\5\36\20\2\u0099\u009a\7\37\2\2\u009a\u009e\5\36\20\2\u009b"+
		"\u009c\7 \2\2\u009c\u009e\5\36\20\2\u009d\u0096\3\2\2\2\u009d\u0097\3"+
		"\2\2\2\u009d\u0099\3\2\2\2\u009d\u009b\3\2\2\2\u009e\35\3\2\2\2\u009f"+
		"\u00a0\5*\26\2\u00a0\u00a1\7\66\2\2\u00a1\u00a2\5$\23\2\u00a2\37\3\2\2"+
		"\2\u00a3\u00a4\7\37\2\2\u00a4\u00a6\5\6\4\2\u00a5\u00a7\5\26\f\2\u00a6"+
		"\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\66"+
		"\2\2\u00a9\u00aa\5\"\22\2\u00aa\u00ab\7\65\2\2\u00ab\u00ac\5\b\5\2\u00ac"+
		"!\3\2\2\2\u00ad\u00ae\5$\23\2\u00ae#\3\2\2\2\u00af\u00b2\5\6\4\2\u00b0"+
		"\u00b2\t\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2%\3\2\2\2"+
		"\u00b3\u00b4\7\t\2\2\u00b4\u00b9\5(\25\2\u00b5\u00b6\7\65\2\2\u00b6\u00b8"+
		"\5(\25\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\65"+
		"\2\2\u00bd\'\3\2\2\2\u00be\u00bf\5*\26\2\u00bf\u00c0\7\66\2\2\u00c0\u00c1"+
		"\t\2\2\2\u00c1\u00c2\b\25\1\2\u00c2)\3\2\2\2\u00c3\u00c8\5\6\4\2\u00c4"+
		"\u00c5\7\64\2\2\u00c5\u00c7\5\6\4\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3"+
		"\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9+\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00cb\u00cc\5\6\4\2\u00cc\u00cd\7=\2\2\u00cd\u00ce\5.\30\2\u00ce"+
		"\u00cf\7>\2\2\u00cf-\3\2\2\2\u00d0\u00da\3\2\2\2\u00d1\u00d6\5\64\33\2"+
		"\u00d2\u00d3\7\64\2\2\u00d3\u00d5\5\64\33\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d1\3\2\2\2\u00da"+
		"/\3\2\2\2\u00db\u00dc\5\6\4\2\u00dc\u00dd\7\63\2\2\u00dd\u00de\5\64\33"+
		"\2\u00de\u00f0\3\2\2\2\u00df\u00e0\5\6\4\2\u00e0\u00e1\7\63\2\2\u00e1"+
		"\u00e2\7\n\2\2\u00e2\u00f0\3\2\2\2\u00e3\u00e4\5\6\4\2\u00e4\u00e5\7\63"+
		"\2\2\u00e5\u00e6\7\13\2\2\u00e6\u00f0\3\2\2\2\u00e7\u00e8\5\6\4\2\u00e8"+
		"\u00e9\7\63\2\2\u00e9\u00ea\5,\27\2\u00ea\u00f0\3\2\2\2\u00eb\u00ec\5"+
		"\6\4\2\u00ec\u00ed\7\63\2\2\u00ed\u00ee\5<\37\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00db\3\2\2\2\u00ef\u00df\3\2\2\2\u00ef\u00e3\3\2\2\2\u00ef\u00e7\3\2"+
		"\2\2\u00ef\u00eb\3\2\2\2\u00f0\61\3\2\2\2\u00f1\u00f2\5\64\33\2\u00f2"+
		"\u00f3\b\32\1\2\u00f3\63\3\2\2\2\u00f4\u00f5\b\33\1\2\u00f5\u00f6\7=\2"+
		"\2\u00f6\u00f7\5\64\33\2\u00f7\u00f8\7>\2\2\u00f8\u00fe\3\2\2\2\u00f9"+
		"\u00fa\5\6\4\2\u00fa\u00fb\b\33\1\2\u00fb\u00fe\3\2\2\2\u00fc\u00fe\7"+
		"!\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u010d\3\2\2\2\u00ff\u0100\f\b\2\2\u0100\u0101\7\61\2\2\u0101\u010c\5"+
		"\64\33\t\u0102\u0103\f\7\2\2\u0103\u0104\7/\2\2\u0104\u010c\5\64\33\b"+
		"\u0105\u0106\f\6\2\2\u0106\u0107\7\60\2\2\u0107\u010c\5\64\33\7\u0108"+
		"\u0109\f\5\2\2\u0109\u010a\7\62\2\2\u010a\u010c\5\64\33\6\u010b\u00ff"+
		"\3\2\2\2\u010b\u0102\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0108\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\65\3\2\2"+
		"\2\u010f\u010d\3\2\2\2\u0110\u0112\7=\2\2\u0111\u0110\3\2\2\2\u0112\u0115"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0117\5\64\33\2\u0117\u0118\7\67\2\2\u0118\u011c"+
		"\5\64\33\2\u0119\u011b\7>\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2"+
		"\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u016b\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011f\u0121\7=\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0125\u0126\5\64\33\2\u0126\u0127\7<\2\2\u0127\u012b\5\64\33\2\u0128"+
		"\u012a\7>\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u016b\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0130\7=\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0135\5\64\33\2\u0135\u0136\7;\2\2\u0136\u013a\5\64\33\2\u0137\u0139"+
		"\7>\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u016b\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013f\7="+
		"\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\5\64"+
		"\33\2\u0144\u0145\79\2\2\u0145\u0149\5\64\33\2\u0146\u0148\7>\2\2\u0147"+
		"\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u016b\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\7=\2\2\u014d"+
		"\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\5\64\33\2\u0153"+
		"\u0154\7:\2\2\u0154\u0158\5\64\33\2\u0155\u0157\7>\2\2\u0156\u0155\3\2"+
		"\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u016b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\7=\2\2\u015c\u015b\3\2"+
		"\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\5\64\33\2\u0162\u0163\7"+
		"8\2\2\u0163\u0167\5\64\33\2\u0164\u0166\7>\2\2\u0165\u0164\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2"+
		"\2\2\u0169\u0167\3\2\2\2\u016a\u0113\3\2\2\2\u016a\u0122\3\2\2\2\u016a"+
		"\u0131\3\2\2\2\u016a\u0140\3\2\2\2\u016a\u014f\3\2\2\2\u016a\u015e\3\2"+
		"\2\2\u016b\67\3\2\2\2\u016c\u016d\7D\2\2\u016d\u0170\5\6\4\2\u016e\u0170"+
		"\5\6\4\2\u016f\u016c\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u018c\3\2\2\2\u0171"+
		"\u0172\7?\2\2\u0172\u0177\5\64\33\2\u0173\u0174\7\64\2\2\u0174\u0176\5"+
		"\64\33\2\u0175\u0173\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7A"+
		"\2\2\u017b\u018b\3\2\2\2\u017c\u017d\7@\2\2\u017d\u0182\5\64\33\2\u017e"+
		"\u017f\7\64\2\2\u017f\u0181\5\64\33\2\u0180\u017e\3\2\2\2\u0181\u0184"+
		"\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0185\u0186\7B\2\2\u0186\u018b\3\2\2\2\u0187\u0188\7E\2"+
		"\2\u0188\u018b\5\6\4\2\u0189\u018b\7C\2\2\u018a\u0171\3\2\2\2\u018a\u017c"+
		"\3\2\2\2\u018a\u0187\3\2\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d9\3\2\2\2\u018e\u018c\3\2\2\2"+
		"\u018f\u0190\3\2\2\2\u0190;\3\2\2\2\u0191\u0192\7\f\2\2\u0192\u0193\7"+
		"=\2\2\u0193\u0194\5\6\4\2\u0194\u0195\7>\2\2\u0195\u01bf\3\2\2\2\u0196"+
		"\u0197\7\r\2\2\u0197\u0199\7=\2\2\u0198\u019a\7\16\2\2\u0199\u0198\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u019e\7!\2\2\u019c"+
		"\u019e\5\6\4\2\u019d\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1"+
		"\u01a3\7\16\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3"+
		"\2\2\2\u01a4\u01bf\7>\2\2\u01a5\u01a6\7\17\2\2\u01a6\u01a7\7=\2\2\u01a7"+
		"\u01a8\5\64\33\2\u01a8\u01a9\7>\2\2\u01a9\u01bf\3\2\2\2\u01aa\u01ab\7"+
		"\20\2\2\u01ab\u01ac\7=\2\2\u01ac\u01ad\5\64\33\2\u01ad\u01ae\7>\2\2\u01ae"+
		"\u01bf\3\2\2\2\u01af\u01b0\7\21\2\2\u01b0\u01b1\7=\2\2\u01b1\u01b2\5\64"+
		"\33\2\u01b2\u01b3\7>\2\2\u01b3\u01bf\3\2\2\2\u01b4\u01b5\7\22\2\2\u01b5"+
		"\u01b6\7=\2\2\u01b6\u01b7\5\64\33\2\u01b7\u01b8\7>\2\2\u01b8\u01bf\3\2"+
		"\2\2\u01b9\u01ba\7\23\2\2\u01ba\u01bb\7=\2\2\u01bb\u01bc\5\64\33\2\u01bc"+
		"\u01bd\7>\2\2\u01bd\u01bf\3\2\2\2\u01be\u0191\3\2\2\2\u01be\u0196\3\2"+
		"\2\2\u01be\u01a5\3\2\2\2\u01be\u01aa\3\2\2\2\u01be\u01af\3\2\2\2\u01be"+
		"\u01b4\3\2\2\2\u01be\u01b9\3\2\2\2\u01bf=\3\2\2\2\u01c0\u01c5\5@!\2\u01c1"+
		"\u01c2\t\3\2\2\u01c2\u01c4\5@!\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7\3\2\2"+
		"\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6?\3\2\2\2\u01c7\u01c5"+
		"\3\2\2\2\u01c8\u01c9\7/\2\2\u01c9\u01d8\5@!\2\u01ca\u01cb\7\60\2\2\u01cb"+
		"\u01d8\5@!\2\u01cc\u01d8\7)\2\2\u01cd\u01d8\7*\2\2\u01ce\u01cf\7=\2\2"+
		"\u01cf\u01d0\5\64\33\2\u01d0\u01d1\7>\2\2\u01d1\u01d8\3\2\2\2\u01d2\u01d8"+
		"\58\35\2\u01d3\u01d8\7!\2\2\u01d4\u01d8\7\"\2\2\u01d5\u01d8\5B\"\2\u01d6"+
		"\u01d8\7J\2\2\u01d7\u01c8\3\2\2\2\u01d7\u01ca\3\2\2\2\u01d7\u01cc\3\2"+
		"\2\2\u01d7\u01cd\3\2\2\2\u01d7\u01ce\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7"+
		"\u01d3\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2"+
		"\2\2\u01d8A\3\2\2\2\u01d9\u01da\t\4\2\2\u01daC\3\2\2\2\u01db\u01dc\7\24"+
		"\2\2\u01dc\u01dd\5\66\34\2\u01dd\u01de\7\25\2\2\u01de\u01e2\5\16\b\2\u01df"+
		"\u01e0\7\65\2\2\u01e0\u01e1\7\26\2\2\u01e1\u01e3\5\16\b\2\u01e2\u01df"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3E\3\2\2\2\u01e4\u01e5\7\27\2\2\u01e5"+
		"\u01e6\5\66\34\2\u01e6\u01e7\7\30\2\2\u01e7\u01e8\5\n\6\2\u01e8G\3\2\2"+
		"\2\u01e9\u01ea\7\31\2\2\u01ea\u01eb\5\60\31\2\u01eb\u01ec\7\32\2\2\u01ec"+
		"\u01ed\7!\2\2\u01ed\u01ee\7\30\2\2\u01ee\u01ef\5\n\6\2\u01efI\3\2\2\2"+
		".VXfv}\u0082\u008d\u009d\u00a6\u00b1\u00b9\u00c8\u00d6\u00d9\u00ef\u00fd"+
		"\u010b\u010d\u0113\u011c\u0122\u012b\u0131\u013a\u0140\u0149\u014f\u0158"+
		"\u015e\u0167\u016a\u016f\u0177\u0182\u018a\u018c\u0199\u019d\u019f\u01a2"+
		"\u01be\u01c5\u01d7\u01e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}