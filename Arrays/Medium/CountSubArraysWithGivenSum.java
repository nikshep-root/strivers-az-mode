public class CountSubArraysWithGivenSum {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int k = 3;
        int ans = subArraySum(nums,k);
        System.out.println(ans);
    }
    static int subArraySum(int[] nums, int k){
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n;j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
