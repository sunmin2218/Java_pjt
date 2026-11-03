package com.office.calculator;

public class MainClass {
	
	public static void main(String[] args) {
		
		OurCalculator ourCalculator = new OurCalculator();
		
		// 10, 20
		
//		ourCalculator.calAdd(20, 10);
//		ourCalculator.calSub(20, 10);
//		ourCalculator.calMul(20, 10);
//		ourCalculator.calDiv(20, 10);
		
		ourCalculator.calculate(20, 10, new CalAdd());
		ourCalculator.calculate(20, 10, new CalSub());
		ourCalculator.calculate(20, 10, new CalMul());
		ourCalculator.calculate(20, 10, new CalDiv());
		
		// 객체를 직접 만들지 않고 외부에서 만들고 주입을 한다
		// 의존하는 객체를 주입 디펜더시 인젝션 DI Depandency Injection
		
		
		// 인터페이스 - 데이터타입을 통일 시키기 위해 쓸 수도 있고,
		// 디펜던시 인젝션을 위해 쓰는 방법도 있다
		// 수십개의 쓰는 이유가 있다
		
		// 디자인 패턴 중 가장 중요한 스트레티지 패턴이 제일 많이 쓰인다
		// 스프링 프레임웤 이해하려면 스트레티지 패턴, DI 개념을 완벽히 이해해야 한다
		
		
		
		
		
		
		
		
		
		
	}

}
