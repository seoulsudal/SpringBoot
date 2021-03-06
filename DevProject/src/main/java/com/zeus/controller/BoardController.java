package com.zeus.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zeus.domain.Board;

import lombok.val;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

//@Log
@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	
	// @RequestMapping의 value 속성에 요청 경로를 설정한다.
	/*
	 * @RequestMapping(value = "/register") public void registerForm() {
	 * log.info("등록 폼"); }
	 */

	// 속성이 하나일 때는 속성명을 생략할 수 있다.
	/*
	 * @RequestMapping("/modify") public void modifyForm() { log.info("수정 폼"); }
	 */
	
	// 속성이 하나일 때는 속성명을 생략할 수 있다.
	/*
	 * @RequestMapping("/list") public void list() { log.info("목록"); }
	 */
	
	// 경로 패턴 지정
	/*
	 * @GetMapping("/read/{boardNo}") public String read(@PathVariable("boardNo")
	 * int boardNo) { log.info("게시글 번호 : " + boardNo);
	 * 
	 * // 경로가 변하므로 뷰 이름 지정 return "board/read"; }
	 */
	
	// 경로 패턴 지정
	/*
	 * @GetMapping("/read2/{no}") public String read2(@PathVariable("no") int
	 * boardNo) { log.info("두번째 게시글 번호 : " + boardNo);
	 * 
	 * // 경로가 변하므로 뷰 이름 지정 return "board/read"; }
	 */
	
	// register 경로에 GET 방식 설정
	/*@GetMapping(value = "/register")
	public String registerForm() {
		log.info("GET 방식 등록 폼");
		
		return "success";
	}*/
	
	// register 경로에 POST 방식 설정
	/*@PostMapping(value = "/register")
	public String register() {
		log.info("POST 방식 등록");
		
		return "success";
	}*/
	
	// modify 경로에 GET 방식
	/*
	 * @GetMapping(value = "/modify")
	 * 
	 * public String modifyForm() { log.info("GET 방식 수정 폼");
	 * 
	 * return "success"; }
	 */
	 
	
	// modify 경로에 POST 방식
	/*
	 * @PostMapping(value = "/modify") public String modify() {
	 * log.info("POST 방식 수정");
	 * 
	 * return "success"; }
	 */
	
	// remove 경로에 POST 방식
	/*
	 * @PostMapping(value = "/remove") public String remove() {
	 * log.info("POST 방식 삭제");
	 * 
	 * return "success"; }
	 */
	
	// list 경로에 GET 방식
	/*
	 * @GetMapping(value = "/list") public String list() { log.info("GET 방식 목록");
	 * 
	 * return "success"; }
	 */
	
	/*
	 * @GetMapping(value = "/get", params = "register") public String registerForm()
	 * { log.info("params 파라미터 GET 방식 등록 폼");
	 * 
	 * return "board/register"; }
	 */
	
	/*
	 * @PostMapping(value = "/post", params = "register") public String register() {
	 * log.info("params 파라미터 POST 방식 등록");
	 * 
	 * return "board/list"; }
	 */
	
	/*
	 * @GetMapping(value = "/get", params = "modify") public String modifyForm() {
	 * log.info("params 파라미터 GET 방식 수정 폼");
	 * 
	 * return "board/modify"; }
	 */
	
	/*
	 * @GetMapping(value = "/get", params = "remove") public String removeForm() {
	 * log.info("params 파라미터 GET 방식 삭제 폼");
	 * 
	 * return "board/remove"; }
	 */
	
	/*
	 * @PostMapping(value = "/post", params = "remove") public String remove() {
	 * log.info("params 파라미터 POST 방식 삭제");
	 * 
	 * return "board/list"; }
	 */
	
	/*
	 * @GetMapping(value = "/get", params = "list") public String list() {
	 * log.info("params 파라미터 GET 방식 목록");
	 * 
	 * return "board/list"; }
	 */
	
	/*
	 * @GetMapping(value = "/get", params = "read") public String read() {
	 * log.info("params 파라미터 GET 방식 읽기");
	 * 
	 * return "board/read"; }
	 */
	

	/*
	 * @PutMapping("/{boardNo}") public ResponseEntity<String>
	 * modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board){
	 * log.info("수정");
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 */
	
	/*
	 * // X-HTTP-Method-Override 요청 헤더 값을 "PUT"으로 지정
	 * 
	 * @PutMapping(value = "/{boardNo}", headers = "X-HTTP-Method-Override=PUT")
	 * public ResponseEntity<String> modifyByHeader(@PathVariable("boardNo") int
	 * boardNo, @RequestBody Board board){ log.info("헤더 수정");
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 */
	
	/*
	 * // consumes 속성값에 "application.json" 미디어 타입을 지정한다.
	 * 
	 * @PostMapping(value = "/{boardNo}") public ResponseEntity<String>
	 * modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board){
	 * log.info("modify");
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 */
	
	// consumes 속성값에 "application.json" 미디어 타입을 지정한다.
	/*
	 * @PutMapping(value = "/{boardNo}", consumes = "application/json") public
	 * ResponseEntity<String> modifyByJson(@PathVariable("boardNo") int
	 * boardNo, @RequestBody Board board){ log.info("modifyByJson");
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 */
	
	/*
	 * // consumes 속성값에 "application.json" 미디어 타입을 지정한다.
	 * 
	 * @PutMapping(value = "/{boardNo}", consumes = "application/xml") public
	 * ResponseEntity<String> modifyByXml(@PathVariable("boardNo") int
	 * boardNo, @RequestBody Board board){ log.info("modifyByXml boardNo : " +
	 * boardNo); log.info("modifyByXml board : " + board);
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 */
	
	// produces 속성값에 "application/xml" 미디어 타입을 지정한다.
	@GetMapping(value = "/{boardNo}", produces = "application/xml")
	public ResponseEntity<Board> readToXml(@PathVariable("boardNo") int boardNo){
		log.info("readToXml");
		
		Board board = new Board();
		
		board.setBoardNo(boardNo);
		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());
		
		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);
		
		return entity;
	}
	
	// produces 속성값에 "application/json" 미디어 타입을 지정한다.
	@GetMapping(value = "/{boardNo}", produces = "application/json")
	public ResponseEntity<Board> readToJson(@PathVariable("boardNo") int boardNo){
		log.info("readToJson");
		
		Board board = new Board();
		
		board.setBoardNo(boardNo);
		board.setTitle("제목");
		board.setContent("내용입니다.");
		board.setWriter("홍길동");
		board.setRegDate(new Date());
		
		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);
		
		return entity;
	}
	
	// 응답 본문의 미디어 타입을 지정하지 않으면 기본값인 "application/json"으로 지정된다.
		@GetMapping(value = "/{boardNo}")
		public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo){
			log.info("readToJson");
			
			Board board = new Board();
			
			board.setBoardNo(boardNo);
			board.setTitle("제목");
			board.setContent("내용입니다.");
			board.setWriter("홍길동");
			board.setRegDate(new Date());
			
			ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);
			
			return entity;
		}
}
