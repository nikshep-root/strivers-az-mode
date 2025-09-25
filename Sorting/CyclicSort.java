import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int[] ans = sort(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sort(int[] nums){
        int i = 0;
        for(int num : nums){  
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        return nums;
    }
    static void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
