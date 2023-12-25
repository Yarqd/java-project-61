package hexlet.code;


//import hexlet.code.games.Calc;

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
        game.getRules();
        for (var i = 0; i < 3; i++) {
            String[] data = game.getData();
            if (data[0].equals(data[1])) {
                System.out.println("Correct!");
                continue;
            }
            System.out.println("'" + data[1] + "' is wrong answer ;(. Correct answer was '" + data[0] + "'.");
            System.out.println("Let's try again, " + name + "!");
            System.exit(0);
        }
        System.out.println("Congratulations, " + name + "!");
    }
}


