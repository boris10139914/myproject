package oo.shopping;

public class GoldenCustomer extends SilverCustomer {

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