package hexlet.code.games;

//import hexlet.code.Engine;
import hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public class Calc implements Game {
    @Override
    public String getRules() {
        System.out.println("What is the result of the expression?");
        return null;
    }

    @Override
    public String[] getData() {
        String[] resultArray = new String[2];
        Random random = new Random();
        int numberOne = random.nextInt(100);
        int numberTwo = random.nextInt(100);
        int arithmetic = random.nextInt(3);
        String arithmeticSign;
        int result;
        if (arithmetic == 0) {
            arithmeticSign = "+";
            result = numberOne + numberTwo;
        } else if (arithmetic == 1) {
            arithmeticSign = "-";
            result = numberOne - numberTwo;
        } else {
            arithmeticSign = "*";
            result = numberOne * numberTwo;
        }
        System.out.println("Question: " + numberOne + " " + arithmeticSign + " " + numberTwo);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt();
        resultArray[0] = Integer.toString(result);
        resultArray[1] = Integer.toString(response);
        return resultArray;
    }
}
//    public String name;
//
//    public static void calc() {
//        //String a = Engine.hello();
//        System.out.println("What is the result of the expression?");
//        for (int i = 0; i < 3; i++) {
//            Random random = new Random();
//            int numberOne = random.nextInt(100);
//            int numberTwo = random.nextInt(100);
//            int arithmetic = random.nextInt(3);
//            String arithmeticSign;
//            int result;
//            if (arithmetic == 0) {
//                arithmeticSign = "+";
//                result = numberOne + numberTwo;
//            } else if (arithmetic == 1) {
//                arithmeticSign = "-";
//                result = numberOne - numberTwo;
//            } else {
//                arithmeticSign = "*";
//                result = numberOne * numberTwo;
//            }
//            System.out.println("Question: " + numberOne + " " + arithmeticSign + " " + numberTwo);
//            System.out.print("Your answer: ");
//            Scanner scanner = new Scanner(System.in);
//            int response = scanner.nextInt();
//            if (result == response) {
//                System.out.println("Correct!");
//                continue;
//            }
//            System.out.println("'" + response + "' is wrong answer ;(. Correct answer was '" + result + "'.");
//            System.out.println("Let's try again, " + a + "!");
//            System.exit(0);
//        }
//        System.out.println("Congratulations, " + a + "!");
//    }
//}
