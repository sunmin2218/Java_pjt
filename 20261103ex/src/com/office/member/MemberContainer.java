package com.office.member;

public class MemberContainer {
	
	final private MemberDao memberDao = new MemberDao();
	final private MemberService memberService = new MemberService(memberDao);
	final private MemberController memberController = new MemberController(memberService);
	
	
	
	private static MemberContainer memberContainer;
	
	private MemberContainer() {}
	
	public static MemberContainer getInstance() {
		if (memberContainer == null) {
			memberContainer = new MemberContainer();
		}
		
		return memberContainer;
	}
	

	public MemberController getMemberController() {
		return memberController;
	}    // 게터만 있어서 가져갈 수는 있으나 세터는 없어서 데이터 수정을 하지 못한다
	// 근데 멤버 컨트롤이 여기 안에서는 수정할 수 있으니 아예 final 로 상수로 만들어 버린다
  // 멤버서비스랑 멤버다오도 게터만 생성
	public MemberService getMemberService() {
		return memberService;
	}

	public MemberDao getMemberDao() {
		return memberDao;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
