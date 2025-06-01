package curriculumA;

public class Qes113 {
    // [概要]変数宣言、代入、型変換処理
    // [詳細]変数宣言の後初期化・代入、型変換を行い出力する
	public static void main(String[] args) {
        // 1,2,3 ローカル変数として宣言→初期値を代入し初期化→初期化したそれぞれの変数に値を代入		
		// バイト型
		byte b;
        // ローカル変数として宣言	
		b = 0;   
        // 初期値を代入し初期化		
		b = 10;
        // 初期化した変数に値を代入 		
		
		// 短整数型
		short s;
		// ローカル変数として宣言
		s = 0; 
		// 初期値を代入し初期化	
		s = 100;
		// 初期化した変数に値を代入
		
		// 整数型
		int age;
		// ローカル変数として宣言
		age = 0;   
		// 初期値を代入し初期化	
		age = 1000;
		// 初期化した変数に値を代入
		
		// 長整数型
		long l;
		// ローカル変数として宣言
		l = 0;   
		// 初期値を代入し初期化	
		l = 10000;
		// 初期化した変数に値を代入
		
		// 単精度浮動小数点数型
		float f;
		// ローカル変数として宣言
		f= 0.0f;  
		// 初期値を代入し初期化	
		f = 9.5f;
		// 初期化した変数に値を代入
		
		// 倍精度浮動小数点数型
		double d;
		// ローカル変数として宣言
		d = 0.0;   
		// 初期値を代入し初期化	
		d = 10.5;
		// 初期化した変数に値を代入
		
		// 文字型
		char c;
		// ローカル変数として宣言
		c = 'x';    
		// 初期値を代入し初期化	
		c = 'a';
		// 初期化した変数に値を代入
		
		// 文字列型
		String name;
		// ローカル変数として宣言
		name = "山田太郎";
		// 初期値を代入し初期化	
		name = "ハロー";
		// 初期化した変数に値を代入
		
		// ブーリアン型
		boolean flag;
		// ローカル変数として宣言
		flag = false;  
		// 初期値を代入し初期化	
		flag = true;
		// 初期化した変数に値を代入
	
		System.out.println("---------------------------------");
	
        // 4 上記で作成した変数を使用し、課題の通りコンソール出力を	できるようにする	
		System.out.println( b + 11100);
        // (b = 10)	+ 11100	
		System.out.println( s - 80);
        // (s = 100) - 80		
		System.out.println( c + name + flag);
        // (c = a) + (name = "ハロー") + (flag = true)		
		System.out.println( b + s + age + l + f + d);
        // (b = 10)+(s = 100)+(age = 1000)+(l = 10000)+(f = 9.5f)+(d = 10.5)		
		System.out.println( b * s * age * l );
        // (b = 10)*(s = 100)*(age = 1000)+(l = 10000)
		System.out.println( d / s );
        // (d = 10.5)/(s = 100)		
		System.out.println( b - s );
        // (b = 10)-(s = 100)		
	
		System.out.println("---------------------------------");
	
        // 5 ハローJAVA2023と表示されるよう修正を行う		
		String num = "20";
		Integer.parseInt( "20");
		
        // numの値が文字列になっているので、数値に変換する。
		int num1 = 23;
		System.out.println( "ハローJAVA" + ( num + num1));
	
		System.out.println("---------------------------------");
	
        // 6 情報をローカル変数に代入し、フォーマットの通りにコンソールに出力
		name = "山田太郎";
        // 文字列型変数に"山田太郎"を代入
		
		System.out.println( "初めまして"+ name + "です" );
        // 出力する
	
		age = 18;
        // 整数型に"18"を代入		
		System.out.println( "年齢は"+ age + "歳です" );
		// 出力する
		
		d  = 170.5;
        // 倍精度浮動小数点数型に170.5を代入		
		System.out.println( "身長は"+ d + "cmです" );
		// 出力する
	
		d  = 62.2;
		// 倍精度浮動小数点数型に62.2を代入
		System.out.println( "体重は" + d + "kgです" );
		// 出力する
	
		String foodName = "寿司";
        // 文字列型に"寿司"を代入(nameと区別するためfoodName)		
		System.out.println( "好きな食べ物は" + foodName + "です" );
		// 出力する
	
		System.out.println("---------------------------------");
		
        // 7 6で作成した自己紹介に続き、変数を使ってbmiが出力されるようにする		
		double height = 1.705;
        // 倍精度浮動小数点数型に代入(メートルで)
		double weight = 62.2;
		// 倍精度浮動小数点数型に代入
		System.out.println("BMIは" + Math.round(weight / height / height) + "です");
        // bmiは(weight/height/height)で求めて出力、Math.roundで小数点切りました。		
	
		System.out.println("---------------------------------");
		
        // 8 6で宣言した変数に再代入し出力する		
		name = "鈴木一郎";
		// 文字列型変数に"鈴木一郎"を代入
		System.out.println( "初めまして" + name + "です");
		// 出力する
	
		age = 24;
		// 整数型に"24"を代入	
		System.out.println("年齢は" + age + "歳です");
		// 出力する
	
		double newHeight = 168.5;
		// 倍精度浮動小数点数型に168.5を代入(重複するためnewHeight表記)
		System.out.println("身長" + newHeight + "cmです");
		// 出力する
	
		double newWeight = 64.2;
		// 倍精度浮動小数点数型に64.2を代入(重複するためnewWeight表記)
		System.out.println("体重は" + newWeight + "kgです");
		// 出力する
	
		foodName = "オムライス";
		// 文字列型に"オムライス"を代入(nameと区別するためfoodName)	
		System.out.println("好きな食べ物は" + foodName + "です");
		// 出力する
	
		double bmi = 64.2 / 1.685 / 1.685;
		// bmiは(weight/height/height)で求めて代入
		System.out.println("BMIは" + Math.round(bmi * 10.0) / 10.0  + "です");
		// (bmi * 10.0)で小数第一位を整数に変換,(Math.round)で四捨五入して整数に,( / 10.0)で小数第一位で出力する
	
		System.out.println("---------------------------------");
		
        // 9 変数【年齢・身長・体重】の数値を和算で自己代入して出力
		System.out.println( "初めまして" + name + "です");
		// 8と変わらないのでそのまま出力する
		System.out.println("年齢は" + (age + 24) +  "歳です");
		// (age = 24) + 24で出力する
		System.out.println("身長" + (newHeight * 2) + "cmです");
		// (newHeight * 2)で出力する
		System.out.println("体重は" + (newWeight * 2) + "kgです");
		// (newWeight * 2)で出力する
		System.out.println("好きな食べ物は" + foodName + "です");
		// 8と変わらないのでそのまま出力する
		bmi = 128.4 / 3.37 / 3.37;
        // bmiを求める(身長はメートルに変換して計算)
		System.out.println("BMIは" + Math.round( bmi * 100.0) / 100.0  + "です");
		// (bmi * 100.0)で小数第二位を整数に変換,(Math.round)で四捨五入して整数に,( / 100.0)で小数第二位で出力する
	
		System.out.println("---------------------------------");
		
        // 10 年齢が25歳以上ならtrueが出力されるようにする(if文は使わず)
		age = 24;
        // 8で使用した年齢を代入(24歳)		
		System.out.println( age >= 25);
        // 年齢が25歳以上ならtrueであることの出力をする
		System.out.println("---------------------------------");
		
        // 11 文字列型に型変換し繋げて出力 		
		System.out.println("年齢は" + String.valueOf(age) + "歳です");
        // String.valueOf　を使って文字列型に型変換して出力する
		System.out.println("身長" + String.valueOf(newHeight) + "cmです");
		// String.valueOf　を使って文字列型に型変換して出力する
		System.out.println("体重は" + String.valueOf(newWeight)+ "kgです");
		// String.valueOf　を使って文字列型に型変換して出力する
		
		System.out.println("---------------------------------");
		
        // 12 11で変換した【年齢・身長】を整数型に変換して出力
		String str = "24";
        // 文字列型を代入		
		age = Integer.parseInt(str);
        // 整数型に変換
		System.out.println("年齢は" + age + "歳です");
		// 出力する
		
		newHeight = 168.5;
		// 文字列型を代入
		int i = (int) newHeight;
        // double→int(整数型)に変換
		System.out.println("身長" + i + "cmです");
		// 出力する
		
		System.out.println("---------------------------------"); 
		
        // 13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力(if文を使わず)
		age = 24;
        // 12 で変換した年齢を代入		
		newHeight = 168;
		// 12 で変換した身長を代入	
		System.out.println( age == 25 || newHeight >= 160 );
		// 年齢が25もしくは(||)身長が160以上であればtrue となることの出力をする
	
	
	}

}
