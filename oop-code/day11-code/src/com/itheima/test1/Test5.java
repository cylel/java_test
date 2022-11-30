package com.itheima.test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("heima000","zhangsan","12345");
        User u2 = new User("heima001","lisi","123");
        User u3 = new User("heima002","wangwu","1234");
        list.add(u1);

        list.add(u2);
        list.add(u3);
        int flag = contains("heima002",list);
        System.out.println(flag);
    }
    public static int contains(String id, ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
