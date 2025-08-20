import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[]  nums = {1, 2, 3, 4, 5};
        int[] ans = solve(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] solve(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        ans[n - 1] = nums[0];
        for(int i = 0; i< n-1;i++){
            ans[i] = nums[i+1];
        }
        return ans;
    }
}
