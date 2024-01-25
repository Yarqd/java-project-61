package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static int calculate(char operator, int number1, int number2) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }

    private static String[] generateRoundData() {
        final int maxRange = 100;
        int numberOne = Utils.getRandomNum(0, maxRange);
        int numberTwo = Utils.getRandomNum(0, maxRange);
        Character[] ops = {'+', '-', '*'};
        int operation = Utils.getRandomNum(0, ops.length);
        String[] round = new String[2];
        round[0] = numberOne + " " + ops[operation] + " " + numberTwo;
        round[1] = String.valueOf(calculate(ops[operation], numberOne, numberTwo));
        return round;
    }

    public static void start() {
        final int rounds = 3;
        String rules =  "What is the result of the expression?";
        String[][] roundsData = new String[rounds][2];
        for (var i = 0; i < rounds; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(rules, roundsData);
    }
}
