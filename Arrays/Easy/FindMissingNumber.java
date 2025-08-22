import java.util.ArrayList;
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5, 6};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    static int missingNumber(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for(int i = 0; i <= arr.length; i++) {
            if (!list.contains(i)){
                return i;
            }
        }
        return -1;
    } 
}
