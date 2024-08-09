public class maximumPopulation {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];

        // year = index + 1950
        // index = year - 1950

        for(int log[] : logs){
            int birthyear = log[0];
            int deathyear = log[1];
            arr[birthyear - 1950]++;
            arr[deathyear - 1950]--;
        }
        int max = arr[0];
        int maxyear = 1950;

        for(int i = 1; i < 101; i++){
            arr[i] = arr[i] + arr[i-1];
            if(max < arr[i]){
                max = arr[i];
                maxyear = i + 1950;
            }
        }
        return maxyear;
    }
    public static void main(String[] args) {
        maximumPopulation solution = new maximumPopulation();

        // Test case 1
        int[][] logs1 = {
                {1950, 1961},
                {1960, 1971},
                {1970, 1981}
        };
        System.out.println(solution.maximumPopulation(logs1)); // Expected output: 1960

        // Test case 2
        int[][] logs2 = {
                {1950, 1961},
                {1961, 1971},
                {1971, 1981},
                {1980, 1990},
                {1990, 2000}
        };
        System.out.println(solution.maximumPopulation(logs2)); // Expected output: 1980

        // Test case 3 (Edge case)
        int[][] logs3 = {
                {1950, 1961},
                {1960, 1971},
                {1961, 1980},
                {1980, 2000},
                {1999, 2050}
        };
        System.out.println(solution.maximumPopulation(logs3)); // Expected output: 1961
    }

}
