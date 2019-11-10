package main.java;

public class MyVisitor<T> extends MainBaseVisitor<T>{

    @Override public T visitProgram(MainParser.ProgramContext ctx) {
        System.out.println("ENTER PROGRAM");
        T res = visitChildren(ctx);
        int size = 0;
        if (ctx.children != null )
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
        else
            System.out.println("ERROR");

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
        else
            System.out.println("ERROR");

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
        if (ctx.children != null && (ctx.getText().substring(0,3).equals("int")|| ctx.getText().substring(0,4).equals("bool") || ctx.getText().substring(0,3).equals("float"))){
            size = ctx.children.size();
            System.out.println("EXIT TYPE");
            System.out.println("  HAD " + size + " CHILDREN");
         }
        else
                System.out.println("ERROR");
        return res;
    }
    @Override public T visitRel(MainParser.RelContext ctx) { return visitChildren(ctx); }

    @Override public T visitExpr(MainParser.ExprContext ctx) { return visitChildren(ctx); }

    @Override public T visitTerm(MainParser.TermContext ctx) { return visitChildren(ctx); }

    @Override public T visitIncdecexpr(MainParser.IncdecexprContext ctx) { return visitChildren(ctx); }

    @Override public T visitFactor(MainParser.FactorContext ctx) { return visitChildren(ctx); }

}
