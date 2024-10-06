package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface FepInsertMapper {
	void selFepInsert(Map<String, Object> paramMap);
}
