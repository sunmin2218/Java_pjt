package com.office.classex04;

public class Car {

	// 멤버 필드
	String color;
	int length;
	int price;
	int displacement;
	
	
	
	// 생성자
	public Car() {
	    System.out.println("--- CONSTRUCTOR ---");
	}
	
	public Car(
			String color, 
			int length,
			int price, 
			int displacement) {
//		super(); // 이건 없어도 된다
		this.color = color;
		this.length = length;
		this.price = price;
		this.displacement = displacement;
	}
	
	
	
	// 메서드
	public void goForward(int speed) {
		// int speed 이거를 파라미터 혹은 매개변수 라고 한다
		// 그리고 메인클래스에 30 이라는 데이터를 '인수' 라고 한다
		// 현업에선 파라미터라고 많이들 말한다
		System.out.println("--- goForward() method ---");
		System.out.println(speed + "km/h");
		
	}
	
	public void goBack() {
		System.out.println("--- goBack() method ---");
	}
	
	public void doTest() {
		goForward(30); // 위에처럼 this. 를 붙여도 된다
		goBack();    // 하지만 보통 안붙인다
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
