import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args){
        int[] arr={23,44,4,453,3,25};
        int[] ans = sort(arr);
        System.out.println(Arrays.toString(ans));    
    }
    static int[] sort(int[] arr){
        for(int i = 1;i< arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j] < arr[j-1]){
                     swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
