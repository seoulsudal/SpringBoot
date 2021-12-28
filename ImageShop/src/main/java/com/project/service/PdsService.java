package com.project.service;

import java.util.List;

import com.project.domain.Pds;

public interface PdsService {

	// 목록 화면
	public List<Pds> list() throws Exception;

	// 등록 처리
	public void register(Pds pds) throws Exception;
	
	public List<String> getAttach(Integer itemId) throws Exception;

	// 상세 페이지
	public Pds read(Integer itemId) throws Exception;

	// 첨부파일 다운로드 처리
	public void updateAttachDownCnt(String fullName) throws Exception;

	// 수정 처리
	public void modify(Pds item) throws Exception;

	// 삭제 처리
	public void remove(Integer itemId) throws Exception;

}
