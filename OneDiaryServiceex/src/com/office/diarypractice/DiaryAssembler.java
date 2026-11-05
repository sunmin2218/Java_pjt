package com.office.diarypractice;

public class DiaryAssembler {
	
	private static DiaryAssembler diaryAssembler;
	
	DiaryDao diaryDao = new DiaryDao();
	DiaryService diaryService = new DiaryService(diaryDao);
	DiaryController diaryController = new DiaryController(diaryService);
	
	private DiaryAssembler() {}
	
	public static DiaryAssembler getInstance() {
		if (diaryAssembler == null) {
			diaryAssembler = new DiaryAssembler();
		}
		return diaryAssembler;
	}
	
	public DiaryController getDiaryController() {
		return diaryController;
	}
	
	public DiaryService getDiaryService() {
		return diaryService;
	}
	
	public DiaryDao getDiaryDao() {
		return diaryDao;
	}
	
	
	
}
