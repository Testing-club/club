package Lesson6;

import java.util.Random;

public class Homework7 {
    public static void main(String[] args) {

        int[][] arr1 = new int[10][10];
        for (int i=0; i < arr1.length; i++)
            for (int j=0; j < arr1[i].length; j++)
                arr1[i][j] = new Random().nextInt(10);

        for (int i=0;i < arr1.length; i++, System.out.println())
            for (int j=0;j < arr1[i].length;j++)
                System.out.print(arr1[i][j]+" ");


        for (int i=0; i < arr1.length / 2; ++i) {
            int tmp[] = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = tmp;
        }
        System.out.println();

        for (int i=0;i <arr1.length;i++, System.out.println())
            for (int j=0;j < arr1[i].length;j++)
                System.out.print(arr1[i][j]+" ");
    }
}


