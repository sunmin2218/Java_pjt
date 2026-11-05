package com.office.diary;

import java.util.ArrayList;

public class DiaryDao {
	
	// [] 배열은 길이 수정이 안된다 그래서 ArrayList 라는게 만들어졌다
	
	private ArrayList<String> diaries = new ArrayList<String>();

	public boolean insertDiary(DiaryDto diaryDto) {
		
		int beforSize = diaries.size();
		
//		diaries.add(diaryDto.getTxt());   
		diaries.add(0, diaryDto.getTxt());   // 이렇게 하면 최신 데이타를 항상 맨 앞에 쌓이니까
		// 나중에 조회할 때 가장 최신 데이터를 가장 먼저 볼 수 있게 된다
		
		int afterSize = diaries.size();
		
		return afterSize > beforSize ? true : false;
	}
	// 데이터가 중요하기 때문에 뒤에서부터인 DAO 부터 코딩하는 것이 좋다
	// 데이터 베이스 구조를 어떻게 잡을까 를 먼저 구상하는 것이 좋다
	// 자바는 한 번 배열을 설정하면 조정이 안되니까 array list 를 쓴다
	
	public ArrayList<String> getDiaries() {
		return diaries;
	}
	
	
}
