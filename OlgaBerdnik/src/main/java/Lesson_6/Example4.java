package Lesson_6;

import java.util.Arrays;
import java.util.Random;

public class Example4 {

        public static void main (String[] args) {
            //Fill 3-dimentional array with random numbers {{},{}}

            int[][][] arr1 = new int[8][4][4];

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
for (int k=0; k<arr1[i][j].length; k++) {
    arr1[i][j][k] = i;
    System.out.print(arr1[i][j][k] + " ");
}
                    System.out.println();
                }
                System.out.println();
            }

        }}


