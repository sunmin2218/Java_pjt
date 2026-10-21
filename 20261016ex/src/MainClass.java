import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 데이터 타입
		 * 메모리에 저장할 데이터의 종류에 따라 할당받는 메모리 크기가 다르게 되는데요,
		 * 각각의 메모리 크기에 따라 데이터 종류를 구분하는 것을 말합니다.
		 * 
		 * 메모리 단위
		 * 1bit > 메모리 최소 단위
		 * 8bit > 1byte
		 * 1024Byte > 1KB 키로바이트
		 * 1024KB 키로바이트 > 1MB 메가바이트
		 * 1024MB 메가바이트 > 1GB 기가바이트
		 * 1024GB 기가바이트 > 1TB 테라바이트
		 */
		
		// 정수 데이터 타입
		/*
		 * byte     1byte  -128 ~ 127
		 * short    2byte  -32,768 ~ 32,767
		 * int      4byte  -21억 ~ 21억 정도 ( 가장 많이 쓰인다 )
		 * long     8byte  -큰 수 ~ 큰 수
		 * ( long 은 숫자 뒤에 소문자나 대문자 L 을 붙여야 한다 )
		 * ( 대문자 L을 많이 쓴다 )
		 */
		
		byte byteNum = 115;
		System.out.println("byteNum: " + byteNum); // 115 
		
		// 오버플로우, 언더플로우가 정수에서 터졌을 경우 반대 끝 숫자로 넘어간다
		byte byteNum01 = -128;
		System.out.println("byteNum01: " + byteNum01); // -128
		
		byteNum01 = (byte)(byteNum01 - 1);
		System.out.println("byteNum01: " + byteNum01); // -129 가 아니라 127 이 나옴 
		//
		
		
		
		short shortNum = 22768;
		System.out.println("shortNum: " + shortNum); // 22768
		
		int intNum = 2123123123;
		System.out.println("intNum : " + intNum); // 123123123123
				
		long longNum = 7112337203687338L;
		System.out.println("longNum : " + longNum); // 711...
		
		
		// 데이터의 최대, 최솟값 구하는 방법
		System.out.println("byte 최솟값: " + Byte.MIN_VALUE);
		System.out.println("byte 최댓값: " + Byte.MAX_VALUE);
		
		System.out.println("short 최솟값: " + Short.MIN_VALUE);
		System.out.println("short 최댓값: " + Short.MAX_VALUE);
		
		System.out.println("int 최솟값: " + Integer.MIN_VALUE);
		System.out.println("int 최댓값: " + Integer.MAX_VALUE);
		
		System.out.println("long 최솟값: " + Long.MIN_VALUE);
		System.out.println("long 최댓값: " + Long.MAX_VALUE);
		
		
		// 실수( 부동소수점 )
		/*
		 * float   4byte
		 * double  8byte
		 */
		
		float floatNum = 3.14f;
		System.out.println("floatNum: " + floatNum); // 3.14
		// float는 숫자 뒤에 f 를 붙인다 ( 대문자를 써도 되지만 보통 소문자를 쓴다 )
		
		double doubleNum = 3.141592312345;
		System.out.println("doubleNum: " + doubleNum); // 3.1415921345
		// double은 숫자 뒤에 d를 붙여도 되지만 안붙여도 된다 ( 보통 안붙임 )
		
		System.out.println("float 최솟값: " + Float.MIN_VALUE); // 1.4E-45
		System.out.println("float 최댓값: " + Float.MAX_VALUE); // 3.4028235E38
		// E 가 붙어있으면 '지수'라고 생각하면 된다
		
		System.out.println("double 최솟값: " + Double.MIN_VALUE); // 4.9E-324
		System.out.println("double 최댓값: " + Double.MAX_VALUE); // 1.7976931348623157E308
		// 웹에선 더블 많이 쓰인다
		// 더블이 소숫점이 더 많아 더 정밀하기 때문이다
		
		// 논리 데이터 타입
		/*
		 * 참( True ), 거짓( False )
		 * boolean     1byte     true, false
		 */
		boolean falg = true;
		// System.out.println("flag: " + flag); // true
		// 파이썬만 true 와 false 첫 글자를 대문자로 쓴다
		
		// 문자와 문자열 데이터 타입
		// 문자
		/*
		 * 메모리에 문자 데이터를 저장하기 위해서 사용하는 데이터 타입
		 * char    2byte    
		 */
		char ch = 'a'; // 문자는 꼭 작은 따옴표를 써야 한다
		// char ch = "a"; // error
		
		ch = 'b';
		System.out.println("ch: " + ch); // b
		
		// ch = 'hello'; // error
		
		// 빈문자( empty ) vs 공백문자( space )
		// char = char1 = '';  // error
		// char char2 = ' '; // 이건 된다
		
		// 문자는 메모리에 저장될 때 정수( unicode )로 저장이 된다
		char char1 = 'A';
		System.out.println("char1: " + char1); // A
		
		int unicode = char1;
		System.out.println("unicode: " + unicode); // 65
		
		char char2 = 'ㄱ';
		System.out.println("char2: " + char2); // ㄱ
		
		unicode = char2;
		System.out.println("unicode: " + unicode); // 12593
		
		char char3 = 65;
		System.out.println("char3: " + char3); // A
		
		char3 = 12593;
		System.out.println("char3: " + char3); // ㄱ
		
		
		// 문자열
		// String - 얘는 대문자로 시작
		// 문자를 여러번 배치해서 문자열로 만든거라 class 타입이고 대문자로 시작한다
		String str1 = "Hello";
		System.out.println("str1: " + str1); // Hello
		
		/*
		 * str1 = '';   엠프티캐릭터,
		 * str1 = ' ';  공백 모두 가능
		 */
		
		// 콘솔을 이용한 데이터 입력, 출력
		// 데이터 출력
		System.out.print("hello python");
		System.out.println("hello java");  // ln 은 line 의 약자이다
		System.out.print("hello python\n"); // \n 을 통해 개행을 할 수 있다
		
		String str = "hollo~";
		System.out.println(str);
		/*
		 * 특수 문자 정리
		 * \n    개행( 줄바꿈 )
		 * \t    탭( 4칸 공백 )
		 * \'    작은 따옴표( ' )
		 * \"    큰 따옴표( " )
		 * \\    역 슬래쉬( \ )
		 */
		
		System.out.print("이름\t학번\n");
		System.out.println("Mr. H\t2020_000123");
		System.out.println("Mr. K\t2020_000124");
		
		System.out.println("어머님께서는 \"밥 먹고 설거지 해놔라.\"라고 하셨습니다.");
		System.out.println("그래서 나는 \'네.\'라고 했습니다.");
		
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("\\\\\\2020-08-01\\\\\\");
		
		
		// 데이터 입력
		Scanner scanner = new Scanner(System.in);
		
