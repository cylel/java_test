package com.itheima.test1;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("channing",21);
        Student s2 = new Student("chan",18);
        Student s3 = new Student("ning",20);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
