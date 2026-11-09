package com.office.member;

public class MemberService {

	final private MemberDao memberDao;
	
	final public static int SIGN_UP_FAIL    = 0;
	final public static int SIGN_UP_SUCCESS = 1;
	// 이 상수는 서비스에 있는게 그나마 맞다
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
		
	}

	public int signUp(MemberDto memberDto) {
		
		// 아이디 중복체크, 회원가입
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		if (!isMember) {
			return memberDao.insertMember(memberDto);
			
		} else {
			return SIGN_UP_FAIL;
		}
	}

	public MemberDto signIn(MemberDto memberDto) {
		
		MemberDto selectedMemberDto = 
				memberDao.selectMemberByMemId(memberDto.getMemId());
		
		if (selectedMemberDto != 
				null && 
				selectedMemberDto.getMemPw().equals(memberDto.getMemPw())) {
			    return selectedMemberDto;
		} else {
			return null;
		}
		
	}
	
}