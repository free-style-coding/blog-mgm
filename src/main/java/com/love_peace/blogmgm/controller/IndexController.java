package com.love_peace.blogmgm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/29_18:23
 */
@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("hello")
    @ResponseBody
    public Object index(){
        return "dsadas";
    }
}
