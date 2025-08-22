public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 3};
        int k = 4;
        int ans = solve(arr,k);
        System.out.println(ans);
    }
    static int solve(int[] arr,int k) {
        for(int nums : arr) {
            if(nums == k){
                return 1;
            }
        }
        return -1;
    }
}
