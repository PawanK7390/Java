import java.util.HashMap;
import java.util.Map;
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create hashmap
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Get the complement using the target value
            int complement = target - nums[i];

            // Search the hashmap for complement, if found, we got our pair
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Put the element in hashmap for subsequent searches
            map.put(nums[i], i);
        }

        // If no solution is found
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Instantiate the Solution class
        twoSum solution = new twoSum();

        // Example array and target
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method
        int[] result = solution.twoSum(nums, target);

        // Print the result
        System.out.println("Indices of the numbers that add up to the target are: " + result[0] + " and " + result[1]);
    }
}
