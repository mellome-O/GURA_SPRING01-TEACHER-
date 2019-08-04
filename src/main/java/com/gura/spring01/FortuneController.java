package com.gura.spring01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FortuneController {
	
	@RequestMapping("/fortune")
	public ModelAndView fortune(ModelAndView mView) {
		//Model 
		String fortuneToday="동쪽으로 가면 귀인을 만나요";
		
		mView.addObject("fortuneToday", fortuneToday);
		mView.setViewName("fortune");
		return mView;
	}
}













