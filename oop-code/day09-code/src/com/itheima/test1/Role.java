package com.itheima.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyfaces = {"lovely","happy","bad","annoying"};

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    String[] girlfaces = {"cute","sexy","adorable","kawai"};

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        if(gender=='男'){
            Random r = new Random();
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender=='女') {
            Random r = new Random();
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else{
            this.face = "not good";
        }
    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }
    //方法:A攻击B
    public void attack(Role role){
        Random r = new Random();
        int hurt = r.nextInt(20)+1;
        int remainblood = role.getBlood()-hurt;
        remainblood = remainblood > 0 ? remainblood:0;
        role.setBlood(remainblood);
        System.out.println(this.getName()+"给"+role.getName()+"造成了"+hurt+"点伤害,"+
                role.getName()+"还剩"+role.getBlood()+"点血");
    }

    public void showRoleInfo(){
        System.out.println("name:"+getName());
        System.out.println("blood:"+getBlood());
        System.out.println("gender:"+getGender());
        System.out.println("face:"+getFace());

    }
}
