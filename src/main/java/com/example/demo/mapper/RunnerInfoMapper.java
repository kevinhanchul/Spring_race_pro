package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RunnerInfoMapper {
	List<Map<String, Object>> selRunnerInfo(Map<String, Object> paramMap);
}
