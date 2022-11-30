package com.itheima.demo1;

import java.util.Scanner;

public class LoopTest {
    public static void main(String[] args) {
//        for(int i = 1; i<=100;i++){
//            if(i%7==0||i%10==7||i/10==7){
//                System.out.println("过");
//                continue;
//            }
//            System.out.println(i);
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个大于等于2的整数");
//        int num = sc.nextInt();
//        int i = 1;
//        while(i*i<num){
//            i++;
//        }
//        System.out.println(--i);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        boolean flag = true;
        int num = sc.nextInt();
        for(int i =2 ; i<num ; i++){
            if(num%i==0){
//                System.out.println("不是质数");
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("是质数");
        }else{
            System.out.println("不是质数");
        }
    }
}
