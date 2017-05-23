package oo.io;

import java.io.FileOutputStream;
import java.util.Scanner;

public class SumScores {

	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("請輸入成績:");
			String data = s.nextLine();
			try{//在try之中 只要出現錯誤就直接跳到catch 錯誤後面的程式碼不再執行
			int score = Integer.parseInt(data);
			sum = sum + score;}catch(NumberFormatException e){
				//有抓到number格式問題就進入這兩行,可以很多catch
				System.out.println("成績格式不符規定");
				i--;
				//若try&catch沒有問題就直接跳到-----
			}
		}
		System.out.println(sum);//---這裡
	}

}
