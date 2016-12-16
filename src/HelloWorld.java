/**
 * Created by Mariusz on 16.12.2016.
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;

public class HelloWorld {
    public HelloWorld() {
    }

    public static void main(String[] args) {
        ConfigurationManager cm;
        if(args.length > 0) {
            cm = new ConfigurationManager(args[0]);
        } else {
            cm = new ConfigurationManager(HelloWorld.class.getResource("helloworld.config.xml"));
        }

        Recognizer recognizer = (Recognizer)cm.lookup("recognizer");
        recognizer.allocate();
        Microphone microphone = (Microphone)cm.lookup("microphone");
        if(!microphone.startRecording()) {
            System.out.println("Cannot start microphone.");
            recognizer.deallocate();
            System.exit(1);
        }

        System.out.println("Say: (Good morning | Hello) ( Bhiksha | Evandro | Paul | Philip | Rita | Will )");

        while(true) {
            while(true) {
                System.out.println("Start speaking. Press Ctrl-C to quit.\n");
                Result result = recognizer.recognize();
                if(result != null) {
                    String resultText = result.getBestFinalResultNoFiller();
                    System.out.println("You said: " + resultText + '\n');
                } else {
                    System.out.println("I can\'t hear what you said.\n");
                }
            }
        }
    }
}
