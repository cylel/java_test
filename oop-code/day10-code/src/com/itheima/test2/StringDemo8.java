package com.itheima.test2;

import java.lang.management.MonitorInfo;
import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while(true){
            System.out.println("请录入一个金额");
            money = sc.nextInt();
            if(money >=0 && money <= 9999999){
                break;
            }else {
                System.out.println("金额无效");
            }
        }
        int temp = money;
        String capitalStr = "";
        while (temp!=0){
            int index = temp % 10;
            capitalStr = getCapital(index) + capitalStr;
            temp /= 10;
        }
        //System.out.println(capitalStr);
        int cnt = 7 - capitalStr.length();
        for (int i = 0; i < cnt; i++) {
            capitalStr = "零" + capitalStr;
        }
        //System.out.println(capitalStr);
        String moneyStr = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < capitalStr.length(); i++) {
            moneyStr = moneyStr + capitalStr.charAt(i) + arr[i];
        }
        System.out.println(moneyStr);
    }
    public static String getCapital(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
