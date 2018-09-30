package com.love_peace.blogmgm.param.dto;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/30_10:13
 */
public class LoginDTO implements Serializable {

    private static final long serialVersionUID = -4692357353337192978L;

    @NotBlank(message = "参数name不能为空")
    private String name;

    @NotBlank(message = "参数password不能为空")
    private String password;

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
