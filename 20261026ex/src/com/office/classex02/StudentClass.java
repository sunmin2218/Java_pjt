package com.office.classex02;

public class StudentClass {
	
	// 속성
	String name;
	int grade;
	int age;
	String major;
	
	// 생성자
	public StudentClass(String name, int grade, int age, String major) {
		System.out.println("--- Constructor ---");
		
		this.name = name;
		this.grade = grade;
		this.age = age;
		this.major = major;
		
	}
	
	// 기능(메서드)
	public void printInfo() {   // 메서드 이름은 동사+명사 로 짓는 것이 국룰 (아무렇게 지으면 안된다)
		System.out.println("Name: " + name);
		System.out.println("Grade: " + grade);
		System.out.println("Age: " + age);
		System.out.println("Major: " + major);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
