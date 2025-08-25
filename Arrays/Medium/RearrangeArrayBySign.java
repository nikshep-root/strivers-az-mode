import java.util.Arrays;
public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] rearrangeArray(int[] nums){
        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int i =0 ; i < nums.length; i++) {
            if (nums[i] > 0) {
               ans[pos] = nums[i];
               pos = pos + 2;
            }
            else{
               ans[neg] = nums[i];
               neg = neg + 2;
            }
        }
        return ans;
    }
}
