package com.zeus.domain;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@Getter
@Setter
@ToString
public class MultiFileMember {

	private String userId;
	private String password;
	private List<MultipartFile> pictureList;
	
}
