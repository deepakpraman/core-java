package com.bigdreams.corejava.datastructures.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class LC_217_S2 {
    public static void main(String[] args) {
        int []array= {1,4,3,2};
        System.out.println(containsDuplicate(array));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer>items= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!items.add(nums[i])){
                return true;
            }
//            if(items.size()<i){
//                return true;
//            }
        }
//        List<Integer> list=  Arrays.stream(nums).boxed().collect(Collectors.toList());
//        Map<Integer, List<Integer>> keyCountMap=list.stream().collect(Collectors.groupingBy(Integer::intValue));
//        for(Integer key:keyCountMap.keySet()){
//            if(keyCountMap.get(key).size()>1)
//                return true;
//        }
        return false;
    }
}
