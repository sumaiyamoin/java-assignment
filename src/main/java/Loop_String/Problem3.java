package Loop_String;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        int count=0;
        Scanner input= new Scanner(System.in);
        while(true) {
            String readString = input.nextLine();
            if (readString.equals("")){
                count++;
                System.out.print(count);
            }
            if(readString.equals("0")){
                break;
            }
        }
    }
}
