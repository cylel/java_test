package com.itheima.demo1;

public class Test2 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 101; i < 200; i++) {
            boolean result = isZhi(i);
            if(result){
//                System.out.println("是质数");
                cnt++;
                System.out.println("当前数字"+i+"是质数");
            }
        }
        System.out.println("共有"+cnt+"个质数");
    }
    public static boolean isZhi(int num){
        for (int i = 2; i < num; i++) {
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}
//    int j = 100;
//    boolean flag = true;
//        for (int i = 2; i < j ; i++) {
//        if(j % i == 0){
//        flag = false;
//        }
//        }
//        if (flag == true){
//        System.out.println("质数");
//        }else {
//        System.out.println("不是质数");
//        }