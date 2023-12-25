package hexlet.code.games;

//import hexlet.code.Engine;
import hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public class Progression implements Game {
    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String[] getData() {
        String[] resultArray = new String[2];
        Random random = new Random();
        int x = random.nextInt(5) + 7; // х - Длинна массива
        int z = random.nextInt(17) + 2; // з - Шаг прогрессии
        int rand = random.nextInt(x - 1) + 1; // Порядковый номер ячейки массива, которую закрасим
        int[] numbers = new int[x];
        numbers[0] = z;
        for (int j = 1; j < numbers.length; j++) {
            numbers[j] = z * ++j;
            --j;
        }
        System.out.print("Question: ");
        for (int q = 0; q < rand; q++) {
            System.out.print(numbers[q] + " ");
        }
        System.out.print(".. ");
        for (int q = ++rand; q < numbers.length; q++) {
            System.out.print(numbers[q] + " ");
        }
        System.out.println();
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt(); // Ответ
        int result = numbers[--rand];
        resultArray[0] = Integer.toString(result);
        resultArray[1] = Integer.toString(response);
        return resultArray;
    }
}
//            if (response != correctAnswer) {
//                System.out.println("'" + response + "' is wrong answer ;(. Correct answer was '" + numbers[rand]
//                        + "'.");
//                System.out.println("Let's try again, " + a + "!");
//                System.exit(0);
//            } else {
//                System.out.println("Correct!");
//            }
//        }
//        System.out.println("Congratulations, " + a + "!");
//    }
//}
