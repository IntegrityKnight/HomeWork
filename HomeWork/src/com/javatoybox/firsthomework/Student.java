package com.javatoybox.firsthomework;

public class Student {
	private String student_name;
	private Integer student_number;

	public Student(String student_name, Integer student_number) {
		super();
		this.student_number = student_number;
		this.student_name = student_name;
	}

	public String getName() {
		return student_name;
	}

	public void setName(String name) {
		this.student_name = name;
	}

	public Integer getNumber() {
		return student_number;
	}

	public void setNumber(Integer number) {
		this.student_number = number;
	}

	public void dohomework(HomeWork homework, String[] answer) {
		homework.setAnswer(answer);
	}
}
