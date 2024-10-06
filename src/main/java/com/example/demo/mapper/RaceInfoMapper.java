package com.example.demo.mapper;

import java.util.Map;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RaceInfoMapper {
	List<Map<String, Object>> selRaceInfo(Map<String, Object> paramMap);
}
