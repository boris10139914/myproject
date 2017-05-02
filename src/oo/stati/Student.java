package oo.stati;

public class Student {
	int english;// 物件屬性
	int math;
	int chinese;
	static int pass = 80;// 類別屬性
	static {
		System.out.println(pass);//因為pass也是static 其他物件還沒生成就已經有了
		System.out.println("static 區塊先執行  物件還沒生成也就是不能用類別裡面的屬性  在準備工作時可以寫這區塊");
	}
	public Student() {
		
	}

	public Student(int english, int math, int chinese) {
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}

	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(math) + "\t" + getScore(chinese));
	}

	protected String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";
		} else {
			return String.valueOf(score);
		}
	}
}
