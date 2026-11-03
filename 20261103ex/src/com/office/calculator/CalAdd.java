package com.office.calculator;

public class CalAdd implements ICalculator {

	// 덧셈
//	private int calAdd(int n1, int n2) {
//		int result = n1 + n2;
//		return result;
//	}
	// 얘는 이용하지 말고 아래 코드를 사용해야 하니 private 으로 바꾼다
	// 근데 아예 지우고 아래에 넣자

	@Override
	public int doOperator(int n1, int n2) {
//		int result = calAdd(n1, n2);
		int result = n1 + n2;
		return result;
	}

}
