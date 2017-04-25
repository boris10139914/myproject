package oo.mid;

public class Ticket {
	int id;;
	String name;
	float price;

	public void setterId(int id) {
		this.id =id;
		
	}

	public int getterId() {
		
		return id;
	}

	public void setterPrice(float price) {
		this.price =price;
	}

	public float getterPrice() {	
		return price;
	}

	public void setterName(String name) {
	 this.name =name;
	}

	public String getterName() {
		return name;
	}
}