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
        final int startProgression = 5;
        final int lengthProgression = 7;
        final int maxProgressionStep = 17;
        int progressionlength = Utils.getRandomNum(startProgression, lengthProgression);
        int progressionStep = Utils.getRandomNum(2, maxProgressionStep);
        int hiddenCell = Utils.hiddenCell(progressionlength);
        String[] progression = generateProgression(progressionlength, progressionStep, hiddenCell);
        String[] round = new String[2];
        round[0] = progression[0];
        round[1] = progression[1];
        return round;
    }

    public static void start() {
        final int rounds = 3;
        String rules = "What number is missing in the progression?";
        String[][] roundsData = new String[rounds][2];
        for (var i = 0; i < rounds; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.run(rules, roundsData);
    }
}
