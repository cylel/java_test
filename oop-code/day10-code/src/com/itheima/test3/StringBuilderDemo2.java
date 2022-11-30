package com.itheima.test3;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa");
        sb.append("jjj");
        String str = sb.toString();
        System.out.println(str);
        System.out.println(sb);
    }
}
