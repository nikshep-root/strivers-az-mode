import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {4,6,2,64,57,34};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int largest = max(arr, last);
            swap(arr, last, largest);
        }
        return arr;
    }
    static int max(int[] arr, int last){
        int maxi = 0;
        for(int i = 0; i <= last; i++){
            if(arr[i] > arr[maxi]){
                maxi = i;
            }
        }
        return maxi;
    }
    static void swap(int[] arr,int first, int largest){
        int temp = arr[first];
        arr[first] = arr[largest];
        arr[largest] = temp;
    }
}
