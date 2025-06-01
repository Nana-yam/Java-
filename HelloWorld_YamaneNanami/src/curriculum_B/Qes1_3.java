package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
// [概要] (1)(2)ログインチェックシステム作成の条件分岐処理 
// [詳細] (1)(2)if文を使用してユーザー名が名前を10文字以内、半角英数字以外で登録できるようにする。
	
	public static void main(String[] args) {
		
        // (1)(2)ログイン時の入力チェックシステムの作成		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
        // 半角英数字を判定するための正規表現を用意する
		String regex =  "^[A-Za-z0-9]+$";
		
        // ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
        // 文字列の長さを取得するためlength()メソッドを使用		
		if ( name.length()  > 10 ) {
			System.out.println("名前を10文字以内にしてください");
			
        // ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力
        // name.isEmpty()で nameオブジェクトが空かどうか判定
        // Objects.isNull()でnull判定
		}else if ( name.isEmpty()|| Objects.isNull(name)) {
			System.out.println("名前を入力してください"); 
			
        // 否定演算子で正規表現にマッチしない(半角英数字以外である)場合に出力			
		}else if ( !name.matches(regex)) {
			System.out.println("半角英数字のみで名前を入力してください");
			
        // 上記どれにも該当しない場合ユーザー名を登録するよう出力する		
		}else {
			System.out.println("ユーザー名「 " + name +  " 」を登録しました");
		}
		
		
		
		
        // (3)[概要]じゃんけんシステムの作成処理
        // (3)[詳細]
	    String[] hands = {"グー","チョキ","パー"};
	    Random random = new Random();
	    int count = 0;
	    while (true) {
	    	int userHand = random.nextInt(3); 
	    	int opponentHand = random.nextInt(3);
	    	count ++;	    	
	    	System.out.println( name + "の手は「" + hands[userHand] + "」");
	    	System.out.println( "相手の手は「" + hands[opponentHand] + "」");    	
	    	if( userHand == opponentHand) {
	    		System.out.println("DRAW あいこ もう一回しましょう！");
	    		continue;
	    	}
	    	if ( (userHand == 0 && opponentHand == 1) ||
	    	   (userHand == 1 && opponentHand == 2) ||
	    	   (userHand == 2 && opponentHand == 0)) {
	    		System.out.println("やるやん。\n次は俺にリベンジさせて");
	    		break;	
	    	} else {
	    		System.out.println("俺の勝ち！");
	    		switch (opponentHand)  {
	    		   case 0 :
	    			   System.out.println("負けは次につながるチャンスです！\nネバーギブアップ！");
	    			   break;
	    		   case 1 :
	    			   System.out.println("たかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
	    			   break;
	    		   case 2 :
	    			   System.out.println("なんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
	    			   break;
	    		}
	    	}
	    }
	    System.out.print("勝つまでにかかった合計回数は" + count + "回です");
		
	}	
	
}
