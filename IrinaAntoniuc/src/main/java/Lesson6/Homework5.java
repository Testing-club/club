package Lesson6;

import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {
        int [][] Arr1 = new int[7][4];
        int [] Arr2 = new int[Arr1.length];

        for(int i =0;i<Arr1.length;i++){

            for(int j=0;j<Arr1[i].length;j++){
                Arr1[i][j]=new Random().nextInt(11) - 5;
                System.out.print(Arr1[i][j]+" ");

                if(j==0)Arr2[i]=Arr1[i][j];
                else Arr2[i]*=Arr1[i][j];
                if(j==Arr1[i].length-1)

                    System.out.println(" ");
            }
        }
        int max=0,max_i=0;
        for(int i=0;i<Arr2.length;i++){
            if(Math.abs(Arr2[i])>(max)){
                max=Arr2[i];
                max_i=i;
            }
        }
        System.out.print("Max ("+max+") row - "+max_i);
    }
}
