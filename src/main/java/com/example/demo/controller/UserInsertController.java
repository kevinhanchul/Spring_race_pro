package com.example.demo.controller;

import com.example.demo.service.UserInsertService;
import org.springframework.web.bind.annotation.PostMapping;
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
//@RequestMapping("/userInsert")
public class UserInsertController {

    private final UserInsertService userInsertService;

    public UserInsertController(UserInsertService userInsertService) {
        this.userInsertService = userInsertService;
    }

    @GetMapping("/userInsert")
    private ModelAndView userInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("userInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/userInsert/getUserInsert")
    public void getUserInsert(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        userInsertService.getUserInsert(paramMap);
    }

    @PostMapping("/userInsert/modUserAgree")
    public void modUserAgree(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        userInsertService.modUserAgree(paramMap);
    }

    @PostMapping("/userInsert/insertUserAccCard")
    public void insertUserAccCard(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println("insertUserAccCard : "+paramMap);
        userInsertService.insertUserAccCard(paramMap);
    }
}
