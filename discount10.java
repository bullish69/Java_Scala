import java.util.*;

public class discount10 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the quantity :");

        int q = s.nextInt();
        int price;
        if (q > 1000) {
            int discount = (q * 100) / 10;
            price = (q * 100) - discount;
        } else {
            price = (q * 100);
        }
        System.out.println("Total Price is :" + price);
    }
}