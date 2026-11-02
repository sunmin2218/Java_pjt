package com.office.inheri.restaurant;

public class ChildRestaurant extends ParentsRestaurant implements Checklist, Checklist2 {
	
	public final static int PARENT_MENU = 1;
	public final static int CHILD_MENU = 2;
	
	
	public void makeBokkeumbap() {
		System.out.println("아들꺼! 볶음밥 만듦!!");
	}
	
	
	// 아빠의 짜장을 재정의해서 새로운 짜장을 만들기
	// 이를 오버라이딩 이라고 한다
	// 상속을 받은 클래스를 재정의 - 오버라이딩
//	@Override
	public void makeJajang(int menu) {
		if (menu == PARENT_MENU) {
			super.makeJajang();
		} else {
			System.out.println("아들꺼! MZ세대 짜장면 만듦!!");
		}
	}
	// 아들꺼에 메이크짜짱이 있으니까 아빠 클래스한테까지 가지 않는다
	
	// 아들꺼 말고 아빠쪽에 짜장면을 실행시키고 싶을 땐
	// this 의 반대 개념인 super 를 사용한다
	// this 는 나, super 는 위로 올라간다
	// super.makeJajang();
	// 이러면 아빠꺼를 먼저 만들고 난 후 아들꺼를 만든다
	// 둘 중 하나만 내오려면 분기 태우면 된다
	
	
	// 추상메서드
	@Override
	public void makeTangsuyuk() {
		
	}


	@Override
	public void checkFloor() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void checkToilet() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void checkHawgu() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}
