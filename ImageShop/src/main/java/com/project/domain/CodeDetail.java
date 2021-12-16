package com.project.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CodeDetail {

	private String groupCode;
	private String codeValue;
	private String codeName;
	private int sortSeq;
	private String useYn;
	private Date regDate;
	private Date updDate;
	
}
