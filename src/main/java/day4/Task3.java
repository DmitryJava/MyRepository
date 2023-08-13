package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[][] array = new int[12][8];
        Random random = new Random();
        int sumMax = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
            }
        }

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum >= sumMax) {
                sumMax = sum;
                index = i;
            }
        }
        System.out.printf("Ответ: %d\n", index);
    }
}
