package com.office.member;

import java.util.Scanner;

public class MemberController implements MemberConfig {
	
	// 여기서 멤버서비스를 싱글톤으로 만들었다
	final private MemberService memberService =
			MemberContainer.getInstance().getMemberService();
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
//		MemberService memberService = new MemberService();
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
				/*
				 * ID, PW --> 인증 된다면 PW, MAIL, PHONE 수정
				 */
				
				System.out.println("Input member ID!!");
				memId = scanner.next();
				
				System.out.println("Input member PW!!");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null);
				
				boolean isAuthentication = 
						memberService.doAuthenticationByMemIdAndMemPw(memberDto);
				
				if (isAuthentication) {
					System.out.println("Input member PW!!");
					memPw = scanner.next();
					
					System.out.println("Input member MAIL!!");
					memMail = scanner.next();
					
					System.out.println("Input member PHONE!!");
					memPhone = scanner.next();
					
					memberDto.setMemPw(memPw);
					memberDto.setMemMail(memMail);
					memberDto.setMemPhone(memPhone);
					
					memberService.modify(memberDto);
				}
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
				systemFlag = !systemFlag;       // true, false 대신 논리연산자 중 하나인 부정연산자를 사용한 모습
				System.out.println("Goodbye~");  // 근데 그냥 true, false 쓰자
				break;
			
			}
			
		}
		
		
		
		
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}