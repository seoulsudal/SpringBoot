package com.zeus.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.basic.BasicDesktopIconUI;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.zeus.domain.Address;
import com.zeus.domain.Card;
import com.zeus.domain.CodeLabelValue;
import com.zeus.domain.FileMember;
import com.zeus.domain.Member;
import com.zeus.domain.MultiFileMember;

import lombok.val;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Log
//@Slf4j
@Controller
public class MemberController {

	/*
	 * @RequestMapping(value = "/registerAllForm", method = RequestMethod.GET)
	 * public String registerAllForm() { log.info("registerAllForm");
	 * 
	 * return "registerAllForm"; }
	 * 
	 * @RequestMapping(value = "/registerForm", method = RequestMethod.GET) public
	 * String registerForm() { log.info("registerForm");
	 * 
	 * return "registerForm"; }
	 */

	/*
	 * @RequestMapping(value = "/register", method = RequestMethod.GET) public
	 * String registerByParameter(String userId, String password) {
	 * log.info("registerByParameter"); log.info("userId = " + userId);
	 * log.info("password = " + password);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/register/{userId}", method = RequestMethod.GET)
	 * public String registerByPath(String userId) { log.info("registerByPath");
	 * log.info("userId = " + userId);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/register01", method = RequestMethod.POST) public
	 * String register01(String userId) {
	 * log.info("HTML ??? ???????????? ???????????? ?????????????????? ?????? register01"); log.info("userId = " +
	 * userId);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/register02", method = RequestMethod.POST) public
	 * String register02(String userId, String password) {
	 * log.info("HTML ??? ????????? ?????? ?????? ?????? register02"); log.info("userId = " + userId);
	 * log.info("password = " + password);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/register03", method = RequestMethod.POST) public
	 * String register03(String password, String userId) {
	 * log.info("???????????? ??????????????? ?????? register03"); log.info("userId = " + userId);
	 * log.info("password = " + password);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/register04", method = RequestMethod.POST) public
	 * String register04(String userId, String password, String coin) {
	 * log.info("HTML ??? ???????????? ????????? ?????? register04"); log.info("userId = " + userId);
	 * log.info("password = " + password); log.info("coin = " + coin);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/register05", method = RequestMethod.POST) public
	 * String register05(String userId, String password, int coin) {
	 * log.info("??????????????? ????????? ?????? ?????? register05"); log.info("userId = " + userId);
	 * log.info("password = " + password); log.info("coin = " + coin);
	 * 
	 * return "success"; }
	 */

	/*
	 * @RequestMapping(value = "/register/{userId}", method = RequestMethod.GET)
	 * public String registerByPath(@PathVariable("userId") String userId) {
	 * log.info("registerByPath : /register/{userId}"); log.info("userId = " +
	 * userId);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/register/{userId}/{coin}", method =
	 * RequestMethod.GET) public String registerByPath(@PathVariable("userId")
	 * String userId, @PathVariable("coin") int coin) {
	 * log.info("registerByPath : /register/{userId}/{coin}"); log.info("userId = "
	 * + userId); log.info("coin = " + coin);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/register01", method = RequestMethod.POST) public
	 * String register01(String userId) { log.info("register01 : userId");
	 * log.info("userId = " + userId);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/register02", method = RequestMethod.POST) public
	 * String register02(@RequestParam("userId") String username) {
	 * log.info("register02 : @RequestParam"); log.info("userId = " + username);
	 * 
	 * return "success"; }
	 */

	/*
	 * @RequestMapping(value = "/registerbeans01", method = RequestMethod.POST)
	 * public String registerbeans01(Member member) { log.info("registerBeans");
	 * log.info("member.getUserId() = " + member.getUserId());
	 * log.info("member.getPassword() = " + member.getPassword());
	 * log.info("member.getCoin() = " + member.getCoin());
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerbeans02", method = RequestMethod.POST)
	 * public String registerbeans02(Member member, int coin) {
	 * log.info("registerBeans"); log.info("member.getUserId() = " +
	 * member.getUserId()); log.info("member.getPassword() = " +
	 * member.getPassword()); log.info("member.getCoin() = " + member.getCoin());
	 * log.info("coin = " + coin);
	 * 
	 * return "success"; }
	 */

	/*
	 * @RequestMapping(value = "/registerByDate01", method = RequestMethod.GET)
	 * public String registerByDate01(String userId, Date dateOfBirth) {
	 * log.info("registerByDate01"); log.info("userId = " + userId);
	 * log.info("dateOfBirth = " + dateOfBirth);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerByDate02", method = RequestMethod.GET)
	 * public String registerByDate02(Member member) { log.info("registerByDate02");
	 * log.info("member.getUserId() = " + member.getUserId());
	 * log.info("member.getDateOfBirth() = " + member.getDateOfBirth());
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerdate", method = RequestMethod.POST) public
	 * String registerdate(Member member) { log.info("registerByDate");
	 * log.info("member.getUserId() = " + member.getUserId());
	 * log.info("member.getPassword() = " + member.getPassword());
	 * log.info("member.getDateOfBirth() = " + member.getDateOfBirth());
	 * 
	 * return "success"; }
	 */

	/*
	 * @RequestMapping(value = "/register", method = RequestMethod.POST) public
	 * String register(Member member) { log.info("register");
	 * log.info("member.getUserId() = " + member.getUserId());
	 * log.info("member.getPassword() = " + member.getPassword());
	 * log.info("member.getDateOfBirth() = " + member.getDateOfBirth());
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerByDateFormat", method = RequestMethod.GET)
	 * public String registerByDateFormat(String userId, @DateTimeFormat(pattern =
	 * "yyyyMMdd") Date dateOfBirth) { log.info("registerByDateFormat");
	 * log.info("userId() = " + userId); log.info("dateOfBirth = " + dateOfBirth);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerByDateFormat01", method =
	 * RequestMethod.GET) public String registerByDateFormat01(String
	 * userId, @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateOfBirth) {
	 * log.info("registerByDateFormat01"); log.info("userId() = " + userId);
	 * log.info("dateOfBirth = " + dateOfBirth);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerByDateFormat02", method =
	 * RequestMethod.GET) public String registerByDateFormat02(String
	 * userId, @DateTimeFormat(pattern = "yyyy/MM/dd") Date dateOfBirth) {
	 * log.info("registerByDateFormat02"); log.info("userId() = " + userId);
	 * log.info("dateOfBirth = " + dateOfBirth);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerByDateFormat03", method =
	 * RequestMethod.GET) public String registerByDateFormat03(Member member) {
	 * log.info("registerByDateFormat03"); log.info("member.getUserId() = " +
	 * member.getUserId()); log.info("member.getDateOfBirth() = " +
	 * member.getDateOfBirth());
	 * 
	 * return "success"; }
	 */

