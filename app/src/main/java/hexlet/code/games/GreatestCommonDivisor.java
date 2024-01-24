package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GreatestCommonDivisor {

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    private static String[] generateRoundData() {
        int numberOne = Utils.getRandomNum(1, 99);
        int numberTwo = Utils.getRandomNum(1, 99);
        String[] round = new String[2];
        round[0] = numberOne + " " + numberTwo;
        round[1] = Integer.toString(findGCD(numberOne, numberTwo));
        return round;
    }

    public static void start() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] rounds = new String[3][2];
        for (var i = 0; i < 3; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rules, rounds);
    }
}
