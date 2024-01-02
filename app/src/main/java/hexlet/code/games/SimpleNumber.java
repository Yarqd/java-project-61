package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class SimpleNumber implements Game {
    public static boolean result(int a) {
        boolean result = true;
        for (int j = 2; j < a / 2; j++) {
            if (a % j == 0) {
                result = false;
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
//        System.out.println("Question: " + x);
//        System.out.print("Your answer: ");
//        Scanner scanner = new Scanner(System.in);
//        String response = scanner.next(); // Ответ игрока
        String finalResponse = "yes";
        boolean bol = result(x);
        if (!bol) {
            finalResponse = "no";
        }
        resultArray[0] = Integer.toString(x);
        resultArray[1] = finalResponse;
        return resultArray;
    }
}

