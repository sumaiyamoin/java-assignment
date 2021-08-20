package basic;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter minimum number.");
        int min = scanner.nextInt();
        System.out.println("Please enter maximum number.");
        int max = scanner.nextInt();
        double rand = Math.random()*(max-min)+min;
        System.out.println((int) rand);
    }
 }
