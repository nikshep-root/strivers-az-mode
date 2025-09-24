import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {32,3,6,65,67,53};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sort(int[] arr){
        int n= arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0;j < n-i-1;j++){
                if(arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
