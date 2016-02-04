package com.christina;

public class BadChild implements Child{
	public String hobby;

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
