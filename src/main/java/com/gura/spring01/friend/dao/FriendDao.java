package com.gura.spring01.friend.dao;

import java.util.List;

import com.gura.spring01.friend.dto.FriendDto;

public interface FriendDao {
	//회원 한명의 정보를 추가 하는 메소드의 형태 정의
	public void insert(FriendDto dto);
	//회원 한명의 정보를 수정하는 메소드
	public void update(FriendDto dto);
	//회원 한명의 정보를 삭제하는 메소드
	public void delete(int num);
	//회원 한명의 정보를 리턴하는 메소드
	public FriendDto getData(int num);
	//회원 목록을 리턴하는 메소드
	public List<FriendDto> getList();
}






