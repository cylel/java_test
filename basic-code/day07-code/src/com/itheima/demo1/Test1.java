package com.itheima.demo1;

import java.util.Scanner;

//sell a plane ticket
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int price = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位,0为头等舱,1为经济舱");
        int seat = sc.nextInt();
        double nowprice = 0.0;
        if (month >= 5 && month <= 10) {
            nowprice = getNowprice(seat, nowprice, price, 0.9, 0.85);
            //nowprice = getPrice(price,seat,0.9,0.85);
        }
        if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            nowprice = getNowprice(seat, nowprice, price, 0.7, 0.65);
            //nowprice = getPrice(price,seat,0.7,0.65);
        }
        System.out.println("机票价格是:" + nowprice);
    }

    public static double getNowprice(int seat, double nowprice, int price, double x, double x1) {
        if (seat == 0) {
            nowprice = price * x;
        } else if (seat == 1) {
            nowprice = price * x1;
        } else {
            System.out.println("没有这个舱位");
        }
        return nowprice;
    }

//    public static double getPrice(double ticket,int seat,double v0,double v1) {
//        if(seat==0){
//            ticket = (ticket*v0);
//        } else if (seat==1) {
//            ticket = (ticket*v1);
//        }else {
//            System.out.println("没有这个舱位");
//        }
//        return ticket;
//    }
}
