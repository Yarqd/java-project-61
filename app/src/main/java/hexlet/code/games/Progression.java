package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static String[] generateProgression(int length, int step, int hidden) {
        String[] result = new String[length];
        result[0] = Integer.toString(step);
        for (var i = 1; i < result.length; i++) {
            result[i] = Integer.toString(Integer.parseInt(result[i - 1]) + step);
        }
        String hid = result[hidden];
        result[hidden] = "..";
        String[] releasedData = new String[2];
        releasedData[0] = String.join(" ", result);
        releasedData[1] = hid;
        return releasedData;
    }

    private static String[] generateRoundData() {
        int progressionlength = Utils.getRandomNum(5, 7);
        int progressionStep = Utils.getRandomNum(2, 17);
        int hiddenCell = Utils.hiddenCell(progressionlength);
        String[] progression = generateProgression(progressionlength, progressionStep, hiddenCell);
        String[] round = new String[2];
        round[0] = progression[0];
        round[1] = progression[1];
        return round;
    }

    public static void start() {
        String rules = "What number is missing in the progression?";
        String[][] rounds = new String[3][2];
        for (var i = 0; i < 3; i++) {
            rounds[i] = generateRoundData();
        }
        Engine.run(rules, rounds);
    }
}
