package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class Calc implements Game {
    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    @Override
    public String[] getData() {
        String[] resultArray = new String[2];
        Random random = new Random();
        int numberOne = random.nextInt(100);
        int numberTwo = random.nextInt(100);
        int result = 0;
        String[] ops = {"+", "-", "*"};
        int arithmetic = random.nextInt(ops.length);
        switch (ops[arithmetic]) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            default:
                break;
        }

//        Scanner scanner = new Scanner(System.in);
//        int response = scanner.nextInt();
        resultArray[0] = numberOne + " " + ops[arithmetic] + " " + numberTwo;
        resultArray[1] = String.valueOf(result);
        return resultArray;
    }
}
