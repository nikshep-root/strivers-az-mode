import java.util.Arrays;

public class MoveZerosToEnd {
   public static void main(String[] args) {
        int[]  nums = {0, 1, 4, 0, 5, 2};
        int[] ans = solve(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] solve(int[] nums){
        int n = nums.length;
        
        int idx = 0;
        for(int num : nums) {
            if(num != 0) {
                nums[idx++] = num;
            }
        }
        while(idx < n) {
            nums[idx++] = 0;
        }
        return nums;
    } 
}
