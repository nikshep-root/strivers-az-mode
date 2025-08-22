import java.util.ArrayList;
import java.util.Arrays;
public class Union {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {1, 2, 7};
        int[] ans = unionArray(num1,num2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] unionArray(int[] num1,int[] num2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < num1.length; i++){
            list.add(num1[i]);
        }
        for(int i = 0; i < num2.length; i++){
            if (!list.contains(num2[i])){
                list.add(num2[i]);
            }
        }
        int[] ans= new int[list.size()];
        for(int i =0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
