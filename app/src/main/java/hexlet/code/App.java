package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Progression;
import hexlet.code.games.SimpleNumber;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.next();
        switch (select) {
            case "1":
                Cli.name();
                break;
            case "2":
                Even.parity();
                break;
            case "3":
                Calc.calc();
                break;
            case "4":
                GCD.gcd();
                break;
            case "5":
                Progression.prog();
                break;
            case "6":
                SimpleNumber.simple();
                break;
            default:
                break;
        }
    }
}
