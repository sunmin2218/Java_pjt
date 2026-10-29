package com.office.member;

public class MemberDumy {
	
	// 속성 
	MemberDB db;
	
	
	// 생성자
	public MemberDumy(MemberDB memberDB) {
		this.db = memberDB;
	}
	
	// 메서드
	public void initMemberDumyData() {
		
		System.out.println("initMemberDumyData()");
		
		// 아이디, 비밀번호, 메일, 연락처
		String[] memberIDs = {"gildong", "chanho", "saeri"};
		String[] memberPWs = {"1234", "5678", "9012"};
		String[] memberMAILs = {"gildong@gmail.com", "chanho@gmail.com", "saeri@gmail.com"};
		String[] memberPHONEs = {"010-1234", "010-5678", "010-9012"};
		
		for(int i = 0; i < memberIDs.length; i++) {
			
			Member member = new Member(memberIDs[i], memberPWs[i], memberMAILs[i], memberPHONEs[i]);
			db.memberDB.put(memberIDs[i], member);
			
		}
		
	}

}