	/*
	 * @RequestMapping(value = "/registerMemberUserId", method = RequestMethod.POST)
	 * public String registerUserId(Member member) { log.info("registerUserId");
	 * log.info("member.getUserId() = " + member.getUserId());
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerUser", method = RequestMethod.POST) public
	 * String registerUser(Member member) { log.info("registerUser");
	 * log.info("member.getUserId() = " + member.getUserId());
	 * log.info("member.getGender() = " + member.getGender());
	 * log.info("member.getHobby() = " + member.getHobby());
	 * log.info("member.isForeigner() = " + member.isForeigner());
	 * log.info("member.getDeveloper() = " + member.getDeveloper());
	 * log.info("member.getBirthDate() = " + member.getDateOfBirth());
	 * log.info("member.getCars() = " + member.getCars());
	 * log.info("member.getIntroduction() = " + member.getIntroduction());
	 * 
	 * String[] hobbyArray = member.getHobbyArray();
	 * 
	 * if(hobbyArray != null) { log.info("hobbyArray.length = " +
	 * hobbyArray.length);
	 * 
	 * for(int i = 0; i < hobbyArray.length; i++) { log.info("hobbyArray[" + i +
	 * "] = " + hobbyArray[i]); } } else { log.info("hobbyArray = null"); }
	 * 
	 * List<String> hobbyList = member.getHobbyList();
	 * 
	 * if(hobbyList != null) { log.info("hobbyList.size() = " + hobbyList.size());
	 * 
	 * for(int i = 0; i < hobbyList.size(); i++) { log.info("hobbyList(" + i +
	 * ") = " + hobbyList.get(i)); } } else { log.info("hobbyList == null"); }
	 * 
	 * Address address = member.getAddress();
	 * 
	 * if(address != null) { log.info("address.getPostCode() = " +
	 * address.getPostCode()); log.info("address.getLocation() = " +
	 * address.getLocation()); } else { log.info("address == null"); }
	 * 
	 * List<Card> cardList = member.getCardList();
	 * 
	 * if(cardList != null) { log.info("cardList.size() = " + cardList.size());
	 * 
	 * for(int i = 0; i < cardList.size(); i++) { Card card = cardList.get(i);
	 * log.info("card.getNo() = " + card.getNo());
	 * log.info("card.getValidMonth() = " + card.getValidMonth()); } } else {
	 * log.info("cardList == null"); }
	 * 
	 * String[] carArray = member.getCarArray();
	 * 
	 * if(carArray != null) { log.info("carArray.length = " + carArray.length);
	 * 
	 * for(int i = 0; i < carArray.length; i++) { log.info("carArray[" + i + "] = "
	 * + carArray[i]); } } else { log.info("carArray == null"); }
	 * 
	 * List<String> carList = member.getCarList();
	 * 
	 * if(carList != null) { log.info("carList.size() = " + carList.size());
	 * 
	 * for(int i = 0; i < carList.size(); i++) { log.info("carList(" + i + ") = " +
	 * carList.get(i)); } } else { log.info("carList == null"); }
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerUserId", method = RequestMethod.POST)
	 * public String registerUserId(String userId) { log.info("registerUserId");
	 * log.info("userId = " + userId);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerPassword", method = RequestMethod.POST)
	 * public String registerPassword(String password) {
	 * log.info("registerPassword"); log.info("password = " + password);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerTextArea", method = RequestMethod.POST)
	 * public String registerTextArea(String introduction) {
	 * log.info("registerTextArea"); log.info("introduction = " + introduction);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerRadio", method = RequestMethod.POST) public
	 * String registerRadio(String gender) { log.info("registerRadio");
	 * log.info("gender = " + gender);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerCheckbox01", method = RequestMethod.POST)
	 * public String registerCheckbox01(String hobby) {
	 * log.info("registerCheckbox01"); log.info("hobby = " + hobby);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerCheckbox02", method = RequestMethod.POST)
	 * public String registerCheckbox02(String[] hobbyArray) {
	 * log.info("registerCheckbox02");
	 * 
	 * if(hobbyArray != null) { log.info("hobbyArray.length = " +
	 * hobbyArray.length);
	 * 
	 * for(int i = 0; i < hobbyArray.length; i++) { log.info("hobbyArray[" + i +
	 * "] = " + hobbyArray[i]); } } else { log.info("hobbyArray == null"); }
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerCheckbox03", method = RequestMethod.POST)
	 * public String registerCheckbox03(String developer) {
	 * log.info("registerCheckbox03"); log.info("developer = " + developer);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerCheckbox04", method = RequestMethod.POST)
	 * public String registerCheckbox04(String foreigner) {
	 * log.info("registerCheckbox04"); log.info("foreigner = " + foreigner);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerSelect", method = RequestMethod.POST)
	 * public String registerSelect(String nationality) {
	 * log.info("registerSelect"); log.info("nationality = " + nationality);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerMultipleSelect01", method =
	 * RequestMethod.POST) public String registerMultipleSelect01(String cars) {
	 * log.info("registerMultipleSelect01"); log.info("cars = " + cars);
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerMultipleSelect02", method =
	 * RequestMethod.POST) public String registerMultipleSelect02(String[] carArray)
	 * { log.info("registerMultipleSelect02");
	 * 
	 * if(carArray != null) { log.info("carArray.length = " + carArray.length);
	 * 
	 * for(int i = 0; i < carArray.length; i++) { log.info("carArray[" + i + "] = "
	 * + carArray[i]); } } else { log.info("carArray == null"); }
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerMultipleSelect03", method =
	 * RequestMethod.POST) public String registerMultipleSelect03(ArrayList<String>
	 * carList) { log.info("registerMultipleSelect03");
	 * 
	 * if(carList != null) { log.info("carList.size = " + carList.size());
	 * 
	 * for(int i = 0; i < carList.size(); i++) { log.info("carList[" + i + "] = " +
	 * carList.get(i)); } } else { log.info("carList == null"); }
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerAddress", method = RequestMethod.POST)
	 * public String registerAddress(Address address) { log.info("registerAddress");
	 * 
	 * if(address != null) { log.info("address.getPostCode() = " +
	 * address.getPostCode()); log.info("address.getLocation() = " +
	 * address.getLocation()); } else { log.info("address == null"); }
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerUserAddress", method = RequestMethod.POST)
	 * public String registerUserAddress(Member member) {
	 * log.info("registerUserAddress");
	 * 
	 * Address address = member.getAddress();
	 * 
	 * if(address != null) { log.info("address.getPostCode() = " +
	 * address.getPostCode()); log.info("address.getLocation() = " +
	 * address.getLocation()); } else { log.info("address == null"); }
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerUserCardList", method = RequestMethod.POST)
	 * public String registerUserCardList(Member member) {
	 * log.info("registerUserCardList");
	 * 
	 * List<Card> cardList = member.getCardList();
	 * 
	 * if(cardList != null) { log.info("cardList.size() = " + cardList.size());
	 * 
	 * for(int i = 0; i < cardList.size(); i++) { Card card = cardList.get(i);
	 * log.info("card.getNo() = " + card.getNo());
	 * log.info("card.getValidMonth() = " + card.getValidMonth()); } } else {
	 * log.info("cardList == null"); }
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerDate01", method = RequestMethod.POST)
	 * public String registerDate01(@DateTimeFormat(pattern = "yyyyMMdd") Date
	 * dateOfBirth) { log.info("registerDate01");
	 * 
	 * if(dateOfBirth != null) { log.info("dateOfBirth = " + dateOfBirth); } else {
	 * log.info("dateOfBirth == null"); }
	 * 
	 * return "success"; }
	 */

