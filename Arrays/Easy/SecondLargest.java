package Arrays.Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {63,464,64,24,6,44,456,44,1};
        int ans = solve(arr);
        System.out.println(ans);
    }
    static int solve(int[] arr){
        int large = arr[0];
        int secondlarge = arr[0];
        for(int nums : arr) {
            if (nums >= large) {
                large = nums;
            }
            else if (nums > secondlarge && nums !=large) {
                secondlarge = nums;
            }
        }
        return secondlarge;
    }
}
