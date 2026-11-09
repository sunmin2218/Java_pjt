package com.office.diarytest;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass implements IDiaryConfig {
	
	public static void main(String[] args) {
		
		/*
		 * 메인
		 * 컨트롤
		 * 서비스
		 * Dao
		 */
		
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String[]> membersData = new HashMap<String, String[]>();
//put	membersData.put(키값, new String[] {배열에 들어갈 데이터들});
//get 	String [] memberInfos = membersData.get(memberId);
		String[] memberInfos;
//		ArrayList<String> memberDiaries = new ArrayList<String>();
				
		
		String memberId;
		String memberPw;
		String memberMail;
		String memberPhone;
		
		boolean systemFlag = true;
		
		
		
		membersData.put("gildong", new String[] 
				{"gildong", "1234", "gildong@gmail.com", "010-1234"});
		membersData.put("chanho", new String[] 
				{"chanho", "5678", "chanho@gmail.com", "010-5678"});
		
		HashMap<String, String> membersDiaries = new HashMap<String, String>();
		
		while (systemFlag) {
			
			System.out.println(
					"1.SIGN-UP  2.SIGN-IN  5.MODIFY  6.DELETE  99.SYSTEM-OUT");
			int menuSelectedNum = scanner.nextInt();
			
			switch (menuSelectedNum) {
			
			case SIGN_UP:
				
				System.out.println("Input new ID");
				memberId = scanner.next();
				
				memberInfos = membersData.get(memberId);
				
				if (memberInfos == null) {
					
					System.out.println("Input new PW");
					memberPw = scanner.next();
					
					
					
					System.out.println("Input new MAIL");
					memberMail = scanner.next();
					System.out.println("Input new PHONE");
					memberPhone = scanner.next();
					
					membersData.put(memberId, new String[] 
							{memberId, memberPw, memberMail, memberPhone});
					
				} else {
					System.out.println("이미 있는 ID입니다");
				}
				
				
				
				
				break;
				
				
				
			case SIGN_IN:
				
				System.out.println("Input your ID");
				memberId = scanner.next();
				System.out.println("Input your PW");
				memberPw = scanner.next();
				
				memberInfos = membersData.get(memberId);
				
				if (memberInfos[0].equals(memberId) && memberInfos[1].equals(memberPw)) {
					System.out.println("Sign-in success!!");
					
					System.out.println(
							"3.Diary 작성   4.Diary 읽기  88.메뉴화면(정보 수정 및 삭제)");
					
					boolean diaryFlag = true;
					while (diaryFlag) {
						
						
						
						int diaryMenuSelectedNumber = scanner.nextInt();
						switch (diaryMenuSelectedNumber) {
						case DIARY_WRITE:
							System.out.println("제목을 작성해주세요");
							String userDiaryTitle = scanner.next();
							System.out.println("일기 쓰는 곳");
							String userDiary = scanner.next();
							
							membersDiaries.put(userDiaryTitle, userDiary);
							System.out.println("일기 작성 완료");
							
							System.out.println(
									"3.Diary 작성   4.Diary 읽기  88.메뉴화면(정보 수정 및 삭제)");
							
							break;
							
						case DIARY_READ:
							
							System.out.println("열람하기 위한 일기의 제목을 입력해주세요");
							userDiaryTitle = scanner.next();
							String memberDiary = membersDiaries.get(userDiaryTitle);
							
							System.out.println(memberDiary);
							System.out.println(" ");
							System.out.println(
									"3.Diary 작성   4.Diary 읽기  88.메뉴화면(정보 수정 및 삭제)");
							
							break;
							
						case 88:
							System.out.println("메뉴화면으로 돌아갑니다");
							diaryFlag = false;
							break;
						}
					}
				} else {
					System.out.println("Sign-in Fail!!");
				}
				
				break;
				
				
				
				
			case MODIFY:
				
				System.out.println("Input your ID");
				memberId = scanner.next();
				System.out.println("Input your PW");
				memberPw = scanner.next();
				
				memberInfos = membersData.get(memberId);
				
				if (memberInfos[0].equals(memberId) && memberInfos[1].equals(memberPw)) {
					
					System.out.println("Input your PW");
					memberPw = scanner.next();
					System.out.println("Input your MAIL");
					memberMail = scanner.next();
					System.out.println("Input your PHONE");
					memberPhone = scanner.next();
					
				    memberInfos[1] = memberPw;
					memberInfos[2] = memberMail;
					memberInfos[3] = memberPhone;	
				
				} else {
					System.out.println("본인확인 실패,ID나 PW를 다시 확인해주세요");
				}
				
				break;
				
			case DELETE:
				
				System.out.println("Input your ID");
				memberId = scanner.next();
				System.out.println("Input your PW");
				memberPw = scanner.next();
				
				memberInfos = membersData.get(memberId);
				
				if (memberInfos[0].equals(memberId) && memberInfos[1].equals(memberPw)) {
					System.out.println("ID와 PW가 삭제되었습니다");
					membersData.remove(memberId);
				} else {
					System.out.println("본인확인 실패,ID나 PW를 다시 확인해주세요");
				}
				
				break;
			
			case SYSTEM_OUT:
				System.out.println("Goodbye~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				systemFlag = false;
				break;	
				
			
			
			}
			
			
		}
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
