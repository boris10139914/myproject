package oo.test;

public class Member {
	String id;
	private int age;// 封裝 其他人不能直接改,只能用
	String name;

	public Member(String name) {// 建構子1
		System.out.println("member constructor");
		this.name = name;
	}

	public Member() {// 建構子2

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
