/* time complexity of this is 0(n) */
public class LongestArray1 {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int ans = longestSubarray(nums,k);
        System.out.println(ans);
    }
    static int longestSubarray(int[] nums,int k){
        int n = nums.length;
        int longest = 0;
        for(int i= 0; i < n;i++){
            for(int j = i; j < n;j++){
                int sum = 0;
                for(int s = i ; s <= j; s++ ){
                    sum = sum + nums[s];  
                }
                if (sum == k) {
                    longest = Math.max(longest,j-i+1);
                }
            }
        }
        return longest;
    }
}
