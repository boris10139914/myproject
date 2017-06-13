package oo.test;

public class Member {
	String id;
	private int age;// 封裝 其他人不能改
	String name;

	public Member() {
		System.out.println("member constructor");
	}

	void setAge(int age) {// 設定進來,沒有public就是只有本身這個package可以用
		this.age = age;
		if (age < 0) {
			age = 0;
		}
		this.age = age;

	}

	public int getAge() { // 讓別人用
		return age;
	}
}
