package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Utils;

public class SimpleNumber implements Game {
    public static boolean result(int a) {
        boolean result = true;
        for (int j = 2; j < a / 2; j++) {
            if (a % j == 0) {
                result = false;
            }
        }
        return result;
    }

    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String[][] getData() {
        String[][] resultArray = new String[3][2];
        for (var i = 0; i < 3; i++) {
            int num = Utils.getRandomNum(2, 4997);
            resultArray[i][0] = Integer.toString(num);
            resultArray[i][1] = result(num) ? "yes" : "no";
        }
        return resultArray;
    }
}

