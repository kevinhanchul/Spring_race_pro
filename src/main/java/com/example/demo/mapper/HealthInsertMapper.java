package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface HealthInsertMapper {
	Map<String, Object> selHealthInfo(Long id);
}