	/*
	 * @RequestMapping(value = "/registerFileUpForm", method = RequestMethod.GET)
	 * public String registerFileUpForm() { log.info("registerFileUpForm");
	 * 
	 * return "registerFileUpForm"; }
	 * 
	 * @RequestMapping(value = "/registerFileUp01", method = RequestMethod.POST)
	 * public String registerFileUp01(MultipartFile picture) throws Exception {
	 * log.info("registerFileUp01");
	 * 
	 * log.info("originalName : " + picture.getOriginalFilename());
	 * log.info("size: " + picture.getSize()); log.info("contentType : " +
	 * picture.getContentType());
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerFileUp02", method = RequestMethod.POST)
	 * public String registerFileUp02(String userId, String password, MultipartFile
	 * picture) throws Exception { log.info("registerFileUp02");
	 * 
	 * log.info("userId : " + userId); log.info("password : " + password);
	 * 
	 * log.info("originalName : " + picture.getOriginalFilename());
	 * log.info("size: " + picture.getSize()); log.info("contentType : " +
	 * picture.getContentType());
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerFileUp03", method = RequestMethod.POST)
	 * public String registerFileUp03(Member member, MultipartFile picture) throws
	 * Exception { log.info("registerFileUp03");
	 * 
	 * log.info("userId : " + member.getUserId()); log.info("password : " +
	 * member.getPassword());
	 * 
	 * log.info("originalName : " + picture.getOriginalFilename());
	 * log.info("size: " + picture.getSize()); log.info("contentType : " +
	 * picture.getContentType());
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerFileUp04", method = RequestMethod.POST)
	 * public String registerFileUp04(FileMember fileMember) throws Exception {
	 * log.info("registerFileUp04");
	 * 
	 * log.info("userId : " + fileMember.getUserId()); log.info("password : " +
	 * fileMember.getPassword());
	 * 
	 * MultipartFile picture = fileMember.getPicture();
	 * 
	 * log.info("originalName : " + picture.getOriginalFilename());
	 * log.info("size: " + picture.getSize()); log.info("contentType : " +
	 * picture.getContentType());
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerFileUp05", method = RequestMethod.POST)
	 * public String registerFileUp05(MultipartFile picture, MultipartFile picture2)
	 * throws Exception { log.info("registerFileUp05");
	 * 
	 * log.info("picture originalName : " + picture.getOriginalFilename());
	 * log.info("picture size: " + picture.getSize());
	 * log.info("picture contentType : " + picture.getContentType());
	 * 
	 * log.info("picture2 originalName : " + picture2.getOriginalFilename());
	 * log.info("picture2 size: " + picture2.getSize());
	 * log.info("picture2 contentType : " + picture2.getContentType());
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerFileUp06", method = RequestMethod.POST)
	 * public String registerFileUp06(List<MultipartFile> pictureList) throws
	 * Exception { log.info("registerFileUp06");
	 * 
	 * log.info("registerFileUp06 pictureList.size() = " + pictureList.size());
	 * 
	 * for(MultipartFile picture : pictureList) { log.info("originalName : " +
	 * picture.getOriginalFilename()); log.info("size: " + picture.getSize());
	 * log.info("contentType : " + picture.getContentType()); }
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerFileUp07", method = RequestMethod.POST)
	 * public String registerFileUp07(MultiFileMember multiFileMember) throws
	 * Exception { log.info("registerFileUp07");
	 * 
	 * List<MultipartFile> pictureList = multiFileMember.getPictureList();
	 * 
	 * log.info("registerFileUp07 pictureList.size() = " + pictureList.size());
	 * 
	 * for(MultipartFile picture : pictureList) { log.info("originalName : " +
	 * picture.getOriginalFilename()); log.info("size: " + picture.getSize());
	 * log.info("contentType : " + picture.getContentType()); }
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerFileUp08", method = RequestMethod.POST)
	 * public String registerFileUp08(MultipartFile[] pictureList) throws Exception
	 * { log.info("registerFileUp08");
	 * 
	 * log.info("registerFileUp08 pictureList.length = " + pictureList.length);
	 * 
	 * for(MultipartFile picture : pictureList) { log.info("originalName : " +
	 * picture.getOriginalFilename()); log.info("size: " + picture.getSize());
	 * log.info("contentType : " + picture.getContentType()); }
	 * 
	 * return "success"; }
	 */

	/*
	 * @GetMapping(value = "/register01/{userId}") public ResponseEntity<String>
	 * register01(@PathVariable("userId") String userId){ log.info("regiser01");
	 * log.info("userId = " + userId);
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 * 
	 * @PostMapping(value = "/register02/{userId}/{password}") public
	 * ResponseEntity<String> register02(@PathVariable("userId") String
	 * userId, @PathVariable("password") String password){ log.info("register02");
	 * log.info("userId = " + userId); log.info("password = " + password);
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 * 
	 * @PostMapping(value = "/register03") public ResponseEntity<String>
	 * register03(@RequestBody Member member){ log.info("register03");
	 * log.info("userId = " + member.getUserId()); log.info("password = " +
	 * member.getPassword());
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 * 
	 * @PostMapping(value = "/register04") public ResponseEntity<String>
	 * register04(String userId, String password){ log.info("register04");
	 * log.info("userId = " + userId); log.info("password = " + password);
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 * 
	 * @PostMapping(value = "/register05/{userId}") public ResponseEntity<String>
	 * register05(@PathVariable("userId") String userId, @RequestBody Member
	 * member){ log.info("register05"); log.info("userId = " + userId);
	 * 
	 * log.info("userId = " + member.getUserId()); log.info("password = " +
	 * member.getPassword());
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 * 
	 * @PostMapping(value = "/register06") public ResponseEntity<String>
	 * register06(@RequestBody List<Member> memberList){ log.info("register06");
	 * 
	 * for(Member member : memberList) { log.info("userId = " + member.getUserId());
	 * log.info("password = " + member.getPassword()); }
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 * 
	 * @PostMapping(value = "/register07") public ResponseEntity<String>
	 * register07(@RequestBody Member member){ log.info("register07");
	 * 
	 * log.info("userId = " + member.getUserId()); log.info("password = " +
	 * member.getPassword());
	 * 
	 * Address address = member.getAddress();
	 * 
	 * if(address != null) { log.info("address.getPostcode() = " +
	 * address.getPostCode()); log.info("address.getLocation() = " +
	 * address.getLocation()); } else { log.info("address == null"); }
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 * 
	 * @PostMapping(value = "/register08") public ResponseEntity<String>
	 * register08(@RequestBody Member member){ log.info("register08");
	 * 
	 * log.info("userId = " + member.getUserId()); log.info("password = " +
	 * member.getPassword());
	 * 
	 * List<Card> cardList = member.getCardList();
	 * 
	 * if(cardList != null) { log.info("cardList.size() = " + cardList.size());
	 * 
	 * for(int i = 0; i < cardList.size(); i++) { Card card = cardList.get(i);
	 * log.info("card.getNo() = " + card.getNo());
	 * log.info("card.getValidMonth() = " + card.getValidMonth()); } } else {
	 * log.info("cardList == null"); }
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS",
	 * HttpStatus.OK);
	 * 
	 * return entity; }
	 */

	/*
	 * @PostMapping(value = "/uploadAjax", produces = "text/plain; charset=UTF-8")
	 * public ResponseEntity<String> uploadAjax(MultipartFile file) throws
	 * Exception{ String originalFilename = file.getOriginalFilename();
	 * 
	 * log.info("originalName: " + originalFilename);
	 * 
	 * ResponseEntity<String> entity = new ResponseEntity<String>("UPLOAD SUCCESS" +
	 * originalFilename, HttpStatus.OK);
	 * 
	 * return entity; }
	 */

