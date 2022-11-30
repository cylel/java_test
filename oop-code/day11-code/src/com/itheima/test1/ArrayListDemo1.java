package com.itheima.test1;

import javax.xml.transform.Result;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        boolean result = list.add("aaa");   //返回是否添加成功
        list.add("bbb");
        //删除元素
        boolean result1 = list.remove("aa");//返回是否删除成功
        String str = list.remove(0);    //返回删除的元素
        //修改元素
        String result2 = list.set(0, "ddd");   //返回被修改元素
        //查询元素
        String s = list.get(0);     //返回该索引对应的元素
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s1 = list.get(i);
        }
    }
}
