package Lesson6;

import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;

public class Lesson6HW4 {
    public static void main(String[] args) {

        int[][] arr1 = new int[5][8];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = new Random().nextInt(100);
                boolean negative = new Random().nextBoolean();
                if (negative) {
                    arr1[i][j] = -arr1[i][j];
                }
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        int max = arr1[0][0];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] > max) {
                    max = arr1[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
