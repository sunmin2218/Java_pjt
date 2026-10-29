package com.office.methodex;

public class Calculator {
	
	public int addOperator(int n1, int n2) {
		// IT 에서 void 무시하자 라는 뜻
		// return 을 썼으니 타입을 void 대신 써서 명시하자
		
		int result = n1 + n2;
		// System.out.println("result: " + result);
		
		return result;
		// 반환되는 데이터 타입을 void 자리에 대신 써 넣는다
		// 호출부에서 선언해서 선언부에서 반환해도
		// 안받아도 에러 뜨지 않는다
		
	}
	
	/*
	public Car productCar() {
		
		Car car = new Car();
		return car;
		
	}
	*/
	
	// 유일하게 예외적으로 Object 라는 데이터 타입도 가능하다
	// 모든 데이터 타입의 조상은 Object 이기 때문에
	// 데이터 타입이 헷갈리면 Object 로 통일시키면 된다
	
	// 배열은 데이터 타입이 똑같아야 담을 수 있는데
	// 두 개의 다른 데이터 타입을 배열에 담을 때에도 쓸 때도 있다
	// 이런 경우는 꺼낼 때 다시 캐스팅 해야 되긴 하다
	
	// 함수는 return 을 만나면 무조건 호출부로 돌아간다
	
	// if (true) return = 0;
	
    public Object productCar() {
		
		Car car = new Car();
		return car;
		
	}
	
	
	
	
	
	
	
	
	

}
