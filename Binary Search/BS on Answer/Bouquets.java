public class Bouquets {
    public static void main(String[] args){
        int[] nums = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        int ans = minBouquets(nums, m, k);
        System.out.println(ans);
    }
    static int minBouquets(int[] nums, int m , int k){
        int start = min(nums);
        int end = max(nums);
        int ans = -1;
        while(start <= end){
            int mid = start + (end- start)/2;
            if(possible(nums, mid, m, k) == true){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
    static int min(int[] nums){
        int n = nums.length;
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] < minimum){
                minimum = nums[i];
            }
        }
        return minimum;
    }
    static int max(int[] nums){
        int n = nums.length;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] > maximum){
                maximum = nums[i];
            }
        }
        return maximum;
    }
    static boolean possible(int[] nums, int mid, int m, int k){
        int count = 0;
        int noOfBouq = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] <= mid){
                count++;
                if(count == k){
                    noOfBouq++;
                    count++;
                }
            }
            else{
                count = 0;
            }
        }
        if(noOfBouq >= m){
            return true;
        }
        return false;
    }
}
