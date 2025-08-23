public class SingleNumber1 {
    public static void main(String[] args) {
       int[] nums = {4,1,2,1,2};
       int ans = singleNumber(nums);
       System.out.println(ans);
    }
    static int singleNumber(int[] nums) {
        int ans = 0;
        for(int num : nums) {
             ans ^= num;
        }
        return ans;
    }
}
