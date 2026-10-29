package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Config config = new Config();
			
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;	
//		Boolean nowBoolean = new Boolean();
		Flag flag = new Flag();
		
		MemberDB memberDB = new MemberDB();
		MemberService memberService = new MemberService(memberDB);
		
		
		if (config.IS_DEV) {
			MemberDumy memberDumy = new MemberDumy(memberDB);
			memberDumy.initMemberDumyData();
		}
		
		
		/*
		 * 과제: 더미 데이터 초기화는 개발환경과 실환경으로 구분
		 */
		
		
		while (flag.systemFlag) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    5.PRINT_ALL_MEMBER    99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case Menu.MENU_SIGN_UP: 
//				memberService = new MemberService();
				memberService.doSignUp(scanner); 
// 이렇게 scanner 객체를 보내주는 과정을 MMI (Machine to Machine Interface)
				
				break;
				
			case Menu.MENU_SIGN_IN:
//				memberService = new MemberService();
				memberService.doSignIn(scanner, flag);
				
				break;
				
			case Menu.MENU_MODIFY:
				
				memberService.doModify(scanner);
				
				break;
				
			case Menu.MENU_DELETE:
				
				memberService.doDelete(scanner);
				
				break;
				
			case Menu.MENU_SYSTEM_OUT:
				flag.systemFlag = false;
				System.out.println("Say Goodbye~");
				break;		
				
			case Menu.MENU_PRINT_ALL_MEMBER:
				
				HashMap<String, Member> db = memberDB.memberDB;
				
				
				
				for (String key : db.keySet()) {    // 키셋 명령어를 이용하여
					
					Member member = db.get(key);   // 해쉬 맵의 키 값만 뽑아내는 코드
					System.out.println(member.memberId);
					System.out.println(member.memberPw);
					System.out.println(member.memberMail);
					System.out.println(member.memberPhone);
				}
				
				
				for (Member member : db.values()) {  // 이건 밸류 값만 뽑아내기
					System.out.println(member.memberId);
					System.out.println(member.memberPw);
					System.out.println(member.memberMail);
					System.out.println(member.memberPhone);
				}
				
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
