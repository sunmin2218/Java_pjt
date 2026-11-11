package com.office.member;

public class MemberDto {
	
	private String memId;
	private String memPw;
	private String memMail;
	private String memPhone;
	// private boolean active = true;
	// 과제 - 논리적 탈퇴를 선호하니까 이걸 추가해서 써보자
	// 멤버 DB를 따로 탈퇴한 회원용을 만들고 거기다 계정을 옮길 수도 있다
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String memId, String memPw, String memMail, String memPhone) {
		super();
		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
		this.memPhone = memPhone;
	}
	
	

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemMail() {
		return memMail;
	}

	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	
	
	
	
	

}
