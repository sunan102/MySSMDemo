package com.sunan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sunan.model.User;
import com.sunan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/")
    public ModelAndView userList() {
        ModelAndView mv = new ModelAndView();
        PageHelper.startPage(2, 2);
        User user = new User();
//        user.setUsername("user2");
        List<User> list = userService.selectAll(user);
        PageInfo<User> p = new PageInfo<User>(list);
        System.out.println(p.getList());
        mv.addObject("users", list);
        mv.addObject("p", p);
        mv.setViewName("user/list");
        return mv;
    }

}
