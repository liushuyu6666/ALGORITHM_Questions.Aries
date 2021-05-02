package Rotate;

public class Rotate_image {
    public void rotate(int[][] matrix){
        int depth = matrix.length / 2, temp, n = matrix.length;
        for(int i = 0; i < depth; i++){
            for(int j = i; j < matrix.length - i - 1; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
                // System.out.println("" + i + j);
            }
        }
    }

    public static void main(String args[]){
        Rotate_image s = new Rotate_image();
        int[][] matrix = {{5, 1, 9, 11}, {2, 4 ,8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        s.rotate(matrix);
        for(int[] row: matrix){
            for(int col: row){
                System.out.println(col);
            }
        }
    }
}
