package com.office.ex;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 용어 복습
		 * 
		 * 객체를 인스턴스라고 하고, 객체의 구성요소(속성, 생성자, 메서드) 들을 멤버라고 한다 객체 == 인스턴스 속성 == 멤버필드 메서드 ==
		 * 멤버메서드 클래스 == (틀 == 명세서 == 설계도)
		 * 
		 * 실무 용어 -> 클래스, 멤버필드, 생성자, 메서드
		 */

		/*
		 * 접근제어자(접근제한자)
		 * 
		 * 예제. 달에 따라 직급에 따라 월급을 지급하자
		 */

		PayController payController = new PayController();
		payController.execute();
		
		/*
		 * public 으로 선언된 속성은 외부에서 자유롭게 데이터를 접근, 변경할 수 있다
		 * 반대되는 개념은 private - 조회, 변경 불가능
		 * 생성자는 무조건 public 을 써야한다, private 을 하면 객체를 생성 못하니까
		 * 
		 * default, protected 까지 총 4개 있다
		 * 
		 * default - 같은 페키지에 있으면 접근 가능
		 * protected - 나중에 배움, 거의 안쓰여서 몰라도 될 정도
		 * 
		 * default 는 아무 키워드도 안쓰면 된다
		 * 
		 * public 은 데이터에 관해선 99프로 안쓴다
		 * 속성은 대부분 private 을 쓰면 된다
		 * 클래스, 생성자 에는 public 쓰자
		 */
		
		
		
		
		
		
		
		
		
		
		
	}

}
