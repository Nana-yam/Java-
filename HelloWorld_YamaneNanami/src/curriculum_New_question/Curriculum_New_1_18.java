package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {	
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void printHello(String name, int num) {
		System.out.println("Hello " + name + " " + num);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multiply(int num1, int num2) {
		System.out.println( num1 * num2);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printArray( int[] array) {
		for (int element : array) {
			System.out.println(element);		
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void multiply(double a, double b) {
		System.out.println( a + b );
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] randNumbers(int num) {
		Random random = new Random();
		int[] numbers = new int[num];
		
		System.out.println( num);
		for (int i = 0; i < num; i++) {
			numbers[i] = random.nextInt(100) + 1;
			System.out.println(numbers[i]);				
		}
		return numbers;		
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double calcAvg(int[] numbers) {
		int sum = 0;
		for ( int i : numbers) {
			sum += i;
		}		
		double avg = (double) sum / numbers.length;
		System.out.printf("%.2f\n " , avg);
		return avg;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
    public static boolean isValid (double avg) {
    	boolean result = avg >= 50;
    	System.out.println(result);
    	
    	return result;
    }
	
	
	public static void main(String[] args) {
	    // 作成したメソッドをここで呼び出してください
		
        // 01 メソッドの呼び出し		
		printHello("javaSE" , 11);
		
        // 02 メソッドの呼び出し(適当な値を代入)		
		multiply( 2, 3);
		
		// 03 メソッドの呼び出し
		int[] array = { 10,20,30,40,50};
		printArray(array);
		
		// 04 メソッドの呼び出し
		multiply(3.5, 5.5);
		
		// 05 メソッドの呼び出し
		int[] nums = randNumbers (6);
		
		// 06 メソッドの呼び出し
		double avg = calcAvg(nums);
		
		// 07 メソッドの呼び出し
		isValid(avg);
	}

	
	

	

}
