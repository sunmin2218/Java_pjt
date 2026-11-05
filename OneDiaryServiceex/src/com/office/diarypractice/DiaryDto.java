package com.office.diarypractice;

public class DiaryDto {
	
    public DiaryDto() {}
	
	public DiaryDto(String txt) {
		super();
		this.txt = txt;
	}

	private String txt;
	
	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

}
