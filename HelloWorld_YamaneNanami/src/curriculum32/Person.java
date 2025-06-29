package curriculum32;

import curriculum33_2.Car;
import curriculum33_3.Bicycle;

public class Person {	
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	//問題1：インスタンスフィールドに「lastName」を追加しましょう
	public String lastName;
	
	//問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
	//※順番はfirstNameの次
	//問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
	public Person(String firstName, String lastName,int age, double height, double weight){	
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count ++;
	}

	public String fullName(){	
		return this.firstName + this.lastName;
	}

	public void print() {	
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
	
	//問題6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）
	//問題7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
	//問題8：さらに、「〇〇が購入しました」と出力する処理を追加してください。
	//問題9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}









