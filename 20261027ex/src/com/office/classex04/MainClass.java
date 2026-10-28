package com.office.classex04;

public class MainClass {
	
	public void printHello() {
		System.out.println("Hello~");
	}
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.goForward(30);
		car1.goBack();
		car1.doTest();
		
		MainClass mainClass = new MainClass();
		mainClass.printHello();
//		printHello();  // 이거 안읽히는 이유 - 메모리가 가장 먼저 읽는 메인메소드
		// 메인메소드는 메인클래스게 아니다
		// 일반 메소드와 다르게 어떤 클래스에도 속해있지 않다
		// 메인메소드가 가장 먼저 읽히니까 
		// 메인클래스에 있는 public void printHello() 를 먼저 읽지 않는다
		
		
		
		// 지역변수랑 전역변수 이름 똑같은게 있어도
		// 다른 변수들로 구분된다
		// this 를 이용하면 지역변수를 전역변수로써 사용할 수 있다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
