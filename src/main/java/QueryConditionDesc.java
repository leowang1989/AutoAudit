public class QueryConditionDesc {
    private String leftVal;

    private String operator;

    public QueryConditionDesc(String leftVal, String operator) {
        this.leftVal = leftVal;
        this.operator = operator;
    }

    public String getLeftVal() {
        return leftVal;
    }

    public String getOperator() {
        return operator;
    }

    public void setLeftVal(String leftVal) {
        this.leftVal = leftVal;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
