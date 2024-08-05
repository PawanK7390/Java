public class diagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            // Add the primary diagonal element
            sum += mat[i][i];
            // Add the secondary diagonal element
            sum += mat[i][n - i - 1];
        }

        // If the matrix size is odd, subtract the middle element
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }

    public static void main(String[] args) {
        diagonalSum solution = new diagonalSum();
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Diagonal Sum: " + solution.diagonalSum(mat)); // Expected output: 25
    }
}
