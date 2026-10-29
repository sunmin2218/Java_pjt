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
		
		while (true) {
			Member member = db.memberDB.get(memberId);
			if (member != null) {
				System.out.println("Input new member ID");
				memberId = scanner.next();
				
			} else {
				break;
			}
		}
		
		
			
		System.out.println("Input new member PW, 비밀번호는 8~12 문자로 표현");
		String memberPw = scanner.next();
		
		while (true) {
			if (memberPw.length() < 8 || memberPw.length() > 12) {
				System.out.println("Input new member PW, 비밀번호는 8~12 문자로 표현");
				memberPw = scanner.next();
				
			} else {
				break;
			}
		}
		
		
			
		System.out.println("Input new member MAIL");
		String memberMail = scanner.next();
			
		System.out.println("Input new member PHONE");
		String memberPhone = scanner.next();
			
		Member member = new Member(memberId, memberPw, memberMail, memberPhone);
//		MemberDB db = new MemberDB();
			
		db.memberDB.put(memberId, member);
			
		db.memberDB.get(memberId).printInfo();
			
		
		/*
		 * 과제: ID 중복 체크 기능 추가
		 * 과제: 비밀번호는 8~12 문자로 표현
		 */
		
	}
	
	/*
	 * 로그인
	 */
	public void doSignIn(Scanner scanner, Flag flag) {
		
//		System.out.println("flag.system");
//		
//		int count = 1;
//		while (true) {
//			
//		}
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
//		MemberDB db = new MemberDB();
		Member searchedMember = db.memberDB.get(memberId);
		
		// searchedMember: Member or null
		if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
			System.out.println("1.SIGN-IN SUCCESESS!!");
			
		} else {
			System.out.println("3.SIGN-IN FAIL!!");
		}
	}
	    /*
		 * 과제: 로그인 실패가 3회 초과이면 시스템 종료
		 *    int count = 1; 이렇게 while문으로 isr 시스템을 만들어서 할 수도 있는데 이렇게 하면 결론적으론 안된다
		 *    얕은 복사로 주소값을 보내준게 아니라 boolean 이라 깊은 복사를 해준 것이기 때문에 값을 준 순간 남남이 되어버려서
		 *    클래스 단위로 만들면 된다
		 *    
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
		
		// 인증 절차 추가
		
		Member searchedMember = db.memberDB.get(memberId);
		
		Member member = db.memberDB.get(memberId);
		if (member != null && searchedMember.memberPw.equals(memberPw)) {
//			searchedMember.memberId;
//			searchedMember.memberMail;
//			searchedMember.memberPhone;
			
		} else {
			return;
		}
		

		
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
