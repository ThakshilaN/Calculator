package com.calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        while (true) {
            Scanner reader = new Scanner(System.in);
            System.out.print("calc > ");

            String operator = reader.next();
            double first = reader.nextDouble();
            double second = reader.nextDouble();
            double result;
            switch (operator) {
                case "ADD":
                    result = first + second;
                    System.out.printf("%.1f %S %.1f = %.1f", first, operator, second, result);
                    break;
                case "SUB":
                    result = first - second;
                    System.out.printf("%.1f %S %.1f = %.1f", first, operator, second, result);
                    break;
                case "MUL":
                    result = first * second;
                    System.out.printf("%.1f %S %.1f = %.1f", first, operator, second, result);
                    break;
                case "DIV":
                    result = first / second;
                    System.out.printf("%.1f %S %.1f = %.1f", first, operator, second, result);
                    break;
                case "MOD":
                    result = first % second;
                    System.out.printf("%.1f %S %.1f = %.1f", first, operator, second, result);
                    break;
                case "HELP":
                    System.out.println(" ");
                    System.out.println("Operation are");
                    System.out.println("1. Addition = Add");
                    System.out.println("2. Subscription = Sub");
                    System.out.println("3. Multiplication = Mul");
                    System.out.println("4. Division = Div");
                    System.out.println("5. Reminder = Mod");
                    System.out.println(" ");
                    System.out.println("Input example : Add 10 10");
                    System.out.println("Result will be: 10 + 10 = 20");
                    System.out.println(" ");
                    System.out.println("Operations are not case sensitive, if you input 'ADD' as 'add' or 'Add' operation will continue.");

                        break;

                default:
                    System.out.printf("Error! operator is not correct");
                    return;
            }

            System.out.printf("\n");
        }
    }

    }


