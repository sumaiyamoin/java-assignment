package DateTime_Function_Array;

import java.util.Arrays;

//2. Find the second largest number from an array by user input using function
public class Problem2 {
    public static void main(String[] args) {
        int num[]={25,50,5,100,98};
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        System.out.println("The second largest number is " + num[num.length-2]);
    }
}
