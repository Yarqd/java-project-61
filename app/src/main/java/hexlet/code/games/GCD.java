package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD implements Engine {
    public static void gcd() {
        String a = Engine.hello();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int numberOne = random.nextInt(98) + 1;
            int numberTwo = random.nextInt(98) + 1;
            System.out.println("Question: " + numberOne + " " + numberTwo);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            int response = scanner.nextInt();
            if (findGCD(numberOne, numberTwo) != response) {
                System.out.println("'" + response + "' is wrong answer ;(. Correct answer was '" + findGCD(numberOne,
                        numberTwo) + "'.");
                System.out.println("Let's try again, " + a + "!");
                System.exit(0);
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + a + "!");
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
