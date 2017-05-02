package oo.abstraction;

public class Car {
	String brand;
	int cc;
	String name;
	String type;
	int status;
	int id;
	float milage;

	public Car() {
		
	}
	public Car(String brand, String name) {
		this(brand, 0, name);
		System.out.println("此建構子較特別");
	}

	public Car(String brand, int cc, String name) {// 區域變數(String brand, int cc,
													// String name) 包含下面的 =
													// brand;..
		this.brand = brand;
		this.cc = cc;
		this.name = name;

	}

	public void setMilage(int m) {
		milage = m;
	}

	public float addMilage(int m) {
		milage = milage + m;
		return milage;
	}

	public void maintain() {
		status = 5;
	}

	public void/* RuturnType:void是回傳值的種類 */ xxxx/* meth方法名稱 */()/* 括號內回傳的值 */ {

	}

}