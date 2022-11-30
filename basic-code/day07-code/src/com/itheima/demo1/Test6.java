package com.itheima.demo1;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = sc.nextInt();
        int[] arr = getArr(num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] getArr(int num){
        int len = 0;
        int temp = num;
        while(temp!=0){
            temp /= 10;
            len++;
        }
        int[] arr = new int[len];
        for (int i = arr.length-1; i >=0 ; i--) {
            arr[i] = num % 10;
            num/= 10;
        }
        return arr;
    }
}
