//Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых
// чисел из отрезка [-99;99]. Вывести массив на экран. После на отдельной строке
// вывести на экран значение максимального элемента этого массива (его индекс не
// имеет значения).
package Arrays;
import java.util.Arrays;
import java.util.Random;
    public class ar4 {

        public static void main(String[] args) {
            int arr_1 [][] = new int[5][8];
            for (int i = 0; i < arr_1.length; i++) {
                for (int j = 0; j < arr_1[0].length; j++) {
                    arr_1[i][j] = new Random().nextInt((99 - (-99)) + 1) + (-99);
                    System.out.print(" " + arr_1[i][j]);
                }
                System.out.println();
            }
            int max = Integer.MIN_VALUE;
            for (int i=0; i<arr_1.length; i++){
              for (int j=0; j<arr_1[0].length; j++){
                  if (max < arr_1[i][j]){
                      max = arr_1[i][j];
                  }
              }
            }
            System.out.println("Max: " + max);


        }
    }


