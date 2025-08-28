import java.util.Arrays;
public class RotateArrayBy90 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] rotateMatrix(int[][] matrix){
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < matrix[i].length;j++) {
                ans[j][n-1-i] = matrix[i][j];
            }
        }
        return ans;
    }
}


/* to rotate the image in-place 
  > first we want to transpose the matrix :

     for(int i =0; i < n;i++) {
        for(int j = i+1; j < n;j++){
           int temp = matrix[i][j];
           matrix[i][j] = matrix[j][i];
           matrix[j][i] = temp;
        }
     }

  > then reverse the cloumn :

    for(int i = 0; i < n; i++) {
       for(int j = 0; j < n/2; j++) {
          int temp = matrix[i][j];
          matrix[i][j] = matrix[i][n-1-j];
          matrix[i][n-1-j] = temp;
       }
    }
       
 */