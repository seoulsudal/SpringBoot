package com.zeus.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zeus.domain.Member;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Log
//@Slf4j
@Controller
public class HomeController {

	// LoggerFactory를 이용하여 Logger를 생성한다.
	/*
	 * private static final Logger logger =
	 * LoggerFactory.getLogger(HomeController.class);
	 * 
	 * @RequestMapping(value = "/formHome") public String home(Locale locale, Model
	 * model) { // info 레벨의 로그를 출력한다. // log.info("환영합니다. 지역은 " + locale + ".");
	 * 
	 * // info 레벨의 로그를 출력한다.
	 * 
	 * logger.info("환영합니다. 지역은 {}.", locale);
	 * 
	 * Date date = new Date(); DateFormat dateFormat =
	 * DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
	 * 
	 * String formatterDate = dateFormat.format(date);
	 * 
	 * model.addAttribute("서버 시간", formatterDate);
	 * 
	 * System.out.println(model);
	 * 
	 * 
	 * log.info("GET 방식 formHome");
	 * 
	 * 
	 * return "formHome"; }
	 */

	/*
	 * @GetMapping(value = "/ajaxHome") public String ajaxHome() {
	 * log.info("headers 속성 매핑");
	 * 
	 * return "ajaxHome"; }
	 */
	
	/*
	 * @RequestMapping(value = "/ajaxHome", method = RequestMethod.GET) public
	 * String ajaxHome() { log.info("Content Type 매핑");
	 * 
	 * return "ajaxHome"; }
	 */
	
	/*@GetMapping(value = "/ajaxHome")
	public String ajaxHome() {
		return "ajaxHome";
	}*/
	
	/*
	 * @GetMapping(value = "/gohome01") public void home01() {
	 * log.info("void 타입 01"); }
	 */
	
	/*
	 * @GetMapping(value = "/sub/gohome02") public void home02() {
	 * log.info("void 타입 02"); }
	 */
	
	/*
	 * @GetMapping(value = "/gohome03") public String home01() {
	 * log.info("String 타입 home01");
	 * 
	 * return "home01"; }
	 * 
	 * @GetMapping(value = "/gohome04") public String home02() {
	 * log.info("String 타입 home02");
	 * 
	 * return "home02"; }
	 * 
	 * @GetMapping(value = "/sub/gohome05") public String home03() {
	 * log.info("String 타입 home03");
	 * 
	 * return "sub/home03"; }
	 * 
	 * @GetMapping(value = "/gohome06") public String home04() {
	 * log.info("String 타입 home04");
	 * 
	 * return "redirect:/sub/gohome07"; }
	 * 
	 * @GetMapping(value = "/gohome07") public String home05() {
	 * log.info("String 타입 home05");
	 * 
	 * return "/sub/home05"; }
	 */
	
	/*
	 * @ResponseBody
	 * 
	 * @GetMapping(value = "/gohome08") public Member home06() {
	 * log.info("자바빈즈 클래스 타입 home06");
	 * 
	 * Member member = new Member();
	 * 
	 * return member; }
	 */
	
	/*
	 * @ResponseBody
	 * 
	 * @GetMapping(value = "/gohome09") public List<Member> home07(){
	 * log.info("컬렉션 List 타입 home07");
	 * 
	 * List<Member> list = new ArrayList<Member>();
	 * 
	 * Member member = new Member(); member.setUserId("user01");
	 * member.setPassword("hong1234"); member.setUserName("홍길동"); list.add(member);
	 * 
	 * Member member2 = new Member(); member2.setUserId("user02");
	 * member2.setPassword("lee5678"); member2.setUserName("이순신");
	 * list.add(member2);
	 * 
	 * return list; }
	 */
	
	/*
	 * @ResponseBody
	 * 
	 * @GetMapping(value = "/gohome10") public Map<String, Member> home08(){
	 * log.info("컬렉션 Map 타입 home08");
	 * 
	 * Map<String, Member> map = new HashMap<String, Member>();
	 * 
	 * Member member = new Member(); member.setUserId("user01");
	 * member.setPassword("hong1234"); member.setUserName("홍길동"); map.put("key1",
	 * member);
	 * 
	 * Member member2 = new Member(); member2.setUserId("user02");
	 * member2.setPassword("lee5678"); member2.setUserName("이순신"); map.put("key2",
	 * member2);
	 * 
	 * return map; }
	 */
	
	/*
	 * @RequestMapping(value = "/registerAjaxForm", method = RequestMethod.GET)
	 * public String registerAjaxForm() { log.info("registerAjaxForm");
	 * 
	 * return "registerAjaxForm"; }
	 */
	
	/*
	 * @RequestMapping(value = "/registerAjaxFileUpForm", method =
	 * RequestMethod.GET) public String registerAjaxFileUpForm() {
	 * log.info("registerAjaxFileUpForm");
	 * 
	 * return "registerAjaxFileUpForm"; }
	 */
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping(value = "/")
	public String home(Locale locale, Model model) {
		log.info("환영 합니다. 클라이언트 지역은 " + locale + "입니다.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate);
		
		return "home";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		// 미리 정의된 메시지에 값을 넘겨준다.
		String[] args = {"이순신"};
		
		// 스프링 프레임워크로부터 MessageSource를 주입 받은 다음 getMessage 메서드를 호출한다.
		String message = messageSource.getMessage("welcome.message", args, Locale.KOREAN);
		
		log.info("Welcome message : " + message);
		
		return "home";
	}
}
