import java.util.ArrayList;

public class RemoveDuplicants {
    public static void main(String[] args) {
        int[] arr = {-2, 2, 4, 4, 4, 4, 5, 5};
        int ans = check(arr);
        System.out.println(ans);
    }
    static int check(int[] arr) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < arr.length;i++) {
            if(!nums.contains(arr[i])) {
                nums.add(arr[i]);
            }
        }
        return nums.size();
    }
}
