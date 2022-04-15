package com.yyx.demo;

import javax.swing.*;
import java.util.*;

/**
 * @description: 只出现一次的数字
 * @author: yangyuxiang9
 * @create: 2022-03-12 15:15
 **/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                if (nums[i] != nums[j]){
                    map.put(1,nums[i]);
                }
            }
        }
        return map.get(1);
    }
}
