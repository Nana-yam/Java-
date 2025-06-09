package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
// [概要] 入力された商品に対して、残り台数をランダムに表示するシステムの作成処理
// [詳細] 拡張for文、switch文、条件演算子(if文の代わりに)を利用し作成する
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		Random random = new Random();
		
        // 文字列inputに複数の商品名を1つの文字列として格納する		
		String items = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
		
		String input = scanner.nextLine();
		
        // 文字列を「、」で分解して配列itemsに格納する		
		String[] inputItems = input.split("、");
		
        // 拡張for文を利用しitems配列の各要素を item の変数に順番に取り出して繰り返し処理を行う	
		for (String inputItem : inputItems) {
			inputItem = inputItem.trim();
            // 0〜11のランダムな整数を生成して stock に格納する 			
			int stock = random.nextInt(12);
			
            // 商品によって分岐処理を行う(switch文)			
			switch (inputItem) {
				case "テレビ":
				case "ディスプレイ":
					
                    // 条件演算子を利用(ディスプレイの場合は11からランダム値を引いた数を在庫とし、テレビはそのままstock として使用)					
					int displayStock = inputItem.equals("ディスプレイ")? 11 - stock : stock;
					String displayName = inputItem.equals("ディスプレイ")? "ディスプレイ" : "テレビ";
					System.out.println( displayName + "の残り台数は" + displayStock + "台です");
					
					// この場合の処理を終了させる
					break;   					
					
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
					
                    // 各商品の在庫数をそのまま表示する					
					System.out.println(inputItem + "の残り台数は" + stock + "台です");
					
					// この場合の処理を終了させる
					break;
					
                // どのケースにも当てはまらない場合の処理					
				default :
					System.out.println("『" + inputItem + "』は指定の商品ではありません");
					
					// この場合の処理を終了させる
					break;									
			}
		}	
		scanner.close();
	}
}
