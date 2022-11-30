package com.itheima.demo1;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        String result = verGen();
        System.out.println(result);
    }
    public static String verGen(){
        String ver = "";
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if(i<=25){chs[i] = (char)(97+i) ;}else {
                chs[i] = (char)(65+i-26);
            }
        }
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(chs.length);
            ver = ver + chs[num];
            //System.out.println(chs[num]);
        }
        int number = r.nextInt(10);
        ver = ver + number;
        return ver;
    }
}
