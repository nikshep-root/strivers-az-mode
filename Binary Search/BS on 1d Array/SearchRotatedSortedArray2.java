public class SearchRotatedSortedArray2 {
    public static void main(String[] args){
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        boolean ans = search(nums,target);
        System.out.println(ans);
    }
    static boolean search(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                start++;
                end--;
            }
            else if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target <=nums[mid] ){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
