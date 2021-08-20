package Loop_String;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.printf("Please enter a number");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int j=2;
        while(j<=n){
            boolean isPrime=true;
            for(int i=2;i<=j/2;i++){
                if(j%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println(j);
            }
            j++;
        }


    }
}
