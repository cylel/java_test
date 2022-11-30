package com.itheima.demo1;

import java.util.Scanner;

public class ForDemo1 {
    public static void main(String[] args) {
//        for (int i=1; i<=5;i++){
//            System.out.println("hello");
//        }
//        for(int i = 1; i<=5; i++){
//            System.out.println(i);
//        }
//        for(int i =1 ;i<=5; i++){
//            System.out.println(i);
//        }
//        int sum =0;
//        for (int i = 1; i <= 100; i++) {
//            if(i%2==0){
//                sum = sum +i;
//            }
//        }
//        System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字，表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请录入一个数字表示范围的结束");
        int end = sc.nextInt();
        int cnt=0;
        for (int i=start;i<=end;i++){
            if(i%3==0&&i%5==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
