import java.util.Arrays;
import java.util.ArrayList;

public class LeftRotateArrayByKPlaces {
    public static void main(String[] args) {
        int[]  nums = {1, 2, 3, 4, 5};
        int k = 2;
        int[] ans = solve(nums , k);
        System.out.println(Arrays.toString(ans));
    }
    static int[] solve(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i =0 ; i< n;i++){
             arr.add(nums[i]);
        }
        for (int i = 0; i < k ; i++) {
            int first = arr.remove(0);
            arr.add(first);
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
