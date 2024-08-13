public class maxSubArray {
    public int maxSubArray(int[] nums) {
        // Check for null or empty array
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty");
        }

        // Initialize variables to store the max sum so far and the current max sum
        int max_so_far = nums[0];
        int curr_max = nums[0];

        // Iterate through the array, starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update current max: either take the current element or add it to the current max sum
            curr_max = Math.max(nums[i], nums[i] + curr_max);

            // Update max so far if the current max is greater
            max_so_far = Math.max(curr_max, max_so_far);
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        maxSubArray solution = new maxSubArray();

        // Test cases
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};
        int[] nums4 = {-1, -2, -3, -4};
        int[] nums5 = {0, -3, 1, 3, 2, -1, 4};

        System.out.println("Max SubArray Sum for nums1: " + solution.maxSubArray(nums1)); // Output: 6
        System.out.println("Max SubArray Sum for nums2: " + solution.maxSubArray(nums2)); // Output: 1
        System.out.println("Max SubArray Sum for nums3: " + solution.maxSubArray(nums3)); // Output: 23
        System.out.println("Max SubArray Sum for nums4: " + solution.maxSubArray(nums4)); // Output: -1
        System.out.println("Max SubArray Sum for nums5: " + solution.maxSubArray(nums5)); // Output: 9

        // Uncommenting the following lines will throw an exception
        // int[] nums6 = null;
        // System.out.println("Max SubArray Sum for nums6: " + solution.maxSubArray(nums6));

        // int[] nums7 = {};
        // System.out.println("Max SubArray Sum for nums7: " + solution.maxSubArray(nums7));
    }

    /*
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for ( int i = 0; i< nums.length; i++){
            curSum = curSum + nums[i];
            if(curSum > maxSum) maxSum = curSum;
            if(curSum < 0){
                curSum = 0;
            }

        }

        System.gc();
        return maxSum;
    }
    */



}
