package main.java;

public class MyVisitor<T> extends MainBaseVisitor<T>{

    @Override public T visitProgram(MainParser.ProgramContext ctx) {
        System.out.println("ENTER PROGRAM");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null)
            size = ctx.children.size();
            System.out.println("EXIT PROGRAM");
            System.out.println("  HAD " + size + " CHILDREN");
            return res;
        }

    @Override public T visitBlock(MainParser.BlockContext ctx) {
        System.out.println("ENTER BLOCK");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null && ctx.getText().charAt(0) == '{') {
            size = ctx.children.size();
            System.out.println("EXIT BLOCK");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

    @Override public T visitDecls(MainParser.DeclsContext ctx) {
        System.out.println("ENTER DECLS");
        T res = visitChildren(ctx);
        int size = 0;
        if (ctx.children != null) {
            size = ctx.children.size();
            System.out.println("EXIT DECLS");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

    @Override public T visitDecl(MainParser.DeclContext ctx) {
        System.out.println("ENTER DECL");
        T res = visitChildren(ctx);
        int size = 0;
        if (ctx.children != null ){
            size = ctx.children.size();
            System.out.println("EXIT DECL");
            System.out.println("  HAD " + size + " CHILDREN");
        }
        else
            System.out.println("ERROR");

        return res;
    }

    @Override public T visitType(MainParser.TypeContext ctx) {
        System.out.println("ENTER TYPE");
        T res = visitChildren(ctx);
        int size = 0;
        if (ctx.children != null)
            if (ctx.getText().startsWith("int") || ctx.getText().startsWith("bool") || ctx.getText().startsWith("float")) {
                size = ctx.children.size();
                System.out.println("EXIT TYPE");
                System.out.println("  HAD " + size + " CHILDREN");
            } else {
                System.out.println("ERROR");
            }

        return res;
    }

    @Override public T visitStmts(MainParser.StmtsContext ctx) {
        System.out.println("ENTER STMTS");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null) {
            size = ctx.children.size();
            System.out.println("EXIT STMTS");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

    @Override public T visitStmt(MainParser.StmtContext ctx) {
        System.out.println("ENTER STMT");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null) {
            size = ctx.children.size();
            System.out.println("EXIT STMT");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

    @Override public T visitAssign(MainParser.AssignContext ctx) {
        System.out.println("ENTER ASSIGN");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null) {
            size = ctx.children.size();
            System.out.println("EXIT ASSIGN");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

    @Override public T visitAllexpr(MainParser.AllexprContext ctx) {
        System.out.println("ENTER ALLEXPR");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null) {
            size = ctx.children.size();
            System.out.println("EXIT ALLEXPR");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

    @Override public T visitAndexpr(MainParser.AndexprContext ctx) {
                System.out.println("ENTER ANDEXPR");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null) {
            size = ctx.children.size();
            System.out.println("EXIT ANDEXPR");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

    @Override public T visitEqual(MainParser.EqualContext ctx) {
                System.out.println("ENTER EQUAL");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null) {
            size = ctx.children.size();
            System.out.println("EXIT EQUAL");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

    @Override public T visitRel(MainParser.RelContext ctx) {
        System.out.println("ENTER REL");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null) {
            size = ctx.children.size();
            System.out.println("EXIT REL");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

    @Override public T visitExpr(MainParser.ExprContext ctx) {
        System.out.println("ENTER EXPR");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null) {
            size = ctx.children.size();
            System.out.println("EXIT EXPR");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

    @Override public T visitTerm(MainParser.TermContext ctx) {
        System.out.println("ENTER TERM");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null) {
            size = ctx.children.size();
            System.out.println("EXIT TERM");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

    @Override public T visitIncdecexpr(MainParser.IncdecexprContext ctx) {
        System.out.println("ENTER INC_DEC_EXPR");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null) {
            size = ctx.children.size();
            System.out.println("EXIT INC_DEC_EXPR");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

    @Override public T visitFactor(MainParser.FactorContext ctx) {
        System.out.println("ENTER FACTOR");
        T res = visitChildren(ctx);
        int size = 0;

        if (ctx.children != null) {
            size = ctx.children.size();
            System.out.println("EXIT FACTOR");
            System.out.println("  HAD " + size + " CHILDREN");
        }

        return res;
    }

}
