package com.itheima.test2;

public class StringDemo10 {
    public static void main(String[] args) {
        String id = "511721200101278907";
        System.out.println("人物信息为:");
        String birthYear = id.substring(6,10);
        String birthMonth = id.substring(10,12);
        String birthDay = id.substring(12,14);
        System.out.println("出生年月日:"+birthYear+"年"+birthMonth+"月"+birthDay+"日");
        char gender = id.charAt(16);
        if ((int)gender % 2 ==0){               //可以写成int number = gender - 48; if(num%2==0)
            System.out.println("性别为:女");
        }else{
            System.out.println("性别为:男");
        }
    }
}
