public class TransposeMatrics {
    public static void transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Create a new matrix to store the transpose
        int[][] transpose = new int[cols][rows];
        
        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        // Print the transpose
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix:");
        transpose(matrix);
    }
}
