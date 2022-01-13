package com.zeus.controller;

import java.util.List;

/*import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;*/
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zeus.domain.Board;
import com.zeus.repository.BoardRepository;
import com.zeus.service.boardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
/* @RepositoryRestController */
@RestController
@CrossOrigin(origins = {"http://localhost:8080", "http://localhost:300"})
@RequestMapping("/boards")
public class BoardController {

	/* private final BoardRepository boardRepository; */
	
	// 목록 조회
	/*
	 * @GetMapping("/boards") public
	 * ResponseEntity<CollectionModel<EntityModel<Board>>> list() throws Exception {
	 * log.info("list");
	 * 
	 * List<Board> boards = boardRepository.findAll();
	 * 
	 * for(Board board : boards) { log.info("" + board); }
	 * 
	 * CollectionModel<EntityModel<Board>> boardModels =
	 * CollectionModel.wrap(boards);
	 * 
	 * for(EntityModel<Board> entityModel : boardModels) { log.info("" +
	 * entityModel); }
	 * 
	 * return new ResponseEntity<>(boardModels, HttpStatus.OK); }
	 */
	
	private final boardService service;
	
	// 등록 조회
	@PostMapping
	public ResponseEntity<Board> register(@Validated @RequestBody Board board) throws Exception {
		log.info("register");
		
		service.register(board);
		
		log.info("register board.getBoardNo() = " + board.getBoardNo());
		
		return new ResponseEntity<>(board, HttpStatus.OK);
	}
	
	// 목록 조회
	@GetMapping
	public ResponseEntity<List<Board>> list() throws Exception {
		log.info("list");
		
		return new ResponseEntity<>(service.list(), HttpStatus.OK);
	}
	
	// 상세 조회
	@GetMapping("/{boardNo}")
	public ResponseEntity<Board> read(@PathVariable("boardNo") Long boardNo) throws Exception {
		log.info("read");
		
		Board board = service.read(boardNo);
		
		return new ResponseEntity<>(board, HttpStatus.OK);
	}
	
	// 수정
	@PutMapping("/{boardNo}")
	public ResponseEntity<Board> modify(@PathVariable("boardNo") Long boardNo, @Validated @RequestBody Board board) throws Exception {
		log.info("modify");
		
		board.setBoardNo(boardNo);
		service.modify(board);
			
		return new ResponseEntity<>(board, HttpStatus.OK);
	}
	
	// 삭제
	@DeleteMapping("/{boardNo}")
	public ResponseEntity<Void> remove(@PathVariable("boardNo") Long boardNo) throws Exception {
		log.info("remove");
		
		service.remove(boardNo);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}
