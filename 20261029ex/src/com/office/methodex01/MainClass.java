package com.office.methodex01;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		// 메서드 오버로딩(과적) : 메서드가 여러개 선언된 것을 말한다
		// 동일한 이름의 메서드가 선언됐다 - 오버로딩
		Greet greet = new Greet();
		greet.printGreetWord();
//		greet.printGreetWordByName("홍길동");
		
		// 요구 사항 : 고객 이름 + 안녕하세요.(홍길동님 안녕하세요.)
		// 요구 사항 : 모르는사람 + 안녕하세요.(안녕하세요.)
		*/
		
		/*
		AddOperator addOperator = new AddOperator();
		
		addOperator.add(10, 20);
		
		addOperator.add(1.5f, 2.5f);
		
		addOperator.add(3.14, 9.8);
		
		addOperator.add("Hello", "World");
		
		// 팀작업 할 때 상대방의 코드를 절대 직접 바꾸지 말고 바꿔달라는 요청을 해야한다
		// 
		*/
		
		
		Score score = new Score();
		score.printStudentScore(90, 80, 70);   // 3명의 총점과 평균
		
		
		/*
		 * 요구사항-II : 2명 학생 전학 왔다.
		 */
		score.printStudentScore(90, 80, 70, 100, 90); // 5명
		
		
		/*
		 * 요구사항-III : 1명 학생 전학 갔다.
		 */
		score.printStudentScore(90, 80, 70, 100);  // 4명
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
