package HomeWorkFromLesson2;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int result = firstNumber > secondNumber ? firstNumber - secondNumber : firstNumber + secondNumber;
        System.out.println(result);
    }
}
