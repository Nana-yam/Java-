package themelogic2628;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class prefectures2829 {
		
	public prefectures2829(String num, String order) {
		// numがnullまたは空文字烈かチェック		
		if(num == null || num.isEmpty()) {
			System.out.println("数字が空です\nシステムを終了します");
			// プログラムを正常終了で強制的に終了させる			
			System.exit(0);
		}
		// orderがnullまたは空文字烈かチェック	
		if(order == null || order.isEmpty()) {
			System.out.println("入力値が正常ではありません\nシステムを終了します");
			// プログラムを正常終了で強制的に終了させる
			System.exit(0);		
		}
	}
	
	public void sorted(String num,String order) {
		
		// numをカンマで分割して、文字列の配列にする		
		String[] nums = num.split(",");
		
		// 空の整数リストnumbersを作成		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// nums配列の各要素を整数に変換してnumbersに追加		
		for(int i = 0;i < nums.length; i++) {
			numbers.add(Integer.parseInt(nums[i]));	
		}
		System.out.println(numbers);
		
		// orderが昇順ならソート処理をする	
		if (order.equals("昇順")) {
			
			// リストnumbersを昇順に並べ替える			
			Collections.sort(numbers);
			
			System.out.println(numbers);
			System.out.println("完了");
			
		// もしorder	が降順なら降順ソート処理に
		}else if(order.equals("降順")) {
			
			//numbersを降順でソートし、結果を出力			
			Collections.sort(numbers,Collections.reverseOrder());
			System.out.println(numbers);
		}
		
		//都道府県情報の配列　インデックスが都道府県番号に対応するようにする		
		String[] array = {
					"北海道:札幌市:83424", 
					"青森県:青森市:9646",
					"岩手県:盛岡市:15275",
					"宮城県:仙台市:7282",
					"秋田県:秋田市:11638",
					"山形県:山形市:9323",
					"福島県:福島市:13784",
					"茨城県:水戸市:6097",
					"栃木県:宇都宮市:6408",
					"群馬県:前橋市:6362",
					"埼玉県:さいたま市:3798"
				};
		
		//数値（都道府県）と情報（文字列）を対応づけるマップを作成		
		Map<Integer,String> map = new HashMap<>();
		
		//リストnumbersに入っている番号を順に処理		
		for(int i =0; i < numbers.size(); i++) {
			
			//インデックスに対応する情報をマップに登録			
			map.put(numbers.get(i),array[numbers.get(i)]);
			
			//対応する文字列を：で分割し、都道府県、県庁所在地、面積を取り出す			
			String[] element = map.get(numbers.get(i)).split(":");
			System.out.println("都道府県名：" + element[0]);
			System.out.println("県庁所在地：" + element[1]);
			System.out.println("面積：" + Double.parseDouble(element[2]) + "km2\n");
		}
	}
}

/*
	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
	
	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8,5,9,.....
	と入力された場合（昇順）
	
	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
	
	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2

*/