package com.itheima.demo1;

public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        arr[0][0] = 20;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
