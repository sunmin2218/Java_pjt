package com.office.member;

import java.util.Scanner;

public class MemberService {
	
	// 속성
	MemberDB db;
	
	// 생성자 
    public MemberService(MemberDB memberDB) {
    	this.db = memberDB;
		
	}	
	
	// 메서드
	/*
	 * 회원 가입
	 */
	public void doSignUp(Scanner scanner) {
		
		System.out.println("Input new member ID");
		String memberId = scanner.next();
		
		// Member IdJungbok = MemberDB.get(memberId); // 가입된 멤버들의 아이디 가져오기
		// if (memberId != memberDB.get(memberId)) {
		// 가져온 멤버들의 아이디가 입력된 아이디랑 다르다면 아래 진행
			
			System.out.println("Input new member PW, 비밀번호는 8~12 문자로 표현");
			String memberPw = scanner.next();
			
			System.out.println("Input new member MAIL");
			String memberMail = scanner.next();
			
			System.out.println("Input new member PHONE");
			String memberPhone = scanner.next();
			
			Member member = new Member(memberId, memberPw, memberMail, memberPhone);
//			MemberDB db = new MemberDB();
			
			db.memberDB.put(memberId, member);
			
			db.memberDB.get(memberId).printInfo();
			
//		} else {
//			System.out.println("이 아이디는 이미 있는 아이디입니다");
//		}
		
		/*
		 * 과제: ID 중복 체크 기능 추가
		 * 과제: 비밀번호는 8~12 문자로 표현
		 */
		
	}
	
	/*
	 * 로그인
	 */
	public void doSignIn(Scanner scanner) {
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
//		MemberDB db = new MemberDB();
		Member searchedMember = db.memberDB.get(memberId);
		
		// searchedMember: Member or null
		if (searchedMember != null) {
			
			if (searchedMember.memberPw.equals(memberPw)) {
				System.out.println("1.SIGN-IN SUCCESESS!!");
			} else {
				System.out.println("2.SIGN-IN FAIL!!");
			}
			
		} else {
			System.out.println("3.SIGN-IN FAIL!!");
		}
	}
	    /*
		 * 과제: 로그인 실패가 3회 초과이면 시스템 종료
		 * systemFlag 를 트루에서 폴스로 어떻게든 만들어야 하는데
		 * boolean 기초 데이터 타입을 클래스화 시켜서 다른 클래스에서도 쓸 수 있도록 하면 된다
		 */
	
	
	
	/*
	 * 정보 수정
	 */
	public void doModify(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		System.out.println("Input member MAIL");
		String memberMail = scanner.next();
		
		System.out.println("Input member PHONE");
		String memberPhone = scanner.next();
		
		Member searchedMember = db.memberDB.get(memberId);
		searchedMember.memberPw = memberPw;
		searchedMember.memberMail = memberMail;
		searchedMember.memberPhone = memberPhone;
		
		searchedMember = db.memberDB.get(memberId);
		searchedMember.printInfo();
		
//		System.out.println(searchedMember.memberId);
//		System.out.println(searchedMember.memberPw);
//		System.out.println(searchedMember.memberMail);
//		System.out.println(searchedMember.memberPhone);
		
		/*
		 * 과제: Modify 기능 추가하기
		 * ID, PW 인증 -> ok -> 정보 수정
		 */
		
		
	}
	
	/*
	 * 회원 탈퇴
	 */
	public void doDelete(Scanner scanner) {
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		Member searchedMember = db.memberDB.get(memberId);
		
		if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
			db.memberDB.remove(memberId);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
