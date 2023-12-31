package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

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
        String task = "";
//        System.out.print("Question: ");
        for (int q = 0; q < rand; q++) {
            task = task + numbers[q] + " ";
//            System.out.print(numbers[q] + " ");
        }
        task = task + ".. ";
//        System.out.print(".. ");
        for (int q = ++rand; q < numbers.length; q++) {
            task = task + numbers[q] + " ";
//            System.out.print(numbers[q] + " ");
        }
        System.out.println();
//        System.out.print("Your answer: ");
//        Scanner scanner = new Scanner(System.in);
//        int response = scanner.nextInt(); // Ответ
        int result = numbers[--rand];
        resultArray[0] = task;
        resultArray[1] = Integer.toString(numbers[rand]);
        return resultArray;
    }
}
