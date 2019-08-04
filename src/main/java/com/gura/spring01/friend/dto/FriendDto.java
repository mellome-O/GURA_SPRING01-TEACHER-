package com.gura.spring01.friend.dto;
//회원 한명의 정보를 담을 Dto 클래스 정의하기
public class FriendDto {
	private int num;
	private String name;
	private String addr;
	
	public FriendDto() {}

	public FriendDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
