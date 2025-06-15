package javaexecute;

import java.util.Scanner;

import javalogic.Theme2;

public class Main1_25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		Theme2 theme = new Theme2(name);
		
		System.out.println("こんにちは 「" + theme.getName() + "」 さん"); 
		System.out.println("ステータス");
		System.out.println("HP:" + theme.getHp()); 
		System.out.println("MP:" + theme.getMp());
		System.out.println("攻撃力:" + theme.getAtacck());
		System.out.println("素早さ:" + theme.getQuick());
		System.out.println("防御力:" + theme.getDefense());
		System.out.println("\nさあ冒険に出かけよう!");
	}

}

/*  名前を入力したら下記がコンソールに出力されるように作ってください
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
