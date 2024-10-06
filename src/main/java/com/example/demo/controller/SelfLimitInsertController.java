package com.example.demo.controller;

import com.example.demo.service.SelfLimitInsertService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/selfLimitInsert")
public class SelfLimitInsertController {
    private final SelfLimitInsertService selfLimitInsertService;

    public SelfLimitInsertController(SelfLimitInsertService selfLimitInsertService) {
        this.selfLimitInsertService = selfLimitInsertService;
    }

    /*
    @GetMapping("/getSelfLimitInsert")
    public Map<String, Object> getSelfLimitInsert(@RequestParam Map<String, Object> paramMap) {
        System.out.println(paramMap);
        return selfLimitInsertService.getSelfLimitInsert(paramMap);
    }*/

    @GetMapping("/selfLimitInsert")
    private ModelAndView selfLimitInsert() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("selfLimitInsert");
        mav.addObject("message", "Hello, abc.html!");
        return mav;
    }

    // POST 메서드도 사용할 수 있게 하려면 @PostMapping 추가
    @PostMapping("/selfLimitInsert/getSelfLimitInsert")
    public void getSelfLimitInsert(@RequestBody Map<String, Object> paramMap) throws Exception {
        selfLimitInsertService.getSelfLimitInsert(paramMap);
    }
}