//		String inputStr = scanner.nextLine();
//		System.out.println("inputStr: " + inputStr);
		
		/*
		 * nextByte()    : 정수 입력
		 * nextInt()     : 정수 입력
		 * nextLong()    : 정수 입력
		 * nextFloat()   : 실수 입력
		 * nextDouble()  : 실수 입력
		 * nextLine()    : 문자열 입력
		 * nextBoolean() : 논리 입력
		 */
		
		// 외부자원 연결해서 썼으면 끊어줘야 하는데 끊지 않아서 경고가 뜬다
		// 그래서 외부자원을 썼으면 끊어주는 작업을 해야 한다
		// 안해주면 메모리가 세어나가고 다른 곳에서 연결을 못한다
		// 여기선 왜 에러가 아니라 경고인가?
		// 어짜피 작은 프로세스이기 때문에
		
		/*
		int inputData = scanner.nextInt();               // 10
		System.out.println("inputData: " + inputData);   // inputInt: 10
		
		// scanner.nextLine(); // 때문에 이런 갈뷔지 데이터를 집어넣어준다	
	
		String inputString = scanner.nextLine();           // java
		System.out.println("inputString: " + inputString); // inputString: java
		// java 를 입력할새도 없이 엔터를 치면 메모리에 남아있는 \n 이 입력이 되어버리기 때문에
		// 만약 둘 다 String 을 쓰면 가운데 갈뷔지 데이터를 집어넣어준다
		*/
		 
		String inputString = scanner.next();                // hello java
		System.out.println("inputString: " + inputString);   // hello
		// 넥스트라인은 줄 끝까지 읽지만 넥스트는 첫 번째 공백 있기 전까지만 읽는다
		
		inputString = scanner.nextLine(); 
		System.out.println("inputString: " + inputString);  // java \n
		
		
		scanner.close(); // 자원 해제 코드 - 이렇게 한 번 끊으면 다시 연결이 안됨
		
		
		
		
	}

}
