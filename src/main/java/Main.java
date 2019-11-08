package main.java;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ListTokenSource;

public class Main {
    public static void main(String[] args) {
        try {
            MainLexer ml = new MainLexer(CharStreams.fromFileName("input"));
            ListTokenSource lts = new ListTokenSource(ml.getAllTokens());
            BufferedTokenStream bts = new BufferedTokenStream(lts);
            MainParser mp = new MainParser(bts);
            mp.addParseListener(new MainBaseListener());
            mp.program();
        } catch (Exception e) {

        }
    }
}
