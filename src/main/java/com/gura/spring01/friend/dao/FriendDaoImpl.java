package com.gura.spring01.friend.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gura.spring01.friend.dto.FriendDto;

@Repository
public class FriendDaoImpl implements FriendDao{
	//의존객체 주입(Dependency Injection) 받기
	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(FriendDto dto) {
		/*
		 *  mapper.xml 의 namespace => friend
		 *  해당 mapper 안에 있는 sql 의 id => insert
		 *  ParameterType => FriendDto  
		 */
		session.insert("friend.insert", dto);
	}

	@Override
	public void update(FriendDto dto) {
		session.update("friend.update", dto);
	}

	@Override
	public void delete(int num) {
		session.delete("friend.delete", num);
	}
	//회원 한명의 정보를 select 해서 리턴하는 메소드 
	@Override
	public FriendDto getData(int num) {
		/*
		 *   mapper namespace => friend
		 *   sql id => getData
		 *   parameterType => int
		 *   resultType => FriendDto
		 */
		FriendDto dto=session.selectOne("friend.getData", num);
		return dto;
	}
	//회원 목록을 리턴하는 메소드
	@Override
	public List<FriendDto> getList() {
		List<FriendDto> list=session.selectList("friend.getList");
		return list;
	}

}








