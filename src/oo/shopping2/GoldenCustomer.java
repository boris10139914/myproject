package oo.shopping2;

public class GoldenCustomer extends Customer {
	float returnRate = 0.05f;

	public GoldenCustomer(int price) {
		super(price);// 呼叫父類別建構子
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

		System.out.println(price + "\t" + (price * discount) + "\t" + (price * returnRate));
	}
}
