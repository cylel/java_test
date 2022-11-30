package com.itheima.test2;

import java.util.Scanner;

public class StringDemo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要反转的字符串");
        String str = sc.next();
        String r_str = reverse(str);
        System.out.println(r_str);
    }

    public static String reverse(String str){
        char[] chs = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chs[str.length()-1-i] = str.charAt(i);
        }
        String str1 = "";
        for (int i = 0; i < chs.length; i++) {
            str1 += chs[i];
        }
        return str1;
    }
}
