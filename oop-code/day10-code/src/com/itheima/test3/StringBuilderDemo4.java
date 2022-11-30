package com.itheima.test3;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = arrToStr(arr);
        System.out.println(str);
    }

    public static String arrToStr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(',');
            }
        }
        String str1 = sb.append("]").toString();
        return str1;
    }
}
