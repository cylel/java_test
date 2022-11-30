package com.itheima.studentmanagesystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {

        //添加一个成员用于测试
        User u = new User("chen","1234","511721200101278907","19121677927");

        System.out.println("欢迎来到学生管理系统");
        ArrayList<User> list = new ArrayList<>();

        list.add(u);

        //用户输入编号选择操作
        Scanner sc = new Scanner(System.in);
        loop1: while (true) {
            System.out.println("请选择操作1登录 2注册 3忘记密码");
            String choose = sc.next();
            switch (choose){
                case "1" -> logIn(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" ->{
                    System.out.println("感谢使用,再见");
                    System.exit(0);
                }
                default -> System.out.println("输入数字无效,请重新输入:");
            }
        }

    }

    public static void register(ArrayList<User> list){
        User u = new User();
        //用户名输入及判断
        Scanner sc = new Scanner(System.in);
        loop: while (true) {
            System.out.println("请输入用户名");
            String username = sc.next();
            if(getIndex(username,list)>=0){
                System.out.println("该用户名已存在,请重新输入");
            }else{
                if(lengthOk(username)){
                    if(legalName(username)){
                        System.out.println("用户名合法,输入成功.");
                        u.setName(username);
                        break loop;
                    }
                }else{
                    System.out.println("用户名长度不符合要求,请重新输入");
                }
            }
        }

        //密码输入判断
        password(u);

        //身份证号验证
        id(u);

        //手机号验证
        phoneNumber(u);
        //注册成功,将成员添加到list
        System.out.println("注册成功.");
        list.add(u);

    }
    public static void logIn(ArrayList<User> list){
        //判断用户名是否存在
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        int index = getIndex(username,list);
        if( index >= 0){
            System.out.println("请输入验证码");
            String truecode = codeMix(getCode());
            System.out.println(truecode);
            while (true) {
                String code = sc.next();
                if(truecode.equals(code)){
                    System.out.println("验证码输入正确");
                    break;
                }else{
                    System.out.println("验证码错误,请重新输入");
                }
            }
            for (int i = 0; i < 3; i++) {
                String true_pw = list.get(index).getPassword();
                System.out.println("请输入密码");
                String pw = sc.next();
                if(pw.equals(true_pw)){
                    System.out.println("密码正确,登陆成功");
                    break;
                }else {
                    System.out.println("密码错误,请重新输入");
                }
            }
        }else{
            System.out.println("用户名未注册,请先注册");
            return;
        }
        //录入密码
        //录入验证码
        //登陆成功

    }
    public static void forgetPassword(ArrayList<User> list){
        //录入用户名,判断是否存在
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        int index = getIndex(username,list);
        if(index >= 0){
            System.out.println("请输入身份证号");
            String id = sc.next();
            System.out.println("请输入手机号");
            String phonenumber = sc.next();
            if(list.get(index).getId().equals(id)&&list.get(index).getPhoneNumber().equals(phonenumber)){
                System.out.println("账号信息匹配成功,请输入新的密码");
                String pw = sc.next();
                list.get(index).setPassword(pw);
            }else {
                System.out.println("账号信息不匹配,修改失败");
            }
        }else {
            System.out.println("该用户名未注册");
        }
    }
    public static int getIndex(String username, ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if(user.getName().equals(username)){
                return i;
            }
        }
        return -1;
    }
    public static boolean lengthOk(String username){
        if(username.length()>=3&&username.length()<=15){
            return true;
        }else{
            return false;
        }
    }
    public static boolean legalName(String username){
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if((c>='0'&&c<='9')||(c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                if((c>'a'&& c<'z')||(c>'A'&& c<'Z')){
                    count++;
                }
            }else {
                System.out.println("用户名必须由字母或数字组成!请重新输入");
                return false;
            }
        }
        if(count > 0){
            return true;
        }else{
            System.out.println("用户名不能是纯数字,请重新输入");
            return false;
        }
    }
    public static void password(User u){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入密码");
            String pw1 = sc.next();
            System.out.println("请再次输入密码");
            String pw2 = sc.next();
            if(pw1.equals(pw2)){
                System.out.println("密码输入成功");
                u.setPassword(pw1);
                break;
            }else {
                System.out.println("两次密码不相同,请重新输入");
            }
        }
    }
    public static void id(User u){
        //身份证号输入
        Scanner sc = new Scanner(System.in);
        loop2:while (true) {
            System.out.println("请输入身份证号");
            String id = sc.next();
            if(id.length()==18){
                if(id.charAt(0)=='0'){
                    System.out.println("身份证号第一位不能为0");
                }else{
                    for (int i = 0; i < id.length(); i++) {
                        if(i!=(id.length()-1)){
                            if(id.charAt(i)>='0'&& id.charAt(i)<='9'){

                            }else{
                                System.out.println("身份证号前17位需要都为数字!");
                                break;
                            }
                        }else{
                            if((id.charAt(i)>='0'&&id.charAt(i)<='9')||id.charAt(i)=='x'||id.charAt(i)=='X'){
                                u.setId(id);
                                System.out.println("身份证号输入成功");
                                break loop2;
                            }else{
                                System.out.println("最后一位需要为数字或者x或X");
                            }
                        }
                    }
                }
            }else{
                System.out.println("身份证号长度需为18位");
            }
        }
    }
    public static void phoneNumber(User u){
        Scanner sc = new Scanner(System.in);
        loop:while (true) {
            System.out.println("请输入手机号");
            String phonenumber = sc.next();
            if(phonenumber.length()==11){
                if(phonenumber.charAt(0)=='0'){
                    System.out.println("手机号第一位不能为0");
                }else{
                    for (int i = 0; i < phonenumber.length(); i++) {
                        if (phonenumber.charAt(i) >= '0' && phonenumber.charAt(i) <= '9') {
                            if(i==phonenumber.length()-1){
                                System.out.println("手机号输入成功");
                                u.setPhoneNumber(phonenumber);
                                break loop;
                            }
                        } else {
                            System.out.println("手机号需要都为数字!");
                            break;
                        }
                    }

                }
            }else{
                System.out.println("手机长度需为11位");
            }
        }
    }

    public static String getCode(){
        String code = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(26);
            int x = r.nextInt(2);
            if(x == 0){
                code = code + (char)(num + 65);
            }else{
                code = code + (char)(num + 97);
            }
        }
        int num = r.nextInt(10);
        code = code + num;
        return code;
    }
    public static String codeMix(String str){
        char[] chs = str.toCharArray();
        for (int i = 0; i < 5; i++) {
            Random r = new Random();
            int temp = r.nextInt(5);
            char c = chs[temp];
            chs[temp] = chs[i];
            chs[i] = c;
        }
        str = "";
        for (int i = 0; i < 5; i++) {
            str = str + chs[i];
        }
        return str;
    }

}
