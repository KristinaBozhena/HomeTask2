package com.christina;

import org.springframework.beans.factory.annotation.Autowired;

public class IdealChild implements Child {
	public String hobby;
	private String name;
	private String phone;

	public IdealChild(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public void study() {
		System.out.println("I did all hometask!!!");

	}

	public boolean isHappy() {
		return true;
	}

	@Autowired
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String doHobby() {
		setHobby(hobby);
		return hobby;
	}

	@Override
	public String toString() {
		return "BadChild: name - " + name + ", phone - " + phone + ". " + doHobby();
	}

}
