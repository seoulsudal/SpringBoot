package com.zeus.domain;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 롬복 애너테이션
@Getter
@Setter
@ToString
public class Member {
	
	// 입력값 검증 규칙을 지정한다.
	// 문자열이 아니고 trim한 길이가 0보다 크다는 것을 검사한다.
	@NotBlank
	private String userId;	
	
	// 문자열이 아니고 trim한 길이가 0보다 크다는 것을 검사한다.
	@NotBlank
	private String password;
	
	// 문자열이 아니고 trim한 길이가 3보다 크다는 것을 검사한다.
	@NotBlank
	@Size(max = 3)
	private String userName;
	
	// 이메일 주소 형식인지 검사한다.
	@Email
	private String email;
	
	// 중첩된 자바빈즈의 입력값 검증을 지정한다.
	@Valid
	private Address address;

	// 중첩된 자바빈즈의 입력값 검증을 지정한다.
	@Valid
	private List<Card> cardList;
	
	private String gender;

	// 입력값의 날짜 형식을 지정하고 과거 날짜인지를 검사한다.
	@Past
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
	
}
