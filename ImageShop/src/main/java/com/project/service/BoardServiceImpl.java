package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.domain.Board;
import com.project.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;

	// 게시글 등록 처리
	@Override
	public void register(Board board) throws Exception {
		mapper.create(board);
	}

	// 게시글 목록 페이지
	@Override
	public List<Board> list() throws Exception {
		return mapper.list();
	}

	// 게시글 상세 페이지(수정 페이지)
	@Override
	public Board read(Integer boardNo) throws Exception {
		return mapper.read(boardNo);
	}

	// 게시글 수정 처리
	@Override
	public void modify(Board board) throws Exception {
		mapper.update(board);
	}

	// 게시글 삭제 처리
	@Override
	public void remove(Integer boardNo) throws Exception {
		mapper.delete(boardNo);
	}
	
}
