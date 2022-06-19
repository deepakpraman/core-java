package com.bigdreams.corejava.datastructures.arrays;

import java.util.Arrays;

// Find Two Numbers that Add up to "n"
public class C3E {
    public static void main(String args[]) {
        int n = 9;
        int[] arr1 = {2, 4, 5, 7, 8};
        findPairs(arr1, n);
    }

    private static void findPairs(int[] arr1, int n) {
        int l1 = arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (i != j && arr1[i] + arr1[j] == n) {
                    System.out.println(arr1[i] + "," + arr1[j]);
                    System.out.println("\r\n");
                }
            }
        }
    }
}
