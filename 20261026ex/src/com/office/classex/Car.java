package com.office.classex;

public class Car {
	

	
	// 여기다 속성과 기능을 정의해주면 그것들이 포함된 객체가 생성된다
	
	
	// 속성
	String color = "Black";
	double size = 5.2;
	int displacement = 2000;
	
	// 생성자
	public Car() {
		System.out.println("Car CONSTRUCTOR CALLED!!");
	}
	
	// 기능
	public void drive() {
		System.out.println("drive() CALLED!!");
	}
	
	public void parking() {
		System.out.println("parking() CALLED!!");
	}
	
	public void stop() {
		System.out.println("stop() CALLED!!");
	}
	
	public void callAllMethod() {
		drive();
		parking();
		stop();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
