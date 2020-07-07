package Lesson6;

import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        int[][] Arr1 = new int[5][8];
        int max=0;

        for (int i = 0; i < Arr1.length; i++) {
            for (int j = 0; j < Arr1[i].length; j++) {
                Arr1[i][j] = new Random().nextInt(199) - 99;
                if (max < Arr1[i][j]){
                    max = Arr1[i][j];
                }

                    System.out.print(Arr1[i][j] + " ");
                }
                System.out.println();
        }
        System.out.println("Max number = " + max);
    }
}
