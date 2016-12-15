package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import sample.antlr4.ProgramLexer;
import sample.antlr4.ProgramParser;

import java.io.File;
import java.io.IOException;

public class Controller {

    @FXML
    private TextField programName;

    @FXML
    void runProgram(ActionEvent event) {
        printTree(programName.getText());
    }



    private void printTree(String sentence) {
        // Get our lexer
        ProgramLexer lexer = new ProgramLexer(new ANTLRInputStream(sentence));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser

        ProgramParser parser = new ProgramParser(tokens);
        ParseTree command = parser.command();
        CommandVisitor visitor = new CommandVisitor();

        AST ast = new AST(command);
        System.out.print(ast);
        for(int i=0; i<command.getChildCount();i++) {
            if (command.getChild(i) != null) {
                visitor.visit(command.getChild(i));
            }
        }
    }



    public void searchAndRunProgramByName(String name) {
        Runtime rs = Runtime.getRuntime();
System.out.print(name);
        try {
            Process p = Runtime.getRuntime().exec(name);
            p.waitFor();

           // rs.exec(name);
          //  rs.wait();

        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
        catch (InterruptedException ex) {
            System.out.print(ex.getMessage());
        }
    }



    static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }


    public void findFile(String name,File file)
    {
        File[] list = file.listFiles();
        if(list!=null)
            for (File fil : list)
            {
                if (fil.isDirectory())
                {
                    findFile(name,fil);
                }
                else if (name.equalsIgnoreCase(fil.getName()))
                {
                    System.out.println(fil.getParentFile());
                }
            }
    }
}