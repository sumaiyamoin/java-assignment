package conditional_statement;

import java.util.Scanner;

//1. Write a program that takes a year from user and print whether that year is a leap
//year or not
public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Please enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {

                    System.out.println("This is a leap year.");
                } else {
                    System.out.println("This is not a leap year.");
                }
            } else {
                System.out.println("This is a leap year");
            }
        } else {
            System.out.println("This is not a leap year");
        }
    }
}
