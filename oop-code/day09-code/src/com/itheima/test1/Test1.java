package com.itheima.test1;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(100, 200, 300, 400, 500);
        double output = nums.stream()
                .map((x) -> x + .5 * x)
                .filter((x) -> x > 400 || x < 200)
                .reduce((x, y) -> x + y)
                .get();
        System.out.print(output);
    }
}
