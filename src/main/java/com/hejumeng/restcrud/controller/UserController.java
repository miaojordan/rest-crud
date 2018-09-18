package com.hejumeng.restcrud.controller;


import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class UserController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam(value = "username") String userName,
                        @RequestParam(value = "password") String passWord,
                        Map<String, Object> map, HttpSession session) {
        if (!StringUtils.isEmpty(userName) && passWord.equals("123456")) {
            session.setAttribute("loginUserName", userName);
            return "redirect:/admin";
        }
        map.put("error", "登陆失败");
        return "login";
    }
}
