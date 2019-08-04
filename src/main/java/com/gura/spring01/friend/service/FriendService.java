package com.gura.spring01.friend.service;

import org.springframework.web.servlet.ModelAndView;

import com.gura.spring01.friend.dto.FriendDto;

public interface FriendService {
	public void getList(ModelAndView mView);
	public void insert(FriendDto dto);
	public void delete(int num);
	public void getData(int num, ModelAndView mView);
	public void update(FriendDto dto);
}
