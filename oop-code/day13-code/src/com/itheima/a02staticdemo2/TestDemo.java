package com.itheima.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);

        double[] arr2 = {1.5,1.2,3.2,5.8};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }

}
