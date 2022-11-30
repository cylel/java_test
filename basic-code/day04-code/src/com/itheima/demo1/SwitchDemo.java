package com.itheima.demo1;

public class SwitchDemo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("你想吃什么面?");
//        String wants = sc.next();
//        switch (wants){
//            case "兰州拉面":
//                System.out.println("吃兰州拉面");
//                break;
//            case "武汉热干面":
//                System.out.println("吃武汉热干面");
//                break;
//            default:
//                System.out.println("吃方便面");
//                break;
//        }
        int number = 10;
        switch (number){
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            default -> System.out.println("lalala");
        }
    }
}
