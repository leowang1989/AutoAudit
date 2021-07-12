import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class QueryStatementDesc {
    // 表名
    private String tableName;

    // 是否存在Limit
    private boolean isExistLimit = false;

    // 是否存在过滤条件
    private boolean isExistFilter = false;

    // 过滤条件列表
    private List<QueryConditionDesc> conds = new ArrayList<>();

    public String getTableName() {
        return tableName;
    }

    public boolean isExistLimit() {
        return isExistLimit;
    }

    public boolean isExistFilter() {
        return isExistFilter;
    }

    public List<QueryConditionDesc> getConds() {
        return conds;
    }

    public void setExistLimit(boolean existLimit) {
        isExistLimit = existLimit;
    }

    public void setExistFilter(boolean existFilter) {
        isExistFilter = existFilter;
    }

    public void addToConds(String leftVal, String operator) {
        this.conds.add(new QueryConditionDesc(leftVal, operator));
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
