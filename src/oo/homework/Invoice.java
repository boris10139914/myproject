package oo.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		// 作業: 照片 把4個號碼用arraylist處理然後用迴圈比對是否中獎
		String q = "331";
		// ---------012345678 第幾格
		// String n = "123456331";
		// System.out.println(n.length());
		// String sub =n.substring(5);//5代表取第5個後面的

		ArrayList<String> a = new ArrayList();
		Scanner s = new Scanner(System.in);
		boolean o = true;
		a.add("331");// 0
		a.add("821");
		a.add("886");
		a.add("554");
		while (o == true) {
			System.out.println("請輸入8位發票號碼:");
			String invoice = s.nextLine();
			System.out.println("您輸入的發票:" + invoice + "   中獎末三碼" + q);
			String sub = invoice.substring(invoice.length() - 3);
			System.out.println("您的末三碼" + sub);
			int i = Integer.parseInt(sub);
			int j = Integer.parseInt(a.get(1));

			/*
			 * System.out.println(i); System.out.println(j);
			 */
			if (i == j) {
				System.out.println("恭喜您中獎");
				break;
			} else {
				System.out.println("沒中獎請繼續輸入");

			}
			// 自己思考
		}

	}
}