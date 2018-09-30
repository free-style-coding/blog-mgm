package com.love_peace.blogmgm.param.enums;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/30_14:50
 */
public enum  BlogType {

    JAVA("java类");

    private String type;

    BlogType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
