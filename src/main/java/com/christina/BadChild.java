package com.christina;

import java.util.Map;

public class BadChild implements Child{
	public String hobby;
	private String name;
	private Map<String, String> phoneNos;

	public BadChild(String name, Map<String, String> phoneNos) {
		super();
		this.name = name;
		this.phoneNos = phoneNos;
	}

	public void study() {
		System.out.println("I don't go to school");
		
	}

	public boolean isHappy() {
		return false;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
		
	}

	public String doHobby() {
		setHobby(hobby);
		return "I like " + hobby;
	}
	

}
