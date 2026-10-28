package com.office.member;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;	
//		Boolean nowBoolean = new Boolean();
		
		MemberDB memberDB = new MemberDB();
		MemberService memberService = new MemberService(memberDB);
		MemberDumy memberDumy = new MemberDumy(memberDB);
		memberDumy.initMemberDumyData();
		
		/*
		 * 과제: 더미 데이터 초기화는 개발환경과 실환경으로 구분
		 */
		
		final int SIGN_UP = 1;
		final int SIGN_IN = 2;
		final int MODIFY = 3;
		final int DELETE = 4;
		final int SYSTEM_OUT = 99;
		
		while (systemFlag) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case SIGN_UP: 
//				memberService = new MemberService();
				memberService.doSignUp(scanner); 
// 이렇게 scanner 객체를 보내주는 과정을 MMI (Machine to Machine Interface)
				
				break;
				
			case SIGN_IN:
//				memberService = new MemberService();
				memberService.doSignIn(scanner);
				
				break;
				
			case MODIFY:
				
				memberService.doModify(scanner);
				
				break;
				
			case DELETE:
				
				memberService.doDelete(scanner);
				
				break;
				
			case SYSTEM_OUT:
				systemFlag = false;
				System.out.println("Say Goodbye~");
				break;		
				
				/*
				 * 과제: case에 사용되는 리터럴 상수 -> 상수로 변경 / clear
				 * 과제: 메뉴 5번 -> 전체 회원 정보 출력하는 기능 구현(AI 도움)
				 */
			}
		}
		
		
		
		
		
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
