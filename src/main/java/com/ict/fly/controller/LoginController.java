package com.ict.fly.controller;

import com.ict.fly.domain.input.LoginInput;
import com.ict.fly.domain.result.Result;
import com.ict.fly.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/index")
    @ResponseBody
    private Result Login(@RequestBody LoginInput loginInput, HttpServletResponse response, HttpServletRequest request) {
        Result result = loginService.Login(loginInput);
        HttpSession httpSession = request.getSession(true);
        httpSession.setAttribute("USER_SESSION", result.getData());
        httpSession.setAttribute("userName", loginInput.getUsername());
        Cookie userNameCookie = new Cookie("userName", loginInput.getUsername());
        Cookie pwdCookie = new Cookie("pwd", loginInput.getPassword());
        response.addCookie(userNameCookie);
        response.addCookie(pwdCookie);
        return result;
    }
}
