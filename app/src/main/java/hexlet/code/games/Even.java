package hexlet.code.games;

import hexlet.code.Engine;
//import hexlet.code.Game;

import java.util.Random;

public class Even {
    public static boolean parityCheck(int randomNumber) {
        return randomNumber % 2 == 0;
    }

    public static void start() {
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] resultArray = new String[3][2];
        for (var i = 0; i < 3; i++) {
            String result;
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            if (parityCheck(randomNumber)) {
                result = "yes";
            } else {
                result = "no";
            }
            resultArray[i][0] = Integer.toString(randomNumber);
            resultArray[i][1] = result;
        }
        Engine.run(rules, resultArray);
    }
}
