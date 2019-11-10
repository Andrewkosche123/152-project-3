package main.java;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ListTokenSource;

public class Main {
    public static void main(String[] args) {
        try {
            MainLexer mll = new MainLexer(CharStreams.fromFileName("input"));
            ListTokenSource ltsl = new ListTokenSource(mll.getAllTokens());
            BufferedTokenStream btsl = new BufferedTokenStream(ltsl);
            MainParser mp = new MainParser(btsl);

            System.out.println("-----===== PARSE USING LISTENER =====-----");
            mp.addParseListener(new MainBaseListener());
            mp.program();

            System.out.println("\n\n\n\n-----===== PARSE USING VISITOR =====-----");
            MainLexer mlv = new MainLexer(CharStreams.fromFileName("input"));
            ListTokenSource ltsv = new ListTokenSource(mlv.getAllTokens());
            BufferedTokenStream btsv = new BufferedTokenStream(ltsv);
            MainParser mpv = new MainParser(btsv);
            MyVisitor v = new MyVisitor();
            v.visitProgram(mpv.program());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
