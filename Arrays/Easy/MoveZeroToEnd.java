import java.util.ArrayList;
import java.util.Arrays;
public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 0, 5, 2};
        int[] ans = check(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] check(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for(int i = 0; i < arr.length; i++) {
            if (list.get(i) == 0) {
                list.add(arr.length - 1,list.get(i));
                list.remove(i);
            }
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return ans;
    }
}

/*
int[] ans = new int[arr.length];
for (int i =0; i < arr.length; i++) {
  if (arr[i] != 0){
  ans[i] = arr[i];
  }
} */
