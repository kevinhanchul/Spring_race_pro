package com.example.demo.controller;

import com.example.demo.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    private ModelAndView login() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/login/getLogin")
    public void getLogin(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println("getLogin : " + paramMap);
        loginService.getLogin(paramMap);
    }    
}
