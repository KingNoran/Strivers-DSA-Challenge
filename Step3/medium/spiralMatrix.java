import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}}; 
        for(int i : spiral(matrix)) System.out.println(i);
    }   
    
    static List<Integer> spiral(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = -1;

        int direction = 1;
        while(rows > 0 && cols > 0){
            for(int i = 0; i < cols; i++){
                col+=direction;
                ans.add(matrix[row][col]);
            }
            rows--;

            for(int i = 0; i < rows; i++){
                row+=direction;
                ans.add(matrix[row][col]);
            }
            cols--;

            direction*=-1;
        }
        return ans;
    } 
}
