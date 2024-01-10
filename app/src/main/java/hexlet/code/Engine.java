package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void run(Game game) {
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
        System.out.println(game.getRules());
        for (var i = 0; i < rounds; i++) {
            String[] data = game.getData();
            System.out.println("Question: " + data[question]);
            System.out.print("Your answer: ");
            String response = scanner.next();
            if (data[answer].equals(response)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + response + "' is wrong answer ;(. Correct answer was '" + data[answer] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}


