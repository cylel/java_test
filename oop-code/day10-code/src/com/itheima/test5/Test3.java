package com.itheima.test5;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        char[] arr = mix(str.toCharArray());
        String result = new String(arr);
        System.out.println("打乱后的字符串是:"+result);
    }

    public static char[] mix(char[] arr){
        Random r =new Random();
        int number = r.nextInt(arr.length);
        for (int i = 0; i < arr.length; i++) {
            char temp = arr[number];
            arr[number] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
