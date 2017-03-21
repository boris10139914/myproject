package FoodReminder;

public class Drinks {
	String type;// 汽水
	String flavor; // 可樂
	int day;// 假設10天後過期

	public Drinks(String type, String flavor, int day) {
		this.type = type;
		this.flavor = flavor;
		this.day = day;
	}
}
