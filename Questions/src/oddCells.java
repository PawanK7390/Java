public class oddCells {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        // Increment the row and column counts based on indices
        for (int i = 0; i < indices.length; i++) {
            rowCount[indices[i][0]]++;
            colCount[indices[i][1]]++;
        }

        int oddCount = 0;
        // Calculate the number of odd cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((rowCount[i] + colCount[j]) % 2 != 0) {
                    oddCount++;
                }
            }
        }
        return oddCount;
    }

    public static void main(String[] args) {
        oddCells solution = new oddCells();
        int[][] indices = {{0, 1}, {1, 1}};
        int m = 2;
        int n = 3;
        System.out.println(solution.oddCells(m, n, indices)); // Expected output: 6
    }
}

    /*
    Optimized Approach
    Instead of maintaining the entire matrix, we can keep track of the number of times each row and each column is incremented using two arrays rowCount and colCount.

        Initialize two arrays rowCount and colCount of sizes m and n respectively.
        For each index in indices, increment the corresponding elements in rowCount and colCount.
        Calculate the number of cells with odd values by using the counts from rowCount and colCount.


        Increment Rows and Columns:
        We use rowCount and colCount to track how many times each row and column is incremented.
        Calculate Odd Values:
        For each cell (i, j), the value is the sum of rowCount[i] and colCount[j].
        Check if the sum is odd and count the number of such cells.
        */

/*
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];

        for(int i = 0; i < indices.length; i++){

            for(int j = 0; j < n; j++){
                ans[indices[i][0]][j]++;
            }
            for(int j = 0; j < m; j++){
                ans[j][indices[i][1]]++;
            }
        }
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if( ans[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
*/

