package com.itheima.demo1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int[] scoreArr = getScores();
        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSum(scoreArr);
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        int avg = (sum-max-min)/(scoreArr.length-2);
        System.out.println("选手最终得分为"+avg+"分");
    }

    //求数组总和
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //求数组最大值
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    //求数组最小值
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>min){
                min = arr[i];
            }
        }
        return min;
    }

    //得到六个成绩
    public static int[] getScores(){
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if(score>0&&score<=100){
                scores[i] = score;
                i++;
            }else{
                System.out.println("请重新输入");
            }
        }
        return scores;
    }
}
