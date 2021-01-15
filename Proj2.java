import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Proj2 {
    public static void main(String[] args) throws Exception {

        for(Integer i=1;i<13;i++) {
            System.out.print("Test# ");
            System.out.println(i);
            String inputFile = "/Users/gussegovia/IdeaProjects/antlrtest/src/tests/test";
            inputFile+=i.toString()+".pas";
            if (args.length > 0)
                inputFile = args[0];
            InputStream is = System.in;
            if (inputFile != null)
                is = new FileInputStream(inputFile);
            ANTLRInputStream input = new ANTLRInputStream(is);
            Proj2Lexer lexer = new Proj2Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Proj2Parser parser = new Proj2Parser(tokens);
            ParseTree tree = parser.program(); // parse; start at prog
            //System.out.println(tree.toStringTree(parser)); // print tree as text
            EvalVis eval = new EvalVis();
            eval.visit(tree);
            System.out.println("");
            //System.out.println("test");
        }



    }
}