package com.example.demo.service;

import com.example.demo.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserInfoService {

    private final UserInfoMapper userInfoMapper;

    public UserInfoService(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    public Map<String, Object> getUserInfo(Map<String, Object> paramMap) {
    	/*Map<String, Object> USER_RESULT;
    	USER_RESULT =  userInfoMapper.selUserInfo(paramMap);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("USER_RESULT", USER_RESULT);
        return resultMap;*/
        return userInfoMapper.selUserInfo(paramMap);
    }
    
}
