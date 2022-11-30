package com.itheima.demo1;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = sc.nextInt();
        if (number>100){
            System.out.println("数字大于100");
        } else if (number>50) {
            System.out.println("数字大于50");
        }else{
            System.out.println("数字小于等于50");
        }
    }
}
