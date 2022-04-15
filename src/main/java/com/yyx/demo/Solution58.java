package com.yyx.demo;

/**
 * @description: 反转单词顺序
 * @author: yangyuxiang9
 * @create: 2022-04-12 15:40
 *
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 *
 * 示例 1：
 * 输入: "the sky is blue"
 * 输出:"blue is sky the"
 *
 * 示例 2：
 * 输入: " hello world!"
 * 输出:"world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 **/
public class Solution58 {
    public static void main(String[] args) {
        String s = "the sky ie2s1@! blue           ";
        String[] strs = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].length() > 0) {
                sb.append(strs[i]).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}