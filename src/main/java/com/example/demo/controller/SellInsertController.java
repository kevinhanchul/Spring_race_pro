package com.example.demo.controller;

import com.example.demo.service.SellInsertService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/sellInsert")
public class SellInsertController {

    private final SellInsertService sellInsertService;

    public SellInsertController(SellInsertService sellInsertService) {
        this.sellInsertService = sellInsertService;
    }

    @GetMapping("/sellInsert")
    private ModelAndView sellInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("sellInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/sellInsert/getSellInsert")
    public void getSellInsert(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        sellInsertService.getSellInsert(paramMap);
    }

    @PostMapping("/sellInsert/initSellInsert")
    public Map<String, Object> initSellInsert(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        return sellInsertService.initSellInsert(paramMap);
    }

    @PostMapping("/sellInsert/initSellName")
    public List<Map<String, Object>> initSellName() throws Exception {
        return sellInsertService.initSellName();
    }
}
