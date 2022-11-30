package com.itheima.demo1;

public class InfiniteloopDemo {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            if(i==3){
                break;
            }
            System.out.println("吃第"+i+"个包子");
        }
    }
}
