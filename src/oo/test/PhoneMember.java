package oo.test;

public class PhoneMember extends Member {
	String phone;
	boolean verified = false;

	// 沒有建構子會補一個java會自動補一個建構子,裡面有super();
	// 呼叫父類別的建構子,也就是說會再印一次
	public PhoneMember(String name) {//建構子1
		super(name);//呼叫父類別要同樣格式
	}

	public PhoneMember() {//建構子2
		super();//呼叫父類別要同樣格式
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isVerified() {// is 不是get 要注意
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

}
