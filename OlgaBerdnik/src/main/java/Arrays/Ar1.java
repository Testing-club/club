//Создать одномерный массив из обьектов класса double, заполнить случайными числами.
// Отсортировать числа методом пузырька и вывсести на экран.
package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ar1 {
    public static void main (String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextDouble();
            //сортировка методом пузырька
           boolean isSorted = false;
           double a;
           while (!isSorted) {
               isSorted = true;
               for (int j=0; j<arr.length-1; j++){
                   if (arr[j] > arr [j+1]) {
                   isSorted = false;

                   a = arr[j];
                   arr[j] = arr[j+1];
                   arr [j+1] = a;
               }}
           }

            System.out.print(arr[i] + " ");
        }
    }
}
