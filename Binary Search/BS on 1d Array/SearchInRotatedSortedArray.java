public class SearchInRotatedSortedArray {
    public static void main(String[] args){
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int k = 0;
        int ans = search(nums,k);
        System.out.println(ans);
    }
    static int search(int[] nums, int k){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == k){
                return mid;
            }
            else if(nums[start] <= nums[mid]){
                if(nums[start] <= k && k <=nums[mid] ){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {
                if(nums[mid] <= k && k <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
