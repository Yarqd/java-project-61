package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Parity;
import hexlet.code.games.Progression;
import hexlet.code.games.SimpleNumber;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Engine.selectGame();
        Scanner scanner = new Scanner(System.in);
        String select = scanner.next();
        if (select.equals("1")) {
            Engine.hello();
            String nam = Cli.name();
            System.out.println("Hello, " + nam + "!");
        } else if (select.equals("2")) {
            Parity.parity();
        } else if (select.equals("3")) {
            Calc.calc();
        } else if (select.equals("4")) {
            GCD.gcd();
        } else if (select.equals("5")) {
            Progression.prog();
        } else if (select.equals("6")) {
            SimpleNumber.simple();
        }
    }
}
