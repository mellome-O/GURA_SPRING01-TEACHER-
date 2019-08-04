package com.gura.spring01.friend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring01.friend.dao.FriendDao;
import com.gura.spring01.friend.dto.FriendDto;

@Service
public class FriendServiceImpl implements FriendService{
	//의존객체 주입 받기 
	@Autowired
	private FriendDao friendDao;
	
	@Override
	public void getList(ModelAndView mView) {
		//친구 목록을 얻어와서 
		List<FriendDto> list=friendDao.getList();
		//ModelAndView 객체에 담는다.
		mView.addObject("list", list);
	}

	@Override
	public void insert(FriendDto dto) {
		friendDao.insert(dto);
	}

	@Override
	public void delete(int num) {
		friendDao.delete(num);
	}

	@Override
	public void getData(int num, ModelAndView mView) {
		//Dao를 이용해서 수정할 친구의 정보를 얻어온다.
		FriendDto dto = friendDao.getData(num);
		//ModelAndView 객체에 담아 놓는다.
		mView.addObject("dto",dto);
		
	}

	@Override
	public void update(FriendDto dto) {
		friendDao.update(dto);
		
	}

}










