package basic;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = scanner.nextInt();
        System.out.println("Please enter another number");
        int b = scanner.nextInt();
        System.out.println(Math.pow(a+b,2));
    }
}
