package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class SimpleNumber {
    public static boolean result(int a) {
        boolean result = true;
        for (int j = 2; j < a / 2; j++) {
            if (a % j == 0) {
                result = false;
            }
        }
        return result;
    }

    private static String[] generateRoundData() {
        final int maxNum = 4997;
        int num = Utils.getRandomNum(2, maxNum);
        String[] round = new String[2];
        round[0] = Integer.toString(num);
        round[1] = result(num) ? "yes" : "no";
        return round;
    }

    public static void start() {
        final int rounds = 3;
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundsData = new String[rounds][2];
        for (var i = 0; i < rounds; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(rules, roundsData);
    }
}

