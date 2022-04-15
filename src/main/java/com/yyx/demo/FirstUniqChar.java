package com.yyx.demo;

import java.util.*;

/**
 * @description: 第一次只出现一次的字符
 * @author: yangyuxiang9
 * @create: 2022-03-31 19:42
 **/
class FirstUniqChar {

    Map<Character, Integer> charMap = new HashMap<>();

    public char firstUniqChar(String s) {
        if (s == "") System.out.println(' ');
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }
        return ' ';
    }


    public static void main(String[] args) {
        String s = "abacgcdeffj";
        if (s == "") System.out.println(' ');
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1){
                System.out.println(s.charAt(i));
            }
        }
        System.out.println(' ');
    }
}
