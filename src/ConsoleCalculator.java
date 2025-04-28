package src;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Console Calculator");

        int num1, num2;
        char operator;

        System.out.println("=============================");

        // functionality of calculator
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        System.out.print("Enter operator: ");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.print(num1 + num2);
                break;
            case '-':
                System.out.print(num1 - num2);
                break;
            case '*':
                System.out.print(num1 * num2);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.print("Invalid Error");
                } else {
                    System.out.print(num1 / num2);
                    break;
                }
            default:
                System.out.print("Invalid operator!");
                break;
        }

        input.close();
    }
}
