package Loop_String;
//1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk. Find total price and total quantity using regular expression
public class Problem4 {
    public static void main(String[] args) {
        String str="1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk. " +
                "Find total price and total quantity using regular expression";
        str=str.replaceAll("[^\\d]"," ");
        str=str.trim();
        //System.out.println(str);
        str=str.replaceAll(" +"," ");
        System.out.println(str);
        String[] arr=str.split(" ");
        int shareeQuantity=Integer.parseInt(arr[0]);
        int shareePrice=Integer.parseInt(arr[1]);
        int shirtQuantity=Integer.parseInt(arr[2]);
        int shirtPrice=Integer.parseInt(arr[3]);
        int pantQuantity=Integer.parseInt(arr[4]);
        int pantPrice=Integer.parseInt(arr[5]);
        int totalQuantity= shareeQuantity+shirtQuantity+pantQuantity;
        int totalPrice=shareePrice+shirtPrice+pantPrice;
        System.out.println("Total quantity is "+totalQuantity);
        System.out.println("Total price is "+totalPrice);
    }
}
