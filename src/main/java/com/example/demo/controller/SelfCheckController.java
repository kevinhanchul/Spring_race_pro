package com.example.demo.controller;

import com.example.demo.service.SelfCheckService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@RestController
//@RequestMapping("/selfCheck")
public class SelfCheckController {

    private final SelfCheckService selfCheckService;

    public SelfCheckController(SelfCheckService selfCheckService) {
        this.selfCheckService = selfCheckService;
    }

    @GetMapping("/selfCheck")
    private ModelAndView selfCheck() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("selfCheck");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    @PostMapping("/selfCheck/getSelfCheck")
    public Map<String, Object> getSelfCheck(@RequestBody Map<String, Object> paramMap) throws Exception {
        return selfCheckService.getSelfCheck(paramMap);
    }

}
