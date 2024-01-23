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

    public static void start() {
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] resultArray = new String[3][2];
        for (var i = 0; i < 3; i++) {
            int num = Utils.getRandomNum(2, 4997);
            resultArray[i][0] = Integer.toString(num);
            resultArray[i][1] = result(num) ? "yes" : "no";
        }
        Engine.run(rules, resultArray);
    }
}

