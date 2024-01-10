package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Utils;

public class Progression implements Game {
    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String[] getData() {
        String[] resultArray = new String[2];
//        Random random = new Random();
//        int x = random.nextInt(5) + 7; // х - Длинна массива
//        int z = random.nextInt(17) + 2; // з - Шаг прогрессии
//        int rand = random.nextInt(x - 1) + 1; // Порядковый номер ячейки массива, которую закрасим
        int progressionlength = Utils.progressionlength();
        int progressionStep = Utils.progressionStep();
        int hiddenCell = Utils.hiddenCell(progressionlength);

        int[] numbers = new int[progressionlength];
        numbers[0] = progressionStep;

        for (int j = 1; j < numbers.length; j++) {
//            numbers[j] = progressionStep * ++j;
//            --j;
            numbers[j] = numbers[j - 1] + progressionStep;
        }

        var taskk = new StringBuilder();

        String task = "";
//        System.out.print("Question: ");
        for (int q = 0; q < hiddenCell; q++) {
            taskk.append(numbers[q] + " ");
            //task = task + numbers[q] + " ";
//            System.out.print(numbers[q] + " ");
        }
        taskk.append(".. ");
        //task = task + ".. ";
//        System.out.print(".. ");
        for (int q = hiddenCell + 1; q < numbers.length; q++) {
            taskk.append(numbers[q] + " ");
            //task = task + numbers[q] + " ";
//            System.out.print(numbers[q] + " ");
        }
        System.out.println();
//        System.out.print("Your answer: ");
//        Scanner scanner = new Scanner(System.in);
//        int response = scanner.nextInt(); // Ответ
//        int result = numbers[--hiddenCell];
        resultArray[0] = taskk.toString();
        resultArray[1] = Integer.toString(numbers[hiddenCell]);
        return resultArray;
    }
}
