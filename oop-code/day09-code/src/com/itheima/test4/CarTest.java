package com.itheima.test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            //录入品牌
            System.out.println("请输入汽车品牌");
            Scanner sc = new Scanner(System.in);
            String brand = sc.next();
            c.setBrand(brand);
            //录入价格
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            //录入颜色
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);
            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand()+','+car.getPrice()+','+car.getColor());
        }
    }
}
