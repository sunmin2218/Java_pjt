package com.office.member;

public class MainClass {

	public static void main(String[] args) {

//		new MemberController().execute();

//		MemberContainer memberContainer = MemberContainer.getInstance();
//		memberContainer.getMemberController().execute();

		MemberContainer.getInstance().getMemberController().execute();

		// 한 번만 사용해야 되는 서비스, 컨트롤러, DAO 를 하나의 컨테이너 클래스에 묶어서
		// 싱글톤으로 만들었다

	}

}
