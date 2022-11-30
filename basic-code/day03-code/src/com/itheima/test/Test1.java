package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入,获取个位十位百位
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个数");
        int number = sc.nextInt();
        int ge = number%10;
        int shi = number/10%10;
        int bai = number/100%10;
        System.out.println("个12位是:"+ge);
        System.out.println("十位是:"+shi);
        System.out.println("百位是:"+bai);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入对方的时髦度");
        int manfashion = sc1.nextInt();
        System.out.println("请输入自己的时髦度");
        int myfashion = sc1.nextInt();
        boolean result = myfashion > manfashion;
        System.out.println(result);
    }
}
