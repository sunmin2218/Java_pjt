
public class Operator {
	
	public static void main(String[] args) {
		
		/*
		 * 연산자( Operator )
		 * 산술연산자, 대입( 복합 )연산자, 비교 연산자, 논리 연산자, 조건식 연산자 등등...
		 */
		
		/*
		 * 산술 연산자   +, -, *, /, %, ++, --
         * 할당 연산자   =, +=, -=, *=, /=, %=, &=(안씀), |=(안씀)
         * 비교 연산자   ==, !=, >, <, >=, <=
         * 논리 연산자   &&, ||, !
		 * 
		 */
		
		// 1. 덧셈 연산
		// 1-1. 숫자 덧셈
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 + num2: " + (num1 + num2));
		
		// float 를 사용한 실수 덧셈도 가능
		
		// 1-2. 문자열 덧셈 (연결 연산자)
		String str1 = "Hello";
		String str2 = "world";
		System.out.println("str1 + str2: "+ (str1 + str2));
		
		// 1-3. 숫자 + 문자열 = 문자열 + 문자열 = 문자열(연결 연산자)
		System.out.println(10 + "Hello"); // 10Hello
		System.out.println(3.14f + "Hello"); // 3.14Hello
		
		// ----  참고: 문자 계산 (유니코드화 시켜 계산) (웹 개발에선 거의 안쓰인다)
		System.out.println('A' + 'B'); // 131 (유니코드) (65 + 66)
		System.out.println('가' + '나'); // 89240
		
		// 2. 뺄셈
		// 2-1. 숫자 뺄셈
		num1 = 10;
		num2 = 20;
		System.out.println("num1 - num2: " + (num1 - num2));
		// (실수 뺄셈도 가능)
		
		// 2-2. 문자열 뺄셈
		// (문자열 뺄셈은 안된다)
		// (문자 뺄셈은 된다)
		
		// 3. 곱셈
		// js랑 똑같다
		
		// 4. 나눗셈
		System.out.println("num1 / num2: " + (num1 / (float)num2)); 
		// 정수인 4바이트끼리 계산되서 0.5가 안나오고 0이 나온다 그래서 
		// 실수인 8바이트짜리 방을 만들어주느라 (float)를 하나 만들어준다
	    // 실수끼리의 나눗셈은 정상적으로 나온다
		
		System.out.println(0/100);  // 0		
//		System.out.println(100/0);  // 에러
		
		// 5. 나머지 연산자
		num1 = 10; num2 = 3;
		System.out.println("num1 % num2: " + (num1 % num2));  // 1

		
	}

}
