import java.util.Arrays;
public class smallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // create buckets for counting sort
        int[] buckets = new int[102];

        // get frequency of each element
        for (int num : nums) {
            buckets[num]++;
        }

        // count smaller numbers than each element
        for (int i = 1; i < buckets.length; i++) {
            buckets[i] += buckets[i - 1];
        }

        // populate the result
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            if (nums[i] == 0)
                result[i] = 0;
            else
                result[i] = buckets[nums[i] - 1];
        }

        return result;
    }

    public static void main(String[] args) {
        smallerNumbersThanCurrent solution = new smallerNumbersThanCurrent();

        int[] nums = {8, 1, 2, 2, 3};
        int[] result = solution.smallerNumbersThanCurrent(nums);

        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("Result array: " + Arrays.toString(result));
    }
}
