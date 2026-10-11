package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort1 {
    public static void main(String arsg[]) {
        int arr[] = { 7, 4, 1, 5, 3 };
        System.out.println("Merge Sort Sorted array: " + Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int arr[]) {
        int n = arr.length;
        mergeSortHelper(arr, 0, n - 1);
        return arr;
    }

    public static void mergeSortHelper(int arr[], int low, int high) {
        // Base case
        if (low >= high) {
            return;
        }
        // find mid
        int mid = (low + high) / 2;
        // now make call to sort first halt of array i.e. low to mid
        mergeSortHelper(arr, low, mid);
        // After that we need to sort the remaining half i.e. mid+1 to high
        mergeSortHelper(arr, mid + 1, high);
        // After both halfs are sorted, merge both halves.
        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        // We have to merge two array which are already sorted on their own.
        // We will use two variable left and right to keep indexes of those arrays
        int left = low;
        int right = mid + 1;
        //
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        // if left array has some elements
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // if right array has some elements
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        //now we have all the elements form both arrays in sorted order in temp array
        //we need to add them back in same order at their respective places in original array
        for(int i =low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }

    }
}
