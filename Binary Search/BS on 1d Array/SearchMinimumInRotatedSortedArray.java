public class SearchMinimumInRotatedSortedArray {
    public static void main(String[] args){
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int ans = search(nums);
        System.out.println(ans);
    }
    static int search(int[] nums){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int low = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[start] <= low){
                low = nums[start];
            }
            if(nums[start] <= nums[mid]){
                if(nums[mid] <= low){
                   low = nums[mid];
                }
                start = mid + 1;
            }
            else{
                if(nums[mid] <= low){
                   low = nums[mid];
                }
                end = mid - 1;
            }
        }
        return low;
    }
}
