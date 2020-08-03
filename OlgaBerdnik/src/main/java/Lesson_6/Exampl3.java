package Lesson_6;

import java.util.Arrays;
import java.util.Random;

public class Exampl3 {
    public static void main (String[] args) {
        //Fill 2-dimentional array with random numbers {{},{}}

        int [][] arr1 = new int[8][15];

        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1[i].length; j++) {
                arr1[i][j] = new Random().nextInt(10);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        //Fast output
      System.out.println(  Arrays.deepToString(arr1)); // вывод всего массива
}}
