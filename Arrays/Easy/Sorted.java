
public class Sorted {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,14,34,1,2};
        boolean ans = check(arr);
        System.out.println(ans);
    }
    static boolean check(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]) {
                 return false;
            }
        }
        return true;
    }
}
