
public class MainClass {
	
	public static void main(String[] args) {
		
		// 변수
		/*
		 * 변수란, 메모리의 특정 공간을 의미한다. 이곳에 데이터가 들어간다.
		 * 변수 선언 & 변수 초기화
		 * 변수 선언  : 메모리의 특정 공간을 청소하고 변수명을 달아주는 작업이다.
		 * 변수 초기화 : 변수의 특정 데이터를 저장하는 작업이다.
		 * 변수 선언 + 변수 초기화 = '변수를 정의 했다'라고 한다
		 * 
		
		 * 
		 */
		
//		 정수를 이용한 변수 선언과 초기화
//		 자바스크립트에선 -> let 변수명 = 데이터;
//		 자바는 -> 데이터 타입 변수명 = 데이터;
		
		int num = 10; // 변수 선언 & 변수 초기화
		int num2;    // 변수 선언
		num2 = 20;  // 변수 초기화
		
		System.out.println("num: " + num);   // 10
		System.out.println("num2: " + num2);  // 20
		
		int address = System.identityHashCode(num);  // 메모리 주소를 알아내는 코드
		System.out.println("address: " + address);  // 메모리 주소는 신경쓸 필요 전혀 없다
		
		
		// 변수명 작명하는 가이드
		// 1. 변수명의 시작은 일반적으로 소문자로 시작한다.
		int money = 1000; // 권장
		int Money = 1000; // 비권장
		
		// 2. 변수명은 일반적으로 영문자를 사용한다.
		int myMoney = 1000; // 권장
		int 나의자산 = 1000; // 비권장
		System.out.println(나의자산); // 나오긴 하지만 하지 말자
		
		// 3. 변수명은 데이터의 의미를 쉽게 파악할 수 있도록 작명한다.
		int score = 80;         // 권장   , s(비권장)
		String player = "홍길동"; // 권장  , p(비권장)
		String map = "지도";   // 권장     , m(비권장)
		
		// 4. 두 개 이상의 단어가 조합된 경우 낙타표기법을 사용한다. (스네이크 표기법도 사용할 수 있지만 C언어 계열에서만 쓰인다)
		int myScore = 80;
		int totalScore = 80;
		int highScore = 80;
		int averageScore = 80;
		String newItem = "칼";
		
		// 5. 키워드는 변수명으로 사용할 수 없다.
		// public, class, void, for, it, switch, case...
		
		// 6. 언어바( _ )를 제외한 특수문자는 변수명으로 사용할 수 없다.
		int my_score = 100; // 가능
		// int my-$#^score = 100; // 불가능
		
		// 7. 변수명에 공백문자는 사용할 수 없다.
		// int my number = 80; // 불가
		
		// 8. 변수명에 숫자를 사용하는 경우 첫 글자를 제외한 나머지 글자에 사용할 수 있다.
		// int 1number = 10; // 불가능
		int num1ber1 = 10; // 가능
		
		/*
        ㆍ 변수명은 영문으로 하고, 첫 글자는 소문자로 한다.
        ㆍ 2개 이상의 단어가 조합된 경우 낙타표기법을 따른다. 
        ㆍ 특수문자, 예약어 그리고 공백문자는 사용하지 않는다.
        ㆍ 숫자를 사용해야하는 경우 중간 또는 뒤에 사용한다.
        */
         
		
		// 데이터 변경 
		// (변경과 선언은 다르다)
		int number = 10;
		System.out.println("number: " + number); // number: 10
		
		number = 20;
		System.out.println("number: " + number); // number: 20
		
		/*
		 * 동일한 이름으로 변수를 선언하면 안된다. 
		 */
		// int number = 30; // 이건 안된다.
		
		
		// 데이터 복사
		int num1 = 10;
		System.out.println("num1: " + num1); // num1: 10
		
		int num22 = num1;
		System.out.println("num22: " + num22); // num22: 10
		// 이렇게 값 자체가 복사되는 것을 '깊은 복사' 라고 한다 = 기초 데이터 타입
		// 래퍼런스 주소가 복사되는 것을 '얕은 복사' 라고 한다 = 래퍼런스 타입
		
		
		int n1 = 10;
		int n2 = 20;
		
		// Q) n1 과 n2 의 값을 교환하시오
		int n0 = 0;
		n0 = n1;
		n1 = n2;
		n2 = n0;
		System.out.println("n1: " + n1);  // 20
		System.out.println("n2: " + n2);  // 10
		System.out.println("n0: " + n0);  // 10
		
		// Q) 가로와 세로 변수를 각각 만들고 방의 넓이를 구해보자.
		int width;
		int height;
		
		width = 100;
		height = 50;
		System.out.println("방의 넓이: " + (width * height)); // 5000
		
	}

}
