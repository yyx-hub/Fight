package com.yyx.demo;

/**
 * @description: 判读Excel表格行号
 * @author: yangyuxiang9
 * @create: 2022-03-12 16:54
 **/
public class ConvertToTitle {
    public static void main(String[] args) {
        int cn = 222;
        StringBuilder sb = new StringBuilder();
        while (cn > 0) {
            cn--;
            sb.append((char)(cn % 26 + 'A'));
            cn /= 26;
        }
        sb.reverse();
        System.out.println(sb.toString());
    }
}
