package javaexecute1;

import javaelogic1.Person;

public class Main {

	public static void main(String[] args) {
		//問題5：Main.javaの引数にweightの60を入れてください
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		System.out.println();
		
		person1.print();
		
		System.out.println();
		//問題10：人数の合計を「合計○人です」と出力してください。
		System.out.println("合計" + Person.getCount() + "人です");		
	}
}

