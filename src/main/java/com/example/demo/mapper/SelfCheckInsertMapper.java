package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface SelfCheckInsertMapper {
	void selSelfCheckInsert(Map<String, Object> paramMap);
}
