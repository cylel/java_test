package com.itheima.demo1;

public class TwoDimensionDemo3 {
    public static void main(String[] args) {
        int[][] yearArrArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };
        int yearSum = 0;
        for (int i = 0; i < yearArrArr.length; i++) {
            int[] quarterArr = yearArrArr[i];
            int quarterSum = getSum(quarterArr);
            System.out.println("第"+(i+1)+"个季度的营业额是"+quarterSum);
            yearSum += quarterSum;
        }
        System.out.println("全年的营业总额是"+yearSum);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
