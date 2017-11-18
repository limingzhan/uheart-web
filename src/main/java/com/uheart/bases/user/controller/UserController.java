package com.uheart.bases.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lm on 2017/7/30.
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping(value="/userIndex")
    public String findUser(){

        return "user/user";
    }
}
