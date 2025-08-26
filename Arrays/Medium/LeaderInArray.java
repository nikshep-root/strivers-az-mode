import java.util.ArrayList;
public class LeaderInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        ArrayList<Integer> ans = leaders(nums);
        System.out.println(ans);
    }
    static ArrayList<Integer> leaders(int[] nums){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = nums.length - 1; i>= 0;i--){
            if(nums[i]> max){
                ans.add(0,nums[i]);
                max = nums[i];
            }
        }
        return ans;
    }
}
