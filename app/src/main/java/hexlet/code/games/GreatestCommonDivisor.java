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
        final int maxRange = 100;
        int numberOne = Utils.getRandomNum(1, maxRange);
        int numberTwo = Utils.getRandomNum(1, maxRange);
        String[] round = new String[2];
        round[0] = numberOne + " " + numberTwo;
        round[1] = Integer.toString(findGCD(numberOne, numberTwo));
        return round;
    }

    public static void start() {
        final int rounds = 3;
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] roundsData = new String[rounds][2];
        for (var i = 0; i < rounds; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(rules, roundsData);
    }
}
