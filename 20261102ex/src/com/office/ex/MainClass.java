package com.office.ex;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 상속(inheritance)
		 * 아빠 클래스가 아들 클래스한테 멤버를 물려주는 것을 말한다
		 * private 은 상속 못받는다
		 * 
		 * C++에선 다중 상속이 가능하지만 자바에선 다중 상속이 불가능하고 단일 상속만 된다
		 * 파이썬도 다중 상속이 되긴 하지만 개발자가 쓰지 말라고 당부 하기도 했다
		 * 그러니까 다중 상속은 하지 말자
		 */
		
		
		ChildClass childCalss = new ChildClass();
		
		
		System.out.println(childCalss.name);
		childCalss.printInfo();
		
		
		
		
		
		
		
		
		
	}

}
