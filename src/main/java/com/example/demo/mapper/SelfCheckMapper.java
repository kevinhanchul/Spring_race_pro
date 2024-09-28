package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface SelfCheckMapper {
	Map<String, Object> selSelfCheck(String userInfo);
}
