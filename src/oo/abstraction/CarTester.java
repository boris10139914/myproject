package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("Toyota", 1800, "Altis");
		Car c2 = new Car("Mercedes", 3500, "cls");
		Car c3 = new Car("Toyoya", 2000, "Wish");
		Car[] cars = new Car[3];
		cars[0] = new Car("Toyota", 1800, "Altis");
		cars[1] = new Car("Mercedes", 3500, "cls");
		cars[2] = new Car("Toyoya", 2000, "Wish");
		cars[0].id = 222;
		System.out.println(cars[0].name);
		for (int i = 0; i < 3; i++) { // i的生存空間Scope到-
			System.out.println(cars[i].name);
		} // 這
		class AA {
		}
		AA a = new AA();
	}
}