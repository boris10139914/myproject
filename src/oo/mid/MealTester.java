package oo.mid;

import java.util.Scanner;

public class MealTester {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Meal m = new Meal(50.0f, 0.9f, "漢堡");

		System.out.println("請輸入顧客餐點");
		m.name = s.nextLine();
		m.totalprice = m.sum(50.0f, 0.9f);
		System.out.println("顧客點的是" + m.name + "顧客要付的價錢是" + m.totalprice);
	}
}
