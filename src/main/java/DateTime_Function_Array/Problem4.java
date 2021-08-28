package DateTime_Function_Array;

import java.util.Scanner;

//4. Write a program to find the position of a matched value from an array. If not matched,
// return -1 using function.
//Given array is: {10,5,2,3,2,7,7,15,10}
//Input: User inputs 7
//Output: Position: 5
public class Problem4 {
    public static void main(String[] args) {
        int num[]={10,5,2,3,2,7,7,15,10};
        System.out.println("Please input a number to check it exists or not");
        Scanner scanner= new Scanner(System.in);
        int input=scanner.nextInt();
        int position= checkElement(input,num);
        System.out.println("Position is "+ position);
    }
    public static int checkElement(int num, int[] array){
        for(int i=0; i<array.length;i++){
            if (num == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
