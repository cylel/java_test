package com.itheima.test5;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串");
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag) {
                break;
            }else{
                System.out.println("当前的字符不符合规则,请重新输入");
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - '0';
            sb.append(changeLuoMa(number));
        }
        System.out.println(sb);
    }
    public static String changeLuoMa(int number){
        String[] arr = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return arr[number];
    }
    public static boolean checkStr(String str){
        if (str.length() > 9){
            return false;
        }else{
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c < '0'|| c >'9'){
                    return false;
                }
            }
        }
        return true;
    }
}
