package com.itheima.test5;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];
        Phone p1 = new Phone("galaxy",5000,"red");
        Phone p2 = new Phone("huawei",6000,"white");
        Phone p3 = new Phone("oppo",2000,"pink");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        //想要输出小数计算结果:
        double avg = sum*1.0/arr.length;
        System.out.println("三部手机的平均价格是:"+avg);
    }
}