	/*
	 * @GetMapping(value = "/model01") public String model01(Model model) {
	 * log.info("model01");
	 * 
	 * model.addAttribute("userId", "hong"); model.addAttribute("password", "1234");
	 * model.addAttribute("email", "aaa@ccc.com"); model.addAttribute("userName",
	 * "?????????"); model.addAttribute("birthDay", "1989-09-07");
	 * 
	 * return "model01"; }
	 * 
	 * @GetMapping(value = "/model02") public String model02(Model model) {
	 * log.info("model02");
	 * 
	 * Member member = new Member();
	 * 
	 * member.setUserId("hongkd"); member.setPassword("1234");
	 * member.setEmail("aaa@ccc.com"); member.setUserName("?????????");
	 * 
	 * Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR, 1988);
	 * cal.set(Calendar.MONTH, 10); cal.set(Calendar.DAY_OF_MONTH, 7);
	 * 
	 * member.setDateOfBirth(cal.getTime());
	 * 
	 * model.addAttribute(member);
	 * 
	 * return "model02"; }
	 * 
	 * @GetMapping(value = "/model03") public String model03(Model model) {
	 * log.info("model03");
	 * 
	 * String[] carArray = {"saab", "audi"};
	 * 
	 * List<String> carList = new ArrayList<String>(); carList.add("saab");
	 * carList.add("audi");
	 * 
	 * String[] hobbyArray = {"Music", "Movie"};
	 * 
	 * List<String> hobbyList = new ArrayList<String>(); hobbyList.add("Music");
	 * hobbyList.add("Movie");
	 * 
	 * model.addAttribute("carArray", carArray); model.addAttribute("carList",
	 * carList);
	 * 
	 * model.addAttribute("hobbyArray", hobbyArray); model.addAttribute("hobbyList",
	 * hobbyList);
	 * 
	 * return "model03"; }
	 * 
	 * @GetMapping(value = "/model04") public String model04(Model model) {
	 * log.info("model04");
	 * 
	 * Member member = new Member();
	 * 
	 * Address address = new Address(); address.setPostCode("080908");
	 * address.setLocation("seoul");
	 * 
	 * member.setAddress(address);
	 * 
	 * List<Card> cardList = new ArrayList<Card>();
	 * 
	 * Card card1 = new Card(); card1.setNo("123456");
	 * 
	 * Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR, 2020);
	 * cal.set(Calendar.MONTH, 9); cal.set(Calendar.DAY_OF_MONTH, 8);
	 * 
	 * card1.setValidMonth(cal.getTime());
	 * 
	 * cardList.add(card1);
	 * 
	 * Card card2 = new Card(); card2.setNo("456786");
	 * 
	 * cal.set(Calendar.YEAR, 2020); cal.set(Calendar.MONTH, 11);
	 * cal.set(Calendar.DAY_OF_MONTH, 12);
	 * 
	 * card2.setValidMonth(cal.getTime());
	 * 
	 * cardList.add(card2);
	 * 
	 * member.setCardList(cardList);
	 * 
	 * model.addAttribute("user", member);
	 * 
	 * return "model04"; }
	 * 
	 * @GetMapping(value = "/model05") public String model05(Model model) {
	 * log.info("model05");
	 * 
	 * Member member = new Member();
	 * 
	 * member.setUserId("hong"); member.setPassword("1234");
	 * member.setEmail("aaa@ccc.com"); member.setUserName("?????????");
	 * 
	 * member.setGender("female");
	 * 
	 * member.setDeveloper("Y"); member.setForeigner(true);
	 * 
	 * member.setNationality("Australia");
	 * 
	 * //user.setCars("saab,audi"); member.setCars("saab");
	 * 
	 * String[] carArray = {"saab", "audi"};
	 * 
	 * member.setCarArray(carArray);
	 * 
	 * List<String> carList = new ArrayList<String>(); carList.add("saab");
	 * carList.add("audi");
	 * 
	 * member.setCarList(carList);
	 * 
	 * member.setHobby("movie");
	 * 
	 * String[] hobbyArray = {"Music", "Movie"};
	 * 
	 * member.setHobbyArray(hobbyArray);
	 * 
	 * List<String> hobbyList = new ArrayList<String>(); hobbyList.add("Music");
	 * hobbyList.add("Movie");
	 * 
	 * member.setHobbyList(hobbyList);
	 * 
	 * Address address = new Address(); address.setPostCode("080908");
	 * address.setLocation("seoul");
	 * 
	 * member.setAddress(address);
	 * 
	 * List<Card> cardList = new ArrayList<Card>();
	 * 
	 * Card card1 = new Card(); card1.setNo("123456");
	 * 
	 * Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR, 2020);
	 * cal.set(Calendar.MONTH, 9); cal.set(Calendar.DAY_OF_MONTH, 8);
	 * 
	 * card1.setValidMonth(cal.getTime());
	 * 
	 * cardList.add(card1);
	 * 
	 * Card card2 = new Card(); card2.setNo("456786");
	 * 
	 * cal.set(Calendar.YEAR, 2022); cal.set(Calendar.MONTH, 11);
	 * cal.set(Calendar.DAY_OF_MONTH, 7);
	 * 
	 * card2.setValidMonth(cal.getTime());
	 * 
	 * cardList.add(card2);
	 * 
	 * member.setCardList(cardList);
	 * 
	 * cal.set(Calendar.YEAR, 1988); cal.set(Calendar.MONTH, 10);
	 * cal.set(Calendar.DAY_OF_MONTH, 7);
	 * 
	 * member.setDateOfBirth(cal.getTime());
	 * 
	 * String introduction = "???????????????. \n???????????????.";
	 * 
	 * member.setIntroduction(introduction);
	 * 
	 * model.addAttribute("user", member);
	 * 
	 * return "model05"; }
	 */

	/*
	 * @GetMapping(value = "/registerModelForm") public String registerModelForm() {
	 * log.info("registerModelForm");
	 * 
	 * return "registerModelForm"; }
	 * 
	 * @PostMapping(value = "/registerModelForm01") public String
	 * registerModelForm01(String userId) { log.info("registerModelForm01");
	 * 
	 * log.info("userId = " + userId);
	 * 
	 * return "registerModelForm01"; }
	 * 
	 * @PostMapping(value = "/registerModelForm02") public String
	 * registerModelForm02(@ModelAttribute("userId") String userId) {
	 * log.info("registerModelForm02");
	 * 
	 * log.info("userId = " + userId);
	 * 
	 * return "registerModelForm02"; }
	 * 
	 * @PostMapping(value = "/registerModelForm03") public String
	 * registerModelForm03(@ModelAttribute("userId") String
	 * userId, @ModelAttribute("password") String password) {
	 * log.info("registerModelForm03");
	 * 
	 * log.info("userId = " + userId); log.info("password = " + password);
	 * 
	 * return "registerModelForm03"; }
	 * 
	 * @PostMapping(value = "/registerModelForm04") public String
	 * registerModelForm04(Member member) { log.info("registerModelForm04");
	 * 
	 * log.info("userId = " + member.getUserId()); log.info("password = " +
	 * member.getPassword());
	 * 
	 * return "registerModelForm04"; }
	 */

	/*
	 * @GetMapping(value = "/registerRedirectAttributesForm") public String
	 * registerRedirectAttributesForm() {
	 * log.info("registerRedirectAttributesForm");
	 * 
	 * return "registerRedirectAttributesForm"; }
	 * 
	 * @PostMapping(value = "/registerRedirectAttributes") public String
	 * registerRedirectAttributes(Member member, RedirectAttributes rttr) throws
	 * Exception { log.info("registerRedirectAttributes");
	 * 
	 * rttr.addFlashAttribute("msg", "success");
	 * 
	 * return "redirect:/result"; }
	 * 
	 * @GetMapping(value = "/result") public String result() { log.info("result");
	 * 
	 * return "result"; }
	 */

