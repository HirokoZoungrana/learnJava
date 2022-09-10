
public class MethodTest {


	//メインメソッド
	public static void main (String[] args){
		
		//このメインメソッドが動かされることを「メインメソッドを呼ぶ」という
		System.out.println("You called the main method.");

		//subメソッドを呼ぶ → System.out.println()しなくても表示される
		sub();
	}

	//メソッドの定義
	public static void sub (){
		
		System.out.println("You called the sub method.");
	}
}