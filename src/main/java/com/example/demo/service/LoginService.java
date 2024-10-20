package com.example.demo.service;

import com.example.demo.mapper.LoginMapper;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginService {

    private final LoginMapper loginMapper;

    public LoginService(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    public void getLogin(Map<String, Object> paramMap) {
        System.out.println("getLogin : "+paramMap);
    	loginMapper.selLogin(paramMap);
    }
}
