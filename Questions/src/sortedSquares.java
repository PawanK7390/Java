import java.util.Arrays;
public class sortedSquares {

    public static void main(String[] args) {
        sortedSquares solution = new sortedSquares();

        int[] nums = {-4, -1, 0, 3, 10};
        int[] sortedSquares = solution.sortedSquares(nums);

        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("Sorted squares: " + Arrays.toString(sortedSquares));
    }

    public int[] sortedSquares(int[] nums) {

        int[] squared = square(nums);
        return mergeSort(squared);
    }

    int[] square(int[] array){

        for(int i = 0; i < array.length; i++){
            array[i] = array[i] * array[i];
        }
        return array;
    }

    int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}

/*
better code
import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {-4, -1, 0, 3, 10};
        int[] sortedSquares = solution.sortedSquares(nums);

        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("Sorted squares: " + Arrays.toString(sortedSquares));
    }
}
*/
