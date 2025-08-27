import java.util.Arrays;
public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] ans = setZeros(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] setZeros(int[][] matrix) {
        int n = matrix.length;
        int[] row = new int[n];
        int[] column = new int [n];
        for(int i = 0; i < n;i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        for(int i = 0; i < n;i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(row[i] == 1|| column[j] == 1){
                     matrix[i][j] = 0;
                }           
            }
        }
        return matrix;
    }
}
