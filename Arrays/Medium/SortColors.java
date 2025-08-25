import java.util.Arrays;
public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int[] ans = sortColors(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sortColors(int[] nums){
        int red = 0;
        int white = 0;
        int blue = 0;
        for(int num : nums){
            if(num == 0){
                red++;
            }
            else if(num == 1){
                white++;
            }
            else{
                blue++;
            }
        }
        for(int i =0; i < red; i++){
            nums[i] = 0;
        }
        for(int i = red ; i < (red+white); i++){
            nums[i]= 1;
        }
        for(int i = (red+white); i < nums.length;i++){
            nums[i] = 2;  
        }
        return nums;
    }
}
