package com.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.project.domain.Pds;

public interface PdsMapper {

	// 목록 화면
	public List<Pds> list() throws Exception;

	// 등록 처리
	public void create(Pds item) throws Exception;

	// 첨부 파일 추가
	public void addAttach(String fileName) throws Exception;

	public List<String> getAttach(Integer itemId) throws Exception;

	public Pds read(Integer itemId) throws Exception;

	public void updateViewCnt(Integer itemId) throws Exception;

	public void updateAttachDownCnt(String fullName) throws Exception;

	public void update(Pds item) throws Exception;

	public void deleteAttach(Integer itemId) throws Exception;

	public void replaceAttach(@Param("fullName") String fileName, @Param("itemId") Integer itemId) throws Exception;

	public void delete(Integer itemId) throws Exception;

}
