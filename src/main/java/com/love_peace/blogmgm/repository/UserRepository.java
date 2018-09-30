package com.love_peace.blogmgm.repository;

import com.love_peace.blogmgm.entity.QUser;
import com.love_peace.blogmgm.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/29_19:23
 */
@Repository
public class UserRepository extends AbstractRepository<User> {
    QUser qUser = QUser.user;

}
