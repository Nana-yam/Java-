package curriculum_B;


public class Qes4 {
// [概要] for文を使用して掛け算処理
// [詳細] for文を使用して掛け算の式、結果の出力をする

	public static void main(String[] args) {
		
        // 1〜9の段 縦方向(掛ける数)	
		for (int i = 1; i <= 9 ; i ++) { 
			
            // 1〜9 横方向(掛けられる数)		
			for (int j = 1; j <= 9; j ++) {
				
                // 数字の桁を揃えた上で掛け算結果を表示する				
				System.out.printf("%02d * %02d = %02d ", i, j, i * j);
				
                // 最後の項目でなければ区切り記号をつける				
				if (j != 9 ) {
					System.out.print("|| ");
				}
				
			}
			
            // 各行の最後に改行	
			System.out.println();
		}
		

	}

}
