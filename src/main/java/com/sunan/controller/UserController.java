package com.sunan.controller;

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
        List<User> list=userService.selectAll();
        mv.addObject("users",list);
        mv.setViewName("user/list");
        return mv;
    }

}
