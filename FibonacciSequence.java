package org.example;
import java.util.Scanner;
//A program that calculates F(n) by the given value of n
public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Enter the index number of Fibonacci Sequence");

        Scanner userInput = new Scanner(System.in);
        int inputN = userInput.nextInt();

        int num1 = 0, num2 = 1;
        for (int i = 0; i < inputN; i++) {
            System.out.print(num2 + "  ");

            int sum = num1 + num2;

            num1 = num2;
            num2 = sum;
        }
        System.out.println("\nThe value of Fibonacci Sequence is " + num1);
    }
}
