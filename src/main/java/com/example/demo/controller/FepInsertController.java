package com.example.demo.controller;

import com.example.demo.service.FepInsertService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@RestController
//@RequestMapping("/fepInsert")
public class FepInsertController {

    private final FepInsertService fepInsertService;

    public FepInsertController(FepInsertService fepInsertService) {
        this.fepInsertService = fepInsertService;
    }

    @GetMapping("/fepInsert")
    private ModelAndView fepInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("fepInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/fepInfo/getFepInsert")
    public Map<String, Object> getFepInsert(@RequestBody Map<String, Object> paramMap) throws Exception {
        return fepInsertService.getFepInsert(paramMap);
    }    
}
