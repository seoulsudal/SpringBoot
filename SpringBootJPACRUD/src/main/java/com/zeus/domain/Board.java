package com.zeus.domain;

import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@EqualsAndHashCode(of = "boardNo")
@ToString
@Entity
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long boardNo;
	
	private String title;
	private String writer;
	
	@Lob
	private String content;
	
	@CreationTimestamp
	private LocalDateTime regDate;
	
	@UpdateTimestamp
	private LocalDateTime updDate;
}
