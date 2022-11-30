package com.itheima.test3;

public class StringBuilderDemo1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("nn");
        sb.append(1);
        sb.append("jjj");
        sb.append(true);
        sb.reverse();
        System.out.println(sb);
        int len = sb.length();
        System.out.println(len);
        //因为StringBuilder是java已经写好的类
        //java在底层对它做了一些特殊处理
        //打印对象不是地址值而是属性值
    }

}
