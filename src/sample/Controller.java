package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sample.antlr4.DrinkLexer;
import sample.antlr4.DrinkParser;

import java.io.IOException;

public class Controller {
    @FXML
    private TextArea output;

    @FXML
    private TextField programName;

    @FXML
    void runProgram(ActionEvent event) {
        printDrink(programName.getText());
    }
    private void printDrink(String drinkSentence) {
        // Get our lexer
        DrinkLexer lexer = new DrinkLexer(new ANTLRInputStream(drinkSentence));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser

        DrinkParser parser = new DrinkParser(tokens);

        // Specify our entry point
        DrinkParser.DrinkSentenceContext drinkSentenceContext = parser.drinkSentence();

        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        AntlrDrinkListener listener = new AntlrDrinkListener();
        walker.walk(listener, drinkSentenceContext);
    }

//    private void makeGrammar(String content) {
//     //   String content = new Scanner(new File("target/generated-sources/antlr4/jsonExample.txt")).useDelimiter("\\Z").next();
//        System.out.println( "Input:\n" + content + "\n\n");
//
//        ANTLRInputStream input = new ANTLRInputStream( content );
//
//        RunGrammarLexer lexer = new RunGrammarLexer(input);
//
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//
//        RunGrammarParser parser = new RunGrammarParser(tokens);
//
//        ParseTree tree = parser.drink();
//
//        System.out.println( "ParseTree:\n" + tree.toStringTree( parser ) + "\n");
//    }

    private void runProgramByName(String name) {
        Runtime rs = Runtime.getRuntime();

        try {
            rs.exec(name);
            output.setText(name+" successfully opened!");
        }
        catch (IOException e) {
            output.setText(e.getMessage());
        }
    }
    public static void runProgramFromUrl() {
        ProcessBuilder p = new ProcessBuilder();
//dir <Folder Name> /AD /s
        try {
            p.command("C:\\Users\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");

            p.start();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Started EXE");
    }


}