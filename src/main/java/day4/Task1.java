package day4;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] array = new int[n];
        int moreEightCount = 0;
        int onesCount = 0;
        int evenCount = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                onesCount += 1;
            if (array[i] > 8)
                moreEightCount += 1;
            if (array[i] % 2 == 0)
                evenCount += 1;
            sum += array[i];
        }

        System.out.printf("Введено число %d. Сгенерирован следующий массив:\n", n);
        System.out.println(Arrays.toString(array));

        System.out.println("Информация о массиве:");
        System.out.printf("Длина массива: %d\n", n);
        System.out.printf("Количество чисел больше 8: %d\n", moreEightCount);
        System.out.printf("Количество чисел равных 1: %d\n", onesCount);
        System.out.printf("Количество четных чисел: %d\n", evenCount);
        System.out.printf("Количество нечетных чисел: %d\n", n - evenCount);
        System.out.printf("Сумма всех элементов массива: %d\n", sum);

    }
}
