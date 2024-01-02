package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void run(Game game) {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println(game.getRules());
        for (var i = 0; i < 3; i++) {
            String[] data = game.getData();
            System.out.println("Question: " + data[0]);
            System.out.print("Your answer: ");
            String response = scanner.next();
            if (data[1].equals(response)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + response + "' is wrong answer ;(. Correct answer was '" + data[1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}


