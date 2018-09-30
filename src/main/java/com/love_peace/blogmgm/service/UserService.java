package com.love_peace.blogmgm.service;

import com.love_peace.blogmgm.entity.User;
import com.love_peace.blogmgm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/30_9:32
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void regist(User user){
        userRepository.persist(user);
    }
}
