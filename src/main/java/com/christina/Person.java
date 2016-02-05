package com.christina;

import java.util.Map;
import java.util.Map.Entry;

public class Person implements Persons {
	private String hobby;
	private String name;
	private Map<String, String> phoneNos;

	public Person(String name, Map<String, String> phoneNos) {
		super();
		this.name = name;
		this.phoneNos = phoneNos;
	}

	public void showPhoneNos() {
		for (Entry<String, String> entry : phoneNos.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}

	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String doHobby() {
		return null;
	}

	@Override
	public String toString() {
		return "Person: name - " + name + ". ";
	}
}
