package main.java;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyListener extends MainBaseListener {
    @Override public void enterProgram(MainParser.ProgramContext ctx) {
        System.out.println("ENTER PROGRAM");
    }

    @Override public void exitProgram(MainParser.ProgramContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("EXIT PROGRAM");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterBlock(MainParser.BlockContext ctx) {
        System.out.println("ENTER BLOCK");
    }

    @Override public void exitBlock(MainParser.BlockContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("EXIT BLOCK");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterDecls(MainParser.DeclsContext ctx) {
        System.out.println("ENTER DECLS");
    }

    @Override public void exitDecls(MainParser.DeclsContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("EXIT DECLS");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterDecl(MainParser.DeclContext ctx) {
        System.out.println("ENTER DECL");
    }

    @Override public void exitDecl(MainParser.DeclContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("EXIT DECL");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterType(MainParser.TypeContext ctx) {
        System.out.println("ENTER TYPE");
    }

    @Override public void exitType(MainParser.TypeContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("EXIT TYPE");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterStmts(MainParser.StmtsContext ctx) { System.out.println("ENTER Stmts"); }

    @Override public void exitStmts(MainParser.StmtsContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("Exit Stmts");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterStmt(MainParser.StmtContext ctx) { System.out.println("ENTER Stmt"); }

    @Override public void exitStmt(MainParser.StmtContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("Exit Stmt");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterAssign(MainParser.AssignContext ctx) { System.out.println("ENTER Assign"); }

    @Override public void exitAssign(MainParser.AssignContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("Exit Assign");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterAllexpr(MainParser.AllexprContext ctx) { System.out.println("ENTER Allexpr"); }

    @Override public void exitAllexpr(MainParser.AllexprContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("Exit Allexpr");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterAndexpr(MainParser.AndexprContext ctx) { System.out.println("ENTER Andexpr"); }

    @Override public void exitAndexpr(MainParser.AndexprContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("Exit Andexpr");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterEqual(MainParser.EqualContext ctx) { System.out.println("ENTER Equal"); }

    @Override public void exitEqual(MainParser.EqualContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("Exit Equal");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterRel(MainParser.RelContext ctx) { System.out.println("ENTER Rel"); }

    @Override public void exitRel(MainParser.RelContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("Exit Rel");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterExpr(MainParser.ExprContext ctx) { System.out.println("ENTER Expr"); }

    @Override public void exitExpr(MainParser.ExprContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("Exit Expr");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterTerm(MainParser.TermContext ctx) { System.out.println("ENTER Term"); }

    @Override public void exitTerm(MainParser.TermContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("Exit Term");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterIncdecexpr(MainParser.IncdecexprContext ctx) { System.out.println("ENTER Incdecexpr"); }

    @Override public void exitIncdecexpr(MainParser.IncdecexprContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("Exit Incdecexpr");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterFactor(MainParser.FactorContext ctx) { System.out.println("ENTER Factor"); }

    @Override public void exitFactor(MainParser.FactorContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("Exit Factor");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void enterEveryRule(ParserRuleContext ctx) { System.out.println("ENTER EveryRule"); }

    @Override public void exitEveryRule(ParserRuleContext ctx) {
        int size = 0;
        if (ctx.children != null)
            size = ctx.children.size();
        System.out.println("Exit EveryRule");
        System.out.println("  HAD " + size + " CHILDREN");
    }

    @Override public void visitTerminal(TerminalNode node) {
        System.out.println("TERMINAL NODE: " + node.toString());
    }

    @Override public void visitErrorNode(ErrorNode node) {
        System.err.println("ERROR: " + node.toString());
    }
}
