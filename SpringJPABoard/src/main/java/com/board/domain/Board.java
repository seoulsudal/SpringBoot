package com.board.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@SequenceGenerator(
		name = "JPABOARD_SEQ_GEN",		// 시퀀스 제너레이터 이름
		sequenceName = "JPABOARD_SEQ",	// 시퀀스 이름
		initialValue = 1,				// 시작 값
		allocationSize = 1				// 메모리를 통해 할당할 범위 사이즈
		)
@Table(name = "jpaboard")
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,	// 사용 할 전략을 시퀀스로 선택
			generator = "JPABOARD_SEQ_GEN"				// 식별자 생성기를 설정해 놓은 jpaboard_seq_gen으로 설정
			)
	@Column(name = "board_no")
	private Long boardNo;
	
	@Column(name = "title")
	private String title;

	@Column(name = "content")
	private String content;
	
	@Column(name = "writer")
	private String writer;
	
	@Column(name = "reg_date")
	private LocalDateTime regDate;
	
}
