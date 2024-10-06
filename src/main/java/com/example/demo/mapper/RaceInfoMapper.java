package com.example.demo.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RaceInfoMapper {
	Map<String, Object> selRaceInfo(Map<String, Object> paramMap);
}
