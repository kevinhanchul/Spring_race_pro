package com.example.demo.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RunnerInfoMapper {
	Map<String, Object> selRunnerInfo(Map<String, Object> paramMap);
}
