package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public String name;

    public static void calc() {
        String a = Engine.hello();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int numberOne = random.nextInt(100);
            int numberTwo = random.nextInt(100);
            int arithmetic = random.nextInt(3);
            String arithmeticSign;
            int result;
            if (arithmetic == 0) {
                arithmeticSign = "+";
                result = numberOne + numberTwo;
            } else if (arithmetic == 1) {
                arithmeticSign = "-";
                result = numberOne - numberTwo;
            } else {
                arithmeticSign = "*";
                result = numberOne * numberTwo;
            }
            System.out.println("Question: " + numberOne + " " + arithmeticSign + " " + numberTwo);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            int response = scanner.nextInt();
            if (result == response) {
                System.out.println("Correct!");
                continue;
            }
            System.out.println("'" + response + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + a + "!");
            System.exit(0);
        }
        System.out.println("Congratulations, " + a + "!");
    }
}
