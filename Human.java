
public class Human {
	
	String name;
	int birthday;
	int manpukudo;
	
	/*
	オブジェクトの作成
	
	Humanオブジェクトはname, birthday この2つのメンバ変数を持つことになる
	
	※用語
	インスタンス　オブジェクトとほぼ同義。個別のオブジェクトをさす場合に言う。クラスを具現化したもの
	*/
	
	//コンストラクタの作成（クラス名そのまま）
	Human(String name, int birthday){
		//コンストラクタに引数を渡す→好きな値を代入できるように
		
		//コンストラクタが呼ばれた時の処理
		this.name = name;
		this.birthday = birthday;
		this.manpukudo = 50;
		//青字はフィールド、茶色は仮引数をさしている
		
		//thisを使ってこのフィールド（メンバ変数と同義）にアクセスする
	};
	
	//コンストラクタのオーバーロード
	Human(){
		this("不明", 0);
		//this()を使うことで、そのクラスで定義されているほかのコンストラクタを呼ぶことが可能
	}
	
	//コンストラクタ内で自身を呼び出すのはNG
	/*
	Human(String name, int birthday, int manpukudo){
		this(name, birthday, manpukudo);
	}
	*/
	void eat() {
		
		this.manpukudo += 60;
	};
	//メンバメソッドの定義
	//しょっちゅう使っているメソッドの例　public static void main (String[] args){}
}
