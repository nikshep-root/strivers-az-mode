import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i =0; i < n; i++) {
            int sum = 0;
            for(int j = i + 1;j<n; j++){
                sum = nums[i] + nums[j];
                if (sum == target){
                    int[] ans = new int[2];
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return new int[0];
    }
}


