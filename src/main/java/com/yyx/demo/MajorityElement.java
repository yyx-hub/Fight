package com.yyx.demo;

import java.util.Arrays;

/**
 * @description: 多数元素
 * @author: yangyuxiang9
 * @create: 2022-03-10 16:03
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 n/2 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 示例1：
 * 输入：[3,2,3]
 * 输出：3
 *
 * 示例2：
 * 输入：[2,2,1,1,1,2,2]
 *      [1,1,1,2,2,2,2]
 * 输出：2
 **/
class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

