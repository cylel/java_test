package com.itheima.test1;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("apple",8000);
        Phone p3 = new Phone("锤子",2999);
        ArrayList<Phone> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> phoneList = underPrice(3000,list);
        for (int i = 0; i < phoneList.size(); i++) {
            System.out.println(phoneList.get(i).getBrand()+","+phoneList.get(i).getPrice());
        }
    }

    public static ArrayList<Phone> underPrice(int price, ArrayList<Phone> list){
        ArrayList<Phone> resultlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            boolean flag = list.get(i).getPrice()<price?true:false;
            if(flag){
                resultlist.add(list.get(i));
            }
        }
        return resultlist;
    }
}
