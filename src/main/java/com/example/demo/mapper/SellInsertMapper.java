package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface SellInsertMapper {
	Map<String, Object> selSellInsert(Long id);
}
