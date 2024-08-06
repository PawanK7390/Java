public class findNumbers {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int digits = 0;
            int num = nums[i]; // Create a copy of the current number

            // Count the digits in the number
            while (num > 0) {
                num /= 10;
                digits++;
            }

            // Check if the number of digits is even
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        findNumbers solution = new findNumbers();
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(solution.findNumbers(nums)); // Expected output: 2
    }
}

/*
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if ((int) (Math.log10(num) + 1) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

        findNumbers Method:
        Iterate over each number in the nums array.
        Use Math.log10(num) + 1 to calculate the number of digits in each number.

        Check if the number of digits is even. If it is, increment the counter count.

        Logarithm to Count Digits:
        The number of digits in a number can be found using the formula
        (int)(Math.log10(num)+1).
*/

