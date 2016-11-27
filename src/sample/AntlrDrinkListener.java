package sample;

import sample.antlr4.DrinkBaseListener;
import sample.antlr4.DrinkParser;

/**
 * Created by Mariusz on 27.11.2016.
 */
public class AntlrDrinkListener extends DrinkBaseListener {

        @Override
        public void enterDrink(DrinkParser.DrinkContext ctx) {
            System.out.println(ctx.getText());
        }

    }

