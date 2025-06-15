package javalogic;

import java.util.Random;

public class Theme2 extends Theme1_25{
	
	public Theme2(String name) {
		super(name);
		Random random = new Random();
		
		setHp(random.nextInt(1000));
		setMp(random.nextInt(1000));
		setAtacck(random.nextInt(1000));
		setQuick(random.nextInt(1000));
		setDefense(random.nextInt(1000));
	}
}

/*

   名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/

