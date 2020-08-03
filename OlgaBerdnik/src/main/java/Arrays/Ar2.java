//Создать одномерный массив из обьектов класса int, заполнить случайными числами.
// Отсортировать числа методом выборки (selection) и вывсести на экран.
package Arrays;

import java.util.Random;

public class Ar2 {
    public static void main (String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(20);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //selection
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
            System.out.print(arr[i] + " ");
        }

    }
}
