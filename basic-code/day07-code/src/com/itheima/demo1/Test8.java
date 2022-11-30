package com.itheima.demo1;

public class Test8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num = 10;
        boolean flag = isInPrice(arr,num);
        System.out.println(flag);
    }

    public static boolean isInPrice(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
