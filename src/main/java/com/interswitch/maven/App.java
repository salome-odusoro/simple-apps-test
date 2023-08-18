package com.interswitch.maven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        SimpleCalculator calculator = new SimpleCalculator();

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number: ");
        int x = scanner.nextInt();
        System.out.print("enter second number: ");
        int y = scanner.nextInt();
        System.out.println("choose an arithmetic to perform(addition, subtraction, multiplication or " +
                "division");
        String option = scanner.next();
        if(option.equalsIgnoreCase("addition")){
            int answer = calculator.sum(x,y);
            System.out.printf("the sum of %d and %d is; %d", x,y,answer);
        }else if(option.equalsIgnoreCase("subtraction")){
            int answer = calculator.difference(x,y);
            System.out.printf("the difference between %d and %d is; %d", x,y,answer);
        }else if(option.equalsIgnoreCase("multiplication")) {
            int answer = calculator.multiplication(x, y);
            System.out.printf("the multiple of %d and %d is; %d", x, y, answer);
        }else if(option.equalsIgnoreCase("division")) {
            double answer = calculator.division(x, y);
            System.out.printf("the division of %d and %d is; %d", x, y, answer);
        }
        System.out.println();
        System.out.println("Arithmetic Completed");
    }
}
