public class Operator4 {
	
	public static void main(String[] args) {
		
		
		
		/*
		 * 논리연산자( Boolean ) / js 랑 똑같다
		 * &&   :   and 연산자      A && B => A 와 B 가 모두 true 인 경우만 true
 		 * ||   :   or 연산자       A || B => A 또는 B 중 하나라도 true 이면 true
		 * !    :   부정(not)연산자  !A => A 의 현재 상태를 부정
		 */
		
		/*
		int num1 = 10; int num2 = 20; int num3 = 30;
		
		boolean result = (num1 < num3) && (num2 < num3);  // true && true
		System.out.println("result: " + result);  // true
		
		boolean result = (num1 > num3) && (num2 < num3);  // false && true
		System.out.println("result: " + result);  // false
		
		boolean result = (num1 > num3) || (num2 < num3);  // false && true
		System.out.println("result: " + result);  // true	
		*/
		/*
		 * 파이썬에선 and, or, not
		 */
		
		// result = (num1 < num2) && (num2 < num3) && (num3 > num1);
		       // true && true => true
		                      // true && true => true
		// System.out.println("result: " + result);
		
		System.out.println(!true); // false
		System.out.println(!!true); // true
		
		/*
		 * &&와 ||중에서 어떤 연산자의 연산 우선순위가 높을까요?
		 * 쉽게 생각하면 &&와 ||는 모두 논리연산자로 연산 우선순위가 같아서 왼쪽부터 순차적으로 연산할거라 
         * 생각하기 쉽습니다. 하지만 실제 연산 우선순위는 &&가 ||보다 높습니다. 
		 */
		
		boolean res = false;
		
		int no1 = 10;
		int no2 = 20;
		int no3 = 30;
		
		res = (no1 < no3) || (no2 < no3) && (no1 > no3);
		// 왼쪽서부터 차례로 연산된다면 false 가 나온다
		System.out.println("res: " + res); // 하지만 true 가 나온다
		// 왜냐하면 || 보다 && 가 먼저 계산되기 때문이다
		
		/*
		 * 조건식 연산자 or 삼항식 연산자  - (많이 쓰인다)
		 */
		
		int passScore = 80;
		int myScore = 90;
		
		// 나의 점수가 80 이상이면 'PASS'를 출력, 그렇지 않으면 'FAIL'출력
		
		String resultStr = (myScore >= passScore) ? "PASS" : "FAIL";
		System.out.println("resultStr: " + resultStr);
		/*
		 * 파이썬에서 삼항연산자
		 * true인 경우 if 조건식 else false인 경우
		 */
		
		// 교재 88 ~ 117
		
		// " 컨트롤 쉬프트 o " 누르면 실수로 지웠던 import java.util.Scanner; 를 자동으로 입력해준다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}