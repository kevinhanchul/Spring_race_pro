package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SellMapper {
	List<Map<String, Object>> selSell(Map<String, Object> paramMap);
}
