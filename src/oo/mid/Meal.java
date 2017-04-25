package oo.mid;

public class Meal {// for MacDonald's ordering process
	float price;// 餐點價錢
	float sale;// 餐點搭配活動打折
	String name;// 餐點名稱
	float totalprice;// 消費者所需支付總金額
	public float sum(float p, float s) {
		price = p;
		sale = s;
		totalprice = (p * s);
		return totalprice;
	}

	public Meal(float price, float sale, String name) {
		this.price = price;
		this.sale = sale;
		this.name = name;

	}

	
}