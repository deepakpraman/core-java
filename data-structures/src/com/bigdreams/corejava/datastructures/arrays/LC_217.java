package com.bigdreams.corejava.datastructures.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LC_217 {
    public static void main(String[] args) {
        int []array= {1,4,3,2};
        System.out.println(containsDuplicate(array));
    }

    public static boolean containsDuplicate(int[] nums) {
        List<Integer> list=  Arrays.stream(nums).boxed().collect(Collectors.toList());
        Map<Integer, List<Integer>> keyCountMap=list.stream().collect(Collectors.groupingBy(Integer::intValue));
        for(Integer key:keyCountMap.keySet()){
            if(keyCountMap.get(key).size()>1)
                return true;
        }
        return false;
    }
}
