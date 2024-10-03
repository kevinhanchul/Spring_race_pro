package com.example.demo.service;

//import com.example.demo.mapper.FepInfoMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FepInfoService {

    //private final FepInfoMapper fepInfoMapper;
/*
    public FepInfoService(FepInfoMapper fepInfoMapper) {
        this.fepInfoMapper = fepInfoMapper;
    }
*/
    public Map<String, Object> getFepInfo(Long id) {
//        return fepInfoMapper.selFepInfo(id);
        Map<String, Object> a = new HashMap<>();
        return a;
    }
    
}
