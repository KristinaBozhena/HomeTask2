package com.christina;

import java.util.Map;

public class IdealChild implements Child {
	public String hobby;
	private String name;
	private Map<String, String> phoneNos;

	public IdealChild(String name, Map<String, String> phoneNos) {
		super();
		this.name = name;
		this.phoneNos = phoneNos;
	}

	public void study() {
		System.out.println("I did all hometask!!!");

	}

	public boolean isHappy() {
		return true;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String doHobby() {
		setHobby(hobby);
		return "I like " + hobby;
	}

}
