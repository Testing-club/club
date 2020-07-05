package Lesson6;

public class Example2 {
    public static void main(String[] args) {
        // 1 2 5
        // 3 7 8
        int[][] arr1 = {{1, 2, 5}, {3, 7, 8}};

        //output with for

        for (int i = 0; i < 2; i++) { // iteration over lines

            for (int j = 0; j < 3; j++) {// iteration over elements in each line

                System.out.print(arr1[i][j] + " ");
            }

            System.out.println();

        }
    }

}
