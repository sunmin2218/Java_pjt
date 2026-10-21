	
public class Operator3 {

	public static void main(String[] args) {
		
		
		/*
		 * 비교 연산자
		 */
		
		System.out.println(10 <= 20);  // true
		
		System.out.println(10 == 20);  // false
		System.out.println(10 != 20);  // true
		// js 에서는 === 이렇게 3개를 썼는데 js 에만 있는 표현이다
		
		float num5 = 0.1f;  // 0.1000000000149  > double
		double num6 = 0.1;  // 0.1000000000000  > double
		
		System.out.println("num5: " + num5);  // 0.1
		System.out.println("num6: " + num6);  // 0.1
		System.out.println("num5 + num6: " + (num5 + num6));  // 0.20000001234567
		
		// garbage 데이터가 있기 때문에 같은 숫자처럼 보여도 다르기 때문에 조심해야 한다
		// 메모리 설계상 정수와는 다르게 실수는 정확하게 데이터를 넣을 수가 없다
		
		int num7 = 10;
		float num8 = 10.0f;	
		
		// int + float => flaot + float  //  num7, num8 => 10.0
		
		System.out.println("num7 > num8: " + (num7 > num8));    // false
		System.out.println("num7 >= num8: " + (num7 >= num8));  // true
		System.out.println("num7 < num8: " + (num7 < num8));    // false
		System.out.println("num7 <= num8: " + (num7 <= num8));  // true
		System.out.println("num7 == num8: " + (num7 == num8));  // true
		System.out.println("num7 != num8: " + (num7 != num8));  // false
		
		// 무조건 엄청 중요 *****
		// 문자열 비교
		String str1 = "hello";
		String str2 = "hello";
		// String 은 래퍼런스 타입이기 때문에 메모리에서 값이 아니라 주소를 가르킨다
		
		System.out.println("str1 == str2: " + (str1 == str2)); // true
		
		//Scanner scanner = new Scanner(System.in);
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println("str3 == str4: " + (str3 == str4)); // false
		
		System.out.println(str3.equals(str4)); // str3 == str4 // true 
		// 이렇게 사용하자 문자를 비교할거면
	}

}