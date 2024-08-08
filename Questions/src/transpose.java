public class transpose {
    public int[][] tanspose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[n][m]; // Initialize the transposed matrix with swapped dimensions

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][i] = matrix[i][j]; // Transpose the element
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        transpose solution = new transpose();

        // Example input
        int[][] matrix = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        System.out.println("Before:");
        printImage(matrix);

        int[][] tanspose = solution.tanspose(matrix);

        System.out.println("After:");
        printImage(tanspose);
    }

    private static void printImage(int[][] image) {
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
