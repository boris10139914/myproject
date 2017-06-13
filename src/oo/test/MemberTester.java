package oo.test;

public class MemberTester {

	public static void main(String[] args) {
		Member member = new Member();// 印建構子
		member.setAge(-5);
		System.out.println(member.getAge());

		// Phone Member
		PhoneMember member2 = new PhoneMember("BORIS");// 印建構子

	}

}
