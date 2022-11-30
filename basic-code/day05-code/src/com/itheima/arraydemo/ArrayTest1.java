package com.itheima.arraydemo;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        int cnt = 0;
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]%3==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
