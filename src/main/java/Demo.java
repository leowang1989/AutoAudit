
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.List;

public class Demo {
    public static void main(String args[])
    {
        // 构造语法解析器
        CharStream input1 = CharStreams.fromString(args[0]);
        SqlBaseLexer lexer1 = new SqlBaseLexer(input1);
        CommonTokenStream tokens1 = new CommonTokenStream((TokenSource) lexer1);
        SqlBaseParser parser1 = new SqlBaseParser((TokenStream) tokens1);

        // 语法解析
        ParseTree tree1 = parser1.singleStatement();
        // 遍历语法树
        ExtractQueryStatementListener listener1 = new ExtractQueryStatementListener();
        ParseTreeWalker walker1 = new ParseTreeWalker();
        walker1.walk(listener1, tree1);

        List<QueryStatementDesc> qsdList = listener1.getQueryStatementDescList();

        // 审核规则解析器
        CharStream input2 = CharStreams.fromString(args[1]);
        SqlAuditLexer lexer2 = new SqlAuditLexer(input2);
        CommonTokenStream tokens2 = new CommonTokenStream((TokenSource) lexer2);
        SqlAuditParser parser2 = new SqlAuditParser((TokenStream) tokens2);

        // 语法解析
        ParseTree tree2 = parser2.auditRule();
        // 遍历语法树
        QueryStatementAuditListener listener2 = new QueryStatementAuditListener(qsdList.get(0));
        ParseTreeWalker walker2 = new ParseTreeWalker();
        walker2.walk(listener2, tree2);

        System.out.println("查询语句：" + args[0]);
        System.out.println("审核规则：" + args[1]);

        if (listener2.getResult()) {
            System.out.println("审核结果：通过");
        } else {
            System.out.println("审核结果：不通过");
        }
    }
}
