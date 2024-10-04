package com.example.demo.service;

//import com.example.demo.mapper.FepInsertMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FepInsertService {

    //private final FepInsertMapper fepInsertMapper;
/*
    public FepInsertService(FepInsertMapper fepInsertMapper) {
        this.fepInsertMapper = fepInsertMapper;
    }
*/
    public Map<String, Object> getFepInsert(Long id) {
//        return fepInsertMapper.selFepInsert(id);
        Map<String, Object> a = new HashMap<>();
        return a;
    }
    
}
