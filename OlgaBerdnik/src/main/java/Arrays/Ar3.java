//Создать массив 100*100 из обьектов класса int,
// заполнить случайными числами. Создать второй пустой массив
// 100*100 и скопировать значения из первого во второй.
package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ar3 {
    public static void main (String[] args) {
int arr_1 [][] = new int [100][100];
int arr_2 [][] = new int [100][100];
for (int i=0; i<arr_1.length; i++){
    for (int j=0; j<arr_1.length; j++) {
        arr_1[i][j] = new Random().nextInt(20);
        System.out.print(arr_1[i][j] + " ");
    }
}     System.out.println();

        System.out.println("Copy array");

        System.arraycopy(arr_1,0, arr_2, 0, arr_1.length);

        for (int i=0; i<arr_2.length; i++){
            for (int j=0; j<arr_2.length; j++) {
                System.out.print(arr_2[i][j] + " ");
            }
        }     System.out.println();
//arr2 = copyFullArrayUsingSystem(source);
      // arr2 = copyFull

    }
}