	/*
	 * @RequestMapping(value = "/registerSpringForm01", method = RequestMethod.GET)
	 * public String registerSpringForm01() { log.info("registerSpringForm01");
	 * 
	 * return "registerSpringForm"; }
	 * 
	 * @RequestMapping(value = "/registerSpringForm02", method = RequestMethod.GET)
	 * // ????????? ????????? ???????????? ?????? Model??? ??????????????? ????????????. public String
	 * registerSpringForm02(Model model) { log.info("registerSpringForm02");
	 * 
	 * // ???????????? "member"??? ???????????? ??? ????????? ????????? ????????????. model.addAttribute("member", new
	 * Member());
	 * 
	 * return "registerSpringForm"; }
	 * 
	 * @RequestMapping(value = "/registerSpringForm03", method = RequestMethod.GET)
	 * public String registerSpringForm03(Model model) {
	 * log.info("registerSpringForm03");
	 * 
	 * // ???????????? "user"??? ???????????? ??? ????????? ????????? ????????????. model.addAttribute("user", new
	 * Member());
	 * 
	 * return "registerSpringForm"; }
	 * 
	 * @RequestMapping(value = "/registerSpringForm04", method = RequestMethod.GET)
	 * public String registerSpringForm04(Model model) {
	 * log.info("registerSpringForm04");
	 * 
	 * // ???????????? "user"??? ???????????? ??? ????????? ????????? ????????????. model.addAttribute("user", new
	 * Member());
	 * 
	 * return "registerSpringForm2"; }
	 * 
	 * @RequestMapping(value = "/registerSpringForm05", method = RequestMethod.GET)
	 * // ??????????????? ??????????????? ???????????? ????????? ?????? ????????? ?????? ???????????? ??? ????????? ????????????. public String
	 * registerSpringForm05(Member member) { log.info("registerSpringForm05");
	 * 
	 * return "registerSpringForm"; }
	 * 
	 * @RequestMapping(value = "/registerSpringForm06", method = RequestMethod.GET)
	 * // ??? ????????? ???????????? ??????????????? ????????? ???????????? ???????????? ???????????? ???????????? ?????????. public String
	 * registerSpringForm06(Member user) { log.info("registerSpringForm06");
	 * 
	 * return "registerSpringForm"; }
	 * 
	 * @RequestMapping(value = "/registerSpringForm07", method = RequestMethod.GET)
	 * // @ModelAttribute ????????????????????? ??? ????????? ???????????? "user"??? ????????????. public String
	 * registerSpringForm07(@ModelAttribute("user") Member member) {
	 * log.info("registerSpringForm07");
	 * 
	 * return "registerSpringForm"; }
	 * 
	 * @RequestMapping(value = "/registerSpringForm08", method = RequestMethod.GET)
	 * // @ModelAttribute ????????????????????? ??? ????????? ???????????? "user"??? ????????????. public String
	 * registerSpringForm08(@ModelAttribute("user") Member member) {
	 * log.info("registerSpringForm08");
	 * 
	 * return "registerSpringForm2"; }
	 * 
	 * @RequestMapping(value = "/registerSpringForm09", method = RequestMethod.GET)
	 * public String registerSpringForm09(Model model) {
	 * log.info("registerSpringForm09");
	 * 
	 * Member member = new Member();
	 * 
	 * // ??? ????????? ??????????????? ?????? ????????????. member.setUserId("hong"); member.setUserName("?????????");
	 * 
	 * model.addAttribute("member", member);
	 * 
	 * return "registerSpringForm"; }
	 * 
	 * @RequestMapping(value = "/register", method = RequestMethod.POST) public
	 * String register(Member member) { log.info("register");
	 * 
	 * log.info("member.getUserId() = " + member.getUserId());
	 * log.info("member.getUserName() = " + member.getUserName());
	 * 
	 * return "resultForm"; }
	 */

	/*
	 * @RequestMapping(value = "/registerSpringFormInput01", method =
	 * RequestMethod.GET) public String registerSpringFormInput01(Model model) {
	 * log.info("registerSpringFormInput01");
	 * 
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerSpringFormInput"; }
	 * 
	 * @RequestMapping(value = "/registerSpringFormInput02", method =
	 * RequestMethod.GET) public String registerSpringFormInput02(Model model) {
	 * log.info("registerSpringFormInput02");
	 * 
	 * Member member = new Member();
	 * 
	 * member.setEmail("aaa@ccc.com"); member.setUserName("?????????");
	 * 
	 * model.addAttribute("member", member);
	 * 
	 * return "registerSpringFormInput"; }
	 * 
	 * // ????????????
	 * 
	 * @RequestMapping(value = "/register", method = RequestMethod.POST) public
	 * String register(Member member) { log.info("register");
	 * 
	 * log.info("member.getUserId() = " + member.getUserId());
	 * log.info("member.getUserName() = " + member.getUserName());
	 * log.info("member.getEmail() = " + member.getEmail());
	 * 
	 * return "inputResult"; }
	 */

	/*
	 * @RequestMapping(value = "/registerSpringFormPassword01", method =
	 * RequestMethod.GET) public String registerSpringFormPassword01(Model model) {
	 * log.info("registerForm01");
	 * 
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerSpringFormPassword"; }
	 * 
	 * @RequestMapping(value = "/registerSpringFormPassword02", method =
	 * RequestMethod.GET) public String registerSpringFormPassword02(Model model) {
	 * log.info("registerForm02");
	 * 
	 * Member member = new Member();
	 * 
	 * member.setPassword("1234"); model.addAttribute("member", member);
	 * 
	 * return "registerSpringFormPassword"; }
	 * 
	 * // ?????? ??????
	 * 
	 * @RequestMapping(value = "register", method = RequestMethod.POST) public
	 * String register(Member member) { log.info("register");
	 * 
	 * log.info("member.getPassword() = " + member.getPassword());
	 * 
	 * return "passwordResult"; }
	 */

	/*
	 * @RequestMapping(value = "/registerSpringFormTextarea01", method =
	 * RequestMethod.GET) public String registerSpringFormTextarea01(Model model) {
	 * log.info("registerSpringFormTextarea01");
	 * 
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerSpringFormTextarea"; }
	 * 
	 * @RequestMapping(value = "/registerSpringFormTextarea02", method =
	 * RequestMethod.GET) public String registerSpringFormTextarea02(Model model) {
	 * log.info("registerSpringFormTextarea02");
	 * 
	 * Member member = new Member();
	 * 
	 * String introduction = "???????????????. \n???????????????.";
	 * 
	 * member.setIntroduction(introduction);
	 * 
	 * model.addAttribute("member", member);
	 * 
	 * return "registerSpringFormTextarea"; }
	 * 
	 * // ?????? ??????
	 * 
	 * @RequestMapping(value = "/register", method = RequestMethod.POST) public
	 * String register(Member member) { log.info("register");
	 * 
	 * log.info("member.getIntroduction() = " + member.getIntroduction());
	 * 
	 * return "textareaResult"; }
	 */

