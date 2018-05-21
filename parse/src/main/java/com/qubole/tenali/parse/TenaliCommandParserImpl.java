package com.qubole.tenali.parse;

import antlr4.TenaliCommandBaseVisitor;
import antlr4.TenaliCommandLexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static antlr4.TenaliCommandLexer.*;

/**
 * Created by devjyotip on 5/12/18.
 */

public class TenaliCommandParserImpl extends TenaliCommandBaseVisitor<String> {

  /**
   * Function for segregating query types and calling the parser with the right context
   * <p>
   * Here we have called the same parser method (TenaliHiveParser.parse) for all the query types.
   * This can be changed in future to call specific parsers like
   * TenaliHiveSelectParser, TenaliHiveInsertParser, TenaliHiveCreateParser
   * This would help in avoiding lot of (if-else) wiring inside the Parse function and result in
   * cleaner code.
   *
   * @param ctx: Sql statement context from Antlr
   */

  @Override
  public String visitSql_stmt(antlr4.TenaliCommandParser.Sql_stmtContext ctx) {
    String stmt = ctx.getText().trim();
    int queryType = ctx.op.getType();

    //qctx.setQueryType(TenaliQueryContext.QueryType.asQueryType(
    //    TenaliCommandLexer.ruleNames[queryType - 1]));

    System.out.println(queryType + " <=  visitSql_stmt  => " + stmt );

    switch (queryType) {
      case Q_SELECT:
      case Q_INSERT:
      case Q_CREATE_TABLE:
      case Q_CREATE_EXTERNAL_TABLE:
      case Q_CREATE_VIEW:
      case Q_DROP_TABLE:
      case Q_WITH:
        break;
      case Q_DROP_VIEW:
        //qctx.setQueryType(TenaliQueryContext.QueryType.DROP_VIEW);
        //qctx.setDroppedView();
        break;
      case Q_USE:
        //qctx.setQueryType(TenaliQueryContext.QueryType.USE_DB);
        //qctx.setDefaultSchema(getDefaultSchema(stmt));
        break;
      case Q_CREATE_FUNCTION:
        //cctx.setIsTemporaryFunctionUsed(true);
        //cctx.addTemporaryFunction(getFunction(stmt));
        break;
      case Q_SET:
        // ToDo
        break;
      case Q_ALTER_TABLE:
        // ToDo
        break;
      case Q_ADD_JAR:
        //cctx.setIsExternalJarUsed(true);
        //cctx.addJarPath(getJar(stmt));
        break;
    }

    //cctx.addQueryContext(aggregateResult(defaultResult(), qctx));
    //return qctx;
    return "";
  }


  @Override
  public String visitParse(antlr4.TenaliCommandParser.ParseContext ctx) {
    System.out.println( " <=  visitParse  => " + ctx.getText() );
    return visitChildren(ctx);
  }

  @Override
  public String visitSql_stmt_list(
      antlr4.TenaliCommandParser.Sql_stmt_listContext ctx) {
    System.out.println( " <=  visitSql_stmt_list  => " + ctx.getText() );
    return visitChildren(ctx);
  }


  @Override
  public String visitChildren(RuleNode node) {
    //TenaliQueryContext result = defaultResult();
    int n = node.getChildCount();

    for (int i = 0; i < n && this.shouldVisitNextChild(node, ""); ++i) {
      ParseTree c = node.getChild(i);
      System.out.println( " <=  visitChildren  => " + c.getText() );
      //TenaliQueryContext childResult = c.accept(this);
      //result = aggregateResult(result, childResult);
      c.accept(this);
    }

    return "";
  }


  /*@Override
  public TenaliQueryContext defaultResult() {
    return cctx.getCurrentQueryContext();
  }


  @Override
  public TenaliQueryContext aggregateResult(TenaliQueryContext prevResult,
                                            TenaliQueryContext childResult) {
    if (prevResult == null) {
      return childResult;
    }
    return prevResult.add(childResult);
  }*/

}

