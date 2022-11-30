package com.itheima.test2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c>='a'&&c<='z'){
                smallCount++;
            } else if (c>'A'&&c<='Z') {
                bigCount++;
            } else if (c>'0'&&c<'9') {
                numberCount++;
            }
        }
        System.out.println("大写字符有"+bigCount+"个.");
        System.out.println("小写字符有"+smallCount+"个.");
        System.out.println("数字字符有"+numberCount+"个.");
    }
}
