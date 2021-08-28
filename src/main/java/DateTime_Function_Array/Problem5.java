package DateTime_Function_Array;

import java.util.HashMap;
import java.util.Random;

//5. Create a hashmap that will store 2, 5, 10, 20, 50, 100, 200, 500, 1000 tk note and each time generate 3 notes randomly and show their summation.
//Output: 5 Tk, 50 Tk, 100 Tk. Total=155 Tk
public class Problem5 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        hashMap.put(0,2);
        hashMap.put(1,5);
        hashMap.put(2,10);
        hashMap.put(3,20);
        hashMap.put(4,50);
        hashMap.put(5,100);
        hashMap.put(6,200);
        hashMap.put(7,500);
        hashMap.put(8,1000);
        Random rand=new Random();
        int key1=rand.nextInt(9);
        int key2=rand.nextInt(9);
        int key3=rand.nextInt(9);
        int note1=hashMap.get(key1);
        int note2=hashMap.get(key2);
        int note3=hashMap.get(key3);
        int sum=note1+note2+note3;
        System.out.println("Sum of "+note1+", "+note2+" and "+note3+" is "+sum);
    }
}
