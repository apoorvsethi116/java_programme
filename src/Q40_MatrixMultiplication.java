public class Q40_MatrixMultiplication {
    public static void multiply(int[][] A, int[][] B) {
        int r1 = A.length, c1 = A[0].length;
        int r2 = B.length, c2 = B[0].length;

        if (c1 != r2) {
            System.out.println("Cannot multiply, invalid dimensions");
            return;
        }

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {5, 6},
                {7, 8}
        };

        multiply(A, B);
    }
}
