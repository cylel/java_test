package com.itheima.demo1;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        //把奖池中的所有奖项打乱
        int[] arr = {2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        }
    }

