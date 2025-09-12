public class PainterPartition {
    public static void main(String[] args){
        int[] nums = {1, 8, 11, 3};
        int k  = 10;
        int ans = paint(k,nums);
        System.out.println(ans);
    }
    static int paint(int k, int[] nums){
        int low = max(nums);
        int high = sum(nums);
        while(low <= high){
            int mid = low + (high-low)/2;
            int cnt = find(nums,mid);
            if(cnt <= k){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return low; 
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
    static int sum(int[] nums){
        int s = 0;
        for(int i = 0; i < nums.length; i++){
            s+=nums[i];
        }
        return s;
    }
    static int find(int[] nums, int numbers){
        int each = 1;
        int count = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] + count <= numbers){
                count += nums[i];
            } 
            else{
                each++;
                count = nums[i];
            }
        }
        return each;
    }
}
