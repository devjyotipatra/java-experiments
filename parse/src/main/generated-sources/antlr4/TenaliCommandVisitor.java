// Generated from antlr4/TenaliCommand.g4 by ANTLR 4.7
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TenaliCommandParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TenaliCommandVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TenaliCommandParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(TenaliCommandParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TenaliCommandParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(TenaliCommandParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TenaliCommandParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(TenaliCommandParser.Sql_stmtContext ctx);
}