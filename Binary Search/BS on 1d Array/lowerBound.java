public class lowerBound {
    public static void main(String[] args){
        int[] nums = {3,5,8,15,19};
        int target = 9;
        int ans = lowerBound(nums,target);
        System.out.println(ans);
    }
    static int lowerBound(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}
