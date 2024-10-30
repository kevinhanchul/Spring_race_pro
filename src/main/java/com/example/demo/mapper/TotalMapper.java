package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface TotalMapper {

	Map<String, Object> releaseFocus(Map<String, Object> paramMap);

	Map<String, Object> noticePopup(Map<String, Object> paramMap);

	Map<String, Object> noticePopupLimit(Map<String, Object> paramMap);
}
