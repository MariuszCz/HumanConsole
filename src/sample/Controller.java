package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import sample.antlr4.ProgramLexer;
import sample.antlr4.ProgramParser;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;

public class Controller {
    @FXML
    private TextArea output;

    @FXML
    private TextField programName;

    @FXML
    void runProgram(ActionEvent event) {
//        try {
//            runProgramByName(programName.getText());
//            runProgramFromUrl(programName.getText());
//        } catch (Exception ex) {
//         //   System.out.print(ex.getMessage());
//        }
        printTree("please run app notatnik fg and close browser chrome");
    }



    private void printTree(String sentence) {
        // Get our lexer
        ProgramLexer lexer = new ProgramLexer(new ANTLRInputStream(sentence));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser

        ProgramParser parser = new ProgramParser(tokens);

        ParseTree connector = parser.command();
        AST ast = new AST(connector);
      //  System.out.print(ast);

     //   System.out.print(ast.getChildren().get(0).getChildren().get(0).getChildren().get(0).getChildren().get(1).toString());
        ActionModel actionModel = new ActionModel(ast.getChildren().get(1).toString(),
                ast.getChildren().get(0).getChildren().get(0).getChildren().get(0).getChildren().get(1).toString(),
                ast.getChildren().get(0).getChildren().get(0).getChildren().get(1).toString(),
                ast.getChildren().get(0).getChildren().get(1).toString());

        System.out.print(actionModel.getConnector());
        System.out.print(actionModel.getAction());
        System.out.print(actionModel.getType());
        System.out.print(actionModel.getName());
       // CommandModel commandModel = new CommandModel();
       // System.out.print(ast);


//        AntlrListener antlrListener = new AntlrListener();
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(antlrListener,connector);

   ///     String sexpression = toStringTree(connector, Arrays.asList(parser.getRuleNames())).trim();

    }
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

    public void runProgramFromUrl(String name) {
//        ProcessBuilder p = new ProcessBuilder();
////dir <Folder Name> /AD /s
//        try {
//            p.command("C:\\Users\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
//
//            p.start();
//        }
//        catch (IOException e) {
//            System.out.println(e);
//        }
//        System.out.println("Started EXE");
        String pattern = name;
        PathMatcher matcher =
                FileSystems.getDefault().getPathMatcher("glob:" + pattern);

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