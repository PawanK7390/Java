import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class createTargetArray2 {
    public int[] createTargetArray2(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        // Convert the list back to an array
        int[] target = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            target[i] = targetList.get(i);
        }

        return target;
    }

    public static void main(String[] args) {
        createTargetArray2 solution = new createTargetArray2();

        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};

        int[] target = solution.createTargetArray2(nums, index);

        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("index: " + Arrays.toString(index));
        System.out.println("target: " + Arrays.toString(target));
    }
}

/*
        Explanation of the Optimized Approach:

        Use a List for Dynamic Insertion:
        ArrayList allows us to insert elements at any position efficiently, which is ideal for our use case where we need to insert elements at specific positions dynamically.
        We initialize an empty ArrayList called targetList.
        List<Integer> targetList = new ArrayList<>();


        Insert Elements into the List:
        We iterate over the nums and index arrays simultaneously.
        For each element, we use the add method of the List class to insert the element from nums at the specified position in index.
        targetList.add(index[i], nums[i]);


        Convert the List back to an Array:
        Once all elements are inserted, we convert the List back to an array.
        int[] target = new int[targetList.size()];
        We use a loop to copy each element from the List to the array.
        for (int i = 0; i < targetList.size(); i++) { target[i] = targetList.get(i); }


        Benefits of the Optimized Approach:

        Efficiency:
        The add method of ArrayList is optimized for dynamic insertion and handles the shifting of elements internally. This avoids the need for manual shifting and reduces the overall complexity.

        Simplicity:
        The code is simpler and more readable, making it easier to understand and maintain.

        Performance:
        This approach generally has better performance for large input sizes compared to the manual shifting method. The ArrayList handles dynamic resizing and shifting internally using optimized algorithms.
        */

/*
    Visualization:
        Let's revisit the example with the arrays:

        nums = [0, 1, 2, 3, 4]
        index = [0, 1, 2, 2, 1]
        Insertion Steps:

        Insert 0 at index 0: [0]
        Insert 1 at index 1: [0, 1]
        Insert 2 at index 2: [0, 1, 2]
        Insert 3 at index 2: [0, 1, 3, 2] (shift 2 to the right)
        Insert 4 at index 1: [0, 4, 1, 3, 2] (shift 1, 3, 2 to the right)
        Final Output:
        The resulting target array is [0, 4, 1, 3, 2], which is obtained efficiently using the ArrayList.

        By using the ArrayList for dynamic insertion, we make the solution more efficient and straightforward, leveraging the optimized internal mechanisms of the ArrayList for handling shifts and resizes.
*/

