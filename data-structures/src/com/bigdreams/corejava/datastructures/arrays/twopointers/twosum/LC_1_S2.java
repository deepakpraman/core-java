package com.bigdreams.corejava.datastructures.arrays.twopointers.twosum;

import java.util.Arrays;
import java.util.HashMap;

// Find Two Numbers that Add up to "n"
public class LC_1_S2 {
    public static void main(String args[]) {
        int n = 9;
        int[] arr1 = {2, 4, 5, 7, 8};
        System.out.println(Arrays.stream(twoSum(arr1, n)));
    }

    private static int[] twoSum(int[] arr1, int n) {
        int[]pairs = new int[2];
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if(map.containsKey(n-arr1[i])){
                pairs[0]=i;
                pairs[1]=map.get(n-arr1[i]);
                break;
            }
            map.put(arr1[i],i);
        }
        return pairs;
    }
}
