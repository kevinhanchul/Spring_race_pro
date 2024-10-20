package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface LoginMapper {
	void selLogin(Map<String, Object> paramMap);
}
