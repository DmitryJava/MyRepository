package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] array = new int[100];
        Random random = new Random();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int numbersEnds0 = 0;
        int sumNumbersEnds0 = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }

        for (int i : array) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
            if (i % 10 == 0) {
                numbersEnds0 += 1;
                sumNumbersEnds0 += i;
            }
        }

        System.out.printf("Наибольший элемент массива: %d\n", max);
        System.out.printf("Наименьший элемент массива: %d\n", min);
        System.out.printf("Количество элементов массива, оканчивающихся на 0: %d\n", numbersEnds0);
        System.out.printf("Сумму элементов массива, оканчивающихся на 0: %d\n", sumNumbersEnds0);
    }
}
