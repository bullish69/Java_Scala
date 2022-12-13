import java.util.*;
import java.lang.*;

public class Menu {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many elements you want in your array : ");
        int no = s.nextInt();
        int arr[] = new int[no];
        for (int i = 0; i < no; i++) {
            System.out.println("Enter Element : ");
            arr[i] = s.nextInt();
        }
        System.out.println("--------- Menu ----------");
        System.out.println("1. Search Element");
        System.out.println("2. Descending Sort");
        System.out.println("3. Remove Duplicate Element");
        System.out.println("What is your choice : ");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                System.out.println("What element you want to search for :");
                int num = s.nextInt();
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i] + "\t");
                }
                break;
            case 2:
                Arrays.sort(arr);
                System.out.println("Array after descending sort :");
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.println(arr[i] + "\t");
                }
                break;
            case 3:
                HashSet<Integer> set = new HashSet<Integer>();
                for (int i = 0; i < arr.length; i++) {
                    set.add(arr[i]);
                }
                List<Integer> l = new ArrayList<Integer>(set);
                System.out.println("Array after removing duplicates : ");
                for (int b : l) {
                    System.out.println(b + "\t");
                }
                break;
            default:
                System.out.println("Kya Engineer Banega Tu");
                break;
        }
    }
}