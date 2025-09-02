import java.util.Arrays;
public class FloorCeil {
    public static void main(String[] args){
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 5;
        int[] ans = getFloorAndCeil(nums,x);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getFloorAndCeil(int[] nums, int x){
        int start = 0;
        int end = nums.length;
        int[] ans = new int[2];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == x){
                ans[0] = nums[mid];
                ans[1] = nums[mid];
                return ans;
            }
            if(nums[mid] < x){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if(end >= 0 && start <= nums.length){
            ans[0] = nums[end];
            ans[1] = nums[start];
            return ans;
        }
        int[] a = {-1,-1};
        return a;
    }
}
