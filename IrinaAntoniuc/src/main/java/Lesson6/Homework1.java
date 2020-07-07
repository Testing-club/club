package Lesson6;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        double [] mas = {3.3, 1.9, 7.5, 4.6};

        boolean isSorted = false;
        double buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1 ; i++) {
                if (mas[i]>mas[i+1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }

}
