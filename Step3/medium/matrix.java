import java.util.ArrayList;

public class matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
        setZeroes(matrix);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(j == matrix[i].length - 1){
                    System.out.println(matrix[i][j]);
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
        }
    }

    static void setZeroes(int[][] matrix) {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        // Get all the coordinates
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    x.add(i); // row
                    y.add(j); // column
                }
            }
        }
        // turn all columns and rows to zero
        for(int i : x){
            rowZero(matrix[i]); // for rows
        }
        for(int i : y){
            columnZero(matrix, i);
        }
    }

    static void columnZero(int[][] matrix, int x){
        for(int i = 0; i < matrix.length; i++){
            if(x >= matrix[i].length || matrix[i][x] == 0) continue;
            matrix[i][x] = 0;
        }
    }

    static void rowZero(int[] arr){
        for(int i = 0; i < arr.length; i++) arr[i] = 0;
    }
}