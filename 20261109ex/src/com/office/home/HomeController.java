package com.office.home;

import java.util.Scanner;

import com.office.Container;
import com.office.menu.Menu;

//사용자의 요청 분석
public class HomeController {

	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		boolean systemFlag = true;
		
		
		while (systemFlag) {
			
			Menu.generateMenu();
			
			int selectedMenu = scanner.nextInt();
			switch (selectedMenu) {
			
			case Menu.MEMBER_SIGN_UP:
			case Menu.MEMBER_SIGN_IN:
			case Menu.MEMBER_SIGN_OUT:
			case Menu.MEMBER_MODIFY:
			case Menu.MEMBER_DELETE:
				Container.getInstance().getMemberController().execute(scanner, selectedMenu);
				// 여기 있는 일은 컨트롤러가 해줘야 하니까 그쪽 객체를 가져오는데 scanner랑 메뉴 번호 뭐 선택했는지
				// 도 보내줘야 하니 selectedMenu 도 보내주고 받는 쪽에서 파라미터를 쓸 때는 데이터 타입도 같이
				// 명시해서 적어주면 된다
		        break;
		        
			case Menu.DIARY_WRITE:
			case Menu.DIARY_READ:
				Container.getInstance().getDiaryController().execute(scanner, selectedMenu);
		        break;
			 
			case Menu.SYSTEM_OUT:
				systemFlag = false;
				System.out.println("Goodbye~~~~~~");
		        break;
			}
			
		}
		
		
		
		scanner.close();
		
	}
	
	

}
