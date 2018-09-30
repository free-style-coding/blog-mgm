package com.love_peace.blogmgm.controller;

import com.love_peace.blogmgm.param.dto.LoginDTO;
import com.love_peace.blogmgm.param.vo.ResultVo;
import com.love_peace.blogmgm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/30_10:09
 */
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("pwd")
    public ResultVo login(@RequestBody @Validated LoginDTO loginDTO, BindingResult result){
        if (result.hasErrors()) {
            return ResultVo.putError(result.getAllErrors().get(0));
        }
        return loginService.login(loginDTO);
    }

}