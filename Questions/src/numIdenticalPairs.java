public class numIdenticalPairs {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[102];

        // calculate the frequency of each number
        for(int num : nums){
            count[num]++;
        }

        int totalCount = 0;

        // calculate total number of pairs possible
        for(int i : count){
            totalCount += ((i) * (i-1))/2;
        }
        return totalCount;
/*        int count = 0; // To store the number of good pairs

        // Iterate over all pairs of elements
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the pair (i, j) is a good pair
                if (nums[i] == nums[j]) {
                    count++; // Increment the count of good pairs
                }
            }
        }

        return count; // Return the total count of good pairs*/

    }

    public static void main(String[] args) {
        numIdenticalPairs solution = new numIdenticalPairs();

        int[] nums = {1, 2, 3, 1, 1, 3};
        int result = solution.numIdenticalPairs(nums);

        System.out.println("Number of good pairs: " + result); // Expected output: 4
    }
}

  /*  we use a nested loop to iterate over all pairs of elements in the array. The outer loop variable i runs from 0 to nums.length - 1, and the inner loop variable j runs from i + 1 to nums.length - 1.
    The condition i < j is implicitly satisfied by the way the loops are constructed.*/

