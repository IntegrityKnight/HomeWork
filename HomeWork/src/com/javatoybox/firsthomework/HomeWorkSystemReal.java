package com.javatoybox.firsthomework;

public class HomeWorkSystemReal {

	public static void main(String[] args) {

		// ���إ߻ݭn�Ψ쪺object instance
		HomeWork homework[] = { new HomeWork(), new HomeWork(), new HomeWork() };
		Student student[] = { new Student("����", 1), new Student("�{��", 2), new Student("����", 3) };
		Teacher teacher = new Teacher("����");

		// �ܽd�Ϊ����D�ε���
		String home_work_title = "�Ĥ@���\�Ҥj��";
		String[] Q = { "Q1. �Эp��IT��~���H�����J(HKD���~)�A�ƾڦp�U�J\r\n" + 
				"	support		18000\r\n" + 
				"	programmer	22000\r\n" + 
				"	system analysis	36000\r\n" + 
				"	project manager	45000\r\n" + 
				"	chief technical officer	150000", "Q2. ��ڤW�D���סA�еo���IT��~���ݪk�J", "Q3. IT is ______" };
		
		String[] A1 = { "A1. 54200", "A1. Low Tech����High Tech�{��", "A3 Shit" };
		String[] A2 = { "A2. 36000", "A2. IT���A�A����T�u���ܦ���", "A3  Dog" };
		String[] A3 = { "A3. 10000", "A3. IT���A�����", "A3. Rubbish" };

		// �Ѯv�]�w�\�Ҽ��D
		teacher.assignHomeWork(homework[0], home_work_title, student[0], Q);
		teacher.assignHomeWork(homework[1], home_work_title, student[1], Q);
		teacher.assignHomeWork(homework[2], home_work_title, student[2], Q);

		// �ǥͰ��\��
		student[0].dohomework(homework[0], A1);
		student[1].dohomework(homework[1], A2);
		student[2].dohomework(homework[2], A3);
		
		// �\�Ҽ��D
			System.out.println(homework[0].getTitle() + '\n');
		// ��enhance for loop��ܵ��G
		for (HomeWork h : homework) {
			System.out.println(h.displayHomeWork());
		}
	}

}
