package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class Progression {
    public static String[] progression(int length, int step, int hidden) {

        String[] result = new String[2]; //Создали результирующий массив

        int[] numbers = new int[length];
        numbers[0] = step;
        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + step; //Создали прогрессию в формате int
        }

        List<String> strings = new ArrayList<>();
        for (int number : numbers) {
            strings.add(Integer.toString(number)); //Перевели прогрессию в формат String в ArrayList
        }

        result[1] = strings.get(hidden); //Взяли нужный ответ в String

        strings.set(hidden, ".."); // Спрятали нужный элемент прогрессии

        String delimiter = " ";
        result[0] = String.join(delimiter, strings); //Должна быть распечатана прогрессия
        return result;
    }

    public static void start() {
        String rules = "What number is missing in the progression?";
        String[][] resultArray = new String[3][2];
        for (var i = 0; i < 3; i++) {
            int progressionlength = Utils.getRandomNum(5, 7);
            int progressionStep = Utils.getRandomNum(2, 17);
            int hiddenCell = Utils.hiddenCell(progressionlength);
            String[] result = progression(progressionlength, progressionStep, hiddenCell);
            resultArray[i][0] = result[0];
            resultArray[i][1] = result[1];
        }
        Engine.run(rules, resultArray);
    }
}
