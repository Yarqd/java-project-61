package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class SimpleNumber {
    public static void simple() {
        Engine.hello();
        String nam = Cli.name();
        System.out.println("Hello, " + nam + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int x = random.nextInt(4997) + 2; // x - наше число
            String correctAnswer = "yes";
            System.out.println("Question: " + x);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.next(); // Ответ игрока

            for (int j = 2; j < x / 2; j++) {
                if (x % j == 0) {
                    correctAnswer = "no";
                }
            }
            if (correctAnswer.equals(response)) {
                System.out.println("Correct!");
                continue;
            }
            System.out.println("'" + response + "' " + "is wrong answer ;(. Correct answer was '"
                    + correctAnswer + "'.");
            System.out.println("Let's try again, " + nam + "!");
            System.exit(0);
        }
        System.out.println("Congratulations, " + nam + "!");
    }
}
