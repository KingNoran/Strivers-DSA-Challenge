public class rotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Before rotate");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(j == matrix[i].length - 1){
                    System.out.println(matrix[i][j]);
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        rotate(matrix);
        System.out.println("After rotate");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(j == matrix[i].length - 1){
                    System.out.println(matrix[i][j]);
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
 
    static void rotate(int[][] matrix) {
        int n = matrix.length - 1; // limit
        int i = 0; // row
        int j = n; // column
        // Invert the matrix
        while(i < n && j > 0){
            int x = 0;
            int y = matrix[j].length - 1;
            while(x < j && y > i){
                int temp = matrix[i][x];
                matrix[i][x] = matrix[y][j];
                matrix[y][j] = temp;
                x++;
                y--;
            }
            i++;
            j--;
        }
        // Invert the columns        
        i = matrix.length - 1;
        while(i >= 0){
            int x = 0;
            int y = matrix[i].length - 1;
            while(x < y){
                int temp = matrix[x][i];
                matrix[x][i] = matrix[y][i];
                matrix[y][i] = temp;
                x++;
                y--;
            }
            i--;
        }
    }
}
