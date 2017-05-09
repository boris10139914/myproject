package oo.stati;

public class GraduateStudent extends Student {
	int thisis;
	
	public GraduateStudent(int english, int math, int chinese,int thisis){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		this.thisis = thisis;
}
	@Override
	public void print() {
		System.out.println(getScore(english) + "\t" +getScore(math) + "\t" + getScore(chinese) + "\t" + getScore(thisis));
	}

}