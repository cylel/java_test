package com.itheima.demo1;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {22,3,44,55}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        } 
    }
}
