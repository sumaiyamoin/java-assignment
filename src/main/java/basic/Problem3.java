package basic;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number");
        double a =  scanner.nextDouble();
        System.out.println("Please input second number");
        double b =  scanner.nextDouble();
        System.out.println("Please input third number");
        double c =  scanner.nextDouble();
        double sum = a + b + c;
        double avg = sum/3;
        System.out.println("Sum is " + sum);
        System.out.println("Average is "+ avg);
    }
}
