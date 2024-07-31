import java.util.ArrayList;
import java.util.List;
public class kidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = max(candies);
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }

    int max(int[] candies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        kidsWithCandies solution = new kidsWithCandies();

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result);  // Output: [true, true, true, false, true]
    }
}
