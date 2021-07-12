import java.util.List;

public class QueryStatementAuditListener  extends SqlAuditBaseListener {
    // 待审核的查询语句
    private QueryStatementDesc queryStatementDesc;

    // 审核结果
    private boolean result = false;

    public QueryStatementAuditListener(QueryStatementDesc queryStatementDesc) {
        this.queryStatementDesc = queryStatementDesc;
    }

    public boolean getResult() {
        return result;
    }

    @Override public void exitAuditRule(SqlAuditParser.AuditRuleContext ctx) {
        this.result = ctx.expr().result;
    }

    @Override public void exitBracketExpr(SqlAuditParser.BracketExprContext ctx) {
        ctx.result = ctx.expr().result;
    }

    @Override public void exitFunctionCall(SqlAuditParser.FunctionCallContext ctx) {
        ctx.result = false;

        if (ctx.function().CONDITIONIS() != null) {
            // 获取参数列表
            List<SqlAuditParser.FuncParamContext> params = ctx.funcParamList().params;
            if (params != null && params.size() == 2) {
                String identifier = params.get(0).getText();
                String operator = params.get(1).getText();

                // 获取查询条件列表
                List<QueryConditionDesc> conds = queryStatementDesc.getConds();
                for (QueryConditionDesc cond : conds) {
                    if (identifier.compareTo(cond.getLeftVal()) == 0 &&
                    operator.compareTo(cond.getOperator()) == 0) {
                        ctx.result = true;
                        break;
                    }
                }
            }
        } else if (ctx.function().EXISTLIMIT() != null) {
            ctx.result = queryStatementDesc.isExistLimit();
        }
    }

    @Override public void exitLogicalBinary(SqlAuditParser.LogicalBinaryContext ctx) {
        ctx.result = false;

        if (ctx.operator.getType() == SqlAuditParser.AND) {
            ctx.result = (ctx.left.result && ctx.right.result);
        } else if (ctx.operator.getType() == SqlAuditParser.OR) {
            ctx.result = (ctx.left.result || ctx.right.result);
        }
    }
}
