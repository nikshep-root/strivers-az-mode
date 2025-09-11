import java.util.Arrays;
public class AggressiveCows {
    public static void main(String[] args){
        int[] nums = {0, 3, 4, 7, 10, 9};
        int k = 4;
        Arrays.sort(nums);
        int ans = aggressiveCows(nums,k);
        System.out.println(ans);
    }
    static int aggressiveCows(int[] nums, int k){
        int max = maxi(nums);
        int min = mini(nums);
        int diff = max - min;
        for(int i = 1 ;i <= diff; i++ ){
            if(isPossible(nums,i,k) == true){
                continue;
            }
            else{
                return i-1;
            }
        }
        return -1;
    }
    static int maxi(int[] nums){
        int m = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= m){
                m = nums[i];
            }
        }
        return m;
    }
    static int mini(int[] nums){
        int m = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < m){
                m = nums[i];
            }
        }
        return m;
    }
    static boolean isPossible(int[] nums, int dist, int cows){
        int countCows = 1;
        int first = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - first >= dist){
                countCows++;
                first = nums[i];
            }
        }
        if(countCows >= cows){
            return true;
        } 
        return false;
    }
}
