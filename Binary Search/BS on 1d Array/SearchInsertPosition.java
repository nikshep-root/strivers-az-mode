public class SearchInsertPosition {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 2;
        int ans = search(nums,target);
        System.out.println(ans);
    }
    static int search(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        if(start <= nums.length-1){
            return start;
        }
        return nums.length;
    }
}
