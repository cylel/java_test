package com.itheima.test2;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("001","huazi",29999.0,100);
        Goods g2 = new Goods("002","tencent",39999.0,10);
        Goods g3 = new Goods("003","bytedance",49999.0,70);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId()+','+goods.getName()+','+goods.getPrice()+','+goods.getCount());
        }

    }
}
