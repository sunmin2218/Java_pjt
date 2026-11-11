package com.office;

import com.office.config.Config;
import com.office.dumy.Dumy;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 부품 assemble
		Container container = Container.getInstance();
		
		// dumy
		if (Config.IS_DEV) {
			new Dumy().setDumy(); 
			// 이렇게 변수 없는 함수는 어나니머스 함수 라고 하는데 한 번만 실행하니까 변수에 따로 넣어주지 않는다
		}
		
		// 실행
		container.getHomeController().execute(); 
		
		// ( execute 말고 다른 동사를 써도 된다 )
		
	}

}
