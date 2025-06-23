package qes1_2628execute;

import java.util.Scanner;

import qes1_2628logic.Animals;

public class Main2628 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		
		String animals = scanner.nextLine(); 
		
		//コンソール入力情報(animalDataList)をカンマで区切る
		String[] animalDataList = animals.split(",");
		
		//コンソール入力情報(animalDataList)の配列の各要素を順番に取り出す
		for(String data : animalDataList) {
			
			// dataをコロンで分割			
			String[] parts = data.split(":");
			
			//分割した要素がちょうど3つあるかチェックする			
			if (parts.length == 3 ) {
				
				//動物の名前を取り出す				
				String name = parts[0];
				
				//体長を文字列から小数(double型)に変換				
				double length = Double.parseDouble(parts[1]);
				
				//速度を文字列から整数(int型)に変換				
				int speed = Integer.parseInt(parts[2]);
				
				Animals animal = new Animals(name, length, speed);
				animal.printInfo();	
			}
		}
	}
}

/*

	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
	コンソール出力結果
	
	コンソールに文字を入力してください
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ

	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス

	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ

	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス

	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ

	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明


*/