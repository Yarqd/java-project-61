package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.next();
        if (select.equals("1")) {
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String nam = Cli.hello();
            System.out.println("Hello, " + nam + "!");
        } else if (select.equals("2")) {
            Parity.parity();
        }
    }
}
