package hexlet.code;


import java.util.Scanner;

public interface Engine {
    static String hello() {
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    static void rounds(Object answer, Object correctAnswer) {

    }
}

