package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Parity {
    public static void parity() {

        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String nam = Cli.hello();
        System.out.println("Hello, " + nam + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.next(); //2
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
                System.out.println("Let's try again, " + nam + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + nam + "!");
    }
}
