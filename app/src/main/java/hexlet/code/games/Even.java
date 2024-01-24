package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static boolean parityChecking(int randomNumber) {
        return randomNumber % 2 == 0;
    }

    private static String[] generateRoundData() {
        int randomNumber = Utils.getRandomNum(0, 99);
        String result = (parityChecking(randomNumber)) ? "yes" : "no";
        String[] round = new String[2];
        round[0] = Integer.toString(randomNumber);
        round[1] = result;
        return round;
    }

    public static void start() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[3][2];
        for (var i = 0; i < 3; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rules, rounds);
    }
}
