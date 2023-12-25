package hexlet.code.games;

//import hexlet.code.Engine;
import hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public class Even implements Game {
    @Override
    public String getRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        return null;
    }

    @Override
    public String[] getData() {
        String[] resultArray = new String[2];
        String result;
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if (randomNumber % 2 == 0) {
            result = "yes";
        } else {
            result = "no";
        }

        System.out.println("Question: " + randomNumber);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.next();
        resultArray[0] = result;
        resultArray[1] = response;
        return resultArray;
    }
}
//            int z = randomNumber % 2;
//            if (response.equals("yes") & z == 0) {
//                System.out.println("Correct!");
//            } else if (response.equals("no") & z != 0) {
//                System.out.println("Correct!");
//            } else {
//                String resp = "no";
//                if (z == 0) {
//                    resp = "yes";
//                }
//                System.out.println("'" + response + "' " + "is wrong answer ;(. Correct answer was '" + resp + "'.");
//                System.out.println("Let's try again, " + a + "!");
//                System.exit(0);
//            }
//        }
//        System.out.println("Congratulations, " + a + "!");
//    }
//}
