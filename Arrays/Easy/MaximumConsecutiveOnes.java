public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int ans =  findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
static int findMaxConsecutiveOnes(int[] nums) {
       int max = 0;
       int cnt = 0;
       for (int num : nums) {
           if (num == 1) {
               cnt++;
           } else {
               if (cnt > max) max = cnt;
               cnt = 0;
           }
        }
        if (cnt > max) max = cnt; 
        return max;
    }
}
