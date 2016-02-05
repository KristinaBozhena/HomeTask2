package com.christina;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Person implements Persons {
	private int id;
	private String name;
	private Map<String, String> phoneNos;

	public Person(int id, String name, Map<String, String> phoneNos) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNos = phoneNos;
	}

	public void showPhoneNos() {
		for (Entry<String, String> entry : phoneNos.entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}

	}

	public void setHobby(String hobby) {

	}

	public String doHobby() {
		return null;
	}
}
