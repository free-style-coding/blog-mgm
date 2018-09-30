package com.love_peace.blogmgm.util;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

/**
 * @Author: LiuHao
 * @Descirption: 生成业务编号的工具类
 * @Date: 2018/9/30_9:47
 */
public class TransIdUtil {

    public static final String DATE_FORMAT_PATTERN = "yyyyMMddHHmmssSSS" ;

    /**
     * 生成业务编号
     * 格式： 盐+时间+随机数
     * 根据前缀区分业务场景
     * @param prefix
     * @return
     */
    public synchronized static String generateNumForTrans(String prefix){
        return prefix + DateFormatUtils.format(new Date(),DATE_FORMAT_PATTERN) + RandomNumberUtil.newRandomNumber();
    }
}
