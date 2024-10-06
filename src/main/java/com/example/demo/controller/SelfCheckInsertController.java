package com.example.demo.controller;

import com.example.demo.service.SelfCheckInsertService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@RequestMapping("/selfCheckInsert")
public class SelfCheckInsertController {

    private final SelfCheckInsertService selfCheckInsertService;

    public SelfCheckInsertController(SelfCheckInsertService selfCheckInsertService) {
        this.selfCheckInsertService = selfCheckInsertService;
    }

    @GetMapping("/selfCheckInsert")
    private ModelAndView selfCheckInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("selfCheckInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/selfCheckInsert/getSelfCheckInsert")
    public void getSelfCheckInsert(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        selfCheckInsertService.getSelfCheckInsert(paramMap);
    }
}
