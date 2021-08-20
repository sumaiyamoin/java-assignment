package Loop_String;

import java.util.Scanner;
//1. Write a program to sum of digits of a number by taking from user input
public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        while(number!=0){
            int rem=number%10;
            number=number/10;
            sum+= rem;
        }
        System.out.println(sum);
    }
}
