package oo.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		// 作業: 照片 把4個號碼用arraylist處理然後用迴圈比對是否中獎
		String q = "331";
		// ---------012345678 第幾格
		String n = "123456331";
		System.out.println(n.length());
		// String sub =n.substring(5);//5代表取第5個後面的
		String sub = n.substring(n.length() - 3);
		System.out.println(sub);
		ArrayList<String> a = new ArrayList();
		Scanner s = new Scanner(System.in);
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		while (a.size() == 4) {
			System.out.println("請輸入發票號碼:");
			String invoice = s.nextLine();
//自己思考
		}

	}
}