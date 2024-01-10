package hexlet.code;

import java.util.Random;

public class Utils {
    static Random random = new Random();
    public static int progressionlength() {
        int result = random.nextInt(5) + 7;
        return result;
    }

    public static int progressionStep() {
        int result = random.nextInt(17) + 2;
        return result;
    }

    public static int hiddenCell(int progressionlength) {
        int result = random.nextInt(progressionlength - 1) + 1;
        return result;
    }
}
