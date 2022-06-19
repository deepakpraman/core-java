package com.bigdreams.corejava.datastructures.arrays;

import java.util.Arrays;
// Merge Two Sorted Arrays
public class C2E {
    public static void main (String args[]){
       int arr1 [] = {1, 3, 4, 5};
       int arr2 []= {2, 6, 7, 8};

       int mergedArr [] = mergeArrays(arr1,arr2);
        Arrays.stream(mergedArr).forEach(value -> System.out.println(value));

    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int resultantArray []= new int[l1+l2];
        int i = 0, j = 0, k = 0;
        // Traverse both array
        while (i < l1 && j < l2) {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j])
                resultantArray[k++] = arr1[i++];
            else
                resultantArray[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < l1)
            resultantArray[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < l2)
            resultantArray[k++] = arr2[j++];
        return resultantArray;
    }
}