	/*
	 * @RequestMapping(value = "/registerSpringFormCheckboxes01", method =
	 * RequestMethod.GET) public String registerSpringFormCheckboxes01(Model model)
	 * { log.info("registerSpringFormCheckboxes01");
	 * 
	 * Map<String, String> hobbyMap = new HashMap<String, String>();
	 * hobbyMap.put("01", "Sports"); hobbyMap.put("02", "Music"); hobbyMap.put("03",
	 * "Movie");
	 * 
	 * model.addAttribute("hobbyMap", hobbyMap); model.addAttribute("member", new
	 * Member());
	 * 
	 * return "registerSpringFormCheckboxes01"; }
	 * 
	 * @RequestMapping(value = "/registerSpringFormCheckboxes02", method =
	 * RequestMethod.GET) public String registerSpringFormCheckboxes02(Model model)
	 * { log.info("registerSpringFormCheckboxes02");
	 * 
	 * List<CodeLabelValue> hobbyCodeList = new ArrayList<CodeLabelValue>();
	 * hobbyCodeList.add(new CodeLabelValue("01", "Sports")); hobbyCodeList.add(new
	 * CodeLabelValue("02", "Music")); hobbyCodeList.add(new CodeLabelValue("03",
	 * "Movie"));
	 * 
	 * model.addAttribute("hobbyCodeList", hobbyCodeList);
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerSpringFormCheckboxes02"; }
	 * 
	 * // ?????? ??????
	 * 
	 * @RequestMapping(value = "/register", method = RequestMethod.POST) public
	 * String register(Member member, Model model) { log.info("register");
	 * 
	 * List<String> hobbyList = member.getHobbyList();
	 * 
	 * if(hobbyList != null) { log.info("hobbyList != null = " + hobbyList.size());
	 * 
	 * for(int i = 0; i< hobbyList.size(); i++) { log.info("hobbyList(" + i + ") = "
	 * + hobbyList.get(i)); } } else { log.info("hobbyList == null"); }
	 * 
	 * model.addAttribute("hobbyList", hobbyList);
	 * 
	 * return "checkboxesResult"; }
	 */

	/*
	 * @RequestMapping(value = "/registerSpringFormCheckbox01", method =
	 * RequestMethod.GET) public String registerSpringFormCheckbox01(Model model) {
	 * log.info("registerSpringFormCheckbox01");
	 * 
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerSpringFormCheckbox"; }
	 * 
	 * @RequestMapping(value = "/registerSpringFormCheckbox02", method =
	 * RequestMethod.GET) public String registerSpringFormCheckbox02(Model model) {
	 * log.info("registerSpringFormCheckbox02");
	 * 
	 * Member member = new Member();
	 * 
	 * member.setDeveloper("Y"); member.setForeigner(true);
	 * member.setHobby("Movie");
	 * 
	 * String[] hobbyArray = {"Music", "Movie"};
	 * 
	 * member.setHobbyArray(hobbyArray);
	 * 
	 * List<String> hobbyList = new ArrayList<String>(); hobbyList.add("Music");
	 * hobbyList.add("Movie");
	 * 
	 * member.setHobbyList(hobbyList);
	 * 
	 * model.addAttribute("member", member);
	 * 
	 * return "registerSpringFormCheckbox"; }
	 * 
	 * // ?????? ??????
	 * 
	 * @RequestMapping(value = "/register", method = RequestMethod.POST) public
	 * String register(Member member, Model model) { log.info("register");
	 * 
	 * log.info("member.isForeigner = " + member.isForeigner());
	 * log.info("member.getDeveloper = " + member.getDeveloper());
	 * log.info("member.getHobby = " + member.getHobby());
	 * 
	 * String[] hobbyArray = member.getHobbyArray();
	 * 
	 * if(hobbyArray != null) { log.info("hobbyArray != null = " +
	 * hobbyArray.length);
	 * 
	 * for(int i = 0; i < hobbyArray.length; i++) { log.info("hobbyArray[" + i +
	 * "] = " + hobbyArray[i]); } } else { log.info("hobbyArray == null"); }
	 * 
	 * List<String> hobbyList = member.getHobbyList();
	 * 
	 * if(hobbyList != null) { log.info("hobbyList != null = " + hobbyList.size());
	 * 
	 * for(int i = 0; i < hobbyList.size(); i++) { log.info("hobbyList[" + i +
	 * "] = " + hobbyList.get(i)); } } else { log.info("hobbyList == null"); }
	 * 
	 * model.addAttribute("member", member);
	 * 
	 * return "checkboxResult"; }
	 */

	/*
	 * @RequestMapping(value = "/registerSpringFormRadiobuttons01", method =
	 * RequestMethod.GET) public String registerSpringFormRadiobuttons01(Model
	 * model) { log.info("registerSpringFormRadiobuttons01");
	 * 
	 * Map<String, String> genderCodeMap = new HashMap<String, String>();
	 * genderCodeMap.put("01", "Male"); genderCodeMap.put("02", "Female");
	 * genderCodeMap.put("03", "Other");
	 * 
	 * model.addAttribute("genderCodeMap", genderCodeMap);
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerSpringFormRadiobuttons01"; }
	 * 
	 * @RequestMapping(value = "/registerSpringFormRadiobuttons02", method =
	 * RequestMethod.GET) public String registerSpringFormRadiobuttons02(Model
	 * model) { log.info("registerSpringFormRadiobuttons02");
	 * 
	 * List<CodeLabelValue> genderCodeList = new ArrayList<CodeLabelValue>();
	 * genderCodeList.add(new CodeLabelValue("01", "Male")); genderCodeList.add(new
	 * CodeLabelValue("02", "Female")); genderCodeList.add(new CodeLabelValue("03",
	 * "Other"));
	 * 
	 * model.addAttribute("genderCodeList", genderCodeList);
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerSpringFormRadiobuttons02"; }
	 * 
	 * // ?????? ??????
	 * 
	 * @RequestMapping(value = "/register", method = RequestMethod.POST) public
	 * String register(Member member, Model model) { log.info("register");
	 * 
	 * log.info("member.getGender() = " + member.getGender());
	 * 
	 * model.addAttribute("gender", member.getGender());
	 * 
	 * return "radiobuttonsResult"; }
	 */

	/*
	 * @RequestMapping(value = "/registerSpringFormRadiobutton01", method =
	 * RequestMethod.GET) public String registerSpringFormRadiobutton01(Model model)
	 * { log.info("registerSpringFormRadiobutton01");
	 * 
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerSpringFormRadiobutton"; }
	 * 
	 * @RequestMapping(value = "/registerSpringFormRadiobutton02", method =
	 * RequestMethod.GET) public String registerSpringFormRadiobutton02(Model model)
	 * { log.info("registerSpringFormRadiobutton02");
	 * 
	 * Member member = new Member();
	 * 
	 * member.setGender("female"); model.addAttribute("member", member);
	 * 
	 * return "registerSpringFormRadiobutton"; }
	 * 
	 * @RequestMapping(value = "/register", method = RequestMethod.POST) public
	 * String register(Member member, Model model) { log.info("register");
	 * 
	 * log.info("member.getGender() = " + member.getGender());
	 * 
	 * model.addAttribute("member", member);
	 * 
	 * return "radiobuttonResult"; }
	 */

