public class KokoEatingBananas {
    public static void main(String[] args){
        int[] nums = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(nums,h);
        System.out.println(ans);
    }
    static int minimumRateToEatBananas(int[] nums,int h){
        int n = nums.length;
        int start = 1;
        int end = max(nums,n);
        int min = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end-start)/2;
            int totalhrs = find(nums,mid);
            if(totalhrs <= h){
                min = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return min;
    }
    static int max(int[] nums, int n){
        int ans = nums[0];
        for(int i = 0; i < n;i++){
            if(nums[i] > ans){
                ans = nums[i];
            }
        }
        return ans;
    }
    static int find(int[] nums, int mid){
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total +=(int) Math.ceil((double)nums[i]/mid);
        }
        return total;
    }
}
