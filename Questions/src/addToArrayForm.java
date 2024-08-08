import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class addToArrayForm {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length;
        int i = n - 1;
        int carry = k;

        // Traverse the array from end to start
        while (i >= 0 || carry > 0) {
            // if there are still digits in num, add them to carry
            if (i >= 0) {
                carry = carry + num[i];
                i--;
            }
            // add last digit of carry to the result list
            result.add(carry % 10);

            // update carry
            carry = carry / 10;
        }
        // the result in list is in reverse order
//        reverse(result);
        Collections.reverse(result);

        return result;
    }

    private void reverse(List<Integer> list) {
        int start = 0, end = list.size() - 1;
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        addToArrayForm solution = new addToArrayForm();

        // Define the input array and K value
        int[] A = {9, 9, 9};
        int K = 1;

        // Call the method and store the result
        List<Integer> result = solution.addToArrayForm(A, K);

        // Print the result
        System.out.println(result);
    }
}

/*
    Initialization:
    We create an ArrayList named result to store the digits of the resulting sum.
    The variable i is initialized to the last index of array A, and carry is initialized with the value of K.

    Iterate Through the Array:
    We use a while loop that runs as long as there are digits left in A to process (i >= 0) or there is a carry left (carry > 0).
    Inside the loop, we add the current digit of A (if any) to the carry and then decrease i.

    Store the Digit and Update Carry:
    The last digit of carry (which is carry % 10) is the current digit of the result. We append it to the result list.
    We then update the carry by dividing it by 10.

    Reverse the Result:
    The result list is built in reverse order, so we reverse it before returning.

    Return the Result:
    The reversed result list is returned, which represents the sum of the number represented by A and K.

    Edge Cases:
    If A is empty, the result should just be the digits of K.
    If K is zero, the result should be the original array A.
    If the addition of K to the digits of A results in a new digit (e.g., adding 1 to 999), ensure that the carry is handled correctly.
*/


/*
    Linked List Insertion:
    The LinkedList allows for efficient insertion at the head, making it a natural choice for this kind of problem, where digits are computed from least significant to most significant.

    Carry Management:
    Similar to the array approach, the code calculates the sum of the corresponding digit from A and K, handles the carry, and stores the resulting digit in the linked list.

    Handling Extra Carry:
    After processing all digits of A, if there's still a carry left, we continue to insert digits until the carry is fully added.
*/
