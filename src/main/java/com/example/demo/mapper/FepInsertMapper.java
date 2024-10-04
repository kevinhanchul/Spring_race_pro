package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface FepInsertMapper {
	Map<String, Object> selFepInsert(Long id);
}
