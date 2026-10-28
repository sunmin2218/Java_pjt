package com.office.classex02;

public class MainClass {
	
	public static void main(String[] args) {
		
		// new -> 객체 생성
		// Student() -> 생성자 호출
		// 생성자가 데이터타입에 맞춰 데이터를 초기화 시킨다 (초기화값을 넣는다 -> null, 0)
		StudentClass student1 = new StudentClass("홍길동", 1, 20, "Computer");
		StudentClass student2 = new StudentClass("박찬호", 1, 21, "Sports");
		
		
//		System.out.println("name: " + student1.name);    // null
//		System.out.println("grade: " + student1.grade);  // 0
//		System.out.println("age: " + student1.age);      // 0
//		System.out.println("major: " + student1.major);  // null
		
		
		student1.printInfo();
		student2.printInfo();
		
		StudentClass student3 = new StudentClass("김경문", 2, 22, "Baseball");
		student3.printInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
