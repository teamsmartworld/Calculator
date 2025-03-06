package org.example;

import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        // setting the variables here
        int firstNumber = 0;
        int secondNumber = 0;

        // invoking the scanner function from the java system
        Scanner scan = new Scanner(System.in);

        //inviting input from the user.
        System.out.println("Please Enter a First Number:");
        firstNumber = scan.nextInt();

        System.out.println("Please enter a Second Number:");
        secondNumber = scan.nextInt();

        int operator;
        double answer = 0;

        // setting out the operators 1 to add, 2 to subtract, 3 to multiply and 4 to divide.
        System.out.println("Enter an Operator:");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");

        operator = scan.nextInt();

        //switching operations here
        switch(operator) {
            case 1:
                answer = firstNumber + secondNumber;
                break;
            case 2:
                answer = firstNumber - secondNumber;
                break;
            case 3:
                answer = firstNumber * secondNumber;
                break;
            case 4:
                answer = firstNumber / secondNumber;
                break;
        }
        System.out.println("The Answer is: " + answer);
        }
    }
}
