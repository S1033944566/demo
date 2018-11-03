package com.baozun.file.readfile;

/**
 * @description:
 * @author: Rover Wang
 * @date: 2018/10/29 10:41
 */
public class CountWords {

    private static int sum = 0;


    public static void sum(int count) {
        sum += count;
    }
    public static int getTotalNum() {
        return sum;
    }
}
