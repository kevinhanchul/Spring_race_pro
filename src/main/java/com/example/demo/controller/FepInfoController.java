package com.example.demo.controller;

import com.example.demo.service.FepInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@RestController
//@RequestMapping("/fepInfo")
public class FepInfoController {

    private final FepInfoService fepInfoService;

    public FepInfoController(FepInfoService fepInfoService) {
        this.fepInfoService = fepInfoService;
    }

    @GetMapping("/fepInfo")
    private ModelAndView fepInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("fepInfo");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/fepInfo/getFepInfo")
    public Map<String, Object> getFepInfo(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        return fepInfoService.getFepInfo(paramMap);
    }    
}
