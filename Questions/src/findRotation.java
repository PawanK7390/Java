public class findRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        // Try to match mat with target for 0, 1, 2, 3 rotations
        for (int i = 0; i < 4; i++) {
            if (compareMatrices(mat, target)) {
                return true;
            }
            mat = rotate90Degrees(mat);
        }

        return false;
    }

    // Function to rotate the matrix by 90 degrees clockwise
    private int[][] rotate90Degrees(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }

        return rotated;
    }

    /*
    How It Works: The code systematically moves elements from their original positions in mat to their corresponding
    rotated positions in rotated. For each element (i, j) in the original matrix, it’s placed at position (j, n-1-i)
    in the rotated matrix.

     Edge Case Consideration: Even when n is small (like 1 or 2), or when the matrix contains distinct or repeating
     numbers, the code handles the rotation correctly by ensuring every element is moved to its new position
     according to the 90-degree rotation rule.

     Complexity: The time complexity is O(n^2) because each element of the matrix is visited and moved exactly once.
     The space complexity is also O(n^2) due to the creation of a new matrix to store the result.
    */

    // Function to compare two matrices
    private boolean compareMatrices(int[][] mat1, int[][] mat2) {
        int n = mat1.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] transpose = new int[n][n];

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                transpose[j][i] = mat[i][j];
            }
        }

        int s=0,e=n-1;
        while(s<e){
            for(int i=0;i<n;i++) {
                int temp = transpose[i][s];
                transpose[i][s] = transpose[i][e];
                transpose[i][e] = temp;
            }
            s++;
            e--;
        }

        return transpose;
    }
    /*
    Outer While Loop: Swaps columns, moving from the outermost columns inward until all columns have been reversed.
    Inner For Loop: Handles the swapping of the corresponding columns within each row.
    Final Matrix: After the completion of the loop, the transposed matrix will have been rotated 90 degrees
    clockwise.
    */
    public static void main(String[] args) {
        findRotation solution = new findRotation();

        // Example 1
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] target1 = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        System.out.println("Example 1: " + solution.findRotation(mat1, target1));  // Expected output: true

        // Example 2
        int[][] mat2 = {
                {0, 1},
                {1, 0}
        };

        int[][] target2 = {
                {1, 0},
                {0, 1}
        };

        System.out.println("Example 2: " + solution.findRotation(mat2, target2));  // Expected output: true

        // Example 3
        int[][] mat3 = {
                {0, 1},
                {1, 1}
        };

        int[][] target3 = {
                {1, 0},
                {0, 1}
        };

        System.out.println("Example 3: " + solution.findRotation(mat3, target3));  // Expected output: false
    }
}
