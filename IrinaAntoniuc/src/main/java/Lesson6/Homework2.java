package Lesson6;

import java.util.Random;

public class Homework2 {

    public static void main(String[] args) {
    int [][] Arr1 = new int[100][100];
        int[][] Arr2 = new int[100][100];

        for (int i=0; i < Arr1.length; i++) {
            for (int j = 0; j < Arr1[i].length; j++) {
                Arr1[i][j] = new Random().nextInt(99);

                System.arraycopy (Arr1, 0, Arr2, 0, 100);

                System.out.print(Arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}