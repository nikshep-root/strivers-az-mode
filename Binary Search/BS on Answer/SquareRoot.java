public class SquareRoot {
    public static void main(String[] args){
        long n = 28;
        long ans = floorSqrt(n);
        System.out.println(ans);
    }
    static long floorSqrt(long n){
        long start = 1;
        long end = n;
        long ans = 1;
        while(start <= end){
            long mid = start + (end-start)/2;
            if(mid*mid == n){
                return mid;
            }
            if(mid*mid > n){
                end = mid - 1;
            }
            else{
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
