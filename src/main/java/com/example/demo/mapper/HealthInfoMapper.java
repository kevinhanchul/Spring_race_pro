package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface HealthInfoMapper {
	List<Map<String, Object>> selHealthInfo(Map<String, Object> paramMap);
}
