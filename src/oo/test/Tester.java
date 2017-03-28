package oo.test;

import java.util.ArrayList;

import oo.abstraction.Car;

public class Tester {

	public static void main(String[] args) {
		Car c = new Car("XX", 2000, "name");
		ArrayList<String> a = new ArrayList(); // (只能字串)
		// String[] numbers={"331","821","886","554"}原本
		a.add("331");// 0
		a.add("821");// 1
		a.add("886");// 2
		// a.add(123);
		// a.add(true);
		System.out.println(a.size());
		a.add("554");// 3
		System.out.println(a.size());
		a.set(2, "885");// 886改成885
		System.out.println(a);
		String data = a.get(3);// 不用特別轉字串 String data =(String)a.get(3);
		// int n =(int)a.get(4);
		System.out.println(data);
	}

}
