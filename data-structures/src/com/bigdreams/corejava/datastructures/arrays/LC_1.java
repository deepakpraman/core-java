package com.bigdreams.corejava.datastructures.arrays;

// Find Two Numbers that Add up to "n"  (USE Quick Sort)
public class LC_1 {
    public static void main(String args[]) {
        int n = 9;
        int[] arr1 = {2, 4, 5, 7, 8};
        twoSum(arr1, n);
    }

    public static int[] twoSum(int[] arr1, int n) {
        int[]pairs = new int[2];
        int l1 = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (i != j && arr1[i] + arr1[j] == n) {
                    pairs[0] =   i;
                    pairs[1] =   j;
                }
            }
        }
        return pairs;
    }
}
