package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static boolean parityChecking(int randomNumber) {
        return randomNumber % 2 == 0;
    }

    private static String[] generateRoundData() {
        final int maxRange = 100;
        int randomNumber = Utils.getRandomNum(0, maxRange);
        String result = (parityChecking(randomNumber)) ? "yes" : "no";
        String[] round = new String[2];
        round[0] = Integer.toString(randomNumber);
        round[1] = result;
        return round;
    }

    public static void start() {
        final int rounds = 3;
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[rounds][2];
        for (var i = 0; i < rounds; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(rules, roundsData);
    }
}
