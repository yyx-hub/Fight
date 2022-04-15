package com.yyx.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @description: 反射
 * @author: yangyuxiang9
 * @create: 2022-04-06 17:48
 **/

    public class Invoke {
        public void test(String[] arg){
            for (String string : arg) {
                System.out.println(string);
            }
        }
        public void demo1() throws Exception {
            //获取字节码对象
            Class<?> clazz = Class.forName("online.Msym");
            //获取一个对象
            Constructor con =  clazz.getConstructor();
            Object m = con.newInstance();
            String[] s = new String[]{"aa","bb"};
            //获取Method对象
            Method method = clazz.getMethod("test", String[].class);
            //调用invoke方法来调用
            method.invoke(m, (Object) s);
        }
    }

