package oo.mid;

public class Ticket {
	int id;;
	String name;
	float price;

	public int setterId(int i) {
		id = i;
		return id;
	}

	public int getterId(int j) {
		id = j;
		return id;
	}

	public float setterPrice(int m) {
		price = m;
		return price;
	}

	public float getterPrice(int n) {
		price = n;
		return price;
	}

	public String setterName(String p) {
		name = p;
		return name;
	}

	public String getterName(String q) {
		name = q;
		return name;
	}
}