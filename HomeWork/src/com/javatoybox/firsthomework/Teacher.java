package com.javatoybox.firsthomework;

public class Teacher {

	private String teacher_name;
	private String staff_number;

	public Teacher(String teacher_name) {
		super();
		this.teacher_name = teacher_name;
	}

	public void setTitle(HomeWork homework, String title) {
		homework.setTitle(title);
	}

	public void assignHomeWork(HomeWork homework, String title, Student student, String[] questions) {
		homework.setTitle(title);
		homework.setStudent(student);
		homework.setQuestion(questions);
	}

	public String getName() {
		return teacher_name;
	}

	public void setName(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getStaff_number() {
		return staff_number;
	}

	public void setStaff_number(String staff_number) {
		this.staff_number = staff_number;
	}

}
