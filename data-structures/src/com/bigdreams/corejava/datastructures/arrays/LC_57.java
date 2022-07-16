package com.bigdreams.corejava.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_57 {
    public static void main(String[] args) {
        int[][]intervals={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[]newInterval={4,8};
        int[][]newIntervals=insert(intervals,newInterval);
        for(int i=0;i<newIntervals.length;i++){
            int[]r=newIntervals[i];
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
            intervals[0]=newInterval;
            return intervals;
        }
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<intervals.length;i++) {
            int[] interval = intervals[i];
            int start = interval[0];
            int end = interval[1];
            if(end<newInterval[0] ){
                list.add(interval);
                continue;
            }else if(start>newInterval[1]){
                list.add(newInterval);
                newInterval=interval;
            }
            else{
                newInterval[0] = Math.min(start,newInterval[0]);
                newInterval[1] = Math.max(end,newInterval[1]);
            }
        }
        list.add(newInterval);
        return list.toArray(new int[list.size()][]);
    }
}
