package com.office.methodex01;

public class Score {

	
	// 메서드
	/*
	 * 요구사항-I : 학급 학생(3명)의 총점과 평균을 출력하는 메서드 만들자
	 */
	public void printStudentScore(int...scores) {  // int[] 배열로 들어온다
		// 총점
		int totalScore = 0;
		for (int score : scores) {
			totalScore += score;
		}     
		// 평균
		double averageScore = totalScore / scores.length;
		
		System.out.println("Total: " + totalScore);
		System.out.println("Average: " + averageScore);
		
	}
	
	/*
	 * 가변인자는 무조건 파라미터 마지막에 와야한다.
	 * 가변인자는 배열이다
	 * 오버로딩과 가변인자는 같이 사용 가능하다
	 */
	
	
	public void printTotalScore(int...scores) {
		
	}
	
    public void printTotalScore(String className, int...scores) {
		
	}
	
	
//	public void printStudentScore(int s1, int s2, int s3, int s4, int s5) {
//		
//		int totalScore = s1 + s2 + s3 + s4 + s5;
//		double averageScore = totalScore / 5;
//		
//		System.out.println("Total: " + totalScore);
//		System.out.println("Average: " + averageScore);
//		
//	}
//	
//	
//	public void printStudentScore(int s1, int s2, int s3, int s4) {
//		
//		int totalScore = s1 + s2 + s3 + s4;
//		double averageScore = totalScore / 4;
//		
//		System.out.println("Total: " + totalScore);
//		System.out.println("Average: " + averageScore);
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}
