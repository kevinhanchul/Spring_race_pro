package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface HealthInsertMapper {
	void selHealthInsert(Map<String, Object> paramMap);
}
