package com.itheima.test2;

public class StringDemo9 {
    public static void main(String[] args) {
        String phoneNumber = "12345678901";
        String start = phoneNumber.substring(0,3);
        String end = phoneNumber.substring(7);
        String result = start + "****" + end;
        System.out.println(result);
    }
}
