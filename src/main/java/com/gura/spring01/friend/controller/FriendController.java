package com.gura.spring01.friend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring01.friend.dto.FriendDto;
import com.gura.spring01.friend.service.FriendService;

/*	[요청명]
 *  /member/list.do
 *  /member/insertform.do
 *  /member/insert.do
 *  /member/updateform.do
 *  /member/update.do
 *  /member/delete.do
 *  [view page]
 *  /member/list.jsp
 *  /member/insertform.jsp
 *  /member/insert.jsp
 *  /member/updateform.jsp
 *  /member/update.jsp
 *  /member/delete.jsp
 */

@Controller
public class FriendController {
	//의존객체 주입 받기
	@Autowired
	private FriendService friendService;
	
	//친구정보 수정 반영 요청처리
	@RequestMapping("/friend/update")
	public String update(@ModelAttribute FriendDto dto) {
		friendService.update(dto);
		return "friend/update";
	}
	
	//친구정보 수정 폼 요청처리
	@RequestMapping("/friend/updateform")
	public ModelAndView updateForm(@RequestParam int num,
			ModelAndView mView) { //키는 지역변수에 담아둠
		friendService.getData(num, mView); //번호와 담을 그릇 //객체지향 : 객체의 참조값 = 사물함 키 값 ,키를 돌려받을 필요는 없다 
											//->최종적으로 뷰페이지정보(키)는 스프링프레임워크가 받는다
		mView.setViewName("friend/updateform");
		return mView; //frienddto 가 담긴 dto라는 키 값
	}
	
	//친구정보 삭제 요청 처리
	@RequestMapping("/friend/delete")
	public String delete(@RequestParam int num) {
		friendService.delete(num);
		return "redirect:/friend/list.do";
	}
	
	//친구 추가 요청처리
//	@RequestMapping("/friend/insert")
//	public ModelAndView insert(HttpServletRequest request) {
//		String name=request.getParameter("name");
//		String addr=request.getParameter("addr");
//		return null;
//	}
	
//	@RequestMapping("/friend/insert")
//	public ModelAndView insert(@RequestParam String name,
//			@RequestParam String addr) {
//		
//		return null;
//	}
	
	@RequestMapping("/friend/insert")
	public ModelAndView insert(@ModelAttribute FriendDto dto,
			ModelAndView mView) {
		//서비스 객체를 이용해서 DB 에 저장
		friendService.insert(dto);
		mView.setViewName("friend/insert");
		return mView;
	}
	
	@RequestMapping("/friend/insertform")
	public ModelAndView insertform(ModelAndView mView) {
		mView.setViewName("friend/insertform");
		return mView;
	}
	
	//아래와 같이 처리할수도 있다.
//	@RequestMapping("/friend/insertform")
//	public String insertform() {
//		
//		return "friend/insertform";
//	}
	
	
	@RequestMapping("/friend/list")
	public ModelAndView list(ModelAndView mView) {
		//서비스를 이용해서 비즈니스로직 수행하고 
		friendService.getList(mView);
		//view page 정보를 ModelAndView 객체에 담고 
		mView.setViewName("friend/list");
		//ModelAndView 객체를 리턴해준다. 
		return mView;
	}
}








