package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface WinnerInfoMapper {
	Map<String, Object> selWinnerInfo(Map<String, Object> paramMap);
}
