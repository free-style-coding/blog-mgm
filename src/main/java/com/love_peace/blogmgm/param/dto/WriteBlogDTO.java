package com.love_peace.blogmgm.param.dto;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/30_15:36
 */
public class WriteBlogDTO implements Serializable {

    private static final long serialVersionUID = 37842213945945208L;

    @NotNull(message = "博文类型不能为null")
    private String type;

    @NotBlank(message = "标题不能为空")
    private String title;

    @NotBlank(message = "文章不能为空")
    private String text;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
