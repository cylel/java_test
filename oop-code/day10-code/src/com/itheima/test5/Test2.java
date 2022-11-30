package com.itheima.test5;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)){
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
    public static String rotate(String arr){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length(); i++) {
            if(i < arr.length()-1){
                sb.append(arr.charAt(i+1));
            }else{
                sb.append(arr.charAt(0));
            }
        }
        String str = sb.toString();
        return str;
    }
}
