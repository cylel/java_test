package com.itheima.test2;

public class StringDemo6 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String result = arrToString(arr);
        System.out.println(result);
    }
    public static String arrToString(int[] arr){
        if(arr == null){
            return "";
        }else if(arr.length==0){
            return "[]";
        }else{
            String result = "[";
            for (int i = 0; i < arr.length; i++) {
                if(i==arr.length-1){
                    result = result + arr[i];
                }else {
                    result = result + arr[i] + ",";
                }
            }
            result += "]";
            return result;
        }
    }
}
