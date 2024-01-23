package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GreatestCommonDivisor {

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

    public static void start() {
        String rules = "Find the greatest common divisor of given numbers.";
        String[][] resultArray = new String[3][2];
        for (var i = 0; i < 3; i++) {
            Random random = new Random();
            int numberOne = random.nextInt(98) + 1;
            int numberTwo = random.nextInt(98) + 1;
            resultArray[i][0] = numberOne + " " + numberTwo;
            resultArray[i][1] = Integer.toString(findGCD(numberOne, numberTwo));
        }
        Engine.run(rules, resultArray);
    }
}
