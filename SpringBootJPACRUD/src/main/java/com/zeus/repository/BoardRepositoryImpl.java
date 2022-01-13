package com.zeus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.querydsl.jpa.JPQLQuery;
import com.zeus.domain.Board;
import com.zeus.domain.QBoard;

public class BoardRepositoryImpl extends QuerydslRepositorySupport implements CustomBoardRepository {

	public BoardRepositoryImpl() {
		super(Board.class);
	}
	
	@Override
	public List<Board> listAll() {
		QBoard board = QBoard.board;
		
		JPQLQuery<Board> query = from(board);
		
		query.where(board.boardNo.gt(0L));
		query.orderBy(board.boardNo.desc());
		
		return query.fetch();
	}

	@Override
	public List<Board> searchByTitle(String title) {
		QBoard board = QBoard.board;
		
		JPQLQuery<Board> query = from(board);
		
		query.where(board.title.like("%" + title + "%"));
		query.orderBy(board.boardNo.desc());
		
		return query.fetch();
	}

	@Override
	public List<Board> searchByWriter(String writer) {
		QBoard board = QBoard.board;
		
		JPQLQuery<Board> query = from(board);
		
		query.where(board.writer.like("%" + writer + "%"));
		query.orderBy(board.boardNo.desc());
		
		return query.fetch();
	}

	@Override
	public List<Board> searchByContent(String content) {
		QBoard board = QBoard.board;
		
		JPQLQuery<Board> query = from(board);
		
		query.where(board.content.like("%" + content + "%"));
		query.orderBy(board.boardNo.desc());
		
		return query.fetch();
	}

	@Override
	public List<Board> searchByTitleOrContent(String title, String content) {
		QBoard board = QBoard.board;
		
		JPQLQuery<Board> query = from(board);
		
		query.where(board.title.like("%" + title + "%").or(board.content.like("%" + content + "%")));
		query.orderBy(board.boardNo.desc());
		
		return query.fetch();
	}

	@Override
	public List<Board> searchByContentOrWriter(String content, String writer) {
		QBoard board = QBoard.board;
		
		JPQLQuery<Board> query = from(board);
		
		query.where(board.content.like("%" + content + "%").or(board.writer.like("%" + writer + "%")));
		query.orderBy(board.boardNo.desc());
		
		return query.fetch();
	}

	@Override
	public List<Board> searchByTitleOrContentOrWriter(String title, String content, String writer) {
		QBoard board = QBoard.board;
		
		JPQLQuery<Board> query = from(board);
		
		query.where(board.title.like("%" + title + "%").or(board.content.like("%" + content + "%").or(board.writer.like("%" + writer + "%"))));
		query.orderBy(board.boardNo.desc());
		
		return query.fetch();
	}

}
