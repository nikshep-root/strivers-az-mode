public class SingleElement {
    public static void main(String[] args){
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int ans = find(nums);
        System.out.println(ans);
    }
    static int find(int[] nums){
        int n = nums.length;
        if(n == 1) return nums[0];
        for(int i = 0; i < n; i++){
            if(i == 0){
                if(nums[0] != nums[1]) return nums[0];
            }
            else if(i == n-1){
                if(nums[i] != nums[i-1]) return nums[i];
            }
            else{
                if(nums[i] != nums[i+1] && nums[i] != nums[i-1]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
