import java.util.ArrayList;
public class SpiralTraversalOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> ans = spiralOrder(matrix);
        System.out.println(ans);
    }
    static ArrayList<Integer> spiralOrder(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0 ,  right = m - 1 , bottom = n - 1 , left = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            } 
            top++;
            for(int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i = right;i >=left ; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom ; i >=top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
