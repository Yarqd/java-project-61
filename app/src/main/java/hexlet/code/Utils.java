package hexlet.code;

import java.util.Random;

public class Utils {
    static Random random = new Random();

    public static int hiddenCell(int progressionlength) {
        int result = random.nextInt(progressionlength - 1) + 1;
        return result;
    }

    public static int getRandomNum(int MIN_RANGE, int MAX_RANGE) {
        int result = random.nextInt(MAX_RANGE) + MIN_RANGE;
        return result;
    }
}
