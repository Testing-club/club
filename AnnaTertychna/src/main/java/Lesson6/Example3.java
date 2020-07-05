package Lesson6;

import java.util.Arrays;
import java.util.Random;

public class Example3 {
    public static void main (String[] args){
        // fill in 2-dimensional array with random numbers
        int[][] arr1 = new int [8] [15];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = new Random().nextInt(10);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        //fast output
        System.out.println(Arrays.deepToString(arr1));
    }
}
