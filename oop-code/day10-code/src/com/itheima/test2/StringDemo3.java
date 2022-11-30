package com.itheima.test2;

import java.nio.ShortBuffer;
import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        String rightUserName = "channing";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String userName = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            if(userName.equals(rightUserName)&&password.equals(rightPassword)){
                System.out.println("用户登陆成功!");
                break;
            }else{
                if(i==2) {
                    System.out.println("用户名或密码错误,账号"+userName+"被锁定,请联系管理员");
                }else{
                System.out.println("用户名或密码错误,您还剩下"+(2-i)+"次机会");
                }
            }
        }

    }
}
