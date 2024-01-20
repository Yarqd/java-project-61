package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class Calc implements Game {
    public static int result(int numberOne, int numberTwo, int arithmetic) {
        if (arithmetic == 0) {
            return numberOne + numberTwo;
        } else if (arithmetic == 1) {
            return numberOne - numberTwo;
        } else {
            return numberOne * numberTwo;
        }
    }
    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public String[][] getData() {
        String[][] resultArray = new String[3][2];
        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int numberOne = random.nextInt(100);
            int numberTwo = random.nextInt(100);
            String[] ops = {"+", "-", "*"};
            int arithmetic = random.nextInt(ops.length);

            resultArray[i][0] = numberOne + " " + ops[arithmetic] + " " + numberTwo;
            resultArray[i][1] = String.valueOf(result(numberOne, numberTwo, arithmetic));
        }
        return resultArray;
    }
}
