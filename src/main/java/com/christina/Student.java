package com.christina;

public class Student {
	private int studentId;
	private String pib;
	private int course;

	public Student() {
	}

	public Student(String pib, int course) {
		super();
		this.pib = pib;
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

}