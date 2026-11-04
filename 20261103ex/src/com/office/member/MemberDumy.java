package com.office.member;

public class MemberDumy {

	private String[] memIds = {"gildong", "chanho"};
	private String[] memPws = {"1234", "1212"};
	private String[] memMails = {"gildong@gmail.com", "chanho@gmail.com"};
	private String[] memPhones = {"010-1234", "010-1212"};
	
	public void signUpForDumy(MemberService memberService) {
		
		for (int i = 0; i < memIds.length; i++) {
			MemberDto memberDto = 
					new MemberDto(
					    memIds[i], 
					    memPws[i],
					    memMails[i],
					    memPhones[i]);
			
		memberService.signUp(memberDto);
		
		}
	}	
}
