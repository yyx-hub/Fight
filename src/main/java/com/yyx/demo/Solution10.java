package com.yyx.demo;

/**
 * @description: 青蛙跳台阶问题
 * @author: yangyuxiang9
 * @create: 2022-04-02 14:12
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 输入：n = 2
 * 输出：2
 *
 * 示例 2：
 * 输入：n = 7
 * 输出：21
 *
 * 示例 3：
 * 输入：n = 0
 * 输出：1
 **/
public class Solution10 {
    public int numWays(int n) {
        if (n < 2) return 1;
        // 滚动数组方法
        int left = 1, right = 1, r = 1;
        for (int i = 2; i <= n; i++) {
            left = right;
            right = r;
            r = (left + right)%1000000007;
        }
        return r;
    }
    public int numWays1(int n) {
        if (n < 2) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2])%1000000007;
        }
        return dp[n];
    }
}
