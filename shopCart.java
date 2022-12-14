import java.util.*;

public class shopCart {
    public static void main(String args[]) {
        Vector<String> v1 = new Vector<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of Items :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s;
            System.out.println("Items Name : ");
            s = sc.nextLine();
            v1.add(s);
        }
        System.out.println("Contents in Cart :" + v1);
        v1.add("Car");
        v1.set(0, "Remote");
        v1.remove(2);
        System.out.println("Contents after operation : " + v1);
    }
}