package com.example.demo.service;

import com.example.demo.mapper.UserInsertMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserInsertService {

    private final UserInsertMapper userInsertMapper;

    public UserInsertService(UserInsertMapper userInsertMapper) {
        this.userInsertMapper = userInsertMapper;
    }

    public void getUserInsert(Map<String, Object> paramMap) {
        System.out.println(paramMap);

        userInsertMapper.selUserInsert(paramMap);
    }

    public void modUserAgree(Map<String, Object> paramMap) {
        System.out.println(paramMap);

        userInsertMapper.modUserAgree(paramMap);
    }

    public void insertUserAccCard(Map<String, Object> paramMap) {
        System.out.println(paramMap);

        userInsertMapper.insertUserAccCard(paramMap);
    }

    public Map<String, Object> userIdChk(Map<String, Object> paramMap) {
        System.out.println(paramMap);

        return userInsertMapper.userIdChk(paramMap);
    }
}
