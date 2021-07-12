import java.util.ArrayList;
import java.util.List;

public class ExtractQueryStatementListener extends SqlBaseBaseListener {
    // 查询语句描述符表
    private List<QueryStatementDesc> queryStatementDescList = new ArrayList<>();

    // 当前查询语句描述符
    private QueryStatementDesc curQueryStatementDesc;

    // 标识符
    private String identifier;

    // 操作符
    private String operator;

    public List<QueryStatementDesc> getQueryStatementDescList() {
        return queryStatementDescList;
    }

    @Override public void enterQuery(SqlBaseParser.QueryContext ctx) {
        curQueryStatementDesc = new QueryStatementDesc();
    }

    @Override public void exitQuery(SqlBaseParser.QueryContext ctx) {
        if (curQueryStatementDesc != null) {
            queryStatementDescList.add(curQueryStatementDesc);
            curQueryStatementDesc = null;
        }
    }

    @Override public void exitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx) {
        identifier = ctx.getText();
    }

    @Override public void exitTableName(SqlBaseParser.TableNameContext ctx) {
        if (identifier != null) {
            curQueryStatementDesc.setTableName(identifier);
            identifier = null;
        }
    }

    @Override public void exitQueryOrganization(SqlBaseParser.QueryOrganizationContext ctx) {
        if (ctx.LIMIT() != null) {
            curQueryStatementDesc.setExistLimit(true);
        }
    }

    @Override public void exitWhereClause(SqlBaseParser.WhereClauseContext ctx) {
        curQueryStatementDesc.setExistFilter(true);
    }

    @Override public void exitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx) {
        operator = ctx.getText();
    }

    @Override public void exitComparison(SqlBaseParser.ComparisonContext ctx) {
        if (identifier != null && operator != null) {
            curQueryStatementDesc.addToConds(identifier, operator);
            identifier = null;
            operator = null;
        }
    }

    @Override public void exitPredicate(SqlBaseParser.PredicateContext ctx) {
        if (ctx.IN() != null) {
            curQueryStatementDesc.addToConds(identifier, ctx.IN().getText());
        } else if (ctx.BETWEEN() != null) {
            curQueryStatementDesc.addToConds(identifier, ctx.BETWEEN().getText());
        }
    }
}
