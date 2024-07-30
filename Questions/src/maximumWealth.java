public class maximumWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        maximumWealth solution = new maximumWealth();

        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6}
        };

        int result = solution.maximumWealth(accounts);

        System.out.println("Maximum wealth: " + result);
    }
}
