public class NoOfTimesArrayIsRotated {
    public static void main(String[] args){
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = times(nums);
        System.out.println(ans);
    }
    static int times(int[] nums){
       int n = nums.length;
       int start = 0, end = n - 1;
       while (start < end) {
           int mid = start + (end - start) / 2;
           if (nums[mid] > nums[end]) {
               start = mid + 1;
           } else {
               end = mid;
           }
       }
        return start; 
    }
}
