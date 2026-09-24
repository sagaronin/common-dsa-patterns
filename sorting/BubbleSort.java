package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = { 7, 4, 1, 5, 3 };
        bubbleSort(arr);
        // Time complexity:
        // first pass: n
        // second pass: n-1
        // third pass: n-2...
        // Basically n+(n-1)+(n-2)+....+2 = summation of 'n' natural numbers
        // n*(n+1)/2 ~= O(n^2)
        // Space complexity: O(1)

    }

    public static void bubbleSort(int arr[]) {
        System.out.println("Given array: " + Arrays.toString(arr));
        int len = arr.length;
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap if nearby elements pairs has one bigger element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            // towards the end of each oteration, bigger element will be at the end of the
            // array
            // and hence outer for loop starts from n and goes to 1(n,n-1,n-2....1).
            System.out.println("Bubble Sorted array at [" + (len - i - 1) + "]th Iteration: " + Arrays.toString(arr));
        }
        System.out.println("Buuble Sorted array: " + Arrays.toString(arr));
    }

}
