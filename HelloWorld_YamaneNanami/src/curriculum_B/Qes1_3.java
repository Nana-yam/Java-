package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
// [概要] (1)(2)ログインチェックシステム作成の条件分岐処理 
// [詳細] (1)(2)if文を使用してユーザー名が名前を10文字以内、半角英数字以外で登録できるようにする。		
	public static void main(String[] args) {
		
        // (1)(2)ログイン時の入力チェックシステムの作成		
		String  name;
        // 半角英数字を判定するための正規表現を用意する
		String regex =  "^[A-Za-z0-9]+$";
		
        // ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力
        // 文字列の長さを取得するためlength()メソッドを使用		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			name = scanner.nextLine();
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
				break;  // 名前を登録できたらループそ抜ける				
			}
			
		}
        // (3)[概要]じゃんけんシステムの作成処理
        // (3)[詳細]じゃんけんシステムを作成する
		
        // 文字列の配列を定義		
	    String[] hands = {"グー","チョキ","パー"};	   	    
	    Random random = new Random();
	    
        // 勝つまでに何回じゃんけんしたかカウントする	    
	    int count = 0;
	    while (true) {	    	
            // ランダムで手を決定する	    	
	    	int userHand = random.nextInt(3); 
	    	int opponentHand = random.nextInt(3);
	    	
            // 1回ごとに回数を増やす	    	
	    	count ++;	   
	    	
            // 手の表示	    	
	    	System.out.println( name + "の手は「" + hands[userHand] + "」");
	    	System.out.println( "相手の手は「" + hands[opponentHand] + "」");    
	    	
            // あいこの判定	    	
	    	if( userHand == opponentHand) {
	    		System.out.println("DRAW あいこ もう一回しましょう！");
	    		continue;
	    	}
	    	
            // 勝ち負けの判定(ユーザー名が勝ちの場合)	    	
	    	if ( (userHand == 0 && opponentHand == 1) ||
	    	   (userHand == 1 && opponentHand == 2) ||
	    	   (userHand == 2 && opponentHand == 0)) {
	    		System.out.println("やるやん。\n次は俺にリベンジさせて");
	    		break;	
	    	} else {
	    		
                // 相手が勝った場合(ユーザー名が負け)  		
	    		System.out.println("俺の勝ち！");
	    		switch (opponentHand)  {	    		
                   // グーで負けた場合	    		
	    		   case 0 :
	    			   System.out.println("負けは次につながるチャンスです！\nネバーギブアップ！");
	    			   break;	    			   
	    		   // チョキで負けた場合	
	    		   case 1 :
	    			   System.out.println("たかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
	    			   break;	    			   
	    		   // パーで負けた場合	
	    		   case 2 :
	    			   System.out.println("なんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
	    			   break;
	    		}
	    	}
	    }
        // 最後に結果を表示する出力	    
	    System.out.print("勝つまでにかかった合計回数は" + count + "回です");	
	}		
}
