package com.love_peace.blogmgm.entity;

import com.love_peace.blogmgm.param.enums.BlogType;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/30_10:50
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "tdx01_blog", columnNames = {"type"})})
public class Blog extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 840493913845219898L;

    private String blogId;

    private String title;

    @Column(name = "text", columnDefinition = "text")
    private String text;

    @Enumerated(EnumType.STRING)
    private BlogType type;

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

    public BlogType getType() {
        return type;
    }

    public void setType(BlogType type) {
        this.type = type;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }
}
