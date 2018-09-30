package com.love_peace.blogmgm.service;

import com.love_peace.blogmgm.entity.User;
import com.love_peace.blogmgm.param.dto.LoginDTO;
import com.love_peace.blogmgm.param.vo.ResultVo;
import com.love_peace.blogmgm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/30_10:20
 */
@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public ResultVo login(LoginDTO loginDTO){
        User user = userRepository.getUserByName(loginDTO.getName());
        if(user == null){
            return ResultVo.putError("不存在的账号");
        }
        if(!loginDTO.getPassword().equals(user.getPassword())){
            return ResultVo.putError("用户名或密码错误");
        }
        return ResultVo.put(0,"登录成功");
    }

}
