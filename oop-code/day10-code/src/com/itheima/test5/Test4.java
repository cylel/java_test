package com.itheima.test5;

public class Test4 {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "1234";
        int result = strToInt(num1)*strToInt(num2);
        String result1 = intToStr(result);
        System.out.println(result1);
    }

    public static String intToStr(int num){
        String str="";
        while(num!=0){
            str = num%10 + str;
            num /= 10;
        }

        return str;
    }
    public static int strToInt(String str){
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num = num * 10 +str.charAt(i)-'0';
        }
        return num;
    }
}
