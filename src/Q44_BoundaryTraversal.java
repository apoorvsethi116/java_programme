public class Q44_BoundaryTraversal {
    public static void printBoundary(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        System.out.print("Boundary Traversal: ");

        if (m == 1) {
            for (int i = 0; i < n; i++) System.out.print(matrix[0][i] + " ");
        } else if (n == 1) {
            for (int i = 0; i < m; i++) System.out.print(matrix[i][0] + " ");
        } else {
            for (int i = 0; i < n; i++) System.out.print(matrix[0][i] + " "); // top
            for (int i = 1; i < m; i++) System.out.print(matrix[i][n - 1] + " "); // right
            for (int i = n - 2; i >= 0; i--) System.out.print(matrix[m - 1][i] + " "); // bottom
            for (int i = m - 2; i > 0; i--) System.out.print(matrix[i][0] + " "); // left
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printBoundary(matrix);
    }
}
