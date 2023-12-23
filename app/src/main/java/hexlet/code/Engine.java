package hexlet.code;


import hexlet.code.games.Calc;

import java.util.Scanner;

public class Engine {

    public static void engineRun() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println();
        System.out.println("Hello, " + name + "!");

    }
}


