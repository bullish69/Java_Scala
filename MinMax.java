import java.util.*;

public class MinMax {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        int min = 0;
        int max = 0;
        for (int i = 0; i < 5; i++) {

            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        {
            for (int i = 0; i < 4; i++) {
                min = min + arr[i];
            }
            for (int i = 1; i < 5; i++) {
                max = max + arr[i];
            }
            System.out.println("Minimum no.of Array : " + min);
            System.out.println("Maximum no.of Array : " + max);
        }
    }
}