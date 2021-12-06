package com.zeus.domain;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 롬복 애너테이션
/*@NoArgsConstructor
@RequiredArgsConstructor*/
/*@Getter
@Setter
@EqualsAndHashCode(of="boardNo")*/
/*@AllArgsConstructor
@ToString*/
@Data
public class Board{
	
	private Integer boardNo;
	/* @NonNull */
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	
	public Board() {
		super();
	}
	
	
}
