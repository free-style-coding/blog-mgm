package com.love_peace.blogmgm.util;

/**
 * 随机数工具类
 */
public class RandomNumberUtil {
    public static String newRandomNumber() {
        int random = (int)(1000+Math.random()*9000);
        return String.valueOf(random);
    }
}
