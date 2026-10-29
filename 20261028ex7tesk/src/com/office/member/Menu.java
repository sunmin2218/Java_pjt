package com.office.member;

public class Menu {
	
	
	final static int MENU_SIGN_UP    = 1;
	final static int MENU_SIGN_IN    = 2;
	final static int MENU_MODIFY     = 3;
	final static int MENU_DELETE     = 4;
	final static int MENU_PRINT_ALL_MEMBER = 5;
	final static int MENU_SYSTEM_OUT = 99;
	
	// 스태틱이 붙은 멤버필드나 메서드는 객체를 생성하지 않아도 메모리에 알아서 자리를 잡게 된다
	// 대문자로 시작해서 그냥 Menu. 이렇게 시작하면 된다
	
	// 스택     힙     스태틱
	// 근데 스태틱은 공간이 넉넉하지 않다
	
	// final 인 변하지 않는 상수를 리터럴 변수에 넣을 수 없으니까 스태틱 사용
	// 메인메서드에 있는 스태틱도 그런 이유
	// 클래스에 있지만 전혀 다른 공간에 있다
	
}
