package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SelfLimitInsertMapper {
	List<Map<String, Object>> selSelfLimit(Map<String, Object> paramMap);
}
