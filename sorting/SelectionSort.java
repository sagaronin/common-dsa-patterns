package sorting;

import java.util.Arrays;

class SelectionSort{
    public static void main(String args[]){
        // int arr[] = {13,46,24,52,20,9};
        int arr[] = {7,4,1,5,3};
        selectionSort(arr);

    }
    public static void selectionSort(int arr[]){
        System.out.println("Given array: "+Arrays.toString(arr));
        //Selection sort works on finding the minimum element and the
        //swapping that with element at the start of the array, and move the start by 1.
        //["9",43,24,52,20,13] - Step 1(9 is the smallest hence swap it with first array element)
        //[9,"13",24,52,20,43] - Step 2
        //[9,13,"20",52,24,43] - Step 3
        //[9,13,20,"24",52,43] - Step 4
        //[9,13,20,24,"43",52] - Step 6
        //Note: after step 1, element at start of array of array is sorted, subsequently at each iteration those
        //many number will be sorted.
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            int smallestElementIndex=i;
            for(int j=i;j<len;j++){
                if(arr[j]<arr[smallestElementIndex]){
                    smallestElementIndex=j;
                }
            }
            //Swap since you found the element
            int temp = arr[i];
            arr[i]=arr[smallestElementIndex];
            arr[smallestElementIndex]=temp;

        }

        System.out.println("Selection Sorted array: "+Arrays.toString(arr));

    }
}