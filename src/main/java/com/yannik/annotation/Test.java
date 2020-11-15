package com.yannik.annotation;

/**
 * @author yannik
 * @date 2020/11/15
 * @describe
 */
public class Test {
    public static void main(String[] args) {
        String simpleName = "IocConfig";
        char[] chars = simpleName.toCharArray();
        chars[0] += 32;
        String.valueOf(chars);
        System.out.println(chars);
    }
}
