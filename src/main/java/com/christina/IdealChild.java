package com.christina;

public class IdealChild implements Child {
	public String hobby;
	
	public void study() {
		System.out.println("I have an exellent marks!!!");
		
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
