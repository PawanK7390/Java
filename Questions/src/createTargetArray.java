import java.util.Arrays;
public class createTargetArray {
   /* Given two arrays, nums and index, create a target array such that each element in nums is inserted at the position specified by the corresponding element in index. If an element needs to be inserted at an already occupied position, the existing elements must be shifted to the right.*/
    public int[] createTargetArray(int[] nums, int[] index) {
        // brute force
        int[] target = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            for (int j = target.length - 1; j > index[i]; j--) {
                target[j] = target[j - 1];
                // This loop starts from the end of the target array and moves elements one
                // position to the right until it reaches the specified index position.
                // Shifting elements to the right creates space for the new element from nums at
                // the specified index without overwriting existing elements.
            }
            target[index[i]] = nums[i];
            // After shifting the necessary elements, we insert the current element from nums into the target array at the specified index position.
        }
        return target;
    }

    public static void main(String[] args) {
        createTargetArray solution = new createTargetArray();

        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] target = solution.createTargetArray(nums, index);

        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("index: " + Arrays.toString(index));
        System.out.println("target: " + Arrays.toString(target));
    }
}
