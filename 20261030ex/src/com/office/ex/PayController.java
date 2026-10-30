package com.office.ex;

import java.util.Scanner;

/*
 * 월급 지급 명령을 내린다.
 */
public class PayController {
	
	boolean flag = true;
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		while (flag) {
			System.out.println("Please enter the month");
			int thisMonth = scanner.nextInt();
			
			if (thisMonth == 999) {
				System.out.println("깃발 폴스");
				flag = false;
				
			} else {
				PayService payService = new PayService();
				payService.pay(thisMonth);
			}
			
//			PayService payService = new PayService();
//			payService.pay(thisMonth);
			
			
		}
		
		
		
		
		scanner.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
