package FoodReminder;

public class Cookies {
	String type;// 洋芋片
	String flavor; // 海苔
	int day;// 假設30天後過期

	public Cookies(String type, String flavor, int day) {
		this.type = type;
		this.flavor = flavor;
		this.day = day;
	}
}