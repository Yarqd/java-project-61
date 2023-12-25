package hexlet.code.games;

//import hexlet.code.Engine;
import hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public class SimpleNumber implements Game {
    public static String result(int a) {
        String result = "yes";
        for (int j = 2; j < a / 2; j++) {
            if (a % j == 0) {
                result = "no";
            }
        }
        return result;
    }

    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String[] getData() {
        String[] resultArray = new String[2];
        Random random = new Random();
        int x = random.nextInt(4997) + 2; // x - наше число
        //String correctAnswer = "yes";
        System.out.println("Question: " + x);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next(); // Ответ игрока
        resultArray[0] = result(x);
        resultArray[1] = response;
        return resultArray;
    }
}

//            for (int j = 2; j < x / 2; j++) {
//                if (x % j == 0) {
//                    correctAnswer = "no";
//                }
//            }
//            if (correctAnswer.equals(response)) {
//                System.out.println("Correct!");
//                continue;
//            }
//            System.out.println("'" + response + "' " + "is wrong answer ;(. Correct answer was '"
//                    + correctAnswer + "'.");
//            System.out.println("Let's try again, " + a + "!");
//            System.exit(0);
//        }
//        System.out.println("Congratulations, " + a + "!");
//    }
//}
