
public class SearchElement {
    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int ans = search(nums , target);
        System.out.println(ans);
    }
    static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start)/2;
        while(start <= end) {
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                end--;
            }
            else{
                start++;
            }
        }
        return -1;
    }
}
