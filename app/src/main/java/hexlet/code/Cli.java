package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String hello() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        return name;
    }
}
