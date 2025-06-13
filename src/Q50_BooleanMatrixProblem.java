public class Q50_BooleanMatrixProblem {
    public static void booleanMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rowFlag = new boolean[rows];
        boolean[] colFlag = new boolean[cols];

        // First pass: mark the rows and cols that should be set to 1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }

        // Second pass: update the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowFlag[i] || colFlag[j]) {
                    matrix[i][j] = 1;
                }
            }
        }

        System.out.println("Updated Boolean Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 1}
        };

        booleanMatrix(matrix);
    }
}

