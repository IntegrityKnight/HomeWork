package com.javatoybox.firsthomework;

public class HomeWorkSystem {

	public static void main(String[] args) {

		// ���إ߻ݭn�Ψ쪺object instance
		HomeWork homework[] = { new HomeWork(), new HomeWork(), new HomeWork() };
		Student student[] = { new Student("Std1", 1), new Student("Std2", 2), new Student("Std3", 3) };
		Teacher teacher = new Teacher("T1");

		// �ܽd�Ϊ����D�ε���
		String home_work_title = "First Homework";
		String[] Q1 = { "Q1a", "Q2a", "Q3a" };
		String[] Q2 = { "Q1b", "Q2b", "Q3b" };
		String[] Q3 = { "Q1c", "Q2c", "Q3c" };
		String[] A1 = { "A1a", "A2a", "A3a" };
		String[] A2 = { "A1b", "A2b", "A3b" };
		String[] A3 = { "A1c", "A2c", "A3c" };

		// �Ѯv�]�w�\�Ҽ��D
		teacher.assignHomeWork(homework[0], home_work_title, student[0], Q1);
		teacher.assignHomeWork(homework[1], home_work_title, student[1], Q2);
		teacher.assignHomeWork(homework[2], home_work_title, student[2], Q3);

		// �ǥͰ��\��
		student[0].dohomework(homework[0], A1);
		student[1].dohomework(homework[1], A2);
		student[2].dohomework(homework[2], A3);
		/*
		 * // �]�w�\�Ҽ��D 
		 * homework[0].setTitle(work);
		 * homework[1].setTitle(work);
		 * homework[2].setTitle(work);
		 * 
		 * // �]�w�D�� 
		 * homework[0].setQuestion(Q1); 
		 * homework[1].setQuestion(Q2);
		 * homework[2].setQuestion(Q3);
		 * 
		 * // �ǥͰ��\��
		 * homework[0].setAnswer(A1);
		 * homework[1].setAnswer(A2);
		 * homework[2].setAnswer(A3);
		 */
		// ��enhance for loop��ܵ��G
		for (HomeWork h : homework) {
			System.out.println(h.displayHomeWork());
		}
	}
}
