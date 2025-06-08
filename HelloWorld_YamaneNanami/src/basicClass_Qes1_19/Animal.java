package basicClass_Qes1_19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog();
		System.out.println(dog.name);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog animal = new Dog(3);
		System.out.println(animal.count);
		
				
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime nowDate = LocalDateTime.now();
		
		// HH:mm:ss の表記に変えています
		DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 		
		String formatNowDate = dtf1.format(nowDate); 
		System.out.println(formatNowDate);
		
	}

}
