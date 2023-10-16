package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        System.out.println("Hello");
        subtract();

    }
    public static void subtract()
    {
        System.out.println("Subtraction:\n ");
        System.out.println("Please enter your first number :");
        Scanner inputs= new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number:");
        int secondNumber =inputs.nextInt();

        int total =firstNumber - secondNumber;
        System.out.println("The total is "+total);
    }

}
