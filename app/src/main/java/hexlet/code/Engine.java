package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void run(String rules, String[][] data) {
        final int rounds = 3;
        final int question = 0;
        final int answer = 1;
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);
        for (var i = 0; i < rounds; i++) {
            System.out.println("Question: " + data[i][question]);
            System.out.print("Your answer: ");
            String response = scanner.next();
            if (!data[i][answer].equals(response)) {
                System.out.println("'" + response + "' is wrong answer ;(. Correct answer was '" + data[i][answer]
                        + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
    }
}


