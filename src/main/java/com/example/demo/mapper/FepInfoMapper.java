package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface FepInfoMapper {
	Map<String, Object> selFepInfo(Map<String, Object> paramMap);
}
