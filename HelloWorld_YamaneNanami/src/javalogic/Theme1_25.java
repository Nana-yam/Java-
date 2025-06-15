package javalogic;

public class Theme1_25 {
	private String name;
	private int hp;
	private int mp;
	private int atacck;
	private int quick;
	private int defense;
	
	public Theme1_25 (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public int getAtacck() {
		return atacck;
	}
	public int getQuick() {
		return quick;
	}
	public int getDefense() {
		return defense;
	}
	
	public void setHp(int hp){
    	this.hp = hp;	
    }
    public void setMp(int mp){
    	this.mp = mp;	
    }
    public void setAtacck(int atacck){
    	this.atacck = atacck;	
    }
    public void setQuick(int quick){
    	this.quick = quick;	
    }
    public void setDefense(int defense){
    	this.defense = defense;	
    }
}


/*
    名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	     こんにちは 「 名前 」 さん
	     ステータス
	     HP：849
	     MP：862
	     攻撃力：375
	     素早さ：937
	     防御力：24

	     さあ冒険に出かけよう！
*/


