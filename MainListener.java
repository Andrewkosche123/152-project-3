// Generated from Main.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainParser}.
 */
public interface MainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MainParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MainParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MainParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MainParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MainParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(MainParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(MainParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MainParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MainParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MainParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MainParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(MainParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(MainParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MainParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MainParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MainParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MainParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#allexpr}.
	 * @param ctx the parse tree
	 */
	void enterAllexpr(MainParser.AllexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#allexpr}.
	 * @param ctx the parse tree
	 */
	void exitAllexpr(MainParser.AllexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void enterAndexpr(MainParser.AndexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void exitAndexpr(MainParser.AndexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(MainParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(MainParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(MainParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(MainParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MainParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MainParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MainParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MainParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#incdecexpr}.
	 * @param ctx the parse tree
	 */
	void enterIncdecexpr(MainParser.IncdecexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#incdecexpr}.
	 * @param ctx the parse tree
	 */
	void exitIncdecexpr(MainParser.IncdecexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MainParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MainParser.FactorContext ctx);
}