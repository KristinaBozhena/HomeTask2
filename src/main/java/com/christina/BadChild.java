package com.christina;

public class BadChild implements Child {

	public String hobby;
	private String name;
	private String phone;

	public BadChild(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public void study() {
		System.out.println("I don't go to school.");

	}

	public boolean isHappy() {
		return false;
	}

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
