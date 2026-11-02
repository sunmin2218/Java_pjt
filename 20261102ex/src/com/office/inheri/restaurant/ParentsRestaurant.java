package com.office.inheri.restaurant;

public abstract class ParentsRestaurant {
	
	// 기능 : 짜장, 짬뽕
	public void makeJajang() {
		System.out.println("아빠꺼! 짜장면 만듦!!");
	}
	
	public void makeJjamppong() {
		System.out.println("아빠꺼! 짬뽕 만듦!!");
	}
	
	// 추상 클래스
	// 아들아 너가 탕수육 만드는 기술이 있어야 내 기술들을 물려줄게
	// class 앞에 abstract 쓰고,
	public abstract void makeTangsuyuk();
	// 상위 추상 클래스에 있는 추상 메서드를 실체화 시켜야 한다
	
	
	
	
	
	
	
	
	
	
	
	

}
