package com.love_peace.blogmgm.regist;

import com.love_peace.blogmgm.entity.User;
import com.love_peace.blogmgm.service.UserService;
import com.love_peace.blogmgm.util.TransIdUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/30_9:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RegistTest {

    @Autowired
    private UserService userService;

    @Test
    public void testRegist(){
        User user = new User();
        user.setName("liuhao");
        user.setPassword("123456");
        user.setUserId(TransIdUtil.generateNumForTrans("REGIST_"));
        userService.regist(user);
    }
}
