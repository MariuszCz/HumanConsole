import antlr4.ProgramLexer;
import antlr4.ProgramParser;
import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Controller {

    private Thread speech;

    @FXML
    private TextField programCommand;

    @FXML
    void runProgram(ActionEvent event) {
        printTree(programCommand.getText());
    }

    @FXML
    void stopSpeech(ActionEvent event) {
            speech.stop();
    }

    @FXML
    void startSpeech(ActionEvent event) {
        speech = new SpeechThread();
        speech.start();
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

    public class SpeechThread extends Thread {
        private ConfigurationManager cm;
        private Recognizer recognizer;

        public void run() {
            getTextFromSpeech();
        }

        private void getTextFromSpeech() {
            try {
                System.out.print("Started listening");
                cm = new ConfigurationManager(Controller.class.getResource("helloworld.config.xml"));
                recognizer = (Recognizer) cm.lookup("recognizer");
                recognizer.allocate();
                Microphone microphone = (Microphone) cm.lookup("microphone");
                if (!microphone.startRecording()) {
                    System.out.println("Cannot start microphone.");
                    recognizer.deallocate();
                }
                Result result;
                while ((result = recognizer.recognize()) != null) {
                    printTree(result.getBestResultNoFiller());
                    programCommand.setText(result.getBestFinalResultNoFiller());
                }
            } catch (IllegalMonitorStateException ex) {
                System.out.print("Stopped!");
            }
        }
    }
}