package com.javatoybox.firsthomework;

public class HomeWorkSystemReal {

	public static void main(String[] args) {

		// 先建立需要用到的object instance
		HomeWork homework[] = { new HomeWork(), new HomeWork(), new HomeWork() };
		Student student[] = { new Student("玩野", 1), new Student("揩野", 2), new Student("撈野", 3) };
		Teacher teacher = new Teacher("機智");

		// 示範用的問題及答案
		String home_work_title = "第一次功課大戰";
		String[] Q = { "Q1. 請計算IT行業的人均收入(HKD月薪)，數據如下︰\r\n" + 
				"	support		18000\r\n" + 
				"	programmer	22000\r\n" + 
				"	system analysis	36000\r\n" + 
				"	project manager	45000\r\n" + 
				"	chief technical officer	150000", "Q2. 跟據上題答案，請發表對IT行業的看法︰", "Q3. IT is ______" };
		
		String[] A1 = { "A1. 54200", "A1. Low Tech撈野High Tech揩野", "A3 Shit" };
		String[] A2 = { "A2. 36000", "A2. IT狗，你的資訊真的很有用", "A3  Dog" };
		String[] A3 = { "A3. 10000", "A3. IT狗，做到嘔", "A3. Rubbish" };

		// 老師設定功課標題
		teacher.assignHomeWork(homework[0], home_work_title, student[0], Q);
		teacher.assignHomeWork(homework[1], home_work_title, student[1], Q);
		teacher.assignHomeWork(homework[2], home_work_title, student[2], Q);

		// 學生做功課
		student[0].dohomework(homework[0], A1);
		student[1].dohomework(homework[1], A2);
		student[2].dohomework(homework[2], A3);
		
		// 功課標題
			System.out.println(homework[0].getTitle() + '\n');
		// 用enhance for loop顯示結果
		for (HomeWork h : homework) {
			System.out.println(h.displayHomeWork());
		}
	}

}
