public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
    static int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/2) {
                return nums[i];
            }
        }
        return 0;
    }    
}
