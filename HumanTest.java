public class HumanTest {

	public static void main(String[] args) {
		
		Human human = new Human();
		/*
		1 Humanは自分で作った「クラス型変数」
		2 オブジェクトを作る際は「new 演算子」を使う→　new クラス名()
		
		この動作でオブジェクトを作ることができる
		*/
		
		human.name = "Hiroko";
		human.birthday = 19910618;
		
		Human human2 = new Human();
		human2.name = "Oumarou";
		human2.birthday = 19930104;
			
		System.out.println("１人目");
		System.out.println("名前" + human.name);
		System.out.println("生年月日" + human.birthday); 
		
		System.out.println("");
		
		System.out.println("2人目");
		System.out.println("名前" + human2.name);
		System.out.println("生年月日" + human2.birthday); 
		
		System.out.println("");
		System.out.println("");
		//Human.java内のメンバメソッドの挙動を確認する
		human.eat();
		human.eat();
		
		human2.eat();
		
		System.out.println("Manpukudo of " + human.name);
		System.out.println(human.manpukudo);
		System.out.println("Manpukudo of " + human2.name);
		System.out.println(human2.manpukudo);
	}
}
