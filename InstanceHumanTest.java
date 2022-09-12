
public class InstanceHumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Human human;		 //①
		human = new Human(); //②
		//コンストラクタを呼び出す
		//コンストラクタが書いていないクラスには、デフォルトコンストラクタが搭載されている
		*/
		
		Human human = new Human("Bilal", 19941205);
		
		
		/*
		①Human型の変数humanを宣言
		②new演算子を使ってHumanクラスをインスタンス化し、（その参照を）変数humanに代入
		*/
		
		System.out.println("Name:"+human.name);
		System.out.println("Birthday:"+human.birthday);
		System.out.println("Satiety:"+human.manpukudo);
	}

}
