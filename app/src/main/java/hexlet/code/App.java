package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Progression;
import hexlet.code.games.SimpleNumber;

import java.util.Scanner;

public class App {
    private static final String EVEN = "2";
    private static final String CALC = "3";
    private static final String GCD = "4";
    private static final String PROGRESSION = "5";
    private static final String PRIME = "6";
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
                Cli.showGreetin();
                break;
            case EVEN:
                Engine.run(new Even());
                break;
            case CALC:
                Engine.run(new Calc());
                break;
            case GCD:
                Engine.run(new GCD());
                break;
            case PROGRESSION:
                Engine.run(new Progression());
                break;
            case PRIME:
                Engine.run(new SimpleNumber());
                break;
            default:
                break;
        }
    }
}
