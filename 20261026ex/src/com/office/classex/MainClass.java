package com.office.classex;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		Car car1 = new Car();
		System.out.println(car1.color);   // Black
		System.out.println(car1.size);   // 5.2
		System.out.println(car1.displacement);   // 2000
		
		car1.drive();
		car1.stop();
		car1.parking();
		
		
		Car car2 = new Car();
		System.out.println("car2 color: " + car2.color); // black
		
		car2.color = "White";
		System.out.println("car2 color: " + car2.color); // White
		
		Car car3 = new Car();
		System.out.println("car3 color: " + car3.color);  // black
		
		car3 = car2;  // car3 에 기존의 car3 데이터는 날라가고, car2의 메모리 주소로 바뀌면서, heap 에 3개 남고, stack 에는 2개 남는다
		
		car3 = null;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
