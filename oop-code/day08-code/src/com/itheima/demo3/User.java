package com.itheima.demo3;

public class User {
    //属性
    private String userName;
    private String psw;
    private String email;
    private String gender;
    private int age;

    public User() {
    }

    public User(String userName, String psw, String email, String gender, int age) {
        this.userName = userName;
        this.psw = psw;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return psw
     */
    public String getPsw() {
        return psw;
    }

    /**
     * 设置
     * @param psw
     */
    public void setPsw(String psw) {
        this.psw = psw;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }



    //空参
//    public User(){}
    //带全部参数的构造
//    public User(String userName,String psw,String email,String gender,int age){
//        this.age = age;
//        this.email =email;
//        this.userName = userName;
//        this.psw = psw;
//        this.gender =gender;
//    }
    //get和set方法
}
