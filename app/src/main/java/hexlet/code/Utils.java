package hexlet.code;

import java.util.Random;

public class Utils {
    private static Random random = new Random();

    public static int hiddenCell(int progressionlength) {
        int result = random.nextInt(progressionlength - 1) + 1;
        return result;
    }

    public static int getRandomNum(int minRange, int maxRange) {
        int result = random.nextInt(maxRange) + minRange;
        return result;
    }
}
