package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface WinnerInfoMapper {
	List<Map<String, Object>> selWinnerInfo(Map<String, Object> paramMap);
}
