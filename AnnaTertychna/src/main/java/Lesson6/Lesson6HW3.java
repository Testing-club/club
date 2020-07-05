package Lesson6;

import java.util.Arrays;
import java.util.Random;

public class Lesson6HW3 {

    public static void main(String[] args) {

        int[][] arr1 = new int[100][100];
        int[][] arr2 = new int[100][100];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = new Random().nextInt(100);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = arr1[i][j];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
