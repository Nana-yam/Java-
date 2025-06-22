package javaelogic1;

public class Person {	
	// 問1 インスタンスフィールドを定義
	// 問4インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）	
	public String name;
	public int age;
	public double height;
	public double weight;

	// 問2,3 コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name,int age, double height, double weight){
		 this.name = name;
		 this.age = age;
		 this.height = height;	
		 this.weight = weight;
		 count ++;
	}
	 
	//問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	//問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
	double bmi() {
		return Math.floor(this.weight / (this.height * this.height)) * 10.0 / 10.0;
	}
	 
	//問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	//問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
	public void print() {	
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");	 
	}
	
	static int count = 0;
	public static int getCount() {
		return count;
	}	 
}



