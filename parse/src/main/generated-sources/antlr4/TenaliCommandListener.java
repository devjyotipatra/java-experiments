// Generated from antlr4/TenaliCommand.g4 by ANTLR 4.7
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TenaliCommandParser}.
 */
public interface TenaliCommandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TenaliCommandParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(TenaliCommandParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TenaliCommandParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(TenaliCommandParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TenaliCommandParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(TenaliCommandParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TenaliCommandParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(TenaliCommandParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TenaliCommandParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(TenaliCommandParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TenaliCommandParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(TenaliCommandParser.Sql_stmtContext ctx);
}