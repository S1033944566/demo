package com.baozun.demo.controller;

import com.baozun.demo.entity.UserEntity;
import com.baozun.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/test1")
    public ModelAndView getTest(){
        ModelAndView mav = new ModelAndView();
        List<UserEntity> userList=userService.getAll();
        mav.addObject("msg", "这是个测试页面！");
        mav.setViewName("test1");
        return  mav;
    }
}
