public class NthRoot {
    public static void main(String[] args){
        int N = 3;
        int M = 27;
        int ans = check(N,M);
        System.out.println(ans);
    }
    static int check(int N, int M){
        int start = 1;
        int end = M;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(Math.pow(mid,N) == M){
               return N;
            }
            if(Math.pow(mid,N) > M){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
