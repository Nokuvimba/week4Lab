package ie.atu;

import java.util.Scanner;
public class multiple {
    public static void main(String[] args){
        multiply();
    }
    public static void multiply(){
        System.out.println("Please enter your first number :");
        Scanner inputs =new Scanner(System.in);
        int num1= inputs.nextInt();

        System.out.println("Please enter your second number :");
        int num2 =inputs.nextInt();

        int multi = num1 * num2;
        System.out.println("The multiple is " + multi);
    }
}
