// Generated from /Users/gussegovia/IdeaProjects/antlrtest/src/Proj2.g4 by ANTLR 4.8


import java.util.*;
import java.util.HashMap;
import java.util.Map;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Proj2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Proj2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code progExpr}
	 * labeled alternative in {@link Proj2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgExpr(Proj2Parser.ProgExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#programHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeading(Proj2Parser.ProgramHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Proj2Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Proj2Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(Proj2Parser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(Proj2Parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Proj2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureAndFunctionDeclarationPart(Proj2Parser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureOrFunctionDeclaration(Proj2Parser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(Proj2Parser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(Proj2Parser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatementVisit}
	 * labeled alternative in {@link Proj2Parser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatementVisit(Proj2Parser.BreakStatementVisitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStatementVisit}
	 * labeled alternative in {@link Proj2Parser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatementVisit(Proj2Parser.ContinueStatementVisitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#formalParameterSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterSection(Proj2Parser.FormalParameterSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(Proj2Parser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(Proj2Parser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#resultType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultType(Proj2Parser.ResultTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(Proj2Parser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationPart(Proj2Parser.VariableDeclarationPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(Proj2Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(Proj2Parser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(Proj2Parser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#methodArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArguments(Proj2Parser.MethodArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDefVisit}
	 * labeled alternative in {@link Proj2Parser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefVisit(Proj2Parser.VarDefVisitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varTrueVisit}
	 * labeled alternative in {@link Proj2Parser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarTrueVisit(Proj2Parser.VarTrueVisitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varFalseVisit}
	 * labeled alternative in {@link Proj2Parser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarFalseVisit(Proj2Parser.VarFalseVisitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCalling}
	 * labeled alternative in {@link Proj2Parser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCalling(Proj2Parser.MethodCallingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varSpecial}
	 * labeled alternative in {@link Proj2Parser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpecial(Proj2Parser.VarSpecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#sExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSExpr(Proj2Parser.SExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMultiplication}
	 * labeled alternative in {@link Proj2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultiplication(Proj2Parser.ExprMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAddition}
	 * labeled alternative in {@link Proj2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddition(Proj2Parser.ExprAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSubtraction}
	 * labeled alternative in {@link Proj2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubtraction(Proj2Parser.ExprSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nothig}
	 * labeled alternative in {@link Proj2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothig(Proj2Parser.NothigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readDouble}
	 * labeled alternative in {@link Proj2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadDouble(Proj2Parser.ReadDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprParenthesis}
	 * labeled alternative in {@link Proj2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesis(Proj2Parser.ExprParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDivision}
	 * labeled alternative in {@link Proj2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDivision(Proj2Parser.ExprDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicEqualExprVisit}
	 * labeled alternative in {@link Proj2Parser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicEqualExprVisit(Proj2Parser.LogicEqualExprVisitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicGTExprVisit}
	 * labeled alternative in {@link Proj2Parser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicGTExprVisit(Proj2Parser.LogicGTExprVisitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicGEExprVisit}
	 * labeled alternative in {@link Proj2Parser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicGEExprVisit(Proj2Parser.LogicGEExprVisitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicLTExprVisit}
	 * labeled alternative in {@link Proj2Parser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicLTExprVisit(Proj2Parser.LogicLTExprVisitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicLEExprVisit}
	 * labeled alternative in {@link Proj2Parser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicLEExprVisit(Proj2Parser.LogicLEExprVisitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicNotEqualExprVisit}
	 * labeled alternative in {@link Proj2Parser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicNotEqualExprVisit(Proj2Parser.LogicNotEqualExprVisitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(Proj2Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(Proj2Parser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialExprReadln}
	 * labeled alternative in {@link Proj2Parser#specialExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialExprReadln(Proj2Parser.SpecialExprReadlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialExprWriteln}
	 * labeled alternative in {@link Proj2Parser#specialExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialExprWriteln(Proj2Parser.SpecialExprWritelnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialExprSqrt}
	 * labeled alternative in {@link Proj2Parser#specialExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialExprSqrt(Proj2Parser.SpecialExprSqrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialExprSin}
	 * labeled alternative in {@link Proj2Parser#specialExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialExprSin(Proj2Parser.SpecialExprSinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialExprCos}
	 * labeled alternative in {@link Proj2Parser#specialExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialExprCos(Proj2Parser.SpecialExprCosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialExprLn}
	 * labeled alternative in {@link Proj2Parser#specialExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialExprLn(Proj2Parser.SpecialExprLnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialExprExp}
	 * labeled alternative in {@link Proj2Parser#specialExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialExprExp(Proj2Parser.SpecialExprExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Proj2Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Proj2Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Proj2Parser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(Proj2Parser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseBlock}
	 * labeled alternative in {@link Proj2Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseBlock(Proj2Parser.IfElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStateBlock}
	 * labeled alternative in {@link Proj2Parser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStateBlock(Proj2Parser.WhileStateBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStateBlock}
	 * labeled alternative in {@link Proj2Parser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStateBlock(Proj2Parser.ForStateBlockContext ctx);
}