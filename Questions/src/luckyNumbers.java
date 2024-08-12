import java.util.ArrayList;
import java.util.List;
public class luckyNumbers {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            // Find the minimum value in the current row
            int minValue = matrix[i][0];
            int minIndex = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                    minIndex = j;
                }
            }

            // Check if this minimum value is the maximum in its column
            boolean isMaxInColumn = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > minValue) {
                    isMaxInColumn = false;
                    break;
                }
            }

            // If it's a lucky number, add to the list
            if (isMaxInColumn) {
                luckyNumbers.add(minValue);
            }
        }

        return luckyNumbers;
    }

    public static void main(String[] args) {
        luckyNumbers solution = new luckyNumbers();

        // Example matrix
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };

        // Finding lucky numbers
        List<Integer> result = solution.luckyNumbers(matrix);

        // Printing the result
        System.out.println("Lucky Numbers: " + result);
    }
}
