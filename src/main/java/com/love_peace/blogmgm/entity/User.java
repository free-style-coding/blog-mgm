package com.love_peace.blogmgm.entity;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/29_19:16
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "udx01_certification_info", columnNames = {"userId"})},
        indexes ={ @Index(name = "idx01_certification_info", columnList = "userId")})
public class User extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = -906533889433117278L;

    private String userId;

    private String name;

    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
