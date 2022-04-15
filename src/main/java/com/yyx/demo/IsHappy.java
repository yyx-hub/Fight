package com.yyx.demo;

/**
 * @description: 是否是快乐数
 * @author: yangyuxiang9
 * @create: 2022-03-12 16:19
 * 快慢指针
 **/
public class IsHappy {
    public class Solution {
        public int squareSum(int n) {
            int sum = 0;
            while(n > 0){
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            return sum;
        }

        public boolean isHappy(int n) {
            int slow = n, fast = squareSum(n);
            while (slow != fast){
                slow = squareSum(slow);
                fast = squareSum(squareSum(fast));
            };
            return slow == 1;
        }
    }

}
