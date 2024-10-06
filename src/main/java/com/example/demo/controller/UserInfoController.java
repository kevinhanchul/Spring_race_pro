package com.example.demo.controller;

import com.example.demo.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import java.util.Map;

@RestController
//@RequestMapping("/userInfo")
public class UserInfoController {

    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping("/userInfo")
    private ModelAndView userInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("userInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/userInfo/getUserInfo")
    public List<Map<String, Object>> getUserInfo(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println();
        return userInfoService.getUserInfo(paramMap);
    }    
}
