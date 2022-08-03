package com.bigdreams.corejava.datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LC_169 {
    public static void main(String[] args) {
        int []array= {2,2,1,1,1,2,2};
        majorityElement(array);
    }

    public static int majorityElement(int[] nums) {
//        List<Integer>list=  Arrays.stream(nums).boxed().collect(Collectors.toList());
//        Map<Integer, List<Integer>> keyCountMap=list.stream().collect(Collectors.groupingBy(Integer::intValue));
//        for(Integer key:keyCountMap.keySet()){
//            if(keyCountMap.get(key).size()>(list.size())/2)
//                return key;
//        }
        Arrays.sort(nums);
        return nums[nums.length/2];
//        return 0;
    }
}
