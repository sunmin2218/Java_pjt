package com.office.member;

public class MemberDto {
	
	private String memId;	
	private String memPw;	
	private String memMail;	
	private String memPhone;
	
    public MemberDto() {
		
	}
	
	
	public MemberDto(String memId, String memPw, String memMail, String memPhone) {
		super();
		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
		this.memPhone = memPhone;
	}
	
	public MemberDto(String memId, String memPw, String memMail) {
		super();
		this.memId = memId;
		this.memPw = memPw;
		this.memMail = memMail;
	} 
	// 폰 넘버를 안받는 경우를 이렇게 점층적 오버로딩을 통해 만들 수도 있으나, 
	// 그냥 디폴트 생성자 하나 만들자
	
    
    
	
    // 그리고 게터 세터 생성 (자동 생성 기능)
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