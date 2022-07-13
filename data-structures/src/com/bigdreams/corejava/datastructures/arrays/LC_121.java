package com.bigdreams.corejava.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LC_121 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        if (prices.length == 1) {
            return 0;
        }
        int lastSoldMaxPrice = 0;
        int lastBoughtMinPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < lastBoughtMinPrice) {
                lastBoughtMinPrice=prices[i];
            }
            int profit = prices[i] - lastBoughtMinPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }


}
