package Lesson_6;

public class Exampl1_2 {
    public static void main (String[] args) {
        //Array of arrays
        //Declaration
        int[][] arr1;
        String[][][] arr2;
        String arr3[][][];
        float[][][][][][] arr4;

        //Instantiation

        arr1 = new int[2][2];
        int[][] arr5 = new int[4][5];
        int arr6[][] = new int[8][9];

        //Initialization

        arr1[0][0] = 30;
        arr1[0][1] = 40;
        arr1[1][1] = 50;
        arr1[1][0] = 60;
        int[][] arr7 = {{15, 25}, {35, 45}};


        //1 2 5
//3 7 8
//type[LineIndex][columnIndex]
        int[][] arr8 = {{1, 2, 5}, {3, 7, 8}};

        //Equals to:

        arr8[0][0] = 1;
        arr8[1][1] = 7;
        arr8[0][2] = 5;
        //..

        System.out.println("arr8[0][0]: " + arr8[0][0]); //ok
        System.out.println("arr8: " + arr8); //not ok
        System.out.println("____________");

        //Output with "for"

        for (int i = 0; i < 2; i++) { //Iterating over lines
            for (int j = 0; j < 3; j++) { //Iterating over elements each line

                System.out.print(arr8[i][j] + "\t");
            }
         System.out.println();


        }

    }
}

