package com.office.ex;


/*
 * 싱글턴 클래스로 만들자!
 */
public class PayCount {
	
	// 멤버필드( 속성 )
	private static PayCount payCount = null;
	private int cnt = 0;
	
	
	// 생성자
	private PayCount() {
		
	}
	
	
	// 메서드
//	public PayCount getPayCountInstance() {
//		if (payCount == null) {
//			payCount = new PayCount();
//		}
//		return payCount;
//	}
	
	// getPayCountInstance() 얘는 스태틱으로 가버리면 속성에 있는 payCount가
	// 못찾으니까 payCount 의 데이터 타입 앞에도 스태틱을 붙여준다
	
	public static PayCount getPayCountInstance() {
		if (payCount == null) {
			payCount = new PayCount();
		}
		return payCount;
	}


	
	// cnt 가 0 에서 올라가게 만들기 위해
	
	// 조회
	public int getCnt() {
		return cnt;
	}
	
	// 설정 초기화
	public void setCnt() {
		this.cnt++;
	}
	
	
	
	// stack    heap    static
	// 스태틱 메서드, 스태틱 멤버필드
	
	
	
	
}
