package com.bigdreams.corejava.datastructures.arrays;

import java.util.*;
import java.util.stream.Collectors;

// Find Two Numbers that Add up to "n"
public class LC_15 {
    public static void main(String args[]) {
        int n = 0;
        int[] arr1 = {-1,0,1,2,-1,-4};
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

    public static List<List<Integer>> threeSum(int[] arr1) {
        Set<List<Integer>>result= new HashSet<>();
        int l1 = arr1.length;
        Arrays.sort(arr1);
        for (int k = 0; k < arr1.length; k++) {
            ArrayList triplets= new ArrayList(3);
            int[]pairs = twoSum(Arrays.copyOfRange(arr1, 1, arr1.length),-1*arr1[k]);
            triplets.add(pairs[0]);
            triplets.add(pairs[1]);
            Collections.sort(triplets);
            result.add(triplets);
        }
        return result.stream().collect(Collectors.toList());
    }

//    public static List<List<Integer>> threeSum(int[] arr1) {
//        Set<List<Integer>>result= new HashSet<>();
//        int l1 = arr1.length;
//        for (int k = 0; k < arr1.length; k++) {
//            for (int i = 0; i < arr1.length; i++) {
//                for (int j = 0; j < arr1.length; j++) {
//                    if (i != j && i!=k && j!=k && arr1[i] + arr1[j]+ arr1[k] == 0) {
//                        ArrayList triplets= new ArrayList(3);
//                        triplets.add(arr1[i]);
//                        triplets.add(arr1[j]);
//                        triplets.add(arr1[k]);
//                        Collections.sort(triplets);
//                        result.add(triplets);
//                    }
//                }
//            }
//        }
//        return result.stream().collect(Collectors.toList());
//    }
//
//    public List<List<Integer>> threeSum(int[] num) {
//        Arrays.sort(num);
//        List<List<Integer>> res = new LinkedList<>();
//        for (int i = 0; i < num.length-2; i++) {
//            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
//                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
//                while (lo < hi) {
//                    if (num[lo] + num[hi] == sum) {
//                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
//                        while (lo < hi && num[lo] == num[lo+1]) lo++;
//                        while (lo < hi && num[hi] == num[hi-1]) hi--;
//                        lo++; hi--;
//                    } else if (num[lo] + num[hi] < sum) lo++;
//                    else hi--;
//                }
//            }
//        }
//        return res;
//    }
}
