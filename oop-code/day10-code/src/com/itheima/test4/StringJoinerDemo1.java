package com.itheima.test4;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");
//        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj.add("aaa").add("bbb").add("ccc").toString());
        //拼接的时候没有变量参与,都是字符串直接相加,
        // 编译之后就是拼接之后的结果,会复用串池中的字符串.
        String str = "a" + "b" + "c";
        //在拼接的时候有变量,每一行拼接的代码,
        // 都会在内存中创建新的字符串,浪费内存.

    }
}
