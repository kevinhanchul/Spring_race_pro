package com.example.demo.controller;

import com.example.demo.service.SellService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@RestController
//@RequestMapping("/sell")
public class SellController {

    private final SellService sellService;

    public SellController(SellService sellService) {
        this.sellService = sellService;
    }

    @GetMapping("/sell")
    private ModelAndView sell() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("sell");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/sell/getSell")
    public Map<String, Object> getSell(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        return sellService.getSell(paramMap);
    }    
}
