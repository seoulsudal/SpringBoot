package com.zeus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.zeus.domain.Board;
import com.zeus.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

	/*
	 * // 의존성 주입 대상 필드
	 * 
	 * @Autowired private BoardService service;
	 * 
	 * @GetMapping("/register") public void registerForm(Board board, Model model)
	 * throws Exception{ log.info("registerForm"); }
	 * 
	 * @PostMapping("/register") public String register(Board board, Model model)
	 * throws Exception{ log.info("register");
	 * 
	 * service.register(board);
	 * 
	 * model.addAttribute("msg", "등록이 완료되었습니다.");
	 * 
	 * return "board/success"; }
	 * 
	 * @GetMapping("/list") public void list(Model model) throws Exception{
	 * log.info("list");
	 * 
	 * model.addAttribute("list", service.list()); }
	 * 
	 * @GetMapping("/read") public void read(int boardNo, Model model) throws
	 * Exception{ log.info("read");
	 * 
	 * model.addAttribute(service.read(boardNo)); }
	 * 
	 * @PostMapping("/remove") public String remove(int boardNo, Model model) throws
	 * Exception{ log.info("remove");
	 * 
	 * service.remove(boardNo);
	 * 
	 * model.addAttribute("msg", "삭제가 완료되었습니다.");
	 * 
	 * return "board/success"; }
	 * 
	 * @GetMapping("/modify") public void modifyForm(int boardNo, Model model)
	 * throws Exception{ log.info("modifyForm");
	 * 
	 * model.addAttribute(service.read(boardNo)); }
	 * 
	 * @PostMapping("/modify") public String modify(Board board, Model model) throws
	 * Exception{ log.info("modify");
	 * 
	 * service.modify(board);
	 * 
	 * model.addAttribute("msg", "수정이 완료되었습니다.");
	 * 
	 * return "board/success"; }
	 */

	/*
	 * // 의존성 주입 대상 필드 private BoardService service;
	 * 
	 * // 생성자를 사용한 의존성 주입
	 * 
	 * @Autowired public BoardController(BoardService service) { this.service =
	 * service; }
	 * 
	 * @GetMapping("/register") public void registerForm(Board board, Model model)
	 * throws Exception { log.info("registerForm"); }
	 * 
	 * @PostMapping("/register") public String register(Board board, Model model)
	 * throws Exception { log.info("register");
	 * 
	 * service.register(board);
	 * 
	 * model.addAttribute("msg", "등록이 완료되었습니다.");
	 * 
	 * return "board/success"; }
	 * 
	 * @GetMapping("/list") public void list(Model model) throws Exception {
	 * log.info("list");
	 * 
	 * model.addAttribute("list", service.list()); }
	 * 
	 * @GetMapping("/read") public void read(int boardNo, Model model) throws
	 * Exception { log.info("read");
	 * 
	 * model.addAttribute(service.read(boardNo)); }
	 * 
	 * @PostMapping("/remove") public String remove(int boardNo, Model model) throws
	 * Exception { log.info("remove");
	 * 
	 * service.remove(boardNo);
	 * 
	 * model.addAttribute("msg", "삭제가 완료되었습니다.");
	 * 
	 * return "board/success"; }
	 * 
	 * @GetMapping("/modify") public void modifyForm(int boardNo, Model model)
	 * throws Exception { log.info("modifyForm");
	 * 
	 * model.addAttribute(service.read(boardNo)); }
	 * 
	 * @PostMapping("/modify") public String modify(Board board, Model model) throws
	 * Exception { log.info("modify");
	 * 
	 * service.modify(board);
	 * 
	 * model.addAttribute("msg", "수정이 완료되었습니다.");
	 * 
	 * return "board/success"; }
	 */

	// 의존성 주입 대상 필드
	private BoardService service;

	// 세터를 사용한 의존성 주입
	@Autowired
	public void setService(BoardService service) {
		this.service = service;
	}

	@GetMapping("/register")
	public void registerForm(Board board, Model model) throws Exception {
		log.info("registerForm");
	}

	@PostMapping("/register")
	public String register(Board board, Model model) throws Exception {
		log.info("register");

		service.register(board);

		model.addAttribute("msg", "등록이 완료되었습니다.");

		return "board/success";
	}

	@GetMapping("/list")
	public void list(Model model) throws Exception {
		log.info("list");

		model.addAttribute("list", service.list());
	}

	@GetMapping("/read")
	public void read(int boardNo, Model model) throws Exception {
		log.info("read");

		model.addAttribute(service.read(boardNo));
	}

	@PostMapping("/remove")
	public String remove(int boardNo, Model model) throws Exception {
		log.info("remove");

		service.remove(boardNo);

		model.addAttribute("msg", "삭제가 완료되었습니다.");

		return "board/success";
	}

	@GetMapping("/modify")
	public void modifyForm(int boardNo, Model model) throws Exception {
		log.info("modifyForm");

		model.addAttribute(service.read(boardNo));
	}

	@PostMapping("/modify")
	public String modify(Board board, Model model) throws Exception {
		log.info("modify");

		service.modify(board);

		model.addAttribute("msg", "수정이 완료되었습니다.");

		return "board/success";
	}
}
