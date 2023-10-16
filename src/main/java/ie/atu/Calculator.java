package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){
        System.out.println("Hello");
        add();
        multiple();
        divide();
        subtract();
    }
    public static void add()
    { System.out.println("add: ");
        System.out.println("Please your first number :");
        Scanner inputs= new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second :");
        int secondNumber =inputs.nextInt();

        int total =firstNumber + secondNumber;
        System.out.println("The total is "+total);
    }

    public static void multiple()
    {
        System.out.println("multiply : ");
        System.out.println("Please enter your first number :");
        Scanner inputs= new Scanner(System.in);
        int num1 = inputs.nextInt();

        System.out.println("Please enter your second :");
        int num2 =inputs.nextInt();

        int multi =num1 * num2;
        System.out.println("The multiple is "+multi);
    }
    public static void divide()
    {
        System.out.println("divide : ");
        System.out.println("Please enter your dividend :");
        Scanner inputs= new Scanner(System.in);
        int num1 = inputs.nextInt();

        System.out.println("Please enter your divisor :");
        int num2 =inputs.nextInt();

        int divide =num1 / num2;
        System.out.println("The answer is "+divide);
    }
    public static void subtract()
    {
        System.out.println("subtract : ");
        System.out.println("Please enter your dividend :");
        Scanner inputs= new Scanner(System.in);
        int num1 = inputs.nextInt();

        System.out.println("Please enter your divisor :");
        int num2 =inputs.nextInt();

        int subtraction =num1 - num2;
        System.out.println("The answer is "+subtraction);
    }
}