	/*
	 * @RequestMapping(value = "/registerSpringFormSelect01", method =
	 * RequestMethod.GET) public String registerSpringFormSelect01(Model model) {
	 * log.info("registerSpringFormSelect01");
	 * 
	 * Map<String, String> nationalityCodeMap = new HashMap<String, String>();
	 * nationalityCodeMap.put("01", "Korea"); nationalityCodeMap.put("02",
	 * "Germany"); nationalityCodeMap.put("03", "Australia");
	 * 
	 * model.addAttribute("nationalityCodeMap", nationalityCodeMap);
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerSpringFormSelect01"; }
	 * 
	 * @RequestMapping(value = "/registerSpringFormSelect02", method =
	 * RequestMethod.GET) public String registerSpringFormSelect02(Model model) {
	 * log.info("registerSpringFormSelect02");
	 * 
	 * List<CodeLabelValue> nationalityCodeList = new ArrayList<CodeLabelValue>();
	 * nationalityCodeList.add(new CodeLabelValue("01", "Korea"));
	 * nationalityCodeList.add(new CodeLabelValue("02", "Germany"));
	 * nationalityCodeList.add(new CodeLabelValue("03", "Australia"));
	 * 
	 * model.addAttribute("nationalityCodeList", nationalityCodeList);
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerSpringFormSelect02"; }
	 * 
	 * @RequestMapping(value = "/registerSpringFormSelect03", method =
	 * RequestMethod.GET) public String registerSpringFormSelect03(Model model) {
	 * log.info("registerSpringFormSelect03");
	 * 
	 * Map<String, String> carCodeMap = new HashMap<String, String>();
	 * carCodeMap.put("01", "Volvo"); carCodeMap.put("02", "Saab");
	 * carCodeMap.put("03", "Opel");
	 * 
	 * model.addAttribute("carCodeMap", carCodeMap); model.addAttribute("member",
	 * new Member());
	 * 
	 * return "registerSpringFormSelect03"; }
	 * 
	 * @RequestMapping(value = "/registerSpringFormSelect04", method =
	 * RequestMethod.GET) public String registerSpringFormSelect04(Model model) {
	 * log.info("registerSpringFormSelect04");
	 * 
	 * List<CodeLabelValue> carCodeList = new ArrayList<CodeLabelValue>();
	 * carCodeList.add(new CodeLabelValue("01", "Volvo")); carCodeList.add(new
	 * CodeLabelValue("02", "Saab")); carCodeList.add(new CodeLabelValue("03",
	 * "Opel"));
	 * 
	 * model.addAttribute("carCodeList", carCodeList); model.addAttribute("member",
	 * new Member());
	 * 
	 * return "registerSpringFormSelect04"; }
	 * 
	 * @RequestMapping(value = "/registerSpringFormSelect05", method =
	 * RequestMethod.GET) public String registerSpringFormSelect05(Model model) {
	 * log.info("registerSpringFormSelect05");
	 * 
	 * List<CodeLabelValue> carCodeList = new ArrayList<CodeLabelValue>();
	 * carCodeList.add(new CodeLabelValue("01", "Volvo")); carCodeList.add(new
	 * CodeLabelValue("02", "Saab")); carCodeList.add(new CodeLabelValue("03",
	 * "Opel"));
	 * 
	 * model.addAttribute("carCodeList", carCodeList); model.addAttribute("member",
	 * new Member());
	 * 
	 * return "registerSpringFormSelect05"; }
	 * 
	 * // ?????? ??????
	 * 
	 * @RequestMapping(value = "/register", method = RequestMethod.POST) public
	 * String register(Member member, Model model) { log.info("register");
	 * 
	 * log.info("member.getNationality() = " + member.getNationality());
	 * 
	 * model.addAttribute("nationality", member.getNationality());
	 * 
	 * return "selectResult"; }
	 * 
	 * // ?????? ??????2
	 * 
	 * @RequestMapping(value = "/register2", method = RequestMethod.POST) public
	 * String register2(Member member, Model model) { log.info("register2");
	 * 
	 * List<String> carList = member.getCarList();
	 * 
	 * if (carList != null) { log.info("carList != null = " + carList.size()); for
	 * (int i = 0; i < carList.size(); i++) { log.info("carList(" + i + ") = " +
	 * carList.get(i)); } } else { log.info("carList == null"); }
	 * 
	 * model.addAttribute("carList", member.getCarList());
	 * 
	 * return "selectResult2"; }
	 */

	/*
	 * @RequestMapping(value = "/registerSpringFormHidden", method =
	 * RequestMethod.GET) public String registerSpringFormHidden(Model model) {
	 * log.info("registerSpringFormHidden");
	 * 
	 * Member member = new Member();
	 * 
	 * member.setUserId("hong"); member.setUserName("?????????");
	 * 
	 * model.addAttribute("member", member);
	 * 
	 * return "registerSpringFormHidden"; }
	 * 
	 * @RequestMapping(value = "/register", method = RequestMethod.POST) public
	 * String register(Member member) { log.info("register");
	 * 
	 * log.info("member.getUserId() = " + member.getUserId());
	 * log.info("member.getUserName() = " + member.getUserName());
	 * 
	 * return "hiddenResult"; }
	 */

	/*
	 * @RequestMapping(value = "/registerSpringFormErrors", method =
	 * RequestMethod.GET) public String registerSpringFormErrors(Model model) {
	 * log.info("registerSpringFormErrors");
	 * 
	 * Member member = new Member();
	 * 
	 * member.setEmail("aaa@ccc.com"); member.setUserName("?????????");
	 * 
	 * model.addAttribute("member", member);
	 * 
	 * return "registerSpringFormErrors"; }
	 * 
	 * @RequestMapping(value = "/register", method = RequestMethod.POST) public
	 * String register(@Validated Member member, BindingResult result) {
	 * log.info("register");
	 * 
	 * // ?????? ?????? if(result.hasErrors()) { return "registerSpringFormErrors"; }
	 * 
	 * log.info("member.getUserId() = " + member.getUserId());
	 * log.info("member.getUserName() = " + member.getUserName());
	 * log.info("member.getEmail() = " + member.getEmail());
	 * 
	 * return "errorsResult"; }
	 */

	/*
	 * // ????????? ????????? ??? ????????? ???????????? @Vaildated??? ????????????.
	 * 
	 * @RequestMapping(value = "/registerValidation", method = RequestMethod.POST)
	 * public String registerValidation(@Validated Member member, BindingResult
	 * result) { log.info("registerValidation");
	 * 
	 * if(result.hasErrors()) { return "registerValidationForm"; }
	 * 
	 * log.info("member.getUserId() = " + member.getUserId());
	 * log.info("member.getGender() = " + member.getGender());
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerValidationForm01", method =
	 * RequestMethod.GET) public String registerValidationForm01(Model model) {
	 * log.info("registerValidationForm01");
	 * 
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerValidationForm"; }
	 * 
	 * @RequestMapping(value = "/registerValidationForm02", method =
	 * RequestMethod.GET) public String registerValidationForm02(Model model) {
	 * log.info("registerValidationForm02");
	 * 
	 * Member member = new Member();
	 * 
	 * member.setPassword("1234"); member.setEmail("aaa@ccc.com");
	 * member.setUserName("?????????"); member.setGender("female");
	 * 
	 * model.addAttribute("member", member);
	 * 
	 * return "registerValidationForm"; }
	 */

