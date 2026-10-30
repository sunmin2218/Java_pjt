package com.office.ex;

public class Daeri {

	// 속성
	private String name = "Kim Daeri";
	private int money;

	// 생성자
	public Daeri() {
		money = 1000000;
	}

	// 메서드
	public void pay() {
		System.out.println(name + "님 노고에 감사드립니다.");
		System.out.println(money + "원 지급 완료!!");
	}


	
	
//	public void setMoney(int money) {
//		this.money = money;
//	
//	}
	
	
	
	
	public void setMoney(int money, String ceoPW) {
		if (ceoPW.equals("1234")) {
			this.money = money;
		}	
	}
	// 굳이 이렇게 우회해서 바꾸는 이유
	// 사장만(특정 사람만) 우회해서 바꿀 수 있도록 하기 위해
	// setter 메서드
	
	
	public int getMoney() {
		return this.money;
	}
	// 누구나 월급 조회 하는 이것도 우회해서 특정 사람만 보게 만들 수 있다
	// getter 메서드
	
	// 세터, 게터 규칙
	// set + 속성명 (set + Money = setMoney)
	// get + 속성명 (get + Money = getMoney)
	
	
	// 자동 완성
	
	
	
	
	
	

}
