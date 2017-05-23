package oo.shopping;

public class SilverCustomer extends Customer {
	float discount = 0.9f;

	public SilverCustomer(int price) {
		super(price);// 呼叫父類別建構子 
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println(price + "\t" + (price * discount) + "\t");
	}

}
