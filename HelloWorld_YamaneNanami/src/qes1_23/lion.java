package qes1_23;

public class lion {
    // フィールド	
	private String name;
	private double length;
	private int speed;
	
	// セッター	
	public void setName(String name) {
		this.name = name;
	}
	public void setLength(double length) {
		this.length = length;
	}	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
    // ゲッター	
	public String getName() {
		return name;
	}
	public double getLength() {
		return length;
	}
	public int getSpeed() {
		return speed;
	}
	public static void main(String[] args)  {
		lion animal = new lion();
		
		animal.setName("ライオン");
		animal.setLength(2.1);
		animal.setSpeed(80);
		
		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLength() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");	
	}
}

/*
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
    体長：2.1m
    速度：80km/h	
*/

