package com.itheima.test1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个小数");
//        double result = sc.nextDouble();
//        System.out.println(result);
        //直接赋值方式
        String s1 = "channing";
        //new的方式
        String s2 = new String();
        //传递字符数组,根据字符数组的内容创建一个新的字符串对象
        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        //传递字节数组,根据字节数组的内容创建一个新的字符串对象
        byte[] bytes ={97,98,99,100};//查这些的ASCII码表示的字符,输出abcd
        String s5 = new String(bytes);
    }

}
