public class SmallestDivisor {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int limit = 8;
        int ans = smallestDivisor(nums, limit);
        System.out.println(ans);
    }
    static int smallestDivisor(int[] nums, int limit){
        int start = 1;
        int end = max(nums);
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(sum(nums,mid) <= limit){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    static int sum(int[] nums,int mid){
        int s = 0;
        for(int i = 0; i < nums.length;i++){
            s += (int) Math.ceil((double) nums[i]/mid);
        }
        return s;
    }
    static int max(int[] nums){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > maxi){
                maxi = nums[i];
            }
        }
        return maxi;
    }
}
