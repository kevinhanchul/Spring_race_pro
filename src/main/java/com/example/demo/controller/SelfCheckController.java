package com.example.demo.controller;

import com.example.demo.service.SelfCheckService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/selfCheck")
public class SelfCheckController {

    private final SelfCheckService selfCheckService;

    public SelfCheckController(SelfCheckService selfCheckService) {
        this.selfCheckService = selfCheckService;
    }

    @GetMapping("/getSelfCheck")
    public Map<String, Object> getSelfCheck(@RequestParam String userInfo) {
        return selfCheckService.getSelfCheck(userInfo);
    }

}
