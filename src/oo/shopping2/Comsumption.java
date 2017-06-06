package oo.shopping2;

import java.util.ArrayList;

import oo.shopping2.Customer;
import oo.shopping2.GoldenCustomer;
import oo.shopping2.SilverCustomer;
import oo.shopping2.NormalCustomer;

public class Comsumption {

	public static void main(String[] args) {
		ArrayList<Customer> clist = new ArrayList<>();
		clist.add(new NormalCustomer(10000));
		clist.add(new SilverCustomer(10000));
		clist.add(new GoldenCustomer(10000));
		clist.add(new NormalCustomer(8000));
		clist.add(new SilverCustomer(7000));
		clist.add(new GoldenCustomer(6000));
		System.out.println("*:SilverCustomer");
		System.out.println("~:GoldenCustomer");
		System.out.println("價錢" + "\t" + "折扣後" + "\t" + "還原金");
		for (Customer c : clist) {
			// instanceof 看他是屬於哪裡的
			// 把右邊的clist從第一筆到最後一筆照順序放入左邊的Customer c
			if (c instanceof SilverCustomer && !(c instanceof GoldenCustomer)) {
				System.out.print("*");
				// SilverCustomer silver = (SilverCustomer) c;
				// 父類別的參照可以放置子類別的物件 把c轉成銀 再放到銀
				// 真是困難

			}
			if (c instanceof GoldenCustomer) {
				System.out.print("~");
			}

			/*
			 * 以下為原本的方法 if(c instanceof SilverCustomer &&!(c instanceof
			 * GoldenCustomer)){ System.out.print("*"); } if(c instanceof
			 * GoldenCustomer){ System.out.print("~"); }
			 */

			c.print();
		}

	}
}