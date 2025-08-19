import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements in an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++) {
            arr[i] = sc.nextInt();
        }
        int ans = large(arr);
        System.out.println(ans);
    }
    static int large(int[] arr) {
        int largest = arr[0];
        for (int nums : arr){
            if (nums > largest) {
                largest = nums;
            }
        }
        return largest;
    }
}
