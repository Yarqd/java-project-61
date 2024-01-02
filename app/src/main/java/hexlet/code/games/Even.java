package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class Even implements Game {
    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
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

//        System.out.println("Question: " + randomNumber);
//        System.out.print("Your answer: ");
//        Scanner scanner = new Scanner(System.in);
//        String response = scanner.next();
        resultArray[0] = Integer.toString(randomNumber);
        resultArray[1] = result;
        return resultArray;
    }
}
