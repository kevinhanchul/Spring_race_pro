package com.example.demo.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserInsertMapper {

	void selUserInsert(Map<String, Object> paramMap);

	void modUserAgree(Map<String, Object> paramMap);

}
