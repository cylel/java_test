package com.itheima.test3;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        boolean flag = str.equals(sb.append(str).reverse().toString());
        if(flag){
            System.out.println("是对称字符");
        }else{
            System.out.println("不是对称字符");
        }
    }
}
