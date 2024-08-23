package com.company.arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxSubArray {
    //TODO: Incomplete
    public int maxSubArray(int[] nums) {
    Map<Integer,Integer> map = new HashMap<>();
    int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            map.put(i,sum);
        }

    return sum;
    }
}
