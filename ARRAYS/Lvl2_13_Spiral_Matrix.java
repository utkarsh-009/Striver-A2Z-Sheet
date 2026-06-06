import java.util.ArrayList;
import java.util.List;

class Solution {

    boolean isValid(int i, int j, int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        if(i < 0 || j < 0 || i >= m || j >= n || matrix[i][j] == Integer.MAX_VALUE) return false;
        return true;
    }
    
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();
        int total = m*n;

        while(total > 0) {
            while(isValid(i,j,matrix)) {
                ans.add(matrix[i][j]);
                matrix[i][j++] = Integer.MAX_VALUE;
                total--;
            }
            j--; i++;

            while(isValid(i,j,matrix)) {
                ans.add(matrix[i][j]);
                matrix[i++][j] = Integer.MAX_VALUE;
                total--;
            }
            i--; j--;

            while(isValid(i,j,matrix)) {
                ans.add(matrix[i][j]);
                matrix[i][j--] = Integer.MAX_VALUE;
                total--;
            }
            j++; i--;

            while(isValid(i,j,matrix)) {
                ans.add(matrix[i][j]);
                matrix[i--][j] = Integer.MAX_VALUE;
                total--;
            }
            i++; j++;
        }

        return ans;
    }
}