	/*
	 * // ????????? ????????? ??? ????????? ???????????? @Vaildated??? ????????????.
	 * 
	 * @RequestMapping(value = "/registerValidation2", method = RequestMethod.POST)
	 * public String registerValidation2(@Validated Member member, BindingResult
	 * result) { log.info("registerValidation2");
	 * 
	 * // ????????? ?????? ????????? ????????? ?????? true??? ????????????. log.info("result.hasErrors() = " +
	 * result.hasErrors());
	 * 
	 * // ????????? ?????? ??? BindingResult??? ???????????? ???????????? ???????????? ?????? ????????? ????????????. if(result.hasErrors())
	 * { List<ObjectError> allErrors = result.getAllErrors(); List<ObjectError>
	 * globalerrErrors = result.getGlobalErrors(); List<FieldError> fieldErrors =
	 * result.getFieldErrors();
	 * 
	 * log.info("allErrors.size() = " + allErrors.size());
	 * log.info("globalerrErrors.size() = " + globalerrErrors.size());
	 * log.info("fieldErrors.size() = " + fieldErrors.size());
	 * 
	 * for(int i = 0; i < allErrors.size(); i++) { ObjectError objectError =
	 * allErrors.get(i); log.info("allError = " + objectError); }
	 * 
	 * for(int i = 0; i < fieldErrors.size(); i++) { FieldError fieldError =
	 * fieldErrors.get(i);
	 * 
	 * log.info("fieldError = " + fieldError);
	 * log.info("fieldError.getDefaultMessage() = " +
	 * fieldError.getDefaultMessage()); } return "registerValidation2Form"; }
	 * 
	 * log.info("member.getUserId() = " + member.getUserId());
	 * log.info("member.getGender() = " + member.getGender());
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerValidation2Form01", method =
	 * RequestMethod.GET) public String registerValidation2Form01(Model model) {
	 * log.info("registerValidation2Form01");
	 * 
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerValidation2Form"; }
	 * 
	 * @RequestMapping(value = "/registerValidation2Form02", method =
	 * RequestMethod.GET) public String registerValidation2Form02(Model model) {
	 * log.info("registerValidation2Form02");
	 * 
	 * Member member = new Member();
	 * 
	 * member.setPassword("1234"); member.setEmail("aaa@ccc.com");
	 * member.setUserName("?????????");
	 * 
	 * member.setGender("female");
	 * 
	 * Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR, 1988);
	 * cal.set(Calendar.MONTH, 10); cal.set(Calendar.DAY_OF_MONTH, 7);
	 * 
	 * member.setDateOfBirth(cal.getTime());
	 * 
	 * model.addAttribute("member", member);
	 * 
	 * return "registerValidation2Form"; }
	 */

	/*
	 * // ????????? ????????? ??? ????????? ???????????? @Vaildated??? ????????????.
	 * 
	 * @RequestMapping(value = "/registerValidation3", method = RequestMethod.POST)
	 * public String registerValidation3(@Validated Member member, BindingResult
	 * result) { log.info("registerValidation3");
	 * 
	 * // ????????? ?????? ????????? ????????? ?????? true??? ????????????. log.info("result.hasErrors() = " +
	 * result.hasErrors());
	 * 
	 * // ????????? ?????? ??? BindingResult??? ???????????? ???????????? ???????????? ?????? ????????? ????????????. if
	 * (result.hasErrors()) { List<ObjectError> allErrors = result.getAllErrors();
	 * List<ObjectError> globalerrErrors = result.getGlobalErrors();
	 * List<FieldError> fieldErrors = result.getFieldErrors();
	 * 
	 * log.info("allErrors.size() = " + allErrors.size());
	 * log.info("globalerrErrors.size() = " + globalerrErrors.size());
	 * log.info("fieldErrors.size() = " + fieldErrors.size());
	 * 
	 * for (int i = 0; i < allErrors.size(); i++) { ObjectError objectError =
	 * allErrors.get(i); log.info("allError = " + objectError); }
	 * 
	 * for (int i = 0; i < globalerrErrors.size(); i++) { ObjectError objectError =
	 * globalerrErrors.get(i); log.info("globalerrErrors = " + objectError); }
	 * 
	 * for (int i = 0; i < fieldErrors.size(); i++) { FieldError fieldError =
	 * fieldErrors.get(i);
	 * 
	 * log.info("fieldError = " + fieldError);
	 * log.info("fieldError.getDefaultMessage() = " +
	 * fieldError.getDefaultMessage()); } return "registerValidation3Form"; }
	 * 
	 * log.info("member.getUserId() = " + member.getUserId());
	 * log.info("member.getGender() = #" + member.getGender() + "#");
	 * 
	 * return "success"; }
	 * 
	 * @RequestMapping(value = "/registerValidation3Form01", method =
	 * RequestMethod.GET) public String registerForm01(Model model) {
	 * log.info("registerValidation3Form01");
	 * 
	 * model.addAttribute("member", new Member());
	 * 
	 * return "registerValidation3Form"; }
	 * 
	 * @RequestMapping(value = "/registerValidation3Form02", method =
	 * RequestMethod.GET) public String registerForm02(Model model) {
	 * log.info("registerValidation3Form02");
	 * 
	 * Member member = new Member();
	 * 
	 * member.setPassword("1234"); member.setEmail("aaa@ccc.com");
	 * member.setUserName("?????????");
	 * 
	 * member.setGender("female");
	 * 
	 * Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR, 1988);
	 * cal.set(Calendar.MONTH, 10); cal.set(Calendar.DAY_OF_MONTH, 7);
	 * 
	 * member.setDateOfBirth(cal.getTime());
	 * 
	 * model.addAttribute("member", member);
	 * 
	 * return "registerValidation3Form"; }
	 */

	// ????????? ????????? ??? ????????? ???????????? @Vaildated??? ????????????.
	@RequestMapping(value = "/registerValidation4", method = RequestMethod.POST)
	public String registerValidation4(@Validated Member member, BindingResult result) {
		log.info("registerValidation4");

		if (result.hasErrors()) {
			return "registerValidation4Form";
		}

		log.info("member.getUserId() = " + member.getUserId());
		log.info("member.getGender() = #" + member.getGender() + "#");

		Address address = member.getAddress();

		if (address != null) {
			log.info("address != null address.getPostCode() = " + address.getPostCode());
			log.info("address != null address.getLocation() = " + address.getLocation());
		} else {
			log.info("address == null");
		}

		List<Card> cardList = member.getCardList();

		if (cardList != null) {
			log.info("cardList != null = " + cardList.size());
			for (int i = 0; i < cardList.size(); i++) {
				Card card = cardList.get(i);
				log.info("card.getNo() = " + card.getNo());
				log.info("card.getValidMonth() = " + card.getValidMonth());
			}
		} else {
			log.info("cardList == null");
		}

		return "success";
	}

	@RequestMapping(value = "/registerValidation4Form01", method = RequestMethod.GET)
	public String registerForm01(Model model) {
		log.info("registerValidation4Form01");

		model.addAttribute("member", new Member());

		return "registerValidation4Form";
	}

	@RequestMapping(value = "/registerValidation4Form02", method = RequestMethod.GET)
	public String registerForm02(Model model) {
		log.info("registerValidation4Form02");

		Member member = new Member();

		member.setPassword("1234");
		member.setEmail("aaa@ccc.com");
		member.setUserName("?????????");

		Address address = new Address();
		
		address.setPostCode("080908");
		address.setLocation("seoul");
		
		member.setAddress(address);
		
		List<Card> cardList = new ArrayList<Card>();
		
		Card card1 = new Card();
		card1.setNo("123456");
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 9);
		cal.set(Calendar.DAY_OF_MONTH, 8);
		
		card1.setValidMonth(cal.getTime());
		
		cardList.add(card1);
		
		Card card2 = new Card();
		card2.setNo("456786");
		
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DAY_OF_MONTH, 4);
		
		card2.setValidMonth(cal.getTime());
		
		cardList.add(card2);
		
		member.setCardList(cardList);
		
		cal.set(Calendar.YEAR, 1988);
		cal.set(Calendar.MONTH, 10);
		cal.set(Calendar.DAY_OF_MONTH, 7);

		member.setDateOfBirth(cal.getTime());

		model.addAttribute("member", member);

		return "registerValidation4Form";
	}

}
