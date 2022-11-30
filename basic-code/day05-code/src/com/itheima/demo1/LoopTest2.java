package com.itheima.demo1;

import java.util.Random;

public class LoopTest2 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(10)+7;
        System.out.println(number);
    }
}
