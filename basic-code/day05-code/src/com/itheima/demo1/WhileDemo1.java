package com.itheima.demo1;

import java.util.Scanner;

public class WhileDemo1 {
    public static void main(String[] args) {
//        int i =1;
//        while(i<=100){
//            System.out.println(i);
//            i++;
//        }
//        double i = 0.1;
//        int cnt = 0;
//        while(i<8844430){
//            i*=2;
//            cnt++;
//        }
//        System.out.println(cnt);
//    }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个回文数");
        int hui = sc.nextInt();
        int temp = hui;
        int yu = 0;
        int newhui = 0;
        while(temp!=0){
            yu = temp%10;
            newhui = newhui*10+yu;
            temp/=10;
        }
        if(newhui==hui){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
    }
}
