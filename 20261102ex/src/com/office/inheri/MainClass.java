package com.office.inheri;

import com.office.inheri.restaurant.ChildRestaurant;
//import com.office.inheri.restaurant.ParentsRestaurant;

public class MainClass {

	public static void main(String[] args) {
		
//		ParentsRestaurant parentsRestaurant = new ParentsRestaurant();
//		parentsRestaurant.makeJajang();
//		parentsRestaurant.makeJjamppong();
		
		ChildRestaurant childRestaurant = new ChildRestaurant();
		childRestaurant.makeJajang(ChildRestaurant.PARENT_MENU); 
		childRestaurant.makeJjamppong();
		childRestaurant.makeBokkeumbap();
	    childRestaurant.makeTangsuyuk();
	    
	    
	    // 클래스와 클래스 간의 상속
	    // 오버라이드
	    // 추상 클래스, 추상 메서드
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
