// Generated from /home/andrew/IdeaProjects/projext3/Main.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MainParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MainParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MainParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MainParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(MainParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MainParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MainParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(MainParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MainParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MainParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#allexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllexpr(MainParser.AllexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#andexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndexpr(MainParser.AndexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(MainParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(MainParser.RelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MainParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MainParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#incdecexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncdecexpr(MainParser.IncdecexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MainParser.FactorContext ctx);
}