package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface RunnerInsertMapper {
	Map<String, Object> selRunnerInfo(Long id);
}