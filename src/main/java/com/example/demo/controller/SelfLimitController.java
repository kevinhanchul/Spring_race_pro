package com.example.demo.controller;

import com.example.demo.service.SelfLimitService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;
import java.util.List;

@RestController
//@RequestMapping("/selfLimit")
public class SelfLimitController {
    private final SelfLimitService selfLimitService;

    public SelfLimitController(SelfLimitService selfLimitService) {
        this.selfLimitService = selfLimitService;
    }

    /*
    @GetMapping("/getSelfLimit")
    public Map<String, Object> getSelfLimit(@RequestParam Map<String, Object> paramMap) {
        System.out.println(paramMap);
        return selfLimitService.getSelfLimit(paramMap);
    }*/

    @GetMapping("/selfLimit")
    private ModelAndView selfLimit() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("selfLimit");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    // POST 메서드도 사용할 수 있게 하려면 @PostMapping 추가
    @PostMapping("/selfLimit/getSelfLimit")
    public List<Map<String, Object>> getSelfLimit(@RequestBody Map<String, Object> paramMap) throws Exception {
        return selfLimitService.getSelfLimit(paramMap);
    }
}
