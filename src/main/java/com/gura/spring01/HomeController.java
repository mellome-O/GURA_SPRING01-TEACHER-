package com.gura.spring01;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // Controller 를 만들기 위한 어노테이션
public class HomeController {
	
	@RequestMapping("/home")
	public String home(HttpServletRequest request) {
		//view page 에 전달할 Model 이라고 가정하자
		List<String> notice=new ArrayList<String>();
		notice.add("장마철입니다.");
		notice.add("우산을 잘 챙기세요.");
		notice.add("어쩌구...");
		notice.add("저쩌구...");
		
		//view 페이지에 전달할 모델을 request 에 "notice" 라는 키값으로 담는다.
		request.setAttribute("notice", notice);
		
		// WEB-INF/views/home.jsp 페이지로 forward 이동해서 응답
		return "home";
	}
	
	//아래코드는 위의 코드와 동일하게 동작한다.
	public ModelAndView home2(ModelAndView mView) {
		//ModelAndView mView=new ModelAndView();
		
		List<String> notice=new ArrayList<String>();
		notice.add("장마철입니다.");
		notice.add("우산을 잘 챙기세요.");
		notice.add("어쩌구...");
		notice.add("저쩌구...");
		// request 에 담을 내용을 ModelAndView 객체에 담고
		mView.addObject("notice", notice);
		// view page 의 정보도 ModelAndView 객체에 담아서 
		mView.setViewName("home");
		
		//리턴해주면 된다. 
		return mView;
	}
}



















