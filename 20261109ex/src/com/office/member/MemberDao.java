package com.office.member;

import java.util.HashMap;

import com.office.db.DiaryDb;

public class MemberDao {

	final private DiaryDb diaryDb;
	
	public MemberDao(DiaryDb diaryDb) {
		this.diaryDb = diaryDb;
		
	}

	public boolean isMember(String memId) {
		
		HashMap<String, MemberDto> members = diaryDb.getMembers();
		MemberDto memberDto = members.get(memId);
		
		return memberDto != null ? true : false;
	}

	public int insertMember(MemberDto memberDto) {
		HashMap<String, MemberDto> members = diaryDb.getMembers();
		// 해쉬맵 안의 구조 심화
		// 반환이 될 때 이전에 있던 값이 반환된다
		
		members.put(memberDto.getMemId(), memberDto);
		// 일단 이렇게 값을 밀어넣고
		return members.get(memberDto.getMemId()) != null 
				? 
				MemberService.SIGN_UP_SUCCESS 
				: 
				MemberService.SIGN_UP_FAIL;
		
	}

	public MemberDto selectMemberByMemId(String memId) {
		
		HashMap<String, MemberDto> members = diaryDb.getMembers();
		
		return members.get(memId) != null ? members.get(memId) : null;
	}

	
	
}