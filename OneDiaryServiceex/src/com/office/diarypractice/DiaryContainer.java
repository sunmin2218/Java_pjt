package com.office.diarypractice;

public class DiaryContainer {
	
	DiaryDao diaryDao = new DiaryDao();
	DiaryService diaryService = new DiaryService(diaryDao);
	DiaryController diaryController = new DiaryController(diaryService);
	
	
}
