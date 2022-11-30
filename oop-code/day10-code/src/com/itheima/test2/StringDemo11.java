package com.itheima.test2;

public class StringDemo11 {
    public static void main(String[] args) {
        String word = "不要bb,nmd";
        //String result = word.replace("bb","**");
        //System.out.println(result);
        String[] arr = {"nmd","bb","xxx","kkk"};
        for (int i = 0; i < arr.length; i++) {
            word = word.replace(arr[i],"***");
        }
        System.out.println(word);
    }
}
