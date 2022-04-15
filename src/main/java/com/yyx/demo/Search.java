package com.yyx.demo;

/**
 * @description: 在排序数组中查找数字
 * @author: yangyuxiang9
 * @create: 2022-03-30 16:08
 *
 * 统计一个数字在排序数组中出现的次数。
 * 示例 1:
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 *
 * 示例2:
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 **/
public class Search {
    public int search(int[] nums, int target) {
        int repeat = 0;
        if (nums.length == 0){
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                repeat++;
            }
            if (i == nums.length-1){
                return repeat;
            }
        }
        return -1;
    }
}
