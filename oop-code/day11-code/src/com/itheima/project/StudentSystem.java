package com.itheima.project;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {

            System.out.println("----------欢迎来到学生管理系统---------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出学生");
            System.out.println("请输入您的选择: ");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出学生");
                    break loop;//System.exit(0);停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }
    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        while (true) {
            System.out.println("请输入学生的id");
            String id = sc.next();
            boolean flag = contains(id,list);
            if(flag){
                System.out.println("id已存在,请重新录入");
            }else {
                s.setId(id);
                break;
            }
        }
        System.out.println("请输入学生的姓名");
        String name = sc.next();
        s.setName(name);
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("请输入学生的家庭住址");
        String address = sc.next();
        s.setAddress(address);
        list.add(s);
        System.out.println("学生信息添加成功");
    }
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = sc.next();
        int index = getIndex(id,list);
        if(index >= 0){
            list.remove(index);
            System.out.println("id为"+id+"的学生删除成功");
        }else{
            System.out.println("id不存在,删除失败");
        }
    }
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要修改的学生的id");
        String id = sc.next();
        int index = getIndex(id,list);
        if(index >= 0){
            System.out.println("请输入新的姓名");
            String newName = sc.next();
            list.get(index).setName(newName);
            System.out.println("请输入新的年龄");
            int newAge = sc.nextInt();
            list.get(index).setAge(newAge);
            System.out.println("请输入新的家庭住址");
            String newAddress = sc.next();
            list.get(index).setAddress(newAddress);

            System.out.println("学生信息修改成功");
        }else{
            System.out.println("该id的学生不存在");
            return;
        }
    }
    public static void queryStudent(ArrayList<Student> list){
        if(list.size()==0){
            System.out.println("当前无学生信息,请添加后再查询");
        }else{
            System.out.println("id\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getId()+"\t"+ list.get(i).getName()+"\t"+list.get(i).getAge()+"\t"+list.get(i).getAddress());
            }
        }
    }

    public static boolean contains(String id, ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    public static int getIndex(String id, ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
