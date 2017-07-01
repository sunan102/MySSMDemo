package com.sunan.service.impl;

import com.sunan.dao.UserDao;
import com.sunan.model.User;
import com.sunan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    public List<User> selectAll(User user) {
        return userDao.selectAll(user);
    }
}
