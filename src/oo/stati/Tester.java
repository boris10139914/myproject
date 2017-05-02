package oo.stati;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		System.out.println(Student.pass);// 還沒new就已經存在
		Student stu1 = new Student(58, 98, 66);
		Student stu2 = new Student(89, 56, 77);
		stu1.pass = 100;// 取代student的pass基本值
		stu1.print();
		stu2.print();
		GraduateStudent gstu = new GraduateStudent(66, 77, 88, 99);
		gstu.print();
		// gstu1.
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(58, 98, 66));
		list.add(new Student(89, 56, 77));
		list.add(new GraduateStudent(66, 77, 88, 99));
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			stu.print();
			//把new出來的物件放到arraylist 
		}
	}

}
