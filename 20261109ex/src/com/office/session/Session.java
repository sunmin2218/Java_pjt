package com.office.session;

import java.util.HashMap;

// 세션도 하나만 존재해야하기 때문에 컨테이너처럼 싱글톤으로 만든다
public class Session {
	
	private static Session session;
	
	
	// memberField
	final private HashMap<String, Object> attributies;
	
	
	
	private Session() {
		this.attributies = new HashMap<String, Object>(); // this. 안써도 된다
	}
	
	public static Session getInstance() {
		if (session == null)
			session = new Session();
		
		return session;
	}
	
	public Object getAttribute(String name) {
		return attributies.get(name);
	}
	
	
	// 이건 기존의 세터가 아니라 어트리부트의 키벨류를 넣어주기 위해 쓰는 세터이다
	public void setAttribute(String name, Object object) {
		attributies.put(name, object);
		
	}
	
	public void removeAttribute(String name) {
		attributies.remove(name);
	}
	
}
