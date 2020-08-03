//Создать двумерный массив из 6 строк по 7 столбцов
// в каждой из случайных целых чисел из отрезка [0;9].
// Вывести массив на экран. Преобразовать массив таким
// образом, чтобы на первом месте в каждой строке стоял
// её наибольший элемент. При этом изменять состав массива
// нельзя, а можно только переставлять элементы в рамках
// одной строки. Порядок остальных элементов строки не
// важен (т.е. можно соврешить только одну перестановку,
// а можно отсортировать по убыванию каждую строку).
// Вывести преобразованный массив на экран.
package Arrays;
import java.util.Random;

public class ar5 {
    public static void main(String[] args) {

        int array[][] = new int[6][7];
        int maxvalue = 0; //max value
        int lol = 0; //temp to keep max value
        int a = 0; //temp to change first and max element at the end of string

        System.out.println("Source array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("String " + i + ": ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(10);
                System.out.print(array[i][j] + " ");

                if (j == 0) maxvalue = array[i][j];
                else {
                    if (maxvalue < array[i][j]) {
                        maxvalue = array[i][j];
                        lol = j;
                    }
                }

                if (j == array[i].length-1) {
                    a = array[i][0];
                    array[i][0] = array[i][lol];
                    array[i][lol] = a;
                }
            }

            System.out.println(" ");
        }

        System.out.println();
        System.out.println("Updated array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("String " + i + ": ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println(" ");
        }
    }
}