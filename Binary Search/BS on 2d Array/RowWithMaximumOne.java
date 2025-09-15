public class RowWithMaximumOne {
    public static void main(String[] args){
        int[][] matrix = { {1,0,1} , {1,1,1} , {0,1,0}};
        int cnt_max = 0;
        int index = -1;
        for(int i = 0; i< matrix.length; i++){
            int cntOnes = matrix[i].length - rowWithMax1s(matrix,i);
            if(cntOnes > cnt_max){
                cnt_max = cntOnes;
                index = i;
            }
        }
        System.out.println(index);
    }
    static int rowWithMax1s(int[][] matrix, int i){
            int start = 0;
            int end = matrix[i].length;
            int ans = -1;
            while(start <= end){
                int mid = start + (end-start)/2;
                if(matrix[i][mid] == 1){
                    ans = mid;
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            return ans;
        

    }
}
