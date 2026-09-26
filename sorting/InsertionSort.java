package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]) {
        int arr[] = { 7, 4, 1, 5, 3 };
        insertionSort(arr);
        // Time complexity:
        // first pass: n
        // second pass: n-1
        // third pass: n-2...
        // Basically n+(n-1)+(n-2)+....+2 = summation of 'n' natural numbers
        // n*(n+1)/2 ~= O(n^2)
        // Space complexity: O(1)

    }

    public static void insertionSort(int[] nums) {
         System.out.println("Given array: " + Arrays.toString(nums));
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
         System.out.println("Insertion Sort Sorted array: " + Arrays.toString(nums));
    }

}
