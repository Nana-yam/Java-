package curriculum_B;

import java.util.Scanner;

public class Qes7 {
// [概要]生徒の成績を管理するプログラムを作成する処理
// [詳細]do-while と二重のforループと2次元配列を使う
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 生徒の人数を保存するために宣言		
		int numStudents;
		
        // 生徒の人数が二人以上いなるまで繰り返し入力できるようにする		
		do {
			System.out.print("生徒の人数を入力してください(2以上) :");
			
            // 入力した生徒の人数を読み取って、変数に保存する処理			
			numStudents = scanner.nextInt();
			
		} while (numStudents < 2) ;
		
        // 4教科の名前を配列で定義		
		String[] subjects = { "英語", "数学" , "理科" , "社会" };
		int subjectCount = subjects.length;
		
        // 2次元配列で各生徒、各教科の点数を保存するための配列を作成	
		int[][] scores = new int[numStudents][subjectCount];
		
        // 各生徒の各教科の点数を、ユーザーから順番に入力してもらう処理を作成		
        // i=生徒、j=教科を表す		
		for (int i = 0; i < numStudents; i ++) {
			for(int j = 0; j < subjectCount; j++) {		
				
                // 入力できるようにprintfメソッドで処理(i = 0なので +1して1人目になる)		
				System.out.printf( "%d人目の『%s』の点数を入力してください:", i + 1, subjects[j]);
				
                // 入力された整数を受け取って、scores 配列の中の i人目のj強科目に保存するよう処理				
				scores[i][j] = scanner.nextInt();
			}
		}
        // 空行で区切りを入れる		
		System.out.println();
		
        // 各生徒の平均点計算、出力	
		double totalSum = 0;
		
        // 生徒を1人ずつ処理するループ		
		for (int i = 0; i < numStudents; i ++) {
			
            // 各生徒の合計点を初期化			
			int sum = 0;
			
            // この生徒が持つ全ての教科の点数を合計するための処理			
			for(int j = 0; j < subjectCount; j ++) {
				
                // 各教科の点数を加算する処理				
				sum += scores[i][j];
			}		
            // sum(合計点)を教科数で割って平均点を出す(double で整数同士の割り算を小数に変換する)			
			double avg = (double) sum / subjectCount;
			
            // 各生徒の合計点を全体の合計に足す処理			
			totalSum += sum;
			
            // 出力処理( %dで生徒 +1して1人目になる、%.2f平均点を小数点第２位まで表示する)			
			System.out.printf("%d人目の平均点は%.2f点です。\n" , i + 1, avg);	
		}
		// 空行で区切りを入れる	
		System.out.println();

        // 各教科の平均点計算、出力	
        //　教科を順番に処理するループ		
		for (int j = 0; j < subjectCount ; j ++) {
			
            // 教科の合計点を初期化			
			int subjectSum = 0;
			
            // 各生徒のその教科の点を加算する処理			
			for(int i = 0; i < numStudents ; i ++) {
				 
                // 点数を合計する処理				
				subjectSum += scores[i][j] ;
			}
            // 合計点を生徒の人数で割って教科ごとの平均点を出す処理(double をつけて小数で計算)			
			double subjectAvg = (double) subjectSum / numStudents;
			
            // 教科名と平均点を出力する処理(%.2f平均点を小数点第２位まで表示する)			
			System.out.printf("%sの平均点は%.2f点です。\n" , subjects[j], subjectAvg);
		}		
        // 全体平均点(全ての点数の合計 ÷ 生徒数 × 教科数)を出力(小数で扱うだめdouble)
		double overallAvg = (double) totalSum / (numStudents * subjectCount);
		
        // 全体の平均点を小数第2位まで表示するための処理		
		System.out.printf("全体の平均点は%.2f点です。\n" , overallAvg);		
	}
}
