package com.bigdreams.corejava.datastructures.arrays.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;

//Best Time to Buy & Sell Stock
public class LC_121_StockSell_MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit2(prices2));
    //    Arrays.stream(productExceptSelf(prices)).forEach(pr-> System.out.println(pr));
    }


    public static int maxProfit(int[] input) {
        int[]output = new int[2];
        int maxProfit = 0;
        for(int i=0;i< input.length;i++){
            int profit= 0;
            for(int j=i;j< input.length;j++){
                        profit=input[j]-input[i];
                if(profit>maxProfit){
                    output[0]=i;
                    output[1]=j;
                    maxProfit=profit;
                }

            }
        }
        System.out.println(maxProfit);
        return maxProfit;
    }

    public static int maxProfit2(int[] input) {
        int[]output = new int[2];
        int maxProfit = 0;
        int minimumBuy=input[0];
        if(input.length==1) return 0;
        for(int i=0;i<input.length;i++){
            int profit= 0;
            maxProfit = Integer.max(maxProfit,input[i]-minimumBuy);
            minimumBuy=Integer.min(minimumBuy,input[i]);
        }
        System.out.println(maxProfit);
        return maxProfit;
    }


//    public static int[] productExceptSelf(int[] input) {
//        int[]output = new int[input.length];
//        for(int i=0;i< input.length;i++){
//            int product= 1;
//            for(int j=0;j< input.length;j++){
//                    if(i!=j)
//                        product=product*input[j];
//            }
//            output[i]=product;
//        }
//
//        return output;
//    }

//    public static int[] productExceptSelf(int[] nums) {
//        int[] result = new int[nums.length];
//        for (int i = 0, tmp = 1; i < nums.length; i++) {
//            result[i] = tmp;
//            tmp *= nums[i];
//        }
//        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
//            result[i] *= tmp;
//            tmp *= nums[i];
//        }
//        return result;
//    }


}
