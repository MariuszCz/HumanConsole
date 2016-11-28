package sample;

import sample.antlr4.ProgramBaseListener;
import sample.antlr4.ProgramParser;

/**
 * Created by Mariusz on 27.11.2016.
 */
public class AntlrDrinkListener extends ProgramBaseListener {

        @Override
        public void enterProgram(ProgramParser.ProgramContext ctx) {
            System.out.println(ctx.getText());
        }

    }

