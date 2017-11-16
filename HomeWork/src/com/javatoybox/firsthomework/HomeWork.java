package com.javatoybox.firsthomework;

public class HomeWork {

	private String title;
	private String question[];
	private String answer[];
	private Student student;
	private StringBuilder sb;

	public HomeWork() {
		super();
		sb = new StringBuilder();
	}

	public HomeWork(String homework_title) {
		super();
		this.title = homework_title;
		sb = new StringBuilder();
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getQuestion() {
		return question;
	}

	public void setQuestion(String question[]) {
		this.question = question;
	}

	public String[] getAnswer() {
		return answer;
	}

	public void setAnswer(String answer[]) {
		this.answer = answer;
	}

	public StringBuilder displayHomeWork() {
		sb.append("student_name: " + student.getName() + " student_number: ");
		sb.append(student.getNumber() +" "+ '\n');
		int i = 0;
		while (question.length > i) {
			sb.append((question[i] + '\n'));
			sb.append((answer[i] + '\n'));
			i++;
		}
		return sb;
	}
}
