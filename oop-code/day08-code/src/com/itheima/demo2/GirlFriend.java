package com.itheima.demo2;

import javax.lang.model.element.Name;

public class GirlFriend {
    public GirlFriend(String name, int age){
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    private String gender;

//    public void setName(String name){
//        this.name = name;
//    }
    public String getName(){
        return name;
    }

//    public void setAge(int age){
//        if(age>18){
//            this.age = age;
//        }else{
//            System.out.println("非法参数");
//        }
//    }
    public int getAge(){
        return age;
    }

    public void sleep(){
        System.out.println("睡觉");
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
