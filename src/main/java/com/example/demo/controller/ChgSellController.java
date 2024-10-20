package com.example.demo.controller;

import com.example.demo.service.ChgSellService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/chgSell")
public class ChgSellController {

    private final ChgSellService chgSellService;

    public ChgSellController(ChgSellService chgSellService) {
        this.chgSellService = chgSellService;
    }

    @GetMapping("/chgSell")
    private ModelAndView chgSell() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("chgSell");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/chgSell/getChgSell")
    public void getChgSell(@RequestBody Map<String, Object> paramMap) throws Exception {
        System.out.println("getChgSell : "+paramMap);
        chgSellService.getChgSell(paramMap);
    }    
}
