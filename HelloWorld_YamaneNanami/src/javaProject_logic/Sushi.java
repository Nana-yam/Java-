package javaProject_logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Sushi {
	public String greeting;
	public String taste;
	public String category;
	public String currentDateTime;
				
	public Sushi(String greeting , String taste , String category) {
		this.greeting = greeting;
		this.taste = taste;
		this.category = category;
		this.currentDateTime = getCurrentDateTime();
	}
			
	private String getCurrentDateTime() {
		LocalDateTime nowDate = LocalDateTime.now();
		DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 		
		String formatNowDate = dtf1.format(nowDate); 
		return nowDate.format(dtf1);	
	}
				
}				

		/* 下記がコンソールに出力されるように作成してください	
			こんにちは！ここは日本です！
			この寿司はうまい
			寿司は和食です
			今の現在日時は2023/03/09 10:23:39です			
		【条件】	
		 ・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		 ・適切なファイルにフィールドで変数を必要な数作ってください。
		 ・thisを使って作成してください。
		 ・日時は今日の日付を取得してください。
		 */

