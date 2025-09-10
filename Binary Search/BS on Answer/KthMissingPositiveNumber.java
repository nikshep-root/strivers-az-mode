public class KthMissingPositiveNumber {
    public static void main(String[] args){
        int[] nums= {1,2,3,4};
        int k = 2;
        int ans = find(nums,k);
        System.out.println(ans);
    }
    static int find(int[] nums, int k){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] < k){
                k = k + 1;
            }
            else {
                return k;
            }
        }
        return k;
    }
}
