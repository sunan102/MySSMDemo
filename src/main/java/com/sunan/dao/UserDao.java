package com.sunan.dao;

import com.sunan.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
public interface UserDao {
    List<User> selectAll(User user);
}