package oo.shopping2;

public abstract class Customer {
	int price;
	float discount = 0.9f;
	float returnRate = 0.05f;
	public Customer(int price) {
		this.price = price;
	}

	public abstract void print();//抽象
}
