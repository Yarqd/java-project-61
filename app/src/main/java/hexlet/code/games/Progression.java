package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class Progression implements Game {
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
    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String[][] getData() {
        String[][] resultArray = new String[3][2];
        for (var i = 0; i < 3; i++) {
            int progressionlength = Utils.getRandomNum(5, 7);
            int progressionStep = Utils.getRandomNum(2, 17);
            int hiddenCell = Utils.hiddenCell(progressionlength);
//            int[] numbers = new int[progressionlength];
//            numbers[0] = progressionStep;
//            for (int j = 1; j < numbers.length; j++) {
//                numbers[j] = numbers[j - 1] + progressionStep;
//            }
//            var task = new StringBuilder();
//            for (int q = 0; q < hiddenCell; q++) {
//                task.append(numbers[q] + " ");
//            }
//            task.append(".. ");
//            for (int q = hiddenCell + 1; q < numbers.length; q++) {
//                task.append(numbers[q] + " ");
//            }
            String[] result = progression(progressionlength, progressionStep, hiddenCell);
            resultArray[i][0] = result[0];
            resultArray[i][1] = result[1];
        }
        return resultArray;
    }
}
