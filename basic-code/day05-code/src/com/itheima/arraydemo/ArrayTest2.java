package com.itheima.arraydemo;

public class ArrayTest2 {
    public static void main(String[] args) {
//        String[]arr = new String[50];
//        arr[1] = "zhangsan";
//        System.out.println(arr[1]);
//        System.out.println(arr[0]);
//        int[] arr2 = {1,2,3};
//        System.out.println(arr2[2]);
        int[] array ={33,5,22,44,55};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
