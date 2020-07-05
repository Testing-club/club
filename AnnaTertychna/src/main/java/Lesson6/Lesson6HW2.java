package Lesson6;

import java.util.Arrays;
import java.util.Random;

public class Lesson6HW2 {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left + 1; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int left, int minInd) {
        int tmp = array[left];
        array[left] = array[minInd];
        array[minInd] = tmp;
    }
}
