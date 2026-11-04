package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig {
	
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		MemberService memberService = new MemberService();
		// 여기서 MemberService 를 싱글톤으로 바꾸면 더욱 견고한 코드가 된다
		// 근데 싱글톤으로 안바꾸고 다른 방법으로 해버렸다 그게 뭐였는지 모르겠다 너무 빨리 지나갔다
		// 알아낸 방법 - 만들었던 객체들이 서로 연동이 되지 않는 문제를
		// 객체를 생성자나 메서드에 "매개변수"를 통해 넘겨주었다
		
		if (IS_DEV) {
			new MemberDumy().signUpForDumy(memberService);
		}
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		
		
		while (systemFlag) {
			System.out.println("1.SIGN UP     2.SIGN IN     3.MODIFY    4.DELETE     99.SYSTEM OUT");
			int selectedMenuNum = scanner.nextInt();
			
			switch (selectedMenuNum) {
			
			case SIGN_UP:
				
				System.out.println("Input new member ID!!");
				memId = scanner.next();
				
				System.out.println("Input new member PW!!");
				memPw = scanner.next();
				
				System.out.println("Input new member MAIL!!");
				memMail = scanner.next();
				
				System.out.println("Input new member Phone!!");
				memPhone = scanner.next();
				
				MemberDto memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				
				
				memberService.signUp(memberDto);
				break;
				
			case SIGN_IN:
				
				System.out.println("Input member ID!!");
				memId = scanner.next();
				
				System.out.println("Input member PW!!");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null);
				
				memberService.signIn(memberDto);
				break;
			
			case MODIFY:
				memberService.modify();
				break;
				
			case DELETE:
				/*
				 * ID and PW 인증 후 삭제
				 */
				System.out.println("Input member ID!!");
				memId = scanner.next();
				
				System.out.println("Input member PW!!");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null);
			  	
				memberService.delete(memberDto);
				break;
				
			case SYSTEM_OUT:
				systemFlag = false;
				System.out.println("Goodbye~");
				break;
			
			}
			
		}
		
		
		
		
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}