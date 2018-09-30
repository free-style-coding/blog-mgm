package com.love_peace.blogmgm.controller;

import com.love_peace.blogmgm.param.dto.WriteBlogDTO;
import com.love_peace.blogmgm.param.vo.ResultVo;
import com.love_peace.blogmgm.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/30_15:51
 */
@RestController
@RequestMapping("blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("write")
    public ResultVo writeBlog(@RequestBody @Validated WriteBlogDTO writeBlogDTO, BindingResult result){
        if(result.hasErrors()){
            return ResultVo.putError(result.getAllErrors().get(0));
        }
        return blogService.writeBlog(writeBlogDTO);
    }
}
