package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String name() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        return name;
    }
}
