// Generated from SqlAudit.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlAuditParser}.
 */
public interface SqlAuditListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlAuditParser#auditRule}.
	 * @param ctx the parse tree
	 */
	void enterAuditRule(SqlAuditParser.AuditRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlAuditParser#auditRule}.
	 * @param ctx the parse tree
	 */
	void exitAuditRule(SqlAuditParser.AuditRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketExpr}
	 * labeled alternative in {@link SqlAuditParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBracketExpr(SqlAuditParser.BracketExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketExpr}
	 * labeled alternative in {@link SqlAuditParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBracketExpr(SqlAuditParser.BracketExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlAuditParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SqlAuditParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlAuditParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SqlAuditParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlAuditParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(SqlAuditParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlAuditParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(SqlAuditParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlAuditParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SqlAuditParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlAuditParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SqlAuditParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlAuditParser#funcParamList}.
	 * @param ctx the parse tree
	 */
	void enterFuncParamList(SqlAuditParser.FuncParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlAuditParser#funcParamList}.
	 * @param ctx the parse tree
	 */
	void exitFuncParamList(SqlAuditParser.FuncParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlAuditParser#funcParam}.
	 * @param ctx the parse tree
	 */
	void enterFuncParam(SqlAuditParser.FuncParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlAuditParser#funcParam}.
	 * @param ctx the parse tree
	 */
	void exitFuncParam(SqlAuditParser.FuncParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlAuditParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SqlAuditParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlAuditParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SqlAuditParser.PredicateContext ctx);
}