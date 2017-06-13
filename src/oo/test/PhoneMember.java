package oo.test;

public class PhoneMember extends Member {
	String phone;
	boolean verified = false;
//沒有建構子會補一個java會自動補一個建構子,裡面有super();
//呼叫父類別的建構子,也就是說會再印一次
}
