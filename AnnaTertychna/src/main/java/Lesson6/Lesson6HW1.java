package Lesson6;

import java.util.Arrays;
import java.util.Random;


public class Lesson6HW1 {
    public static void main(String[] args) {

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextDouble();
        }
        System.out.println(Arrays.toString(array));

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(double[] array, int ind1, int ind2) {
        double tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}

