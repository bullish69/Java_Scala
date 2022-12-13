import java.io.*;
import java.util.Arrays;

class UnsortedArr {
    public static int firstMissingPositive(int[] nums, int n) {
        Arrays.sort(nums);
        int ans = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ans)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 2, 3, 4, 7 };
        int n = arr.length;
        int ans = firstMissingPositive(arr, n);
        System.out.println(ans);
    }
}
