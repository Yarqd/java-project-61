package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static int result(int numberOne, int numberTwo, int arithmetic) {
        if (arithmetic == 0) {
            return numberOne + numberTwo;
        } else if (arithmetic == 1) {
            return numberOne - numberTwo;
        } else {
            return numberOne * numberTwo;
        }
    }

    public static void start() {
        String rules =  "What is the result of the expression?";
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
        Engine.run(rules, resultArray);
    }
}
