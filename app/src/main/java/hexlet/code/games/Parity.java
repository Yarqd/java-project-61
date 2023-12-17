package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Parity implements Engine {
    public static void parity() {
        String a = Engine.hello();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.next();
            int z = randomNumber % 2;
            if (response.equals("yes") & z == 0) {
                System.out.println("Correct!");
            } else if (response.equals("no") & z != 0) {
                System.out.println("Correct!");
            } else {
                String resp = "no";
                if (z == 0) {
                    resp = "yes";
                }
                System.out.println("'" + response + "' " + "is wrong answer ;(. Correct answer was '" + resp + "'.");
                System.out.println("Let's try again, " + a + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + a + "!");
    }
}
